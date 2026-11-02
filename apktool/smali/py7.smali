.class public final synthetic Lpy7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 11
    iput-byte p2, p0, Lpy7;->X:B

    iput-object p1, p0, Lpy7;->Y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 12
    iput-byte p3, p0, Lpy7;->X:B

    iput-object p1, p0, Lpy7;->Y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ln49;Ll49;)V
    .locals 0

    .line 1
    const/16 p1, 0xd

    .line 2
    .line 3
    iput-byte p1, p0, Lpy7;->X:B

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p2, p0, Lpy7;->Y:Ljava/lang/Object;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, Lpy7;->X:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object p0, p0, Lpy7;->Y:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, Ll49;

    .line 11
    .line 12
    check-cast p1, Lqr6;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    const-string v0, "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`next_schedule_time_override` = ?,`next_schedule_time_override_generation` = ?,`stop_reason` = ?,`trace_tag` = ?,`backoff_on_system_interruptions` = ?,`required_network_type` = ?,`required_network_request` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?"

    .line 18
    .line 19
    invoke-interface {p1, v0}, Lqr6;->X0(Ljava/lang/String;)Lxr6;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    :try_start_0
    invoke-static {v0, p0}, Lf08;->b(Lxr6;Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {v0}, Lxr6;->S0()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    .line 29
    invoke-static {v0, v2}, Lu15;->h(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    invoke-static {p1}, Los4;->r(Lqr6;)I

    .line 33
    .line 34
    .line 35
    sget-object p0, Ldn8;->a:Ldn8;

    .line 36
    .line 37
    return-object p0

    .line 38
    :catchall_0
    move-exception p0

    .line 39
    :try_start_1
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 40
    :catchall_1
    move-exception p1

    .line 41
    invoke-static {v0, p0}, Lu15;->h(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    .line 42
    .line 43
    .line 44
    throw p1

    .line 45
    :pswitch_0
    check-cast p0, Ljava/util/List;

    .line 46
    .line 47
    check-cast p1, Ljava/lang/Throwable;

    .line 48
    .line 49
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result p1

    .line 57
    if-eqz p1, :cond_0

    .line 58
    .line 59
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    check-cast p1, Lwg1;

    .line 64
    .line 65
    invoke-virtual {p1}, Lwg1;->b()V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_0
    sget-object p0, Ldn8;->a:Ldn8;

    .line 70
    .line 71
    return-object p0

    .line 72
    :pswitch_1
    check-cast p0, Llr8;

    .line 73
    .line 74
    check-cast p1, Lhi0;

    .line 75
    .line 76
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    iget-object p0, p0, Llr8;->a:Lrj0;

    .line 80
    .line 81
    iget-object v0, p0, Lrj0;->c:Ljava/lang/Object;

    .line 82
    .line 83
    monitor-enter v0

    .line 84
    :try_start_2
    iget-boolean v1, p0, Lrj0;->d:Z

    .line 85
    .line 86
    if-nez v1, :cond_1

    .line 87
    .line 88
    new-instance v1, Lni0;

    .line 89
    .line 90
    new-instance v2, Ljava/lang/StringBuilder;

    .line 91
    .line 92
    const-string v3, "CameraGraph-"

    .line 93
    .line 94
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    sget-object v3, Lni0;->b:Lqv;

    .line 98
    .line 99
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    sget-object v4, Lqv;->b:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    .line 103
    .line 104
    invoke-virtual {v4, v3}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->incrementAndGet(Ljava/lang/Object;)I

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    invoke-direct {v1, v2}, Lni0;-><init>(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p0, p1, v1}, Lrj0;->c(Lhi0;Lni0;)Lqi0;

    .line 119
    .line 120
    .line 121
    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 122
    monitor-exit v0

    .line 123
    return-object p0

    .line 124
    :catchall_2
    move-exception p0

    .line 125
    goto :goto_1

    .line 126
    :cond_1
    :try_start_3
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 127
    .line 128
    const-string p1, "Check failed."

    .line 129
    .line 130
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 134
    :goto_1
    monitor-exit v0

    .line 135
    throw p0

    .line 136
    :pswitch_2
    check-cast p0, Lrm8;

    .line 137
    .line 138
    check-cast p1, Lcc1;

    .line 139
    .line 140
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    iget-object p0, p0, Lrm8;->a:Lsm8;

    .line 144
    .line 145
    invoke-static {p1, p0}, Lvm8;->b(Lcc1;Lum8;)V

    .line 146
    .line 147
    .line 148
    sget-object p0, Ldn8;->a:Ldn8;

    .line 149
    .line 150
    return-object p0

    .line 151
    :pswitch_3
    check-cast p0, Luc8;

    .line 152
    .line 153
    check-cast p1, Ljava/lang/Throwable;

    .line 154
    .line 155
    iput-object v2, p0, Luc8;->j:Lux0;

    .line 156
    .line 157
    sget-object p0, Ldn8;->a:Ldn8;

    .line 158
    .line 159
    return-object p0

    .line 160
    :pswitch_4
    check-cast p0, Lhc8;

    .line 161
    .line 162
    check-cast p1, Lzr4;

    .line 163
    .line 164
    iget-object p0, p0, Lhc8;->a:Leh;

    .line 165
    .line 166
    invoke-virtual {p0}, Leh;->invoke()Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    check-cast p0, Ly24;

    .line 171
    .line 172
    return-object p0

    .line 173
    :pswitch_5
    check-cast p0, Lc88;

    .line 174
    .line 175
    check-cast p1, Lpl;

    .line 176
    .line 177
    iget-object v0, p1, Lpl;->a:Ljava/lang/Object;

    .line 178
    .line 179
    check-cast v0, Lml;

    .line 180
    .line 181
    instance-of v2, v0, Loa4;

    .line 182
    .line 183
    const/16 v3, 0xe

    .line 184
    .line 185
    if-eqz v2, :cond_2

    .line 186
    .line 187
    move-object v2, v0

    .line 188
    check-cast v2, Loa4;

    .line 189
    .line 190
    iget-object v4, v2, Loa4;->b:Lc88;

    .line 191
    .line 192
    if-nez v4, :cond_2

    .line 193
    .line 194
    iget-object v0, v2, Loa4;->a:Ljava/lang/String;

    .line 195
    .line 196
    new-instance v2, Loa4;

    .line 197
    .line 198
    invoke-direct {v2, v0, p0}, Loa4;-><init>(Ljava/lang/String;Lc88;)V

    .line 199
    .line 200
    .line 201
    invoke-static {p1, v2, v1, v1, v3}, Lpl;->a(Lpl;Lml;III)Lpl;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    goto :goto_2

    .line 206
    :cond_2
    instance-of v2, v0, Lna4;

    .line 207
    .line 208
    if-eqz v2, :cond_3

    .line 209
    .line 210
    check-cast v0, Lna4;

    .line 211
    .line 212
    iget-object v2, v0, Lna4;->b:Lc88;

    .line 213
    .line 214
    if-nez v2, :cond_3

    .line 215
    .line 216
    iget-object v0, v0, Lna4;->a:Ljava/lang/String;

    .line 217
    .line 218
    new-instance v2, Lna4;

    .line 219
    .line 220
    invoke-direct {v2, v0, p0}, Lna4;-><init>(Ljava/lang/String;Lc88;)V

    .line 221
    .line 222
    .line 223
    invoke-static {p1, v2, v1, v1, v3}, Lpl;->a(Lpl;Lml;III)Lpl;

    .line 224
    .line 225
    .line 226
    move-result-object p1

    .line 227
    :cond_3
    :goto_2
    return-object p1

    .line 228
    :pswitch_6
    check-cast p0, Ls48;

    .line 229
    .line 230
    check-cast p1, Lpt1;

    .line 231
    .line 232
    iget-object p1, p1, Lpt1;->a:Landroid/view/DragEvent;

    .line 233
    .line 234
    invoke-virtual {p1}, Landroid/view/DragEvent;->getClipDescription()Landroid/content/ClipDescription;

    .line 235
    .line 236
    .line 237
    move-result-object p1

    .line 238
    invoke-virtual {p0}, Ls48;->invoke()Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object p0

    .line 242
    check-cast p0, Ljava/lang/Iterable;

    .line 243
    .line 244
    instance-of v0, p0, Ljava/util/Collection;

    .line 245
    .line 246
    if-eqz v0, :cond_4

    .line 247
    .line 248
    move-object v0, p0

    .line 249
    check-cast v0, Ljava/util/Collection;

    .line 250
    .line 251
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 252
    .line 253
    .line 254
    move-result v0

    .line 255
    if-eqz v0, :cond_4

    .line 256
    .line 257
    goto :goto_3

    .line 258
    :cond_4
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 259
    .line 260
    .line 261
    move-result-object p0

    .line 262
    :cond_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 263
    .line 264
    .line 265
    move-result v0

    .line 266
    if-eqz v0, :cond_7

    .line 267
    .line 268
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    check-cast v0, Lps4;

    .line 273
    .line 274
    sget-object v2, Lps4;->c:Lps4;

    .line 275
    .line 276
    invoke-static {v0, v2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 277
    .line 278
    .line 279
    move-result v2

    .line 280
    const/4 v3, 0x1

    .line 281
    if-nez v2, :cond_6

    .line 282
    .line 283
    if-eqz p1, :cond_5

    .line 284
    .line 285
    iget-object v0, v0, Lps4;->a:Ljava/lang/String;

    .line 286
    .line 287
    invoke-virtual {p1, v0}, Landroid/content/ClipDescription;->hasMimeType(Ljava/lang/String;)Z

    .line 288
    .line 289
    .line 290
    move-result v0

    .line 291
    if-ne v0, v3, :cond_5

    .line 292
    .line 293
    :cond_6
    move v1, v3

    .line 294
    :cond_7
    :goto_3
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 295
    .line 296
    .line 297
    move-result-object p0

    .line 298
    return-object p0

    .line 299
    :pswitch_7
    check-cast p0, Ln48;

    .line 300
    .line 301
    check-cast p1, Ly24;

    .line 302
    .line 303
    sget-object v0, Ls86;->e:Ls86;

    .line 304
    .line 305
    iget-object v1, p0, Ln48;->w0:Lr68;

    .line 306
    .line 307
    iget-object v1, v1, Lr68;->x:Lzi1;

    .line 308
    .line 309
    invoke-virtual {v1}, Lzi1;->getValue()Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v1

    .line 313
    check-cast v1, Ls86;

    .line 314
    .line 315
    if-nez v1, :cond_8

    .line 316
    .line 317
    move-object v1, v0

    .line 318
    :cond_8
    iget-object p0, p0, Ln48;->u0:Ly78;

    .line 319
    .line 320
    invoke-virtual {p0}, Ly78;->e()Ly24;

    .line 321
    .line 322
    .line 323
    move-result-object p0

    .line 324
    if-eqz p0, :cond_b

    .line 325
    .line 326
    invoke-interface {p0}, Ly24;->g()Z

    .line 327
    .line 328
    .line 329
    move-result v2

    .line 330
    if-eqz v2, :cond_a

    .line 331
    .line 332
    invoke-interface {p1}, Ly24;->g()Z

    .line 333
    .line 334
    .line 335
    move-result v2

    .line 336
    if-nez v2, :cond_9

    .line 337
    .line 338
    goto :goto_4

    .line 339
    :cond_9
    invoke-virtual {v1}, Ls86;->f()J

    .line 340
    .line 341
    .line 342
    move-result-wide v2

    .line 343
    invoke-static {p0}, Ljm4;->x(Ly24;)Ly24;

    .line 344
    .line 345
    .line 346
    move-result-object p0

    .line 347
    invoke-interface {p0, v2, v3}, Ly24;->n(J)J

    .line 348
    .line 349
    .line 350
    move-result-wide v2

    .line 351
    invoke-interface {p1, v2, v3}, Ly24;->E(J)J

    .line 352
    .line 353
    .line 354
    move-result-wide p0

    .line 355
    invoke-virtual {v1}, Ls86;->e()J

    .line 356
    .line 357
    .line 358
    move-result-wide v0

    .line 359
    invoke-static {p0, p1, v0, v1}, Lu70;->n(JJ)Ls86;

    .line 360
    .line 361
    .line 362
    move-result-object v2

    .line 363
    goto :goto_5

    .line 364
    :cond_a
    :goto_4
    move-object v2, v0

    .line 365
    goto :goto_5

    .line 366
    :cond_b
    const-string p0, "Required value was null."

    .line 367
    .line 368
    invoke-static {p0}, Lzc3;->d(Ljava/lang/String;)Ljava/lang/Void;

    .line 369
    .line 370
    .line 371
    invoke-static {}, Lb61;->n()V

    .line 372
    .line 373
    .line 374
    :goto_5
    return-object v2

    .line 375
    :pswitch_8
    check-cast p0, Lpy7;

    .line 376
    .line 377
    check-cast p1, Lye8;

    .line 378
    .line 379
    instance-of v0, p1, Le7;

    .line 380
    .line 381
    if-eqz v0, :cond_c

    .line 382
    .line 383
    check-cast p1, Le7;

    .line 384
    .line 385
    iget-object p1, p1, Le7;->q0:Ly0;

    .line 386
    .line 387
    invoke-virtual {p0, p1}, Lpy7;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 391
    .line 392
    goto :goto_6

    .line 393
    :cond_c
    const-string p0, "TextContextMenuDataNode.TraverseKey key must only be attached to instances of TextContextMenuDataNode."

    .line 394
    .line 395
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 396
    .line 397
    .line 398
    :goto_6
    return-object v2

    .line 399
    :pswitch_9
    check-cast p0, Le38;

    .line 400
    .line 401
    check-cast p1, Lgn2;

    .line 402
    .line 403
    invoke-interface {p1, p0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    sget-object p0, Ldn8;->a:Ldn8;

    .line 407
    .line 408
    return-object p0

    .line 409
    :pswitch_a
    check-cast p0, Landroid/graphics/drawable/Drawable;

    .line 410
    .line 411
    check-cast p1, Lsv1;

    .line 412
    .line 413
    invoke-interface {p1}, Lsv1;->n0()Llr;

    .line 414
    .line 415
    .line 416
    move-result-object v0

    .line 417
    invoke-virtual {v0}, Llr;->k()Lsm0;

    .line 418
    .line 419
    .line 420
    move-result-object v0

    .line 421
    invoke-interface {p1}, Lsv1;->e()J

    .line 422
    .line 423
    .line 424
    move-result-wide v2

    .line 425
    const/16 v4, 0x20

    .line 426
    .line 427
    shr-long/2addr v2, v4

    .line 428
    long-to-int v2, v2

    .line 429
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 430
    .line 431
    .line 432
    move-result v2

    .line 433
    float-to-int v2, v2

    .line 434
    invoke-interface {p1}, Lsv1;->e()J

    .line 435
    .line 436
    .line 437
    move-result-wide v3

    .line 438
    const-wide v5, 0xffffffffL

    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    and-long/2addr v3, v5

    .line 444
    long-to-int p1, v3

    .line 445
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 446
    .line 447
    .line 448
    move-result p1

    .line 449
    float-to-int p1, p1

    .line 450
    invoke-virtual {p0, v1, v1, v2, p1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 451
    .line 452
    .line 453
    invoke-static {v0}, Lfb;->b(Lsm0;)Landroid/graphics/Canvas;

    .line 454
    .line 455
    .line 456
    move-result-object p1

    .line 457
    invoke-virtual {p0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 458
    .line 459
    .line 460
    sget-object p0, Ldn8;->a:Ldn8;

    .line 461
    .line 462
    return-object p0

    .line 463
    :pswitch_b
    check-cast p0, Landroid/view/MotionEvent;

    .line 464
    .line 465
    check-cast p1, Lyl8;

    .line 466
    .line 467
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 468
    .line 469
    .line 470
    invoke-virtual {p0}, Landroid/view/MotionEvent;->getX()F

    .line 471
    .line 472
    .line 473
    move-result v0

    .line 474
    invoke-virtual {p0}, Landroid/view/MotionEvent;->getY()F

    .line 475
    .line 476
    .line 477
    move-result p0

    .line 478
    iget-object v1, p1, Lyl8;->h:Landroid/graphics/Rect;

    .line 479
    .line 480
    if-eqz v1, :cond_e

    .line 481
    .line 482
    float-to-int v0, v0

    .line 483
    float-to-int p0, p0

    .line 484
    invoke-virtual {v1, v0, p0}, Landroid/graphics/Rect;->contains(II)Z

    .line 485
    .line 486
    .line 487
    move-result p0

    .line 488
    if-eqz p0, :cond_d

    .line 489
    .line 490
    iget-object p0, p1, Lyl8;->f:Lzl8;

    .line 491
    .line 492
    iget v0, p1, Lyl8;->g:I

    .line 493
    .line 494
    invoke-interface {p0, v0}, Lzl8;->y(I)V

    .line 495
    .line 496
    .line 497
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 498
    .line 499
    iget-boolean p1, p1, Lyl8;->e:Z

    .line 500
    .line 501
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 502
    .line 503
    .line 504
    move-result-object p1

    .line 505
    new-instance v0, Lqg5;

    .line 506
    .line 507
    invoke-direct {v0, p0, p1}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 508
    .line 509
    .line 510
    goto :goto_7

    .line 511
    :cond_d
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 512
    .line 513
    new-instance v0, Lqg5;

    .line 514
    .line 515
    invoke-direct {v0, p0, p0}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 516
    .line 517
    .line 518
    goto :goto_7

    .line 519
    :cond_e
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 520
    .line 521
    new-instance v0, Lqg5;

    .line 522
    .line 523
    invoke-direct {v0, p0, p0}, Lqg5;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 524
    .line 525
    .line 526
    :goto_7
    return-object v0

    .line 527
    :pswitch_c
    check-cast p0, Lrn2;

    .line 528
    .line 529
    sget-object v0, Lys0;->j0:Lug8;

    .line 530
    .line 531
    check-cast p1, Lok;

    .line 532
    .line 533
    iget-object v1, p1, Lok;->e:Lrh5;

    .line 534
    .line 535
    invoke-virtual {v1}, Lrh5;->getValue()Ljava/lang/Object;

    .line 536
    .line 537
    .line 538
    move-result-object v1

    .line 539
    iget-object v0, v0, Lug8;->b:Lgn2;

    .line 540
    .line 541
    iget-object p1, p1, Lok;->f:Lwk;

    .line 542
    .line 543
    invoke-interface {v0, p1}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 544
    .line 545
    .line 546
    move-result-object p1

    .line 547
    invoke-interface {p0, v1, p1}, Lrn2;->K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 548
    .line 549
    .line 550
    sget-object p0, Ldn8;->a:Ldn8;

    .line 551
    .line 552
    return-object p0

    .line 553
    :pswitch_data_0
    .packed-switch 0x0
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
