.class public final Lz77;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lqe5;


# instance fields
.field public final X:Lqe5;

.field public final Y:Lf63;

.field public final Z:Lpv;


# direct methods
.method public constructor <init>(Lqe5;Lf63;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lz77;->X:Lqe5;

    .line 5
    .line 6
    iput-object p2, p0, Lz77;->Y:Lf63;

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    invoke-static {p1}, Lnr4;->e(Z)Lpv;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iput-object p1, p0, Lz77;->Z:Lpv;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final C0(Lzu3;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lz77;->Z:Lpv;

    .line 5
    .line 6
    invoke-virtual {v0}, Lpv;->b()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const/4 p0, 0x0

    .line 13
    return-object p0

    .line 14
    :cond_0
    sget-object v0, Lyb6;->a:Lzb6;

    .line 15
    .line 16
    const-class v1, Lz77;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const-class v1, Lqe5;

    .line 30
    .line 31
    invoke-virtual {v0, v1}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_2

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    const-class v1, Lk73;

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_3

    .line 53
    .line 54
    :goto_0
    return-object p0

    .line 55
    :cond_3
    const-class v1, Landroid/media/Image;

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-nez v0, :cond_4

    .line 66
    .line 67
    iget-object p0, p0, Lz77;->X:Lqe5;

    .line 68
    .line 69
    invoke-interface {p0, p1}, Lbo8;->C0(Lzu3;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    :cond_4
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    .line 75
    .line 76
    new-instance v0, Ljava/lang/StringBuilder;

    .line 77
    .line 78
    const-string v1, "Cannot unwrap "

    .line 79
    .line 80
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    const-string p0, " as android.media.Image. Use setFinalizerinstead and close all outstanding references."

    .line 87
    .line 88
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-direct {p1, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    throw p1
.end method

.method public final V0()Lz77;
    .locals 9

    .line 1
    iget-object v0, p0, Lz77;->Z:Lpv;

    .line 2
    .line 3
    invoke-virtual {v0}, Lpv;->b()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    :cond_0
    move-object v0, v1

    .line 11
    goto :goto_3

    .line 12
    :cond_1
    iget-object v0, p0, Lz77;->Y:Lf63;

    .line 13
    .line 14
    iget-object v2, v0, Lf63;->Z:Ljava/lang/Object;

    .line 15
    .line 16
    move-object v4, v2

    .line 17
    check-cast v4, Lqv;

    .line 18
    .line 19
    :cond_2
    iget v7, v4, Lqv;->a:I

    .line 20
    .line 21
    if-nez v7, :cond_3

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    :goto_0
    move v8, v2

    .line 25
    goto :goto_1

    .line 26
    :cond_3
    add-int/lit8 v2, v7, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :goto_1
    sget-object v3, Liu;->a:Lsun/misc/Unsafe;

    .line 30
    .line 31
    sget-wide v5, Lqv;->c:J

    .line 32
    .line 33
    invoke-virtual/range {v3 .. v8}, Lsun/misc/Unsafe;->compareAndSwapInt(Ljava/lang/Object;JII)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    if-eqz v8, :cond_4

    .line 40
    .line 41
    iget-object v0, v0, Lf63;->Y:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, Lqe5;

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_4
    move-object v0, v1

    .line 47
    :goto_2
    if-eqz v0, :cond_0

    .line 48
    .line 49
    new-instance v0, Lz77;

    .line 50
    .line 51
    iget-object v2, p0, Lz77;->X:Lqe5;

    .line 52
    .line 53
    iget-object p0, p0, Lz77;->Y:Lf63;

    .line 54
    .line 55
    invoke-direct {v0, v2, p0}, Lz77;-><init>(Lqe5;Lf63;)V

    .line 56
    .line 57
    .line 58
    :goto_3
    if-eqz v0, :cond_5

    .line 59
    .line 60
    return-object v0

    .line 61
    :cond_5
    const-string p0, "Required value was null."

    .line 62
    .line 63
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    return-object v1
.end method

.method public final close()V
    .locals 5

    .line 1
    iget-object v0, p0, Lz77;->Z:Lpv;

    .line 2
    .line 3
    invoke-virtual {v0}, Lpv;->a()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_8

    .line 8
    .line 9
    iget-object p0, p0, Lz77;->Y:Lf63;

    .line 10
    .line 11
    iget-object v0, p0, Lf63;->Z:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lqv;

    .line 14
    .line 15
    sget-object v1, Lqv;->b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 16
    .line 17
    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->decrementAndGet(Ljava/lang/Object;)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_8

    .line 22
    .line 23
    iget-object v0, p0, Lf63;->f0:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Ltv;

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    invoke-virtual {v0, v1}, Ltv;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Lzu0;

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    iget-object p0, p0, Lf63;->Y:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast p0, Lqe5;

    .line 40
    .line 41
    instance-of v0, p0, Ljava/lang/AutoCloseable;

    .line 42
    .line 43
    if-eqz v0, :cond_0

    .line 44
    .line 45
    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    .line 46
    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_0
    instance-of v0, p0, Ljava/util/concurrent/ExecutorService;

    .line 50
    .line 51
    if-eqz v0, :cond_4

    .line 52
    .line 53
    check-cast p0, Ljava/util/concurrent/ExecutorService;

    .line 54
    .line 55
    invoke-static {}, Ljava/util/concurrent/ForkJoinPool;->commonPool()Ljava/util/concurrent/ForkJoinPool;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    if-ne p0, v0, :cond_1

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_1
    invoke-interface {p0}, Ljava/util/concurrent/ExecutorService;->isTerminated()Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-nez v0, :cond_8

    .line 67
    .line 68
    invoke-interface {p0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 69
    .line 70
    .line 71
    const/4 v1, 0x0

    .line 72
    :cond_2
    :goto_0
    if-nez v0, :cond_3

    .line 73
    .line 74
    :try_start_0
    sget-object v2, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    .line 75
    .line 76
    const-wide/16 v3, 0x1

    .line 77
    .line 78
    invoke-interface {p0, v3, v4, v2}, Ljava/util/concurrent/ExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    .line 79
    .line 80
    .line 81
    move-result v0
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 82
    goto :goto_0

    .line 83
    :catch_0
    if-nez v1, :cond_2

    .line 84
    .line 85
    invoke-interface {p0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 86
    .line 87
    .line 88
    const/4 v1, 0x1

    .line 89
    goto :goto_0

    .line 90
    :cond_3
    if-eqz v1, :cond_8

    .line 91
    .line 92
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    .line 97
    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_4
    instance-of v0, p0, Landroid/content/res/TypedArray;

    .line 101
    .line 102
    if-eqz v0, :cond_5

    .line 103
    .line 104
    check-cast p0, Landroid/content/res/TypedArray;

    .line 105
    .line 106
    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    .line 107
    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_5
    instance-of v0, p0, Landroid/media/MediaMetadataRetriever;

    .line 111
    .line 112
    if-eqz v0, :cond_6

    .line 113
    .line 114
    check-cast p0, Landroid/media/MediaMetadataRetriever;

    .line 115
    .line 116
    invoke-virtual {p0}, Landroid/media/MediaMetadataRetriever;->release()V

    .line 117
    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_6
    instance-of v0, p0, Landroid/media/MediaDrm;

    .line 121
    .line 122
    if-eqz v0, :cond_7

    .line 123
    .line 124
    check-cast p0, Landroid/media/MediaDrm;

    .line 125
    .line 126
    invoke-virtual {p0}, Landroid/media/MediaDrm;->release()V

    .line 127
    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_7
    invoke-static {}, Lkp5;->e()V

    .line 131
    .line 132
    .line 133
    :cond_8
    :goto_1
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lz77;->X:Lqe5;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
