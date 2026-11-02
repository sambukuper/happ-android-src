.class public final Lxb;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 14
    iput-byte p2, p0, Lxb;->X:B

    iput-object p1, p0, Lxb;->Y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lq89;)V
    .locals 1

    .line 1
    const/16 v0, 0x1d

    .line 2
    .line 3
    iput-byte v0, p0, Lxb;->X:B

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lxb;->Y:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public a()V
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    :try_start_0
    iget-object v2, p0, Lxb;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v2, Lc37;

    .line 6
    .line 7
    iget-object v2, v2, Lc37;->X:Ljava/util/ArrayDeque;

    .line 8
    .line 9
    monitor-enter v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 10
    const/4 v3, 0x1

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    :try_start_1
    iget-object v0, p0, Lxb;->Y:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, Lc37;

    .line 16
    .line 17
    iget v4, v0, Lc37;->f0:I

    .line 18
    .line 19
    const/4 v5, 0x4

    .line 20
    if-ne v4, v5, :cond_0

    .line 21
    .line 22
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 23
    if-eqz v1, :cond_2

    .line 24
    .line 25
    :goto_1
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    .line 30
    .line 31
    .line 32
    goto :goto_2

    .line 33
    :catchall_0
    move-exception p0

    .line 34
    goto :goto_3

    .line 35
    :cond_0
    :try_start_2
    iget-wide v6, v0, Lc37;->g0:J

    .line 36
    .line 37
    const-wide/16 v8, 0x1

    .line 38
    .line 39
    add-long/2addr v6, v8

    .line 40
    iput-wide v6, v0, Lc37;->g0:J

    .line 41
    .line 42
    iput v5, v0, Lc37;->f0:I

    .line 43
    .line 44
    move v0, v3

    .line 45
    :cond_1
    iget-object v4, p0, Lxb;->Y:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v4, Lc37;

    .line 48
    .line 49
    iget-object v4, v4, Lc37;->X:Ljava/util/ArrayDeque;

    .line 50
    .line 51
    invoke-virtual {v4}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    check-cast v4, Ljava/lang/Runnable;

    .line 56
    .line 57
    if-nez v4, :cond_3

    .line 58
    .line 59
    iget-object p0, p0, Lxb;->Y:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast p0, Lc37;

    .line 62
    .line 63
    iput v3, p0, Lc37;->f0:I

    .line 64
    .line 65
    monitor-exit v2

    .line 66
    if-eqz v1, :cond_2

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_2
    :goto_2
    return-void

    .line 70
    :cond_3
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 71
    :try_start_3
    invoke-static {}, Ljava/lang/Thread;->interrupted()Z

    .line 72
    .line 73
    .line 74
    move-result v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 75
    or-int/2addr v1, v2

    .line 76
    :try_start_4
    invoke-interface {v4}, Ljava/lang/Runnable;->run()V
    :try_end_4
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :catchall_1
    move-exception p0

    .line 81
    goto :goto_4

    .line 82
    :catch_0
    :try_start_5
    const-string v2, "SequentialExecutor"

    .line 83
    .line 84
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    invoke-static {v2}, Lhi5;->z0(Ljava/lang/String;)Ljava/lang/String;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :goto_3
    :try_start_6
    monitor-exit v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 92
    :try_start_7
    throw p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 93
    :goto_4
    if-eqz v1, :cond_4

    .line 94
    .line 95
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 100
    .line 101
    .line 102
    :cond_4
    throw p0
.end method

