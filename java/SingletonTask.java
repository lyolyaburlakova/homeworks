public final class SingletonTask
{
    private static volatile SingletonTask instance;
    String value;

    private SingletonTask(String value)
    {
        // Этот код эмулирует медленную инициализацию
        try
        {
            Thread.sleep(10000);
        }
        catch (InterruptedException ex)
        {
            ex.printStackTrace();
        }
        this.value = value;
    }

    static SingletonTask getInstance(String value) {
        if (instance == null) {
            synchronized (SingletonTask.class){
                if (instance == null){
                    instance = new SingletonTask(value);
                }
            }
        }
        return instance;
    }
}
