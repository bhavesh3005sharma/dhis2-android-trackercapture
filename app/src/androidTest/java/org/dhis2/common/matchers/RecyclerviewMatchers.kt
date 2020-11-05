package org.dhis2.common.matchers

import android.view.View
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.matcher.BoundedMatcher
import kotlinx.android.synthetic.main.item_carousel_tei.view.sorting_field_value
import org.hamcrest.Description
import org.hamcrest.Matcher
import org.hamcrest.TypeSafeMatcher
import java.sql.Date
import java.text.SimpleDateFormat

class RecyclerviewMatchers {

    companion object {
        fun isNotEmpty(): Matcher<View> {
            return object : TypeSafeMatcher<View>() {
                public override fun matchesSafely(view: View): Boolean {
                    return (view as RecyclerView).childCount > 0
                }

                override fun describeTo(description: Description) {
                    description.appendText("RecyclerView should not be empty")
                }
            }
        }

        fun withSize(size: Int): Matcher<View> {
            return object : TypeSafeMatcher<View>() {
                public override fun matchesSafely(view: View): Boolean {
                    val recyclerview = view as RecyclerView
                    return recyclerview.adapter!!.itemCount == size
                }

                override fun describeTo(description: Description) {
                    description.appendText("Recyclerview should have total elements of $size")
                }
            }
        }

        fun hasItem(@NonNull matcher: Matcher<View>): Matcher<View> {
            return object : BoundedMatcher<View, RecyclerView>(RecyclerView::class.java) {
                override fun describeTo(description: Description) {
                    description.appendText("has item: ")
                    matcher.describeTo(description)
                }

                override fun matchesSafely(view: RecyclerView): Boolean {
                    val adapter = view.adapter
                    for (position in 0 until adapter!!.itemCount) {
                        val type = adapter.getItemViewType(position)
                        val holder = adapter.createViewHolder(view, type)
                        adapter.onBindViewHolder(holder, position)
                        if (matcher.matches(holder.itemView)) {
                            return true
                        }
                    }
                    return false
                }
            }
        }

        fun allElementsHave(@NonNull matcher: Matcher<View>) : Matcher<View> {
            return object : BoundedMatcher<View, RecyclerView>(RecyclerView::class.java) {
                override fun describeTo(description: Description) {
                    description.appendText("all elements have: ")
                    matcher.describeTo(description)
                }
                override fun matchesSafely(view: RecyclerView): Boolean {
                    val adapter = view.adapter
                    for (position in 0 until adapter!!.itemCount) {
                        val type = adapter.getItemViewType(position)
                        val holder = adapter.createViewHolder(view, type)
                        adapter.onBindViewHolder(holder, position)
                        if (!matcher.matches(holder.itemView)) return false
                    }
                    return true
                }
            }
        }

        fun dateIsInRange(startDate: String, endDate: String) : Matcher<View> {
            return object : BoundedMatcher<View, RecyclerView>(RecyclerView::class.java) {
                override fun describeTo(description: Description) {
                    description.appendText("all elements have dates between $startDate and $endDate : ")
                    //matcher.describeTo(description)
                }
                override fun matchesSafely(view: RecyclerView): Boolean {
                    val adapter = view.adapter
                    for (position in 0 until adapter!!.itemCount) {
                        val type = adapter.getItemViewType(position)
                        val holder = adapter.createViewHolder(view, type)
                        adapter.onBindViewHolder(holder, position)

                        val start = Date.valueOf(startDate)
                        val end = Date.valueOf(endDate)
                        val range = start..end
                        val date = holder.itemView.sorting_field_value.text.toString()
                        val initialFormattedDate = SimpleDateFormat("dd/M/yyyy").parse(date)
                        val formatter = SimpleDateFormat("yyyy-MM-dd")
                        val parsedDate = formatter.format(initialFormattedDate)
                        if (Date.valueOf(parsedDate) !in range) return false

                        // id getText
                        // holder.itemView.findViewById(id)
                        // val text = holder.itemView.findViewById<TextView>(sorting_field_value)
                    }
                    return true
                }
            }
        }

        fun atPosition(
            position: Int,
            @NonNull itemMatcher: Matcher<View>
        ): Matcher<View> {
            return object : BoundedMatcher<View, RecyclerView>(RecyclerView::class.java) {
                override fun describeTo(description: Description) {
                    description.appendText("has item in recyclerview  at position $position")
                    itemMatcher.describeTo(description)
                }

                override fun matchesSafely(view: RecyclerView): Boolean {
                    val viewHolder = view.findViewHolderForAdapterPosition(position) ?: return false
                    return itemMatcher.matches(viewHolder.itemView)
                }
            }
        }
    }
}
