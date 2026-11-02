.class public final Landroidx/work/impl/workers/ConstraintTrackingWorker;
.super Landroidx/work/CoroutineWorker;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/work/impl/workers/ConstraintTrackingWorker$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\u0008B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\t"
    }
    d2 = {
        "Landroidx/work/impl/workers/ConstraintTrackingWorker;",
        "Landroidx/work/CoroutineWorker;",
        "Landroid/content/Context;",
        "appContext",
        "Landroidx/work/WorkerParameters;",
        "workerParameters",
        "<init>",
        "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V",
        "a",
        "work-runtime"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final g:Landroidx/work/WorkerParameters;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p1, p2}, Landroidx/work/CoroutineWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, Landroidx/work/impl/workers/ConstraintTrackingWorker;->g:Landroidx/work/WorkerParameters;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final e(Lq51;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-object v0, p0, Lec4;->b:Landroidx/work/WorkerParameters;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/work/WorkerParameters;->f:Ljava/util/concurrent/Executor;

    .line 4
    .line 5
    invoke-static {v0}, Lnr4;->x(Ljava/util/concurrent/Executor;)Lu61;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Lr5;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    const/4 v3, 0x6

    .line 13
    invoke-direct {v1, p0, v2, v3}, Lr5;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0, v1, p1}, Lw51;->W(Ls61;Lrn2;Lq51;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public final f(Lec4;Lcc0;Ll49;Ls51;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p4, Lg31;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p4

    .line 6
    check-cast v0, Lg31;

    .line 7
    .line 8
    iget v1, v0, Lg31;->h0:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lg31;->h0:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lg31;

    .line 21
    .line 22
    invoke-direct {v0, p0, p4}, Lg31;-><init>(Landroidx/work/impl/workers/ConstraintTrackingWorker;Ls51;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p0, v0, Lg31;->f0:Ljava/lang/Object;

    .line 26
    .line 27
    iget p4, v0, Lg31;->h0:I

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    const/4 v2, 0x1

    .line 31
    if-eqz p4, :cond_2

    .line 32
    .line 33
    if-ne p4, v2, :cond_1

    .line 34
    .line 35
    invoke-static {p0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 40
    .line 41
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    return-object v1

    .line 45
    :cond_2
    invoke-static {p0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    new-instance p0, Landroidx/work/impl/workers/a;

    .line 49
    .line 50
    invoke-direct {p0, p1, p2, p3, v1}, Landroidx/work/impl/workers/a;-><init>(Lec4;Lcc0;Ll49;Lq51;)V

    .line 51
    .line 52
    .line 53
    iput v2, v0, Lg31;->h0:I

    .line 54
    .line 55
    invoke-static {p0, v0}, Lgv3;->n(Lrn2;Lq51;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    sget-object p1, Lc71;->X:Lc71;

    .line 60
    .line 61
    if-ne p0, p1, :cond_3

    .line 62
    .line 63
    return-object p1

    .line 64
    :cond_3
    :goto_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    return-object p0
.end method

.method public final g(Ls51;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    iget-object v2, v1, Landroidx/work/impl/workers/ConstraintTrackingWorker;->g:Landroidx/work/WorkerParameters;

    .line 6
    .line 7
    instance-of v3, v0, Lh31;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v0

    .line 12
    check-cast v3, Lh31;

    .line 13
    .line 14
    iget v4, v3, Lh31;->i0:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v4, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v4, v5

    .line 23
    iput v4, v3, Lh31;->i0:I

    .line 24
    .line 25
    :goto_0
    move-object v7, v3

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    new-instance v3, Lh31;

    .line 28
    .line 29
    invoke-direct {v3, v1, v0}, Lh31;-><init>(Landroidx/work/impl/workers/ConstraintTrackingWorker;Ls51;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :goto_1
    iget-object v0, v7, Lh31;->g0:Ljava/lang/Object;

    .line 34
    .line 35
    iget v3, v7, Lh31;->i0:I

    .line 36
    .line 37
    const/4 v8, 0x0

    .line 38
    const/4 v9, 0x1

    .line 39
    if-eqz v3, :cond_2

    .line 40
    .line 41
    if-ne v3, v9, :cond_1

    .line 42
    .line 43
    iget-object v2, v7, Lh31;->f0:Lec4;

    .line 44
    .line 45
    :try_start_0
    invoke-static {v0}, Lw39;->n0(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    .line 47
    .line 48
    goto/16 :goto_3

    .line 49
    .line 50
    :catch_0
    move-exception v0

    .line 51
    goto/16 :goto_4

    .line 52
    .line 53
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-object v8

    .line 59
    :cond_2
    invoke-static {v0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    iget-object v0, v1, Lec4;->b:Landroidx/work/WorkerParameters;

    .line 63
    .line 64
    iget-object v3, v0, Landroidx/work/WorkerParameters;->b:Lu91;

    .line 65
    .line 66
    const-string v4, "androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME"

    .line 67
    .line 68
    invoke-virtual {v3, v4}, Lu91;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    if-eqz v3, :cond_10

    .line 73
    .line 74
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    if-nez v4, :cond_3

    .line 79
    .line 80
    goto/16 :goto_8

    .line 81
    .line 82
    :cond_3
    iget-object v4, v1, Lec4;->a:Landroid/content/Context;

    .line 83
    .line 84
    invoke-static {v4}, Lx39;->v0(Landroid/content/Context;)Lx39;

    .line 85
    .line 86
    .line 87
    move-result-object v5

    .line 88
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    iget-object v6, v5, Lx39;->k0:Landroidx/work/impl/WorkDatabase;

    .line 92
    .line 93
    invoke-virtual {v6}, Landroidx/work/impl/WorkDatabase;->x()Ln49;

    .line 94
    .line 95
    .line 96
    move-result-object v6

    .line 97
    iget-object v0, v0, Landroidx/work/WorkerParameters;->a:Ljava/util/UUID;

    .line 98
    .line 99
    invoke-virtual {v0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v6, v0}, Ln49;->c(Ljava/lang/String;)Ll49;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    if-nez v0, :cond_4

    .line 111
    .line 112
    new-instance v0, Lac4;

    .line 113
    .line 114
    invoke-direct {v0}, Lac4;-><init>()V

    .line 115
    .line 116
    .line 117
    return-object v0

    .line 118
    :cond_4
    new-instance v6, Lcc0;

    .line 119
    .line 120
    iget-object v10, v5, Lx39;->s0:Ly5;

    .line 121
    .line 122
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    invoke-direct {v6, v10}, Lcc0;-><init>(Ly5;)V

    .line 126
    .line 127
    .line 128
    iget-object v10, v6, Lcc0;->b:Ljava/util/ArrayList;

    .line 129
    .line 130
    new-instance v11, Ljava/util/ArrayList;

    .line 131
    .line 132
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 136
    .line 137
    .line 138
    move-result-object v10

    .line 139
    :cond_5
    :goto_2
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 140
    .line 141
    .line 142
    move-result v12

    .line 143
    if-eqz v12, :cond_6

    .line 144
    .line 145
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v12

    .line 149
    move-object v13, v12

    .line 150
    check-cast v13, Lw21;

    .line 151
    .line 152
    invoke-interface {v13, v0}, Lw21;->a(Ll49;)Z

    .line 153
    .line 154
    .line 155
    move-result v13

    .line 156
    if-eqz v13, :cond_5

    .line 157
    .line 158
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    goto :goto_2

    .line 162
    :cond_6
    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    .line 163
    .line 164
    .line 165
    move-result v10

    .line 166
    if-nez v10, :cond_7

    .line 167
    .line 168
    invoke-static {}, Llh4;->P0()Llh4;

    .line 169
    .line 170
    .line 171
    move-result-object v10

    .line 172
    sget v12, Lk39;->a:I

    .line 173
    .line 174
    new-instance v15, Lut8;

    .line 175
    .line 176
    const/16 v12, 0xf

    .line 177
    .line 178
    invoke-direct {v15, v12}, Lut8;-><init>(B)V

    .line 179
    .line 180
    .line 181
    const/16 v16, 0x1f

    .line 182
    .line 183
    const/4 v12, 0x0

    .line 184
    const/4 v13, 0x0

    .line 185
    const/4 v14, 0x0

    .line 186
    invoke-static/range {v11 .. v16}, Lwv0;->y0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lgn2;I)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    :cond_7
    invoke-virtual {v11}, Ljava/util/ArrayList;->isEmpty()Z

    .line 193
    .line 194
    .line 195
    move-result v10

    .line 196
    if-nez v10, :cond_8

    .line 197
    .line 198
    sget v0, Ll31;->a:I

    .line 199
    .line 200
    invoke-static {}, Llh4;->P0()Llh4;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    new-instance v0, Lbc4;

    .line 208
    .line 209
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 210
    .line 211
    .line 212
    return-object v0

    .line 213
    :cond_8
    sget v10, Ll31;->a:I

    .line 214
    .line 215
    invoke-static {}, Llh4;->P0()Llh4;

    .line 216
    .line 217
    .line 218
    move-result-object v10

    .line 219
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    :try_start_1
    sget-object v10, Lpz2;->G0:Lpz2;

    .line 223
    .line 224
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v10, v4, v3, v2}, Lpz2;->l(Landroid/content/Context;Ljava/lang/String;Landroidx/work/WorkerParameters;)Lec4;

    .line 228
    .line 229
    .line 230
    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 231
    iget-object v2, v2, Landroidx/work/WorkerParameters;->h:Ly5;

    .line 232
    .line 233
    iget-object v2, v2, Ly5;->h0:Ljava/lang/Object;

    .line 234
    .line 235
    check-cast v2, Lki3;

    .line 236
    .line 237
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 238
    .line 239
    .line 240
    :try_start_2
    invoke-static {v2}, Lnr4;->x(Ljava/util/concurrent/Executor;)Lu61;

    .line 241
    .line 242
    .line 243
    move-result-object v10

    .line 244
    move-object v4, v0

    .line 245
    new-instance v0, Lpi;
    :try_end_2
    .catch Ljava/util/concurrent/CancellationException; {:try_start_2 .. :try_end_2} :catch_1

    .line 246
    .line 247
    const/4 v5, 0x0

    .line 248
    move-object v2, v3

    .line 249
    move-object v3, v6

    .line 250
    const/4 v6, 0x3

    .line 251
    :try_start_3
    invoke-direct/range {v0 .. v6}, Lpi;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 252
    .line 253
    .line 254
    iput-object v2, v7, Lh31;->f0:Lec4;

    .line 255
    .line 256
    iput v9, v7, Lh31;->i0:I

    .line 257
    .line 258
    invoke-static {v10, v0, v7}, Lw51;->W(Ls61;Lrn2;Lq51;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v0
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_0

    .line 262
    sget-object v3, Lc71;->X:Lc71;

    .line 263
    .line 264
    if-ne v0, v3, :cond_9

    .line 265
    .line 266
    return-object v3

    .line 267
    :cond_9
    :goto_3
    :try_start_4
    check-cast v0, Ldc4;
    :try_end_4
    .catch Ljava/util/concurrent/CancellationException; {:try_start_4 .. :try_end_4} :catch_0

    .line 268
    .line 269
    return-object v0

    .line 270
    :catch_1
    move-exception v0

    .line 271
    move-object v2, v3

    .line 272
    :goto_4
    iget-object v1, v1, Lec4;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 273
    .line 274
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 275
    .line 276
    .line 277
    move-result v3

    .line 278
    const/16 v4, -0x100

    .line 279
    .line 280
    if-eq v3, v4, :cond_a

    .line 281
    .line 282
    goto :goto_5

    .line 283
    :cond_a
    instance-of v3, v0, Landroidx/work/impl/workers/ConstraintTrackingWorker$a;

    .line 284
    .line 285
    if-eqz v3, :cond_e

    .line 286
    .line 287
    :goto_5
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 288
    .line 289
    const/16 v5, 0x1f

    .line 290
    .line 291
    if-ge v3, v5, :cond_b

    .line 292
    .line 293
    const/16 v1, -0x200

    .line 294
    .line 295
    goto :goto_6

    .line 296
    :cond_b
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 297
    .line 298
    .line 299
    move-result v3

    .line 300
    if-eq v3, v4, :cond_c

    .line 301
    .line 302
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 303
    .line 304
    .line 305
    move-result v1

    .line 306
    goto :goto_6

    .line 307
    :cond_c
    instance-of v1, v0, Landroidx/work/impl/workers/ConstraintTrackingWorker$a;

    .line 308
    .line 309
    if-eqz v1, :cond_d

    .line 310
    .line 311
    move-object v1, v0

    .line 312
    check-cast v1, Landroidx/work/impl/workers/ConstraintTrackingWorker$a;

    .line 313
    .line 314
    iget v1, v1, Landroidx/work/impl/workers/ConstraintTrackingWorker$a;->X:I

    .line 315
    .line 316
    :goto_6
    invoke-virtual {v2, v1}, Lec4;->d(I)V

    .line 317
    .line 318
    .line 319
    goto :goto_7

    .line 320
    :cond_d
    const-string v0, "Unreachable"

    .line 321
    .line 322
    invoke-static {v0}, Lbt;->i(Ljava/lang/String;)V

    .line 323
    .line 324
    .line 325
    return-object v8

    .line 326
    :cond_e
    :goto_7
    instance-of v1, v0, Landroidx/work/impl/workers/ConstraintTrackingWorker$a;

    .line 327
    .line 328
    if-eqz v1, :cond_f

    .line 329
    .line 330
    new-instance v0, Lbc4;

    .line 331
    .line 332
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 333
    .line 334
    .line 335
    return-object v0

    .line 336
    :cond_f
    throw v0

    .line 337
    :catchall_0
    sget v0, Ll31;->a:I

    .line 338
    .line 339
    invoke-static {}, Llh4;->P0()Llh4;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 344
    .line 345
    .line 346
    iget-object v0, v5, Lx39;->j0:Lxy0;

    .line 347
    .line 348
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 349
    .line 350
    .line 351
    new-instance v0, Lac4;

    .line 352
    .line 353
    invoke-direct {v0}, Lac4;-><init>()V

    .line 354
    .line 355
    .line 356
    return-object v0

    .line 357
    :cond_10
    :goto_8
    sget v0, Ll31;->a:I

    .line 358
    .line 359
    invoke-static {}, Llh4;->P0()Llh4;

    .line 360
    .line 361
    .line 362
    move-result-object v0

    .line 363
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 364
    .line 365
    .line 366
    new-instance v0, Lac4;

    .line 367
    .line 368
    invoke-direct {v0}, Lac4;-><init>()V

    .line 369
    .line 370
    .line 371
    return-object v0
.end method