.method public final run()V
    .locals 20

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-byte v0, v1, Lxb;->X:B

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    const-wide/16 v3, 0x0

    .line 7
    .line 8
    const/4 v5, 0x0

    .line 9
    const-wide/16 v6, -0x1

    .line 10
    .line 11
    const/4 v8, 0x2

    .line 12
    const/4 v9, 0x0

    .line 13
    const/4 v10, 0x1

    .line 14
    const/4 v11, 0x0

    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    new-instance v0, Lx11;

    .line 19
    .line 20
    const/4 v2, 0x4

    .line 21
    invoke-direct {v0, v2, v9, v9}, Lx11;-><init>(ILandroid/app/PendingIntent;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    iget-object v1, v1, Lxb;->Y:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, Lq89;

    .line 27
    .line 28
    iget-object v1, v1, Lq89;->n:Lbl;

    .line 29
    .line 30
    invoke-virtual {v1, v0}, Lbl;->j(Lx11;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :pswitch_0
    iget-object v0, v1, Lxb;->Y:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, Lq09;

    .line 37
    .line 38
    iget-object v0, v0, Lq09;->X:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, Li89;

    .line 41
    .line 42
    iget-object v0, v0, Li89;->h:Lis2;

    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    const-string v2, " disconnecting because it was signed out."

    .line 53
    .line 54
    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    check-cast v0, Lu10;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Lu10;->c(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :pswitch_1
    iget-object v0, v1, Lxb;->Y:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v0, Li89;

    .line 67
    .line 68
    invoke-virtual {v0}, Li89;->a()V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :pswitch_2
    iget-object v0, v1, Lxb;->Y:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v0, Lmw8;

    .line 75
    .line 76
    invoke-virtual {v0, v11}, Lmw8;->o(I)V

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :pswitch_3
    monitor-enter p0

    .line 81
    :try_start_0
    iget-object v0, v1, Lxb;->Y:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v0, Lkw8;

    .line 84
    .line 85
    iput-boolean v11, v0, Lkw8;->Y:Z

    .line 86
    .line 87
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 88
    :goto_0
    sget-object v0, Lkw8;->k0:Ljava/lang/ref/ReferenceQueue;

    .line 89
    .line 90
    invoke-virtual {v0}, Ljava/lang/ref/ReferenceQueue;->poll()Ljava/lang/ref/Reference;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    if-eqz v0, :cond_0

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_0
    iget-object v0, v1, Lxb;->Y:Ljava/lang/Object;

    .line 98
    .line 99
    check-cast v0, Lkw8;

    .line 100
    .line 101
    iget-object v0, v0, Lkw8;->Z:Landroid/view/View;

    .line 102
    .line 103
    invoke-virtual {v0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    iget-object v2, v1, Lxb;->Y:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v2, Lkw8;

    .line 110
    .line 111
    if-nez v0, :cond_1

    .line 112
    .line 113
    iget-object v0, v2, Lkw8;->Z:Landroid/view/View;

    .line 114
    .line 115
    sget-object v2, Lkw8;->l0:Liw8;

    .line 116
    .line 117
    invoke-virtual {v0, v2}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 118
    .line 119
    .line 120
    iget-object v0, v1, Lxb;->Y:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v0, Lkw8;

    .line 123
    .line 124
    iget-object v0, v0, Lkw8;->Z:Landroid/view/View;

    .line 125
    .line 126
    invoke-virtual {v0, v2}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 127
    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_1
    iget-boolean v0, v2, Lkw8;->f0:Z

    .line 131
    .line 132
    if-eqz v0, :cond_2

    .line 133
    .line 134
    invoke-virtual {v2}, Lkw8;->f()V

    .line 135
    .line 136
    .line 137
    goto :goto_1

    .line 138
    :cond_2
    invoke-virtual {v2}, Lkw8;->b()Z

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    if-nez v0, :cond_3

    .line 143
    .line 144
    goto :goto_1

    .line 145
    :cond_3
    iput-boolean v10, v2, Lkw8;->f0:Z

    .line 146
    .line 147
    invoke-virtual {v2}, Lkw8;->a()V

    .line 148
    .line 149
    .line 150
    iput-boolean v11, v2, Lkw8;->f0:Z

    .line 151
    .line 152
    :goto_1
    return-void

    .line 153
    :catchall_0
    move-exception v0

    .line 154
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 155
    throw v0

    .line 156
    :pswitch_4
    iget-object v0, v1, Lxb;->Y:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v0, Lsb8;

    .line 159
    .line 160
    iget-object v1, v0, Lsb8;->h:Landroid/view/Window$Callback;

    .line 161
    .line 162
    invoke-virtual {v0}, Lsb8;->u0()Landroid/view/Menu;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    instance-of v2, v0, Lnt4;

    .line 167
    .line 168
    if-eqz v2, :cond_4

    .line 169
    .line 170
    move-object v2, v0

    .line 171
    check-cast v2, Lnt4;

    .line 172
    .line 173
    goto :goto_2

    .line 174
    :cond_4
    move-object v2, v9

    .line 175
    :goto_2
    if-eqz v2, :cond_5

    .line 176
    .line 177
    invoke-virtual {v2}, Lnt4;->w()V

    .line 178
    .line 179
    .line 180
    :cond_5
    :try_start_2
    invoke-interface {v0}, Landroid/view/Menu;->clear()V

    .line 181
    .line 182
    .line 183
    invoke-interface {v1, v11, v0}, Landroid/view/Window$Callback;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    .line 184
    .line 185
    .line 186
    move-result v3

    .line 187
    if-eqz v3, :cond_6

    .line 188
    .line 189
    invoke-interface {v1, v11, v9, v0}, Landroid/view/Window$Callback;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    .line 190
    .line 191
    .line 192
    move-result v1

    .line 193
    if-nez v1, :cond_7

    .line 194
    .line 195
    goto :goto_3

    .line 196
    :catchall_1
    move-exception v0

    .line 197
    goto :goto_4

    .line 198
    :cond_6
    :goto_3
    invoke-interface {v0}, Landroid/view/Menu;->clear()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 199
    .line 200
    .line 201
    :cond_7
    if-eqz v2, :cond_8

    .line 202
    .line 203
    invoke-virtual {v2}, Lnt4;->v()V

    .line 204
    .line 205
    .line 206
    :cond_8
    return-void

    .line 207
    :goto_4
    if-eqz v2, :cond_9

    .line 208
    .line 209
    invoke-virtual {v2}, Lnt4;->v()V

    .line 210
    .line 211
    .line 212
    :cond_9
    throw v0

    .line 213
    :pswitch_5
    iget-object v0, v1, Lxb;->Y:Ljava/lang/Object;

    .line 214
    .line 215
    check-cast v0, Landroidx/appcompat/widget/Toolbar;

    .line 216
    .line 217
    invoke-virtual {v0}, Landroidx/appcompat/widget/Toolbar;->u()Z

    .line 218
    .line 219
    .line 220
    return-void

    .line 221
    :pswitch_6
    iget-object v0, v1, Lxb;->Y:Ljava/lang/Object;

    .line 222
    .line 223
    check-cast v0, Lcom/google/android/material/textfield/TextInputLayout;

    .line 224
    .line 225
    iget-object v0, v0, Lcom/google/android/material/textfield/TextInputLayout;->h0:Lg12;

    .line 226
    .line 227
    iget-object v0, v0, Lg12;->l0:Lcom/google/android/material/internal/CheckableImageButton;

    .line 228
    .line 229
    invoke-virtual {v0}, Landroid/view/View;->performClick()Z

    .line 230
    .line 231
    .line 232
    invoke-virtual {v0}, Landroid/view/View;->jumpDrawablesToCurrentState()V

    .line 233
    .line 234
    .line 235
    return-void

    .line 236
    :cond_a
    :goto_5
    :pswitch_7
    iget-object v0, v1, Lxb;->Y:Ljava/lang/Object;

    .line 237
    .line 238
    move-object v2, v0

    .line 239
    check-cast v2, Lf28;

    .line 240
    .line 241
    monitor-enter v2

    .line 242
    :try_start_3
    invoke-virtual {v2}, Lf28;->b()Lw18;

    .line 243
    .line 244
    .line 245
    move-result-object v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_4

    .line 246
    monitor-exit v2

    .line 247
    if-nez v3, :cond_b

    .line 248
    .line 249
    return-void

    .line 250
    :cond_b
    iget-object v2, v3, Lw18;->c:Le28;

    .line 251
    .line 252
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    iget-object v0, v1, Lxb;->Y:Ljava/lang/Object;

    .line 256
    .line 257
    move-object v4, v0

    .line 258
    check-cast v4, Lf28;

    .line 259
    .line 260
    sget-object v0, Lf28;->i:Ljava/util/logging/Logger;

    .line 261
    .line 262
    sget-object v5, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    .line 263
    .line 264
    invoke-virtual {v0, v5}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    .line 265
    .line 266
    .line 267
    move-result v5

    .line 268
    if-eqz v5, :cond_c

    .line 269
    .line 270
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 271
    .line 272
    .line 273
    move-result-wide v8

    .line 274
    const-string v0, "starting"

    .line 275
    .line 276
    invoke-static {v3, v2, v0}, Ld28;->e(Lw18;Le28;Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    goto :goto_6

    .line 280
    :cond_c
    move-wide v8, v6

    .line 281
    :goto_6
    :try_start_4
    invoke-virtual {v4, v3}, Lf28;->e(Lw18;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 282
    .line 283
    .line 284
    if-eqz v5, :cond_a

    .line 285
    .line 286
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 287
    .line 288
    .line 289
    move-result-wide v4

    .line 290
    sub-long/2addr v4, v8

    .line 291
    invoke-static {v4, v5}, Ld28;->d(J)Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    const-string v4, "finished run in "

    .line 296
    .line 297
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    invoke-static {v3, v2, v0}, Ld28;->e(Lw18;Le28;Ljava/lang/String;)V

    .line 302
    .line 303
    .line 304
    goto :goto_5

    .line 305
    :catchall_2
    move-exception v0

    .line 306
    :try_start_5
    iget-object v4, v4, Lf28;->a:Ly45;

    .line 307
    .line 308
    iget-object v4, v4, Ly45;->X:Ljava/lang/Object;

    .line 309
    .line 310
    check-cast v4, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 311
    .line 312
    invoke-virtual {v4, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 313
    .line 314
    .line 315
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 316
    :catchall_3
    move-exception v0

    .line 317
    if-eqz v5, :cond_d

    .line 318
    .line 319
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 320
    .line 321
    .line 322
    move-result-wide v4

    .line 323
    sub-long/2addr v4, v8

    .line 324
    invoke-static {v4, v5}, Ld28;->d(J)Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v1

    .line 328
    const-string v4, "failed a run in "

    .line 329
    .line 330
    invoke-virtual {v4, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 331
    .line 332
    .line 333
    move-result-object v1

    .line 334
    invoke-static {v3, v2, v1}, Ld28;->e(Lw18;Le28;Ljava/lang/String;)V

    .line 335
    .line 336
    .line 337
    :cond_d
    throw v0

    .line 338
    :catchall_4
    move-exception v0

    .line 339
    monitor-exit v2

    .line 340
    throw v0

    .line 341
    :pswitch_8
    iget-object v0, v1, Lxb;->Y:Ljava/lang/Object;

    .line 342
    .line 343
    check-cast v0, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;

    .line 344
    .line 345
    invoke-virtual {v0}, Landroidx/recyclerview/widget/StaggeredGridLayoutManager;->a1()Z

    .line 346
    .line 347
    .line 348
    return-void

    .line 349
    :pswitch_9
    :try_start_6
    invoke-virtual {v1}, Lxb;->a()V
    :try_end_6
    .catch Ljava/lang/Error; {:try_start_6 .. :try_end_6} :catch_0

    .line 350
    .line 351
    .line 352
    return-void

    .line 353
    :catch_0
    move-exception v0

    .line 354
    iget-object v2, v1, Lxb;->Y:Ljava/lang/Object;

    .line 355
    .line 356
    check-cast v2, Lc37;

    .line 357
    .line 358
    iget-object v2, v2, Lc37;->X:Ljava/util/ArrayDeque;

    .line 359
    .line 360
    monitor-enter v2

    .line 361
    :try_start_7
    iget-object v1, v1, Lxb;->Y:Ljava/lang/Object;

    .line 362
    .line 363
    check-cast v1, Lc37;

    .line 364
    .line 365
    iput v10, v1, Lc37;->f0:I

    .line 366
    .line 367
    monitor-exit v2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 368
    throw v0

    .line 369
    :catchall_5
    move-exception v0

    .line 370
    :try_start_8
    monitor-exit v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    .line 371
    throw v0

    .line 372
    :pswitch_a
    iget-object v0, v1, Lxb;->Y:Ljava/lang/Object;

    .line 373
    .line 374
    check-cast v0, Lxy6;

    .line 375
    .line 376
    iget-object v0, v0, Lxy6;->b:Landroid/view/ViewGroup;

    .line 377
    .line 378
    check-cast v0, Landroidx/leanback/widget/SearchBar;

    .line 379
    .line 380
    iput-boolean v10, v0, Landroidx/leanback/widget/SearchBar;->o0:Z

    .line 381
    .line 382
    iget-object v0, v0, Landroidx/leanback/widget/SearchBar;->g0:Landroidx/leanback/widget/SpeechOrbView;

    .line 383
    .line 384
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 385
    .line 386
    .line 387
    return-void

    .line 388
    :pswitch_b
    iget-object v0, v1, Lxb;->Y:Ljava/lang/Object;

    .line 389
    .line 390
    check-cast v0, Lqc4;

    .line 391
    .line 392
    iget-object v2, v0, Lqc4;->a:Ljava/lang/Object;

    .line 393
    .line 394
    monitor-enter v2

    .line 395
    :try_start_9
    iget-object v0, v1, Lxb;->Y:Ljava/lang/Object;

    .line 396
    .line 397
    check-cast v0, Lqc4;

    .line 398
    .line 399
    iget-object v0, v0, Lqc4;->f:Ljava/lang/Object;

    .line 400
    .line 401
    iget-object v3, v1, Lxb;->Y:Ljava/lang/Object;

    .line 402
    .line 403
    check-cast v3, Lqc4;

    .line 404
    .line 405
    sget-object v4, Lqc4;->k:Ljava/lang/Object;

    .line 406
    .line 407
    iput-object v4, v3, Lqc4;->f:Ljava/lang/Object;

    .line 408
    .line 409
    monitor-exit v2
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    .line 410
    iget-object v1, v1, Lxb;->Y:Ljava/lang/Object;

    .line 411
    .line 412
    check-cast v1, Lqc4;

    .line 413
    .line 414
    invoke-virtual {v1, v0}, Lqc4;->j(Ljava/lang/Object;)V

    .line 415
    .line 416
    .line 417
    return-void

    .line 418
    :catchall_6
    move-exception v0

    .line 419
    :try_start_a
    monitor-exit v2
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    .line 420
    throw v0

    .line 421
    :pswitch_c
    iget-object v0, v1, Lxb;->Y:Ljava/lang/Object;

    .line 422
    .line 423
    check-cast v0, Lkb4;

    .line 424
    .line 425
    iput-object v9, v0, Lkb4;->Y:Ljava/util/ArrayList;

    .line 426
    .line 427
    iput-object v9, v0, Lkb4;->X:Ljava/util/ArrayList;

    .line 428
    .line 429
    return-void

    .line 430
    :pswitch_d
    iget-object v0, v1, Lxb;->Y:Ljava/lang/Object;

    .line 431
    .line 432
    check-cast v0, Lyi3;

    .line 433
    .line 434
    iget-object v12, v0, Lyi3;->m:Ly42;

    .line 435
    .line 436
    iget-object v2, v0, Lyi3;->c:Landroidx/recyclerview/widget/l;

    .line 437
    .line 438
    if-eqz v2, :cond_1a

    .line 439
    .line 440
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 441
    .line 442
    .line 443
    move-result-wide v6

    .line 444
    iget-wide v8, v0, Lyi3;->B:J

    .line 445
    .line 446
    const-wide/high16 v13, -0x8000000000000000L

    .line 447
    .line 448
    cmp-long v2, v8, v13

    .line 449
    .line 450
    if-nez v2, :cond_e

    .line 451
    .line 452
    :goto_7
    move-wide/from16 v16, v3

    .line 453
    .line 454
    goto :goto_8

    .line 455
    :cond_e
    sub-long v3, v6, v8

    .line 456
    .line 457
    goto :goto_7

    .line 458
    :goto_8
    iget-object v2, v0, Lyi3;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 459
    .line 460
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/j;

    .line 461
    .line 462
    .line 463
    move-result-object v2

    .line 464
    iget-object v3, v0, Lyi3;->A:Landroid/graphics/Rect;

    .line 465
    .line 466
    if-nez v3, :cond_f

    .line 467
    .line 468
    new-instance v3, Landroid/graphics/Rect;

    .line 469
    .line 470
    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    .line 471
    .line 472
    .line 473
    iput-object v3, v0, Lyi3;->A:Landroid/graphics/Rect;

    .line 474
    .line 475
    :cond_f
    iget-object v4, v0, Lyi3;->c:Landroidx/recyclerview/widget/l;

    .line 476
    .line 477
    iget-object v4, v4, Landroidx/recyclerview/widget/l;->a:Landroid/view/View;

    .line 478
    .line 479
    invoke-virtual {v2, v4, v3}, Landroidx/recyclerview/widget/j;->o(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 480
    .line 481
    .line 482
    invoke-virtual {v2}, Landroidx/recyclerview/widget/j;->p()Z

    .line 483
    .line 484
    .line 485
    move-result v3

    .line 486
    if-eqz v3, :cond_11

    .line 487
    .line 488
    iget v3, v0, Lyi3;->j:F

    .line 489
    .line 490
    iget v4, v0, Lyi3;->h:F

    .line 491
    .line 492
    add-float/2addr v3, v4

    .line 493
    float-to-int v3, v3

    .line 494
    iget-object v4, v0, Lyi3;->A:Landroid/graphics/Rect;

    .line 495
    .line 496
    iget v4, v4, Landroid/graphics/Rect;->left:I

    .line 497
    .line 498
    sub-int v4, v3, v4

    .line 499
    .line 500
    iget-object v8, v0, Lyi3;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 501
    .line 502
    invoke-virtual {v8}, Landroid/view/View;->getPaddingLeft()I

    .line 503
    .line 504
    .line 505
    move-result v8

    .line 506
    sub-int/2addr v4, v8

    .line 507
    iget v8, v0, Lyi3;->h:F

    .line 508
    .line 509
    cmpg-float v9, v8, v5

    .line 510
    .line 511
    if-gez v9, :cond_10

    .line 512
    .line 513
    if-gez v4, :cond_10

    .line 514
    .line 515
    :goto_9
    move v15, v4

    .line 516
    goto :goto_a

    .line 517
    :cond_10
    cmpl-float v4, v8, v5

    .line 518
    .line 519
    if-lez v4, :cond_11

    .line 520
    .line 521
    iget-object v4, v0, Lyi3;->c:Landroidx/recyclerview/widget/l;

    .line 522
    .line 523
    iget-object v4, v4, Landroidx/recyclerview/widget/l;->a:Landroid/view/View;

    .line 524
    .line 525
    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    .line 526
    .line 527
    .line 528
    move-result v4

    .line 529
    add-int/2addr v4, v3

    .line 530
    iget-object v3, v0, Lyi3;->A:Landroid/graphics/Rect;

    .line 531
    .line 532
    iget v3, v3, Landroid/graphics/Rect;->right:I

    .line 533
    .line 534
    add-int/2addr v4, v3

    .line 535
    iget-object v3, v0, Lyi3;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 536
    .line 537
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    .line 538
    .line 539
    .line 540
    move-result v3

    .line 541
    iget-object v8, v0, Lyi3;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 542
    .line 543
    invoke-virtual {v8}, Landroid/view/View;->getPaddingRight()I

    .line 544
    .line 545
    .line 546
    move-result v8

    .line 547
    sub-int/2addr v3, v8

    .line 548
    sub-int/2addr v4, v3

    .line 549
    if-lez v4, :cond_11

    .line 550
    .line 551
    goto :goto_9

    .line 552
    :cond_11
    move v15, v11

    .line 553
    :goto_a
    invoke-virtual {v2}, Landroidx/recyclerview/widget/j;->q()Z

    .line 554
    .line 555
    .line 556
    move-result v2

    .line 557
    if-eqz v2, :cond_13

    .line 558
    .line 559
    iget v2, v0, Lyi3;->k:F

    .line 560
    .line 561
    iget v3, v0, Lyi3;->i:F

    .line 562
    .line 563
    add-float/2addr v2, v3

    .line 564
    float-to-int v2, v2

    .line 565
    iget-object v3, v0, Lyi3;->A:Landroid/graphics/Rect;

    .line 566
    .line 567
    iget v3, v3, Landroid/graphics/Rect;->top:I

    .line 568
    .line 569
    sub-int v3, v2, v3

    .line 570
    .line 571
    iget-object v4, v0, Lyi3;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 572
    .line 573
    invoke-virtual {v4}, Landroid/view/View;->getPaddingTop()I

    .line 574
    .line 575
    .line 576
    move-result v4

    .line 577
    sub-int/2addr v3, v4

    .line 578
    iget v4, v0, Lyi3;->i:F

    .line 579
    .line 580
    cmpg-float v8, v4, v5

    .line 581
    .line 582
    if-gez v8, :cond_12

    .line 583
    .line 584
    if-gez v3, :cond_12

    .line 585
    .line 586
    :goto_b
    move v11, v3

    .line 587
    goto :goto_c

    .line 588
    :cond_12
    cmpl-float v3, v4, v5

    .line 589
    .line 590
    if-lez v3, :cond_13

    .line 591
    .line 592
    iget-object v3, v0, Lyi3;->c:Landroidx/recyclerview/widget/l;

    .line 593
    .line 594
    iget-object v3, v3, Landroidx/recyclerview/widget/l;->a:Landroid/view/View;

    .line 595
    .line 596
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    .line 597
    .line 598
    .line 599
    move-result v3

    .line 600
    add-int/2addr v3, v2

    .line 601
    iget-object v2, v0, Lyi3;->A:Landroid/graphics/Rect;

    .line 602
    .line 603
    iget v2, v2, Landroid/graphics/Rect;->bottom:I

    .line 604
    .line 605
    add-int/2addr v3, v2

    .line 606
    iget-object v2, v0, Lyi3;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 607
    .line 608
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    .line 609
    .line 610
    .line 611
    move-result v2

    .line 612
    iget-object v4, v0, Lyi3;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 613
    .line 614
    invoke-virtual {v4}, Landroid/view/View;->getPaddingBottom()I

    .line 615
    .line 616
    .line 617
    move-result v4

    .line 618
    sub-int/2addr v2, v4

    .line 619
    sub-int/2addr v3, v2

    .line 620
    if-lez v3, :cond_13

    .line 621
    .line 622
    goto :goto_b

    .line 623
    :cond_13
    :goto_c
    move-wide v2, v13

    .line 624
    if-eqz v15, :cond_14

    .line 625
    .line 626
    iget-object v13, v0, Lyi3;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 627
    .line 628
    iget-object v4, v0, Lyi3;->c:Landroidx/recyclerview/widget/l;

    .line 629
    .line 630
    iget-object v4, v4, Landroidx/recyclerview/widget/l;->a:Landroid/view/View;

    .line 631
    .line 632
    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    .line 633
    .line 634
    .line 635
    move-result v14

    .line 636
    iget-object v4, v0, Lyi3;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 637
    .line 638
    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    .line 639
    .line 640
    .line 641
    invoke-virtual/range {v12 .. v17}, Ly42;->h(Landroidx/recyclerview/widget/RecyclerView;IIJ)I

    .line 642
    .line 643
    .line 644
    move-result v15

    .line 645
    :cond_14
    move v4, v15

    .line 646
    if-eqz v11, :cond_15

    .line 647
    .line 648
    iget-object v13, v0, Lyi3;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 649
    .line 650
    iget-object v5, v0, Lyi3;->c:Landroidx/recyclerview/widget/l;

    .line 651
    .line 652
    iget-object v5, v5, Landroidx/recyclerview/widget/l;->a:Landroid/view/View;

    .line 653
    .line 654
    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    .line 655
    .line 656
    .line 657
    move-result v14

    .line 658
    iget-object v5, v0, Lyi3;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 659
    .line 660
    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    .line 661
    .line 662
    .line 663
    move v15, v11

    .line 664
    invoke-virtual/range {v12 .. v17}, Ly42;->h(Landroidx/recyclerview/widget/RecyclerView;IIJ)I

    .line 665
    .line 666
    .line 667
    move-result v11

    .line 668
    goto :goto_d

    .line 669
    :cond_15
    move v15, v11

    .line 670
    :goto_d
    if-nez v4, :cond_17

    .line 671
    .line 672
    if-eqz v11, :cond_16

    .line 673
    .line 674
    goto :goto_e

    .line 675
    :cond_16
    iput-wide v2, v0, Lyi3;->B:J

    .line 676
    .line 677
    goto :goto_f

    .line 678
    :cond_17
    :goto_e
    iget-wide v8, v0, Lyi3;->B:J

    .line 679
    .line 680
    cmp-long v2, v8, v2

    .line 681
    .line 682
    if-nez v2, :cond_18

    .line 683
    .line 684
    iput-wide v6, v0, Lyi3;->B:J

    .line 685
    .line 686
    :cond_18
    iget-object v2, v0, Lyi3;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 687
    .line 688
    invoke-virtual {v2, v4, v11}, Landroidx/recyclerview/widget/RecyclerView;->scrollBy(II)V

    .line 689
    .line 690
    .line 691
    iget-object v2, v0, Lyi3;->c:Landroidx/recyclerview/widget/l;

    .line 692
    .line 693
    if-eqz v2, :cond_19

    .line 694
    .line 695
    invoke-virtual {v0, v2}, Lyi3;->p(Landroidx/recyclerview/widget/l;)V

    .line 696
    .line 697
    .line 698
    :cond_19
    iget-object v2, v0, Lyi3;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 699
    .line 700
    iget-object v3, v0, Lyi3;->s:Lxb;

    .line 701
    .line 702
    invoke-virtual {v2, v3}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 703
    .line 704
    .line 705
    iget-object v0, v0, Lyi3;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 706
    .line 707
    sget-object v2, Lcw8;->a:Ljava/util/WeakHashMap;

    .line 708
    .line 709
    invoke-virtual {v0, v1}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 710
    .line 711
    .line 712
    :cond_1a
    :goto_f
    return-void

    .line 713
    :pswitch_e
    iget-object v0, v1, Lxb;->Y:Ljava/lang/Object;

    .line 714
    .line 715
    check-cast v0, Lsu/happ/proxyutility/ui/foundation/component/snackbar/HappSnackbarView;

    .line 716
    .line 717
    iget-object v0, v0, Lsu/happ/proxyutility/ui/foundation/component/snackbar/HappSnackbarView;->i0:Landroid/widget/FrameLayout;

    .line 718
    .line 719
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 720
    .line 721
    .line 722
    return-void

    .line 723
    :pswitch_f
    iget-object v0, v1, Lxb;->Y:Ljava/lang/Object;

    .line 724
    .line 725
    check-cast v0, Llr;

    .line 726
    .line 727
    iget-object v1, v0, Llr;->f0:Ljava/lang/Object;

    .line 728
    .line 729
    check-cast v1, Lkv2;

    .line 730
    .line 731
    iget-object v2, v1, Lkv2;->X:Ljava/util/concurrent/atomic/AtomicReference;

    .line 732
    .line 733
    invoke-virtual {v2, v9}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    .line 734
    .line 735
    .line 736
    move-result-object v2

    .line 737
    if-eqz v2, :cond_1b

    .line 738
    .line 739
    iget-object v0, v0, Llr;->Y:Ljava/lang/Object;

    .line 740
    .line 741
    check-cast v0, Landroid/os/Handler;

    .line 742
    .line 743
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 744
    .line 745
    .line 746
    :cond_1b
    return-void

    .line 747
    :pswitch_10
    iget-object v0, v1, Lxb;->Y:Ljava/lang/Object;

    .line 748
    .line 749
    check-cast v0, Landroidx/leanback/widget/GridLayoutManager;

    .line 750
    .line 751
    invoke-virtual {v0}, Landroidx/recyclerview/widget/j;->K0()V

    .line 752
    .line 753
    .line 754
    return-void

    .line 755
    :pswitch_11
    iget-object v0, v1, Lxb;->Y:Ljava/lang/Object;

    .line 756
    .line 757
    check-cast v0, Lxb4;

    .line 758
    .line 759
    invoke-interface {v0, v10}, Ljava/util/concurrent/Future;->cancel(Z)Z

    .line 760
    .line 761
    .line 762
    return-void

    .line 763
    :pswitch_12
    iget-object v0, v1, Lxb;->Y:Ljava/lang/Object;

    .line 764
    .line 765
    check-cast v0, Lkk7;

    .line 766
    .line 767
    iput-boolean v11, v0, Lkk7;->j:Z

    .line 768
    .line 769
    invoke-virtual {v0}, Lkk7;->n()V

    .line 770
    .line 771
    .line 772
    return-void

    .line 773
    :pswitch_13
    iget-object v0, v1, Lxb;->Y:Ljava/lang/Object;

    .line 774
    .line 775
    check-cast v0, Lml2;

    .line 776
    .line 777
    invoke-virtual {v0, v10}, Lml2;->A(Z)Z

    .line 778
    .line 779
    .line 780
    return-void

    .line 781
    :pswitch_14
    iget-object v0, v1, Lxb;->Y:Ljava/lang/Object;

    .line 782
    .line 783
    check-cast v0, Lqk2;

    .line 784
    .line 785
    iget-object v1, v0, Lqk2;->M0:Lnk2;

    .line 786
    .line 787
    if-eqz v1, :cond_1c

    .line 788
    .line 789
    invoke-virtual {v0}, Lqk2;->g()Lnk2;

    .line 790
    .line 791
    .line 792
    :cond_1c
    return-void

    .line 793
    :pswitch_15
    iget-object v0, v1, Lxb;->Y:Ljava/lang/Object;

    .line 794
    .line 795
    check-cast v0, Lg82;

    .line 796
    .line 797
    iget-object v1, v0, Lg82;->z:Landroid/animation/ValueAnimator;

    .line 798
    .line 799
    iget-byte v3, v0, Lg82;->A:B

    .line 800
    .line 801
    if-eq v3, v10, :cond_1d

    .line 802
    .line 803
    if-eq v3, v8, :cond_1e

    .line 804
    .line 805
    goto :goto_10

    .line 806
    :cond_1d
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->cancel()V

    .line 807
    .line 808
    .line 809
    :cond_1e
    iput-byte v2, v0, Lg82;->A:B

    .line 810
    .line 811
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 812
    .line 813
    .line 814
    move-result-object v0

    .line 815
    check-cast v0, Ljava/lang/Float;

    .line 816
    .line 817
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 818
    .line 819
    .line 820
    move-result v0

    .line 821
    new-array v2, v8, [F

    .line 822
    .line 823
    aput v0, v2, v11

    .line 824
    .line 825
    aput v5, v2, v10

    .line 826
    .line 827
    invoke-virtual {v1, v2}, Landroid/animation/ValueAnimator;->setFloatValues([F)V

    .line 828
    .line 829
    .line 830
    const-wide/16 v2, 0x1f4

    .line 831
    .line 832
    invoke-virtual {v1, v2, v3}, Landroid/animation/ValueAnimator;->setDuration(J)Landroid/animation/ValueAnimator;

    .line 833
    .line 834
    .line 835
    invoke-virtual {v1}, Landroid/animation/ValueAnimator;->start()V

    .line 836
    .line 837
    .line 838
    :goto_10
    return-void

    .line 839
    :pswitch_16
    iget-object v0, v1, Lxb;->Y:Ljava/lang/Object;

    .line 840
    .line 841
    check-cast v0, Lqw1;

    .line 842
    .line 843
    iput-object v9, v0, Lqw1;->q0:Lxb;

    .line 844
    .line 845
    invoke-virtual {v0}, Lqw1;->drawableStateChanged()V

    .line 846
    .line 847
    .line 848
    return-void

    .line 849
    :pswitch_17
    iget-object v0, v1, Lxb;->Y:Ljava/lang/Object;

    .line 850
    .line 851
    check-cast v0, Landroidx/drawerlayout/widget/a;

    .line 852
    .line 853
    iget-object v1, v0, Landroidx/drawerlayout/widget/a;->d:Landroidx/drawerlayout/widget/DrawerLayout;

    .line 854
    .line 855
    iget-object v3, v0, Landroidx/drawerlayout/widget/a;->b:Lmw8;

    .line 856
    .line 857
    iget v3, v3, Lmw8;->o:I

    .line 858
    .line 859
    iget-byte v4, v0, Landroidx/drawerlayout/widget/a;->a:B

    .line 860
    .line 861
    if-ne v4, v2, :cond_1f

    .line 862
    .line 863
    move v5, v10

    .line 864
    goto :goto_11

    .line 865
    :cond_1f
    move v5, v11

    .line 866
    :goto_11
    const/4 v6, 0x5

    .line 867
    if-eqz v5, :cond_21

    .line 868
    .line 869
    invoke-virtual {v1, v2}, Landroidx/drawerlayout/widget/DrawerLayout;->d(I)Landroid/view/View;

    .line 870
    .line 871
    .line 872
    move-result-object v7

    .line 873
    if-eqz v7, :cond_20

    .line 874
    .line 875
    invoke-virtual {v7}, Landroid/view/View;->getWidth()I

    .line 876
    .line 877
    .line 878
    move-result v8

    .line 879
    neg-int v8, v8

    .line 880
    goto :goto_12

    .line 881
    :cond_20
    move v8, v11

    .line 882
    :goto_12
    add-int/2addr v8, v3

    .line 883
    goto :goto_13

    .line 884
    :cond_21
    invoke-virtual {v1, v6}, Landroidx/drawerlayout/widget/DrawerLayout;->d(I)Landroid/view/View;

    .line 885
    .line 886
    .line 887
    move-result-object v7

    .line 888
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 889
    .line 890
    .line 891
    move-result v8

    .line 892
    sub-int/2addr v8, v3

    .line 893
    :goto_13
    if-eqz v7, :cond_27

    .line 894
    .line 895
    if-eqz v5, :cond_22

    .line 896
    .line 897
    invoke-virtual {v7}, Landroid/view/View;->getLeft()I

    .line 898
    .line 899
    .line 900
    move-result v3

    .line 901
    if-lt v3, v8, :cond_23

    .line 902
    .line 903
    :cond_22
    if-nez v5, :cond_27

    .line 904
    .line 905
    invoke-virtual {v7}, Landroid/view/View;->getLeft()I

    .line 906
    .line 907
    .line 908
    move-result v3

    .line 909
    if-le v3, v8, :cond_27

    .line 910
    .line 911
    :cond_23
    invoke-virtual {v1, v7}, Landroidx/drawerlayout/widget/DrawerLayout;->f(Landroid/view/View;)I

    .line 912
    .line 913
    .line 914
    move-result v3

    .line 915
    if-nez v3, :cond_27

    .line 916
    .line 917
    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 918
    .line 919
    .line 920
    move-result-object v3

    .line 921
    check-cast v3, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;

    .line 922
    .line 923
    iget-object v0, v0, Landroidx/drawerlayout/widget/a;->b:Lmw8;

    .line 924
    .line 925
    invoke-virtual {v7}, Landroid/view/View;->getTop()I

    .line 926
    .line 927
    .line 928
    move-result v5

    .line 929
    invoke-virtual {v0, v7, v8, v5}, Lmw8;->r(Landroid/view/View;II)Z

    .line 930
    .line 931
    .line 932
    iput-boolean v10, v3, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;->c:Z

    .line 933
    .line 934
    invoke-virtual {v1}, Landroid/view/View;->invalidate()V

    .line 935
    .line 936
    .line 937
    if-ne v4, v2, :cond_24

    .line 938
    .line 939
    move v2, v6

    .line 940
    :cond_24
    invoke-virtual {v1, v2}, Landroidx/drawerlayout/widget/DrawerLayout;->d(I)Landroid/view/View;

    .line 941
    .line 942
    .line 943
    move-result-object v0

    .line 944
    if-eqz v0, :cond_25

    .line 945
    .line 946
    invoke-virtual {v1, v0}, Landroidx/drawerlayout/widget/DrawerLayout;->b(Landroid/view/View;)V

    .line 947
    .line 948
    .line 949
    :cond_25
    iget-boolean v0, v1, Landroidx/drawerlayout/widget/DrawerLayout;->v0:Z

    .line 950
    .line 951
    if-nez v0, :cond_27

    .line 952
    .line 953
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 954
    .line 955
    .line 956
    move-result-wide v2

    .line 957
    const/4 v8, 0x0

    .line 958
    const/4 v9, 0x0

    .line 959
    const/4 v6, 0x3

    .line 960
    const/4 v7, 0x0

    .line 961
    move-wide v4, v2

    .line 962
    invoke-static/range {v2 .. v9}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    .line 963
    .line 964
    .line 965
    move-result-object v0

    .line 966
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 967
    .line 968
    .line 969
    move-result v2

    .line 970
    :goto_14
    if-ge v11, v2, :cond_26

    .line 971
    .line 972
    invoke-virtual {v1, v11}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 973
    .line 974
    .line 975
    move-result-object v3

    .line 976
    invoke-virtual {v3, v0}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    .line 977
    .line 978
    .line 979
    add-int/lit8 v11, v11, 0x1

    .line 980
    .line 981
    goto :goto_14

    .line 982
    :cond_26
    invoke-virtual {v0}, Landroid/view/MotionEvent;->recycle()V

    .line 983
    .line 984
    .line 985
    iput-boolean v10, v1, Landroidx/drawerlayout/widget/DrawerLayout;->v0:Z

    .line 986
    .line 987
    :cond_27
    return-void

    .line 988
    :pswitch_18
    iget-object v0, v1, Lxb;->Y:Ljava/lang/Object;

    .line 989
    .line 990
    check-cast v0, Lsn1;

    .line 991
    .line 992
    iget-object v1, v0, Lsn1;->g1:Lpn1;

    .line 993
    .line 994
    iget-object v0, v0, Lsn1;->o1:Landroid/app/Dialog;

    .line 995
    .line 996
    invoke-virtual {v1, v0}, Lpn1;->onDismiss(Landroid/content/DialogInterface;)V

    .line 997
    .line 998
    .line 999
    return-void

    .line 1000
    :pswitch_19
    iget-object v0, v1, Lxb;->Y:Ljava/lang/Object;

    .line 1001
    .line 1002
    check-cast v0, Landroidx/leanback/widget/picker/DatePicker;

    .line 1003
    .line 1004
    iget v1, v0, Landroidx/leanback/widget/picker/DatePicker;->z0:I

    .line 1005
    .line 1006
    iget v2, v0, Landroidx/leanback/widget/picker/DatePicker;->y0:I

    .line 1007
    .line 1008
    iget v3, v0, Landroidx/leanback/widget/picker/DatePicker;->A0:I

    .line 1009
    .line 1010
    filled-new-array {v1, v2, v3}, [I

    .line 1011
    .line 1012
    .line 1013
    move-result-object v1

    .line 1014
    move v2, v10

    .line 1015
    move v3, v2

    .line 1016
    :goto_15
    if-ltz v8, :cond_32

    .line 1017
    .line 1018
    aget v4, v1, v8

    .line 1019
    .line 1020
    if-gez v4, :cond_28

    .line 1021
    .line 1022
    goto/16 :goto_1e

    .line 1023
    .line 1024
    :cond_28
    sget-object v5, Landroidx/leanback/widget/picker/DatePicker;->H0:[I

    .line 1025
    .line 1026
    aget v5, v5, v8

    .line 1027
    .line 1028
    iget-object v6, v0, Landroidx/leanback/widget/picker/Picker;->h0:Ljava/util/ArrayList;

    .line 1029
    .line 1030
    if-nez v6, :cond_29

    .line 1031
    .line 1032
    move-object v4, v9

    .line 1033
    goto :goto_16

    .line 1034
    :cond_29
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1035
    .line 1036
    .line 1037
    move-result-object v4

    .line 1038
    check-cast v4, Lcn5;

    .line 1039
    .line 1040
    :goto_16
    if-eqz v2, :cond_2b

    .line 1041
    .line 1042
    iget-object v6, v0, Landroidx/leanback/widget/picker/DatePicker;->D0:Ljava/util/Calendar;

    .line 1043
    .line 1044
    invoke-virtual {v6, v5}, Ljava/util/Calendar;->get(I)I

    .line 1045
    .line 1046
    .line 1047
    move-result v6

    .line 1048
    iget v7, v4, Lcn5;->b:I

    .line 1049
    .line 1050
    if-eq v6, v7, :cond_2a

    .line 1051
    .line 1052
    iput v6, v4, Lcn5;->b:I

    .line 1053
    .line 1054
    :goto_17
    move v6, v10

    .line 1055
    goto :goto_18

    .line 1056
    :cond_2a
    move v6, v11

    .line 1057
    goto :goto_18

    .line 1058
    :cond_2b
    iget-object v6, v0, Landroidx/leanback/widget/picker/DatePicker;->F0:Ljava/util/Calendar;

    .line 1059
    .line 1060
    invoke-virtual {v6, v5}, Ljava/util/Calendar;->getActualMinimum(I)I

    .line 1061
    .line 1062
    .line 1063
    move-result v6

    .line 1064
    iget v7, v4, Lcn5;->b:I

    .line 1065
    .line 1066
    if-eq v6, v7, :cond_2a

    .line 1067
    .line 1068
    iput v6, v4, Lcn5;->b:I

    .line 1069
    .line 1070
    goto :goto_17

    .line 1071
    :goto_18
    if-eqz v3, :cond_2d

    .line 1072
    .line 1073
    iget-object v7, v0, Landroidx/leanback/widget/picker/DatePicker;->E0:Ljava/util/Calendar;

    .line 1074
    .line 1075
    invoke-virtual {v7, v5}, Ljava/util/Calendar;->get(I)I

    .line 1076
    .line 1077
    .line 1078
    move-result v7

    .line 1079
    iget v12, v4, Lcn5;->c:I

    .line 1080
    .line 1081
    if-eq v7, v12, :cond_2c

    .line 1082
    .line 1083
    iput v7, v4, Lcn5;->c:I

    .line 1084
    .line 1085
    :goto_19
    move v7, v10

    .line 1086
    goto :goto_1a

    .line 1087
    :cond_2c
    move v7, v11

    .line 1088
    :goto_1a
    or-int/2addr v6, v7

    .line 1089
    goto :goto_1b

    .line 1090
    :cond_2d
    iget-object v7, v0, Landroidx/leanback/widget/picker/DatePicker;->F0:Ljava/util/Calendar;

    .line 1091
    .line 1092
    invoke-virtual {v7, v5}, Ljava/util/Calendar;->getActualMaximum(I)I

    .line 1093
    .line 1094
    .line 1095
    move-result v7

    .line 1096
    iget v12, v4, Lcn5;->c:I

    .line 1097
    .line 1098
    if-eq v7, v12, :cond_2c

    .line 1099
    .line 1100
    iput v7, v4, Lcn5;->c:I

    .line 1101
    .line 1102
    goto :goto_19

    .line 1103
    :goto_1b
    iget-object v7, v0, Landroidx/leanback/widget/picker/DatePicker;->F0:Ljava/util/Calendar;

    .line 1104
    .line 1105
    invoke-virtual {v7, v5}, Ljava/util/Calendar;->get(I)I

    .line 1106
    .line 1107
    .line 1108
    move-result v7

    .line 1109
    iget-object v12, v0, Landroidx/leanback/widget/picker/DatePicker;->D0:Ljava/util/Calendar;

    .line 1110
    .line 1111
    invoke-virtual {v12, v5}, Ljava/util/Calendar;->get(I)I

    .line 1112
    .line 1113
    .line 1114
    move-result v12

    .line 1115
    if-ne v7, v12, :cond_2e

    .line 1116
    .line 1117
    move v7, v10

    .line 1118
    goto :goto_1c

    .line 1119
    :cond_2e
    move v7, v11

    .line 1120
    :goto_1c
    and-int/2addr v2, v7

    .line 1121
    iget-object v7, v0, Landroidx/leanback/widget/picker/DatePicker;->F0:Ljava/util/Calendar;

    .line 1122
    .line 1123
    invoke-virtual {v7, v5}, Ljava/util/Calendar;->get(I)I

    .line 1124
    .line 1125
    .line 1126
    move-result v7

    .line 1127
    iget-object v12, v0, Landroidx/leanback/widget/picker/DatePicker;->E0:Ljava/util/Calendar;

    .line 1128
    .line 1129
    invoke-virtual {v12, v5}, Ljava/util/Calendar;->get(I)I

    .line 1130
    .line 1131
    .line 1132
    move-result v12

    .line 1133
    if-ne v7, v12, :cond_2f

    .line 1134
    .line 1135
    move v7, v10

    .line 1136
    goto :goto_1d

    .line 1137
    :cond_2f
    move v7, v11

    .line 1138
    :goto_1d
    and-int/2addr v3, v7

    .line 1139
    if-eqz v6, :cond_30

    .line 1140
    .line 1141
    aget v6, v1, v8

    .line 1142
    .line 1143
    invoke-virtual {v0, v6, v4}, Landroidx/leanback/widget/picker/Picker;->a(ILcn5;)V

    .line 1144
    .line 1145
    .line 1146
    :cond_30
    aget v4, v1, v8

    .line 1147
    .line 1148
    iget-object v6, v0, Landroidx/leanback/widget/picker/DatePicker;->F0:Ljava/util/Calendar;

    .line 1149
    .line 1150
    invoke-virtual {v6, v5}, Ljava/util/Calendar;->get(I)I

    .line 1151
    .line 1152
    .line 1153
    move-result v5

    .line 1154
    iget-object v6, v0, Landroidx/leanback/widget/picker/Picker;->h0:Ljava/util/ArrayList;

    .line 1155
    .line 1156
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1157
    .line 1158
    .line 1159
    move-result-object v6

    .line 1160
    check-cast v6, Lcn5;

    .line 1161
    .line 1162
    iget v7, v6, Lcn5;->a:I

    .line 1163
    .line 1164
    if-eq v7, v5, :cond_31

    .line 1165
    .line 1166
    iput v5, v6, Lcn5;->a:I

    .line 1167
    .line 1168
    iget-object v6, v0, Landroidx/leanback/widget/picker/Picker;->g0:Ljava/util/ArrayList;

    .line 1169
    .line 1170
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1171
    .line 1172
    .line 1173
    move-result-object v6

    .line 1174
    check-cast v6, Landroidx/leanback/widget/VerticalGridView;

    .line 1175
    .line 1176
    if-eqz v6, :cond_31

    .line 1177
    .line 1178
    iget-object v7, v0, Landroidx/leanback/widget/picker/Picker;->h0:Ljava/util/ArrayList;

    .line 1179
    .line 1180
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1181
    .line 1182
    .line 1183
    move-result-object v4

    .line 1184
    check-cast v4, Lcn5;

    .line 1185
    .line 1186
    iget v4, v4, Lcn5;->b:I

    .line 1187
    .line 1188
    sub-int/2addr v5, v4

    .line 1189
    invoke-virtual {v6, v5}, Lb20;->setSelectedPosition(I)V

    .line 1190
    .line 1191
    .line 1192
    :cond_31
    :goto_1e
    add-int/lit8 v8, v8, -0x1

    .line 1193
    .line 1194
    goto/16 :goto_15

    .line 1195
    .line 1196
    :cond_32
    return-void

    .line 1197
    :pswitch_1a
    iget-object v0, v1, Lxb;->Y:Ljava/lang/Object;

    .line 1198
    .line 1199
    check-cast v0, Lm70;

    .line 1200
    .line 1201
    iput-boolean v11, v0, Lm70;->c:Z

    .line 1202
    .line 1203
    iget-object v1, v0, Lm70;->e:Ljava/lang/Object;

    .line 1204
    .line 1205
    check-cast v1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 1206
    .line 1207
    iget-object v2, v1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->Q:Lmw8;

    .line 1208
    .line 1209
    if-eqz v2, :cond_33

    .line 1210
    .line 1211
    invoke-virtual {v2}, Lmw8;->g()Z

    .line 1212
    .line 1213
    .line 1214
    move-result v2

    .line 1215
    if-eqz v2, :cond_33

    .line 1216
    .line 1217
    iget v1, v0, Lm70;->b:I

    .line 1218
    .line 1219
    invoke-virtual {v0, v1}, Lm70;->d(I)V

    .line 1220
    .line 1221
    .line 1222
    goto :goto_1f

    .line 1223
    :cond_33
    iget v2, v1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->P:I

    .line 1224
    .line 1225
    if-ne v2, v8, :cond_34

    .line 1226
    .line 1227
    iget v0, v0, Lm70;->b:I

    .line 1228
    .line 1229
    invoke-virtual {v1, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->O(I)V

    .line 1230
    .line 1231
    .line 1232
    :cond_34
    :goto_1f
    return-void

    .line 1233
    :pswitch_1b
    iget-object v0, v1, Lxb;->Y:Ljava/lang/Object;

    .line 1234
    .line 1235
    check-cast v0, Lub4;

    .line 1236
    .line 1237
    iget-object v2, v0, Lub4;->Z:Lqw1;

    .line 1238
    .line 1239
    iget-object v5, v0, Lub4;->X:Llx;

    .line 1240
    .line 1241
    iget-boolean v8, v0, Lub4;->p0:Z

    .line 1242
    .line 1243
    if-nez v8, :cond_35

    .line 1244
    .line 1245
    goto/16 :goto_21

    .line 1246
    .line 1247
    :cond_35
    iget-boolean v8, v0, Lub4;->n0:Z

    .line 1248
    .line 1249
    if-eqz v8, :cond_36

    .line 1250
    .line 1251
    iput-boolean v11, v0, Lub4;->n0:Z

    .line 1252
    .line 1253
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 1254
    .line 1255
    .line 1256
    move-result-wide v8

    .line 1257
    iput-wide v8, v5, Llx;->e:J

    .line 1258
    .line 1259
    iput-wide v6, v5, Llx;->g:J

    .line 1260
    .line 1261
    iput-wide v8, v5, Llx;->f:J

    .line 1262
    .line 1263
    const/high16 v6, 0x3f000000    # 0.5f

    .line 1264
    .line 1265
    iput v6, v5, Llx;->h:F

    .line 1266
    .line 1267
    :cond_36
    iget-wide v6, v5, Llx;->g:J

    .line 1268
    .line 1269
    cmp-long v6, v6, v3

    .line 1270
    .line 1271
    if-lez v6, :cond_37

    .line 1272
    .line 1273
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 1274
    .line 1275
    .line 1276
    move-result-wide v6

    .line 1277
    iget-wide v8, v5, Llx;->g:J

    .line 1278
    .line 1279
    iget v10, v5, Llx;->i:I

    .line 1280
    .line 1281
    int-to-long v12, v10

    .line 1282
    add-long/2addr v8, v12

    .line 1283
    cmp-long v6, v6, v8

    .line 1284
    .line 1285
    if-lez v6, :cond_37

    .line 1286
    .line 1287
    goto :goto_20

    .line 1288
    :cond_37
    invoke-virtual {v0}, Lub4;->e()Z

    .line 1289
    .line 1290
    .line 1291
    move-result v6

    .line 1292
    if-nez v6, :cond_38

    .line 1293
    .line 1294
    :goto_20
    iput-boolean v11, v0, Lub4;->p0:Z

    .line 1295
    .line 1296
    goto :goto_21

    .line 1297
    :cond_38
    iget-boolean v6, v0, Lub4;->o0:Z

    .line 1298
    .line 1299
    if-eqz v6, :cond_39

    .line 1300
    .line 1301
    iput-boolean v11, v0, Lub4;->o0:Z

    .line 1302
    .line 1303
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 1304
    .line 1305
    .line 1306
    move-result-wide v12

    .line 1307
    const/16 v18, 0x0

    .line 1308
    .line 1309
    const/16 v19, 0x0

    .line 1310
    .line 1311
    const/16 v16, 0x3

    .line 1312
    .line 1313
    const/16 v17, 0x0

    .line 1314
    .line 1315
    move-wide v14, v12

    .line 1316
    invoke-static/range {v12 .. v19}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    .line 1317
    .line 1318
    .line 1319
    move-result-object v6

    .line 1320
    invoke-virtual {v2, v6}, Lqw1;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 1321
    .line 1322
    .line 1323
    invoke-virtual {v6}, Landroid/view/MotionEvent;->recycle()V

    .line 1324
    .line 1325
    .line 1326
    :cond_39
    iget-wide v6, v5, Llx;->f:J

    .line 1327
    .line 1328
    cmp-long v3, v6, v3

    .line 1329
    .line 1330
    if-eqz v3, :cond_3a

    .line 1331
    .line 1332
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 1333
    .line 1334
    .line 1335
    move-result-wide v3

    .line 1336
    invoke-virtual {v5, v3, v4}, Llx;->a(J)F

    .line 1337
    .line 1338
    .line 1339
    move-result v6

    .line 1340
    const/high16 v7, -0x3f800000    # -4.0f

    .line 1341
    .line 1342
    mul-float/2addr v7, v6

    .line 1343
    mul-float/2addr v7, v6

    .line 1344
    const/high16 v8, 0x40800000    # 4.0f

    .line 1345
    .line 1346
    mul-float/2addr v6, v8

    .line 1347
    add-float/2addr v6, v7

    .line 1348
    iget-wide v7, v5, Llx;->f:J

    .line 1349
    .line 1350
    sub-long v7, v3, v7

    .line 1351
    .line 1352
    iput-wide v3, v5, Llx;->f:J

    .line 1353
    .line 1354
    long-to-float v3, v7

    .line 1355
    mul-float/2addr v3, v6

    .line 1356
    iget v4, v5, Llx;->d:F

    .line 1357
    .line 1358
    mul-float/2addr v3, v4

    .line 1359
    float-to-int v3, v3

    .line 1360
    iget-object v0, v0, Lub4;->r0:Lqw1;

    .line 1361
    .line 1362
    invoke-virtual {v0, v3}, Landroid/widget/AbsListView;->scrollListBy(I)V

    .line 1363
    .line 1364
    .line 1365
    sget-object v0, Lcw8;->a:Ljava/util/WeakHashMap;

    .line 1366
    .line 1367
    invoke-virtual {v2, v1}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 1368
    .line 1369
    .line 1370
    goto :goto_21

    .line 1371
    :cond_3a
    const-string v0, "Cannot compute scroll delta before calling start()"

    .line 1372
    .line 1373
    invoke-static {v0}, Lkp5;->t(Ljava/lang/String;)V

    .line 1374
    .line 1375
    .line 1376
    :goto_21
    return-void

    .line 1377
    :pswitch_1c
    iget-object v0, v1, Lxb;->Y:Ljava/lang/Object;

    .line 1378
    .line 1379
    check-cast v0, Landroidx/compose/ui/platform/AndroidComposeView;

    .line 1380
    .line 1381
    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 1382
    .line 1383
    .line 1384
    iget-object v2, v0, Landroidx/compose/ui/platform/AndroidComposeView;->o1:Landroid/view/MotionEvent;

    .line 1385
    .line 1386
    if-eqz v2, :cond_3d

    .line 1387
    .line 1388
    invoke-virtual {v2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 1389
    .line 1390
    .line 1391
    move-result v1

    .line 1392
    const/16 v3, 0xa

    .line 1393
    .line 1394
    if-eq v1, v3, :cond_3d

    .line 1395
    .line 1396
    if-eq v1, v10, :cond_3d

    .line 1397
    .line 1398
    const/4 v3, 0x7

    .line 1399
    if-eq v1, v3, :cond_3c

    .line 1400
    .line 1401
    const/16 v4, 0x8

    .line 1402
    .line 1403
    const/16 v5, 0x9

    .line 1404
    .line 1405
    if-eq v1, v4, :cond_3b

    .line 1406
    .line 1407
    if-eq v1, v5, :cond_3c

    .line 1408
    .line 1409
    move v3, v8

    .line 1410
    goto :goto_22

    .line 1411
    :cond_3b
    move v3, v5

    .line 1412
    :cond_3c
    :goto_22
    iget-wide v4, v0, Landroidx/compose/ui/platform/AndroidComposeView;->p1:J

    .line 1413
    .line 1414
    const/4 v6, 0x0

    .line 1415
    move-object v1, v0

    .line 1416
    invoke-virtual/range {v1 .. v6}, Landroidx/compose/ui/platform/AndroidComposeView;->G(Landroid/view/MotionEvent;IJZ)V

    .line 1417
    .line 1418
    .line 1419
    :cond_3d
    return-void

    .line 1420
    nop

    .line 1421
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
