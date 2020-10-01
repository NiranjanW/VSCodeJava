package CodeBytes;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureSample {

public static CompletableFuture<Integer> create() {
    return CompletableFuture.supplyAsync(() -> 2);
}    
public static void main(String[] args) {

    CompletableFuture<Integer> future = create();
    future.thenAccept(data -> System.out.println(data));

    create()
    .thenAccept(dat -> printIt(dat));
    
    
}

    //SUpplier<T> T get() - like mother love
    //Predicate<T> boolean test(T)
    //Function<T,R> R apply(T)
    //Consumer<T> void accept(T) - eg ForEach 

    //get() getNow() impatient
    
}
