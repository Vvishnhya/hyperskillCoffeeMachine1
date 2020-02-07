public static void moveRobot(Robot robot, int toX, int toY) {

        while (robot.getX() != toX || robot.getY() != toY) {

        if (toX != robot.getX()) {
        if (toX < robot.getX()) {
        while (robot.getDirection() != Direction.LEFT) {
        if (robot.getDirection() == Direction.RIGHT || robot.getDirection() == Direction.DOWN) {
        robot.turnRight();
        } else {
        robot.turnLeft();
        }
        }
        robot.stepForward();
        } else {
        while (robot.getDirection() != Direction.RIGHT) {
        if (robot.getDirection() == Direction.LEFT || robot.getDirection() == Direction.UP) {
        robot.turnRight();
        } else {
        robot.turnLeft();
        }
        }
        robot.stepForward();
        }
        }else if(toY != robot.getY()) {
        if (toY < robot.getY()) {
        while (robot.getDirection() != Direction.DOWN) {
        if (robot.getDirection() == Direction.RIGHT || robot.getDirection() == Direction.UP) {
        robot.turnRight();
        } else {
        robot.turnLeft();
        }
        }
        robot.stepForward();
        } else {
        while (robot.getDirection() != Direction.UP) {
        if (robot.getDirection() == Direction.LEFT || robot.getDirection() == Direction.DOWN) {
        robot.turnRight();
        } else {
        robot.turnLeft();
        }
        }
        robot.stepForward();
        }

        }else{
        robot.stepForward();
        }

        }
        }
