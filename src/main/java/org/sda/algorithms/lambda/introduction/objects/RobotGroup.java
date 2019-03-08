package org.sda.algorithms.lambda.introduction.objects;

import java.util.ArrayList;
import java.util.List;

/**
 */
public class RobotGroup {

    public static List<Robot> getRobotGroup() {
        List<Robot> robotGroup = new ArrayList<>();
        robotGroup.add(new Robot("AWT", true, false, true));
        robotGroup.add(new Robot("Wicket", false, false, false));
        robotGroup.add(new Robot("Angular", true, true, true));
        robotGroup.add(new Robot("Iridium", false, true, true));
        robotGroup.add(new Robot("Spring", false, true, false));
        robotGroup.add(new Robot("Hibernate", true, true, false));
        return robotGroup;
    }

    public static void main(String[] args) {

        List<Robot> robotGroup = getRobotGroup();
        print(robotGroup, new CheckIfDancer());
        System.out.println();

        print(robotGroup, robot -> robot.getName().contains("a"));
        System.out.println();

        print(robotGroup, Robot::isSinger);
        System.out.println();
    }

    public static void print(List<Robot> robotList, Checker checker) {
        for (Robot robot : robotList) {
            if (checker.check(robot)) {
                System.out.println(robot);
            }
        }
        System.out.println();
    }
}