class FrogJump {
    public int solution(int X, int Y, int D) {
        Integer distance = Y - X;
        return (int) Math.ceil((double) distance / D);
    }
}
