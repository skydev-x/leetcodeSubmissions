class Solution {
    fun canFinish(numCourses: Int, prerequisites: Array<IntArray>): Boolean {
        
        if (numCourses < 2) {
            return true
        }

        val prerequisiteMap = mutableMapOf<Int, MutableList<Int>>()
        for (prerequisite in prerequisites) {
            val (course, mandatory) = prerequisite
            prerequisiteMap.getOrPut(course) { mutableListOf() }.add(mandatory)
        }
        val visitingStatus = IntArray(numCourses + 1)
        for (courseNumber in 0 until numCourses) {
            if (!dfsCourse(courseNumber, visitingStatus, prerequisiteMap)) {
                return false
            }
        }
        return true

    }

    fun dfsCourse(courseNumber: Int, visitingStatus: IntArray, prerequisiteMap: Map<Int, List<Int>>): Boolean {
        if (visitingStatus[courseNumber] == 1) {
            return false 
        } else if (visitingStatus[courseNumber] == 2) {
            return true 
        }
        
        visitingStatus[courseNumber] = 1
        
        val prerequisitesOfCourse = prerequisiteMap[courseNumber]
        if (prerequisitesOfCourse != null) {
            for (prerequisite in prerequisitesOfCourse) {
                if (!dfsCourse(prerequisite, visitingStatus, prerequisiteMap)) {
                    return false
                }
            }
        }
        
        visitingStatus[courseNumber] = 2
        
        return true
    }
}