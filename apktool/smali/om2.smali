.class public final Lom2;
.super Lv3;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lme5;


# instance fields
.field public final c:I

.field public final d:I

.field public final e:Lqv;

.field public final synthetic f:Lqm2;


# direct methods
.method public constructor <init>(Lqm2;IILqv;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lom2;->f:Lqm2;

    .line 2
    .line 3
    const/4 p1, 0x3

    .line 4
    invoke-direct {p0, p1}, Lv3;-><init>(B)V

    .line 5
    .line 6
    .line 7
    iput p2, p0, Lom2;->c:I

    .line 8
    .line 9
    iput p3, p0, Lom2;->d:I

    .line 10
    .line 11
    iput-object p4, p0, Lom2;->e:Lqv;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 7

    .line 1
    sget-object v0, Lpm2;->f0:Lpm2;

    .line 2
    .line 3
    instance-of v1, p1, Lve5;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    move-object v2, p1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v2, 0x0

    .line 12
    :goto_0
    check-cast v2, Lqe5;

    .line 13
    .line 14
    const/4 v3, 0x1

    .line 15
    if-eqz v2, :cond_8

    .line 16
    .line 17
    instance-of p1, v2, Lz77;

    .line 18
    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    check-cast v2, Lz77;

    .line 22
    .line 23
    invoke-virtual {v2}, Lz77;->V0()Lz77;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    const-class p1, Lz77;

    .line 29
    .line 30
    sget-object v1, Lyb6;->a:Lzb6;

    .line 31
    .line 32
    invoke-virtual {v1, p1}, Lzb6;->b(Ljava/lang/Class;)Lzu3;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-interface {v2, p1}, Lbo8;->C0(Lzu3;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    check-cast p1, Lz77;

    .line 41
    .line 42
    if-eqz p1, :cond_2

    .line 43
    .line 44
    invoke-virtual {p1}, Lz77;->V0()Lz77;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    goto :goto_1

    .line 49
    :cond_2
    new-instance p1, Lf63;

    .line 50
    .line 51
    invoke-direct {p1, v2}, Lf63;-><init>(Lqe5;)V

    .line 52
    .line 53
    .line 54
    new-instance v1, Lz77;

    .line 55
    .line 56
    invoke-direct {v1, v2, p1}, Lz77;-><init>(Lqe5;Lf63;)V

    .line 57
    .line 58
    .line 59
    move-object p1, v1

    .line 60
    :goto_1
    iget-object v1, p0, Lv3;->b:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v1, Lux0;

    .line 63
    .line 64
    new-instance v2, Lte5;

    .line 65
    .line 66
    invoke-direct {v2, p1}, Lte5;-><init>(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1, v2}, Lrm3;->V(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-nez v1, :cond_b

    .line 74
    .line 75
    instance-of v1, p1, Ljava/lang/AutoCloseable;

    .line 76
    .line 77
    if-eqz v1, :cond_3

    .line 78
    .line 79
    invoke-virtual {p1}, Lz77;->close()V

    .line 80
    .line 81
    .line 82
    goto :goto_4

    .line 83
    :cond_3
    instance-of v1, p1, Ljava/util/concurrent/ExecutorService;

    .line 84
    .line 85
    if-eqz v1, :cond_7

    .line 86
    .line 87
    check-cast p1, Ljava/util/concurrent/ExecutorService;

    .line 88
    .line 89
    invoke-static {}, Ljava/util/concurrent/ForkJoinPool;->commonPool()Ljava/util/concurrent/ForkJoinPool;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    if-ne p1, v1, :cond_4

    .line 94
    .line 95
    goto :goto_4

    .line 96
    :cond_4
    invoke-interface {p1}, Ljava/util/concurrent/ExecutorService;->isTerminated()Z

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    if-nez v1, :cond_b

    .line 101
    .line 102
    invoke-interface {p1}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 103
    .line 104
    .line 105
    const/4 v2, 0x0

    .line 106
    :cond_5
    :goto_2
    if-nez v1, :cond_6

    .line 107
    .line 108
    :try_start_0
    sget-object v4, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    .line 109
    .line 110
    const-wide/16 v5, 0x1

    .line 111
    .line 112
    invoke-interface {p1, v5, v6, v4}, Ljava/util/concurrent/ExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    .line 113
    .line 114
    .line 115
    move-result v1
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 116
    goto :goto_2

    .line 117
    :catch_0
    if-nez v2, :cond_5

    .line 118
    .line 119
    invoke-interface {p1}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 120
    .line 121
    .line 122
    move v2, v3

    .line 123
    goto :goto_2

    .line 124
    :cond_6
    if-eqz v2, :cond_b

    .line 125
    .line 126
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    invoke-virtual {p1}, Ljava/lang/Thread;->interrupt()V

    .line 131
    .line 132
    .line 133
    goto :goto_4

    .line 134
    :cond_7
    invoke-static {}, Lkp5;->e()V

    .line 135
    .line 136
    .line 137
    return-void

    .line 138
    :cond_8
    iget-object v2, p0, Lv3;->b:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast v2, Lux0;

    .line 141
    .line 142
    if-nez v1, :cond_9

    .line 143
    .line 144
    if-eqz p1, :cond_9

    .line 145
    .line 146
    move p1, v3

    .line 147
    goto :goto_3

    .line 148
    :cond_9
    if-nez p1, :cond_a

    .line 149
    .line 150
    const/4 p1, 0x2

    .line 151
    goto :goto_3

    .line 152
    :cond_a
    check-cast p1, Lve5;

    .line 153
    .line 154
    iget p1, p1, Lve5;->a:I

    .line 155
    .line 156
    :goto_3
    new-instance v1, Lve5;

    .line 157
    .line 158
    invoke-direct {v1, p1}, Lve5;-><init>(I)V

    .line 159
    .line 160
    .line 161
    new-instance p1, Lte5;

    .line 162
    .line 163
    invoke-direct {p1, v1}, Lte5;-><init>(Ljava/lang/Object;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v2, p1}, Lrm3;->V(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    :cond_b
    :goto_4
    iget-object p1, p0, Lom2;->e:Lqv;

    .line 170
    .line 171
    sget-object v1, Lqv;->b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 172
    .line 173
    invoke-virtual {v1, p1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->decrementAndGet(Ljava/lang/Object;)I

    .line 174
    .line 175
    .line 176
    move-result p1

    .line 177
    if-nez p1, :cond_13

    .line 178
    .line 179
    iget-object p1, p0, Lom2;->f:Lqm2;

    .line 180
    .line 181
    iget-object p1, p1, Lqm2;->h:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 182
    .line 183
    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 184
    .line 185
    .line 186
    move-result-object p1

    .line 187
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 191
    .line 192
    .line 193
    move-result v2

    .line 194
    if-nez v2, :cond_12

    .line 195
    .line 196
    iget-object p0, p0, Lom2;->f:Lqm2;

    .line 197
    .line 198
    iget-object p1, p0, Lqm2;->g:Lqv;

    .line 199
    .line 200
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v1, p1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->decrementAndGet(Ljava/lang/Object;)I

    .line 204
    .line 205
    .line 206
    move-result p1

    .line 207
    if-eqz p1, :cond_c

    .line 208
    .line 209
    goto :goto_6

    .line 210
    :cond_c
    iget-object v1, p0, Lqm2;->f:Ltv;

    .line 211
    .line 212
    :cond_d
    iget-object p1, v1, Ltv;->a:Ljava/lang/Object;

    .line 213
    .line 214
    move-object v2, p1

    .line 215
    check-cast v2, Lpm2;

    .line 216
    .line 217
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 218
    .line 219
    .line 220
    move-result v4

    .line 221
    if-eqz v4, :cond_f

    .line 222
    .line 223
    if-ne v4, v3, :cond_e

    .line 224
    .line 225
    move-object v2, v0

    .line 226
    goto :goto_5

    .line 227
    :cond_e
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 228
    .line 229
    new-instance v0, Ljava/lang/StringBuilder;

    .line 230
    .line 231
    const-string v1, "Unexpected frame state for "

    .line 232
    .line 233
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    const-string p0, "! State is "

    .line 240
    .line 241
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 242
    .line 243
    .line 244
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    const/16 p0, 0x20

    .line 248
    .line 249
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object p0

    .line 256
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 257
    .line 258
    .line 259
    throw p1

    .line 260
    :cond_f
    sget-object v2, Lpm2;->Z:Lpm2;

    .line 261
    .line 262
    :goto_5
    invoke-virtual {v1, p1, v2}, Ltv;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    move-result p1

    .line 266
    if-eqz p1, :cond_d

    .line 267
    .line 268
    iget-object p1, p0, Lqm2;->h:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 269
    .line 270
    invoke-virtual {p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 271
    .line 272
    .line 273
    move-result-object p1

    .line 274
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 275
    .line 276
    .line 277
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 278
    .line 279
    .line 280
    move-result v1

    .line 281
    if-nez v1, :cond_11

    .line 282
    .line 283
    if-ne v2, v0, :cond_13

    .line 284
    .line 285
    iget-object p0, p0, Lqm2;->h:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 286
    .line 287
    invoke-virtual {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 288
    .line 289
    .line 290
    move-result-object p0

    .line 291
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 292
    .line 293
    .line 294
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 295
    .line 296
    .line 297
    move-result p1

    .line 298
    if-nez p1, :cond_10

    .line 299
    .line 300
    goto :goto_6

    .line 301
    :cond_10
    invoke-static {p0}, Lp61;->k(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 302
    .line 303
    .line 304
    move-result-object p0

    .line 305
    throw p0

    .line 306
    :cond_11
    invoke-static {p1}, Lp61;->k(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 307
    .line 308
    .line 309
    move-result-object p0

    .line 310
    throw p0

    .line 311
    :cond_12
    invoke-static {p1}, Lp61;->k(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 312
    .line 313
    .line 314
    move-result-object p0

    .line 315
    throw p0

    .line 316
    :cond_13
    :goto_6
    return-void
.end method
