.class public final Lkm2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final X:Lqm2;

.field public final Y:Ljava/util/Set;

.field public final Z:Lpv;


# direct methods
.method public constructor <init>(Lqm2;)V
    .locals 7

    .line 1
    iget-object v0, p1, Lqm2;->e:Lgb4;

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    const/16 v2, 0xa

    .line 6
    .line 7
    invoke-static {v0, v2}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 12
    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    invoke-virtual {v0, v3}, Lgb4;->listIterator(I)Ljava/util/ListIterator;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    :goto_0
    move-object v5, v4

    .line 20
    check-cast v5, Lo03;

    .line 21
    .line 22
    invoke-virtual {v5}, Lo03;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v6

    .line 26
    if-eqz v6, :cond_0

    .line 27
    .line 28
    invoke-virtual {v5}, Lo03;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    check-cast v5, Lom2;

    .line 33
    .line 34
    iget v5, v5, Lom2;->c:I

    .line 35
    .line 36
    new-instance v6, Ldl7;

    .line 37
    .line 38
    invoke-direct {v6, v5}, Ldl7;-><init>(I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    invoke-static {v1}, Lwv0;->c1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    .line 51
    .line 52
    iput-object p1, p0, Lkm2;->X:Lqm2;

    .line 53
    .line 54
    iput-object v1, p0, Lkm2;->Y:Ljava/util/Set;

    .line 55
    .line 56
    new-instance p1, Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-static {v0, v2}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v3}, Lgb4;->listIterator(I)Ljava/util/ListIterator;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    :goto_1
    move-object v1, v0

    .line 70
    check-cast v1, Lo03;

    .line 71
    .line 72
    invoke-virtual {v1}, Lo03;->hasNext()Z

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-eqz v2, :cond_1

    .line 77
    .line 78
    invoke-virtual {v1}, Lo03;->next()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    check-cast v1, Lom2;

    .line 83
    .line 84
    iget v1, v1, Lom2;->d:I

    .line 85
    .line 86
    new-instance v2, Lpe5;

    .line 87
    .line 88
    invoke-direct {v2, v1}, Lpe5;-><init>(I)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_1
    invoke-static {p1}, Lwv0;->c1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 96
    .line 97
    .line 98
    invoke-static {v3}, Lnr4;->e(Z)Lpv;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    iput-object p1, p0, Lkm2;->Z:Lpv;

    .line 103
    .line 104
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lkm2;->g()Z

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final finalize()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lkm2;->g()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lkm2;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public final g()Z
    .locals 12

    .line 1
    iget-object v0, p0, Lkm2;->Z:Lpv;

    .line 2
    .line 3
    invoke-virtual {v0}, Lpv;->a()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_9

    .line 9
    .line 10
    iget-object v0, p0, Lkm2;->X:Lqm2;

    .line 11
    .line 12
    iget-object v2, v0, Lqm2;->d:Lnm2;

    .line 13
    .line 14
    iget-object v0, v0, Lqm2;->e:Lgb4;

    .line 15
    .line 16
    iget-object v3, v2, Lv3;->a:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v3, Lqv;

    .line 19
    .line 20
    sget-object v4, Lqv;->b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 21
    .line 22
    invoke-virtual {v4, v3}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->decrementAndGet(Ljava/lang/Object;)I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    const/4 v4, 0x2

    .line 27
    if-nez v3, :cond_0

    .line 28
    .line 29
    iget-object v2, v2, Lv3;->b:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v2, Lux0;

    .line 32
    .line 33
    new-instance v3, Lve5;

    .line 34
    .line 35
    invoke-direct {v3, v4}, Lve5;-><init>(I)V

    .line 36
    .line 37
    .line 38
    new-instance v5, Lte5;

    .line 39
    .line 40
    invoke-direct {v5, v3}, Lte5;-><init>(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2, v5}, Lrm3;->V(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    :cond_0
    invoke-virtual {v0}, Lgb4;->a()I

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    move v3, v1

    .line 51
    :goto_0
    const/4 v5, 0x1

    .line 52
    if-ge v3, v2, :cond_8

    .line 53
    .line 54
    invoke-virtual {v0, v3}, Lgb4;->get(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    check-cast v6, Lom2;

    .line 59
    .line 60
    iget v7, v6, Lom2;->c:I

    .line 61
    .line 62
    new-instance v8, Ldl7;

    .line 63
    .line 64
    invoke-direct {v8, v7}, Ldl7;-><init>(I)V

    .line 65
    .line 66
    .line 67
    iget-object v7, p0, Lkm2;->Y:Ljava/util/Set;

    .line 68
    .line 69
    invoke-interface {v7, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v7

    .line 73
    if-eqz v7, :cond_7

    .line 74
    .line 75
    iget-object v7, v6, Lv3;->a:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v7, Lqv;

    .line 78
    .line 79
    sget-object v8, Lqv;->b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 80
    .line 81
    invoke-virtual {v8, v7}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->decrementAndGet(Ljava/lang/Object;)I

    .line 82
    .line 83
    .line 84
    move-result v7

    .line 85
    if-nez v7, :cond_7

    .line 86
    .line 87
    iget-object v7, v6, Lv3;->b:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v7, Lux0;

    .line 90
    .line 91
    new-instance v8, Lve5;

    .line 92
    .line 93
    invoke-direct {v8, v4}, Lve5;-><init>(I)V

    .line 94
    .line 95
    .line 96
    new-instance v9, Lte5;

    .line 97
    .line 98
    invoke-direct {v9, v8}, Lte5;-><init>(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v7, v9}, Lrm3;->V(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    iget-object v6, v6, Lv3;->b:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v6, Lux0;

    .line 107
    .line 108
    invoke-virtual {v6}, Lrm3;->S()Z

    .line 109
    .line 110
    .line 111
    move-result v7

    .line 112
    const/4 v8, 0x0

    .line 113
    if-eqz v7, :cond_1

    .line 114
    .line 115
    invoke-virtual {v6}, Lrm3;->isCancelled()Z

    .line 116
    .line 117
    .line 118
    move-result v7

    .line 119
    if-nez v7, :cond_1

    .line 120
    .line 121
    invoke-virtual {v6}, Lrm3;->G()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v6

    .line 125
    check-cast v6, Lte5;

    .line 126
    .line 127
    iget-object v6, v6, Lte5;->a:Ljava/lang/Object;

    .line 128
    .line 129
    instance-of v7, v6, Lve5;

    .line 130
    .line 131
    if-nez v7, :cond_1

    .line 132
    .line 133
    if-eqz v6, :cond_1

    .line 134
    .line 135
    move-object v8, v6

    .line 136
    :cond_1
    check-cast v8, Lz77;

    .line 137
    .line 138
    if-eqz v8, :cond_7

    .line 139
    .line 140
    instance-of v6, v8, Ljava/lang/AutoCloseable;

    .line 141
    .line 142
    if-eqz v6, :cond_2

    .line 143
    .line 144
    invoke-virtual {v8}, Lz77;->close()V

    .line 145
    .line 146
    .line 147
    goto :goto_2

    .line 148
    :cond_2
    instance-of v6, v8, Ljava/util/concurrent/ExecutorService;

    .line 149
    .line 150
    if-eqz v6, :cond_6

    .line 151
    .line 152
    check-cast v8, Ljava/util/concurrent/ExecutorService;

    .line 153
    .line 154
    invoke-static {}, Ljava/util/concurrent/ForkJoinPool;->commonPool()Ljava/util/concurrent/ForkJoinPool;

    .line 155
    .line 156
    .line 157
    move-result-object v6

    .line 158
    if-ne v8, v6, :cond_3

    .line 159
    .line 160
    goto :goto_2

    .line 161
    :cond_3
    invoke-interface {v8}, Ljava/util/concurrent/ExecutorService;->isTerminated()Z

    .line 162
    .line 163
    .line 164
    move-result v6

    .line 165
    if-nez v6, :cond_7

    .line 166
    .line 167
    invoke-interface {v8}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 168
    .line 169
    .line 170
    move v7, v1

    .line 171
    :cond_4
    :goto_1
    if-nez v6, :cond_5

    .line 172
    .line 173
    :try_start_0
    sget-object v9, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    .line 174
    .line 175
    const-wide/16 v10, 0x1

    .line 176
    .line 177
    invoke-interface {v8, v10, v11, v9}, Ljava/util/concurrent/ExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    .line 178
    .line 179
    .line 180
    move-result v6
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 181
    goto :goto_1

    .line 182
    :catch_0
    if-nez v7, :cond_4

    .line 183
    .line 184
    invoke-interface {v8}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 185
    .line 186
    .line 187
    move v7, v5

    .line 188
    goto :goto_1

    .line 189
    :cond_5
    if-eqz v7, :cond_7

    .line 190
    .line 191
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 192
    .line 193
    .line 194
    move-result-object v5

    .line 195
    invoke-virtual {v5}, Ljava/lang/Thread;->interrupt()V

    .line 196
    .line 197
    .line 198
    goto :goto_2

    .line 199
    :cond_6
    invoke-static {}, Lkp5;->e()V

    .line 200
    .line 201
    .line 202
    :cond_7
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 203
    .line 204
    goto/16 :goto_0

    .line 205
    .line 206
    :cond_8
    return v5

    .line 207
    :cond_9
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lkm2;->X:Lqm2;

    .line 2
    .line 3
    invoke-virtual {p0}, Lqm2;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
