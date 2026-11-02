.class public final Lk42;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lv06;
.implements Lm82;
.implements Ly23;
.implements Lmu0;
.implements Lh24;
.implements Lgz2;
.implements Lzl8;
.implements Ldr8;
.implements Lk71;


# static fields
.field public static X:Lk42;


# direct methods
.method public static g(Lsu/happ/proxyutility/ui/BaseActivity;Landroidx/coordinatorlayout/widget/CoordinatorLayout;Ljava/lang/String;Lmy2;Ljava/lang/Iterable;II)V
    .locals 7

    .line 1
    sget v0, Lzx2;->B:I

    .line 2
    .line 3
    and-int/lit8 p6, p6, 0x10

    .line 4
    .line 5
    if-eqz p6, :cond_0

    .line 6
    .line 7
    sget-object p4, Ld02;->X:Ld02;

    .line 8
    .line 9
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    const/4 p6, 0x0

    .line 16
    move-object v0, p1

    .line 17
    move-object v1, p6

    .line 18
    :cond_1
    instance-of v2, v0, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 19
    .line 20
    if-eqz v2, :cond_2

    .line 21
    .line 22
    check-cast v0, Landroid/view/ViewGroup;

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_2
    instance-of v2, v0, Landroid/widget/FrameLayout;

    .line 26
    .line 27
    if-eqz v2, :cond_4

    .line 28
    .line 29
    move-object v1, v0

    .line 30
    check-cast v1, Landroid/widget/FrameLayout;

    .line 31
    .line 32
    invoke-virtual {v1}, Landroid/view/View;->getId()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    const v2, 0x1020002

    .line 37
    .line 38
    .line 39
    if-ne v1, v2, :cond_3

    .line 40
    .line 41
    check-cast v0, Landroid/view/ViewGroup;

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_3
    move-object v1, v0

    .line 45
    check-cast v1, Landroid/view/ViewGroup;

    .line 46
    .line 47
    :cond_4
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    instance-of v2, v0, Landroid/view/View;

    .line 52
    .line 53
    if-eqz v2, :cond_5

    .line 54
    .line 55
    check-cast v0, Landroid/view/View;

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_5
    move-object v0, p6

    .line 59
    :goto_0
    if-nez v0, :cond_1

    .line 60
    .line 61
    move-object v0, v1

    .line 62
    :goto_1
    if-eqz v0, :cond_f

    .line 63
    .line 64
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    sget v2, Lt46;->snackbar:I

    .line 73
    .line 74
    const/4 v3, 0x0

    .line 75
    invoke-virtual {v1, v2, v0, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    check-cast v1, Lsu/happ/proxyutility/ui/foundation/component/snackbar/HappSnackbarView;

    .line 83
    .line 84
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    invoke-static {p1}, Lue3;->y(Landroid/content/Context;)Z

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    new-instance v2, Lzx2;

    .line 96
    .line 97
    invoke-direct {v2, v0, v1, v1}, Lv20;-><init>(Landroid/view/ViewGroup;Lsu/happ/proxyutility/ui/foundation/component/snackbar/HappSnackbarView;Lsu/happ/proxyutility/ui/foundation/component/snackbar/HappSnackbarView;)V

    .line 98
    .line 99
    .line 100
    iget-object v0, v2, Lv20;->i:Lu20;

    .line 101
    .line 102
    invoke-virtual {v0, v3}, Lu20;->setAnimationMode(I)V

    .line 103
    .line 104
    .line 105
    new-instance v0, Lcom/google/android/material/snackbar/BaseTransientBottomBar$Behavior;

    .line 106
    .line 107
    invoke-direct {v0}, Lcom/google/android/material/snackbar/BaseTransientBottomBar$Behavior;-><init>()V

    .line 108
    .line 109
    .line 110
    const/4 v4, 0x2

    .line 111
    iput-byte v4, v0, Lcom/google/android/material/behavior/SwipeDismissBehavior;->e:B

    .line 112
    .line 113
    iput-object v0, v2, Lv20;->t:Lcom/google/android/material/snackbar/BaseTransientBottomBar$Behavior;

    .line 114
    .line 115
    iget-object v0, v2, Lv20;->i:Lu20;

    .line 116
    .line 117
    const/high16 v5, 0x43340000    # 180.0f

    .line 118
    .line 119
    invoke-virtual {v0, v5}, Landroid/view/View;->setRotation(F)V

    .line 120
    .line 121
    .line 122
    iget-object v0, v2, Lv20;->i:Lu20;

    .line 123
    .line 124
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 125
    .line 126
    .line 127
    move-result-object v5

    .line 128
    const v6, 0x106000d

    .line 129
    .line 130
    .line 131
    invoke-virtual {v5, v6}, Landroid/content/Context;->getColor(I)I

    .line 132
    .line 133
    .line 134
    move-result v5

    .line 135
    invoke-virtual {v0, v5}, Landroid/view/View;->setBackgroundColor(I)V

    .line 136
    .line 137
    .line 138
    iget-object v0, v2, Lv20;->i:Lu20;

    .line 139
    .line 140
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 144
    .line 145
    .line 146
    move-result-object v5

    .line 147
    if-eqz v5, :cond_e

    .line 148
    .line 149
    check-cast v5, Landroidx/coordinatorlayout/widget/b;

    .line 150
    .line 151
    invoke-virtual {v5, v3, v3, v3, p5}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0, v5}, Lu20;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    .line 158
    .line 159
    .line 160
    move-result p5

    .line 161
    const/4 v0, 0x1

    .line 162
    if-eqz p5, :cond_8

    .line 163
    .line 164
    if-eq p5, v0, :cond_7

    .line 165
    .line 166
    if-ne p5, v4, :cond_6

    .line 167
    .line 168
    goto :goto_2

    .line 169
    :cond_6
    invoke-static {}, Lb61;->c()V

    .line 170
    .line 171
    .line 172
    return-void

    .line 173
    :cond_7
    :goto_2
    const/16 p5, 0x1388

    .line 174
    .line 175
    goto :goto_3

    .line 176
    :cond_8
    const/16 p5, 0x7d0

    .line 177
    .line 178
    :goto_3
    iput p5, v2, Lv20;->k:I

    .line 179
    .line 180
    new-instance p5, Ll00;

    .line 181
    .line 182
    invoke-direct {p5, v2, v4}, Ll00;-><init>(Ljava/lang/Object;B)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {p0}, Landroidx/activity/ComponentActivity;->b()Lz95;

    .line 186
    .line 187
    .line 188
    move-result-object v4

    .line 189
    invoke-virtual {v4, p5}, Lz95;->b(Lu95;)V

    .line 190
    .line 191
    .line 192
    new-instance v4, Lyx2;

    .line 193
    .line 194
    invoke-direct {v4, p1, p5, p0}, Lyx2;-><init>(ZLl00;Lsu/happ/proxyutility/ui/BaseActivity;)V

    .line 195
    .line 196
    .line 197
    iget-object p1, v2, Lv20;->s:Ljava/util/ArrayList;

    .line 198
    .line 199
    if-nez p1, :cond_9

    .line 200
    .line 201
    new-instance p1, Ljava/util/ArrayList;

    .line 202
    .line 203
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 204
    .line 205
    .line 206
    iput-object p1, v2, Lv20;->s:Ljava/util/ArrayList;

    .line 207
    .line 208
    :cond_9
    invoke-interface {p1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    invoke-virtual {v1, p2}, Lsu/happ/proxyutility/ui/foundation/component/snackbar/HappSnackbarView;->setSnackbarMessage(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v1, p3}, Lsu/happ/proxyutility/ui/foundation/component/snackbar/HappSnackbarView;->setSnackbarStatus(Lmy2;)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v1, p4}, Lsu/happ/proxyutility/ui/foundation/component/snackbar/HappSnackbarView;->setActions(Ljava/lang/Iterable;)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 221
    .line 222
    .line 223
    move-result-object p0

    .line 224
    const/16 p1, 0x20

    .line 225
    .line 226
    invoke-virtual {p0, p1}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 227
    .line 228
    .line 229
    invoke-static {}, Lyr6;->f()Lyr6;

    .line 230
    .line 231
    .line 232
    move-result-object p0

    .line 233
    iget p1, v2, Lv20;->k:I

    .line 234
    .line 235
    iget-object p2, v2, Lv20;->v:Ls20;

    .line 236
    .line 237
    iget-object p3, p0, Lyr6;->Y:Ljava/lang/Object;

    .line 238
    .line 239
    monitor-enter p3

    .line 240
    :try_start_0
    invoke-virtual {p0, p2}, Lyr6;->h(Ls20;)Z

    .line 241
    .line 242
    .line 243
    move-result p4

    .line 244
    if-eqz p4, :cond_a

    .line 245
    .line 246
    iget-object p2, p0, Lyr6;->f0:Ljava/lang/Object;

    .line 247
    .line 248
    check-cast p2, Lrc7;

    .line 249
    .line 250
    iput p1, p2, Lrc7;->b:I

    .line 251
    .line 252
    iget-object p1, p0, Lyr6;->Z:Ljava/lang/Object;

    .line 253
    .line 254
    check-cast p1, Landroid/os/Handler;

    .line 255
    .line 256
    invoke-virtual {p1, p2}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 257
    .line 258
    .line 259
    iget-object p1, p0, Lyr6;->f0:Ljava/lang/Object;

    .line 260
    .line 261
    check-cast p1, Lrc7;

    .line 262
    .line 263
    invoke-virtual {p0, p1}, Lyr6;->o(Lrc7;)V

    .line 264
    .line 265
    .line 266
    monitor-exit p3

    .line 267
    return-void

    .line 268
    :catchall_0
    move-exception p0

    .line 269
    goto :goto_5

    .line 270
    :cond_a
    iget-object p4, p0, Lyr6;->g0:Ljava/lang/Object;

    .line 271
    .line 272
    check-cast p4, Lrc7;

    .line 273
    .line 274
    if-eqz p4, :cond_b

    .line 275
    .line 276
    if-eqz p2, :cond_b

    .line 277
    .line 278
    iget-object p4, p4, Lrc7;->a:Ljava/lang/ref/WeakReference;

    .line 279
    .line 280
    invoke-virtual {p4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object p4

    .line 284
    if-ne p4, p2, :cond_b

    .line 285
    .line 286
    move v3, v0

    .line 287
    :cond_b
    if-eqz v3, :cond_c

    .line 288
    .line 289
    iget-object p2, p0, Lyr6;->g0:Ljava/lang/Object;

    .line 290
    .line 291
    check-cast p2, Lrc7;

    .line 292
    .line 293
    iput p1, p2, Lrc7;->b:I

    .line 294
    .line 295
    goto :goto_4

    .line 296
    :cond_c
    new-instance p4, Lrc7;

    .line 297
    .line 298
    invoke-direct {p4, p1, p2}, Lrc7;-><init>(ILs20;)V

    .line 299
    .line 300
    .line 301
    iput-object p4, p0, Lyr6;->g0:Ljava/lang/Object;

    .line 302
    .line 303
    :goto_4
    iget-object p1, p0, Lyr6;->f0:Ljava/lang/Object;

    .line 304
    .line 305
    check-cast p1, Lrc7;

    .line 306
    .line 307
    if-eqz p1, :cond_d

    .line 308
    .line 309
    const/4 p2, 0x4

    .line 310
    invoke-virtual {p0, p1, p2}, Lyr6;->c(Lrc7;I)Z

    .line 311
    .line 312
    .line 313
    move-result p1

    .line 314
    if-eqz p1, :cond_d

    .line 315
    .line 316
    monitor-exit p3

    .line 317
    return-void

    .line 318
    :cond_d
    iput-object p6, p0, Lyr6;->f0:Ljava/lang/Object;

    .line 319
    .line 320
    invoke-virtual {p0}, Lyr6;->p()V

    .line 321
    .line 322
    .line 323
    monitor-exit p3

    .line 324
    return-void

    .line 325
    :goto_5
    monitor-exit p3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 326
    throw p0

    .line 327
    :cond_e
    const-string p0, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams"

    .line 328
    .line 329
    invoke-static {p0}, Lb61;->i(Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    return-void

    .line 333
    :cond_f
    const-string p0, "No suitable parent found from the given view. Please provide a valid view."

    .line 334
    .line 335
    invoke-static {p0}, Lbt;->q(Ljava/lang/String;)V

    .line 336
    .line 337
    .line 338
    return-void
.end method


# virtual methods
.method public a()Lte3;
    .locals 2

    .line 1
    sget-object p0, Lte3;->Z:Lte3;

    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    invoke-static {v0, v1}, Lkm4;->E(J)Lte3;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public b()Lk05;
    .locals 0

    .line 1
    invoke-static {}, Lk05;->j()Lk05;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public c(Lf57;)Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public d()Ler8;
    .locals 0

    .line 1
    new-instance p0, Lkv4;

    .line 2
    .line 3
    invoke-direct {p0}, Lkv4;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public e()Z
    .locals 6

    .line 1
    sget-object p0, Le92;->a:Le92;

    .line 2
    .line 3
    monitor-enter p0

    .line 4
    :try_start_0
    sget v0, Le92;->c:I

    .line 5
    .line 6
    add-int/lit8 v1, v0, 0x1

    .line 7
    .line 8
    sput v1, Le92;->c:I

    .line 9
    .line 10
    const/16 v1, 0x1e

    .line 11
    .line 12
    if-ge v0, v1, :cond_0

    .line 13
    .line 14
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    sget-wide v2, Le92;->d:J

    .line 19
    .line 20
    const-wide/16 v4, 0x7530

    .line 21
    .line 22
    add-long/2addr v2, v4

    .line 23
    cmp-long v0, v0, v2

    .line 24
    .line 25
    if-lez v0, :cond_3

    .line 26
    .line 27
    :cond_0
    const/4 v0, 0x0

    .line 28
    sput v0, Le92;->c:I

    .line 29
    .line 30
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 31
    .line 32
    .line 33
    move-result-wide v1

    .line 34
    sput-wide v1, Le92;->d:J

    .line 35
    .line 36
    sget-object v1, Le92;->b:Ljava/io/File;

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/io/File;->list()[Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    if-nez v1, :cond_1

    .line 43
    .line 44
    new-array v1, v0, [Ljava/lang/String;

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    move-exception v0

    .line 48
    goto :goto_1

    .line 49
    :cond_1
    :goto_0
    array-length v1, v1

    .line 50
    const/16 v2, 0x320

    .line 51
    .line 52
    if-ge v1, v2, :cond_2

    .line 53
    .line 54
    const/4 v0, 0x1

    .line 55
    :cond_2
    sput-boolean v0, Le92;->e:Z

    .line 56
    .line 57
    :cond_3
    sget-boolean v0, Le92;->e:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    .line 59
    monitor-exit p0

    .line 60
    return v0

    .line 61
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 62
    throw v0
.end method

.method public f(Lta7;)Z
    .locals 2

    .line 1
    iget-object p0, p1, Lta7;->a:Lyo1;

    .line 2
    .line 3
    instance-of v0, p0, Lwo1;

    .line 4
    .line 5
    const v1, 0x7fffffff

    .line 6
    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    check-cast p0, Lwo1;

    .line 11
    .line 12
    iget p0, p0, Lwo1;->a:I

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move p0, v1

    .line 16
    :goto_0
    const/16 v0, 0x64

    .line 17
    .line 18
    if-le p0, v0, :cond_2

    .line 19
    .line 20
    iget-object p0, p1, Lta7;->b:Lyo1;

    .line 21
    .line 22
    instance-of p1, p0, Lwo1;

    .line 23
    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    check-cast p0, Lwo1;

    .line 27
    .line 28
    iget v1, p0, Lwo1;->a:I

    .line 29
    .line 30
    :cond_1
    if-le v1, v0, :cond_2

    .line 31
    .line 32
    const/4 p0, 0x1

    .line 33
    return p0

    .line 34
    :cond_2
    const/4 p0, 0x0

    .line 35
    return p0
.end method

.method public get()Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance p0, Lj03;

    .line 2
    .line 3
    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-direct {p0, v0}, Lj03;-><init>(Ljava/util/concurrent/ExecutorService;)V

    .line 8
    .line 9
    .line 10
    return-object p0
.end method

.method public h([B)Z
    .locals 1

    .line 1
    const/4 p0, 0x0

    .line 2
    aget-byte p1, p1, p0

    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    if-ne p1, v0, :cond_0

    .line 6
    .line 7
    return v0

    .line 8
    :cond_0
    return p0
.end method

.method public j(Lj71;)Ljava/lang/Object;
    .locals 0

    .line 1
    throw p1
.end method

.method public y(I)V
    .locals 0

    .line 1
    return-void
.end method
