.class public final synthetic Lnm7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lnm7;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lnm7;->Y:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 79

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, Lnm7;->X:B

    .line 4
    .line 5
    sget-object v3, Ldn8;->a:Ldn8;

    .line 6
    .line 7
    const/4 v4, 0x0

    .line 8
    const/4 v5, 0x1

    .line 9
    iget-object v0, v0, Lnm7;->Y:Ljava/lang/String;

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    move-object/from16 v1, p1

    .line 15
    .line 16
    check-cast v1, Ljava/io/PrintWriter;

    .line 17
    .line 18
    sget v2, Lsu/happ/proxyutility/service/XRayVpnService;->v0:I

    .line 19
    .line 20
    invoke-static {v1}, Lp61;->q(Ljava/io/PrintWriter;)Ljava/util/Date;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    const-string v4, "DOU "

    .line 27
    .line 28
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const-string v0, "DEFAULT_REMOTE_DNS"

    .line 34
    .line 35
    :goto_0
    new-instance v4, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v2, " Tunnel DNS = "

    .line 44
    .line 45
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v1, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    return-object v3

    .line 59
    :pswitch_0
    move-object/from16 v1, p1

    .line 60
    .line 61
    check-cast v1, Lqr6;

    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    const-string v2, "DELETE FROM worktag WHERE work_spec_id=?"

    .line 67
    .line 68
    invoke-interface {v1, v2}, Lqr6;->X0(Ljava/lang/String;)Lxr6;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    :try_start_0
    invoke-interface {v1, v5, v0}, Lxr6;->T(ILjava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-interface {v1}, Lxr6;->S0()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    .line 77
    .line 78
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 79
    .line 80
    .line 81
    return-object v3

    .line 82
    :catchall_0
    move-exception v0

    .line 83
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 84
    .line 85
    .line 86
    throw v0

    .line 87
    :pswitch_1
    move-object/from16 v1, p1

    .line 88
    .line 89
    check-cast v1, Lqr6;

    .line 90
    .line 91
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    const-string v2, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?"

    .line 95
    .line 96
    invoke-interface {v1, v2}, Lqr6;->X0(Ljava/lang/String;)Lxr6;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    :try_start_1
    invoke-interface {v1, v5, v0}, Lxr6;->T(ILjava/lang/String;)V

    .line 101
    .line 102
    .line 103
    new-instance v0, Ljava/util/ArrayList;

    .line 104
    .line 105
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 106
    .line 107
    .line 108
    :goto_1
    invoke-interface {v1}, Lxr6;->S0()Z

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    if-eqz v2, :cond_1

    .line 113
    .line 114
    invoke-interface {v1, v4}, Lxr6;->p0(I)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 119
    .line 120
    .line 121
    goto :goto_1

    .line 122
    :catchall_1
    move-exception v0

    .line 123
    goto :goto_2

    .line 124
    :cond_1
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 125
    .line 126
    .line 127
    return-object v0

    .line 128
    :goto_2
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 129
    .line 130
    .line 131
    throw v0

    .line 132
    :pswitch_2
    move-object/from16 v1, p1

    .line 133
    .line 134
    check-cast v1, Lqr6;

    .line 135
    .line 136
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    const-string v2, "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?"

    .line 140
    .line 141
    invoke-interface {v1, v2}, Lqr6;->X0(Ljava/lang/String;)Lxr6;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    :try_start_2
    invoke-interface {v2, v5, v0}, Lxr6;->T(ILjava/lang/String;)V

    .line 146
    .line 147
    .line 148
    invoke-interface {v2}, Lxr6;->S0()Z

    .line 149
    .line 150
    .line 151
    invoke-static {v1}, Los4;->r(Lqr6;)I

    .line 152
    .line 153
    .line 154
    move-result v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 155
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V

    .line 156
    .line 157
    .line 158
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    return-object v0

    .line 163
    :catchall_2
    move-exception v0

    .line 164
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V

    .line 165
    .line 166
    .line 167
    throw v0

    .line 168
    :pswitch_3
    move-object/from16 v1, p1

    .line 169
    .line 170
    check-cast v1, Lqr6;

    .line 171
    .line 172
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    const-string v2, "SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)"

    .line 176
    .line 177
    invoke-interface {v1, v2}, Lqr6;->X0(Ljava/lang/String;)Lxr6;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    :try_start_3
    invoke-interface {v1, v5, v0}, Lxr6;->T(ILjava/lang/String;)V

    .line 182
    .line 183
    .line 184
    new-instance v0, Ljava/util/ArrayList;

    .line 185
    .line 186
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 187
    .line 188
    .line 189
    :goto_3
    invoke-interface {v1}, Lxr6;->S0()Z

    .line 190
    .line 191
    .line 192
    move-result v2

    .line 193
    if-eqz v2, :cond_2

    .line 194
    .line 195
    invoke-interface {v1, v4}, Lxr6;->getBlob(I)[B

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    sget-object v3, Lu91;->b:Lu91;

    .line 200
    .line 201
    invoke-static {v2}, Lwl7;->A([B)Lu91;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 206
    .line 207
    .line 208
    goto :goto_3

    .line 209
    :catchall_3
    move-exception v0

    .line 210
    goto :goto_4

    .line 211
    :cond_2
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 212
    .line 213
    .line 214
    return-object v0

    .line 215
    :goto_4
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 216
    .line 217
    .line 218
    throw v0

    .line 219
    :pswitch_4
    move-object/from16 v1, p1

    .line 220
    .line 221
    check-cast v1, Lqr6;

    .line 222
    .line 223
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    const-string v2, "UPDATE workspec SET period_count=period_count+1 WHERE id=?"

    .line 227
    .line 228
    invoke-interface {v1, v2}, Lqr6;->X0(Ljava/lang/String;)Lxr6;

    .line 229
    .line 230
    .line 231
    move-result-object v1

    .line 232
    :try_start_4
    invoke-interface {v1, v5, v0}, Lxr6;->T(ILjava/lang/String;)V

    .line 233
    .line 234
    .line 235
    invoke-interface {v1}, Lxr6;->S0()Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 236
    .line 237
    .line 238
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 239
    .line 240
    .line 241
    return-object v3

    .line 242
    :catchall_4
    move-exception v0

    .line 243
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 244
    .line 245
    .line 246
    throw v0

    .line 247
    :pswitch_5
    move-object/from16 v1, p1

    .line 248
    .line 249
    check-cast v1, Lqr6;

    .line 250
    .line 251
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    .line 253
    .line 254
    const-string v2, "UPDATE workspec SET run_attempt_count=0 WHERE id=?"

    .line 255
    .line 256
    invoke-interface {v1, v2}, Lqr6;->X0(Ljava/lang/String;)Lxr6;

    .line 257
    .line 258
    .line 259
    move-result-object v2

    .line 260
    :try_start_5
    invoke-interface {v2, v5, v0}, Lxr6;->T(ILjava/lang/String;)V

    .line 261
    .line 262
    .line 263
    invoke-interface {v2}, Lxr6;->S0()Z

    .line 264
    .line 265
    .line 266
    invoke-static {v1}, Los4;->r(Lqr6;)I

    .line 267
    .line 268
    .line 269
    move-result v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 270
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V

    .line 271
    .line 272
    .line 273
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    return-object v0

    .line 278
    :catchall_5
    move-exception v0

    .line 279
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V

    .line 280
    .line 281
    .line 282
    throw v0

    .line 283
    :pswitch_6
    move-object/from16 v1, p1

    .line 284
    .line 285
    check-cast v1, Lqr6;

    .line 286
    .line 287
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 288
    .line 289
    .line 290
    const-string v2, "SELECT COUNT(*) > 0 FROM workspec WHERE id=? AND state=0 AND schedule_requested_at<>-1"

    .line 291
    .line 292
    invoke-interface {v1, v2}, Lqr6;->X0(Ljava/lang/String;)Lxr6;

    .line 293
    .line 294
    .line 295
    move-result-object v1

    .line 296
    :try_start_6
    invoke-interface {v1, v5, v0}, Lxr6;->T(ILjava/lang/String;)V

    .line 297
    .line 298
    .line 299
    invoke-interface {v1}, Lxr6;->S0()Z

    .line 300
    .line 301
    .line 302
    move-result v0

    .line 303
    if-eqz v0, :cond_3

    .line 304
    .line 305
    invoke-interface {v1, v4}, Lxr6;->getLong(I)J

    .line 306
    .line 307
    .line 308
    move-result-wide v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 309
    long-to-int v0, v2

    .line 310
    if-eqz v0, :cond_3

    .line 311
    .line 312
    move v4, v5

    .line 313
    goto :goto_5

    .line 314
    :catchall_6
    move-exception v0

    .line 315
    goto :goto_6

    .line 316
    :cond_3
    :goto_5
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 317
    .line 318
    .line 319
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 320
    .line 321
    .line 322
    move-result-object v0

    .line 323
    return-object v0

    .line 324
    :goto_6
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 325
    .line 326
    .line 327
    throw v0

    .line 328
    :pswitch_7
    move-object/from16 v1, p1

    .line 329
    .line 330
    check-cast v1, Lqr6;

    .line 331
    .line 332
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 333
    .line 334
    .line 335
    const-string v2, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)"

    .line 336
    .line 337
    invoke-interface {v1, v2}, Lqr6;->X0(Ljava/lang/String;)Lxr6;

    .line 338
    .line 339
    .line 340
    move-result-object v1

    .line 341
    :try_start_7
    invoke-interface {v1, v5, v0}, Lxr6;->T(ILjava/lang/String;)V

    .line 342
    .line 343
    .line 344
    new-instance v0, Ljava/util/ArrayList;

    .line 345
    .line 346
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 347
    .line 348
    .line 349
    :goto_7
    invoke-interface {v1}, Lxr6;->S0()Z

    .line 350
    .line 351
    .line 352
    move-result v2

    .line 353
    if-eqz v2, :cond_4

    .line 354
    .line 355
    invoke-interface {v1, v4}, Lxr6;->p0(I)Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v2

    .line 359
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    .line 360
    .line 361
    .line 362
    goto :goto_7

    .line 363
    :catchall_7
    move-exception v0

    .line 364
    goto :goto_8

    .line 365
    :cond_4
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 366
    .line 367
    .line 368
    return-object v0

    .line 369
    :goto_8
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 370
    .line 371
    .line 372
    throw v0

    .line 373
    :pswitch_8
    move-object/from16 v1, p1

    .line 374
    .line 375
    check-cast v1, Lqr6;

    .line 376
    .line 377
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 378
    .line 379
    .line 380
    const-string v2, "UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?"

    .line 381
    .line 382
    invoke-interface {v1, v2}, Lqr6;->X0(Ljava/lang/String;)Lxr6;

    .line 383
    .line 384
    .line 385
    move-result-object v2

    .line 386
    :try_start_8
    invoke-interface {v2, v5, v0}, Lxr6;->T(ILjava/lang/String;)V

    .line 387
    .line 388
    .line 389
    invoke-interface {v2}, Lxr6;->S0()Z

    .line 390
    .line 391
    .line 392
    invoke-static {v1}, Los4;->r(Lqr6;)I

    .line 393
    .line 394
    .line 395
    move-result v0
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    .line 396
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V

    .line 397
    .line 398
    .line 399
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 400
    .line 401
    .line 402
    move-result-object v0

    .line 403
    return-object v0

    .line 404
    :catchall_8
    move-exception v0

    .line 405
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V

    .line 406
    .line 407
    .line 408
    throw v0

    .line 409
    :pswitch_9
    move-object/from16 v1, p1

    .line 410
    .line 411
    check-cast v1, Lqr6;

    .line 412
    .line 413
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 414
    .line 415
    .line 416
    const-string v2, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)"

    .line 417
    .line 418
    invoke-interface {v1, v2}, Lqr6;->X0(Ljava/lang/String;)Lxr6;

    .line 419
    .line 420
    .line 421
    move-result-object v1

    .line 422
    :try_start_9
    invoke-interface {v1, v5, v0}, Lxr6;->T(ILjava/lang/String;)V

    .line 423
    .line 424
    .line 425
    new-instance v0, Ljava/util/ArrayList;

    .line 426
    .line 427
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 428
    .line 429
    .line 430
    :goto_9
    invoke-interface {v1}, Lxr6;->S0()Z

    .line 431
    .line 432
    .line 433
    move-result v2

    .line 434
    if-eqz v2, :cond_5

    .line 435
    .line 436
    invoke-interface {v1, v4}, Lxr6;->p0(I)Ljava/lang/String;

    .line 437
    .line 438
    .line 439
    move-result-object v2

    .line 440
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    .line 441
    .line 442
    .line 443
    goto :goto_9

    .line 444
    :catchall_9
    move-exception v0

    .line 445
    goto :goto_a

    .line 446
    :cond_5
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 447
    .line 448
    .line 449
    return-object v0

    .line 450
    :goto_a
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 451
    .line 452
    .line 453
    throw v0

    .line 454
    :pswitch_a
    move-object/from16 v1, p1

    .line 455
    .line 456
    check-cast v1, Lqr6;

    .line 457
    .line 458
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 459
    .line 460
    .line 461
    const-string v2, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)"

    .line 462
    .line 463
    invoke-interface {v1, v2}, Lqr6;->X0(Ljava/lang/String;)Lxr6;

    .line 464
    .line 465
    .line 466
    move-result-object v1

    .line 467
    :try_start_a
    invoke-interface {v1, v5, v0}, Lxr6;->T(ILjava/lang/String;)V

    .line 468
    .line 469
    .line 470
    new-instance v0, Ljava/util/ArrayList;

    .line 471
    .line 472
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 473
    .line 474
    .line 475
    :goto_b
    invoke-interface {v1}, Lxr6;->S0()Z

    .line 476
    .line 477
    .line 478
    move-result v2

    .line 479
    if-eqz v2, :cond_6

    .line 480
    .line 481
    invoke-interface {v1, v4}, Lxr6;->p0(I)Ljava/lang/String;

    .line 482
    .line 483
    .line 484
    move-result-object v2

    .line 485
    invoke-interface {v1, v5}, Lxr6;->getLong(I)J

    .line 486
    .line 487
    .line 488
    move-result-wide v6

    .line 489
    long-to-int v3, v6

    .line 490
    invoke-static {v3}, La28;->m(I)Lu39;

    .line 491
    .line 492
    .line 493
    move-result-object v3

    .line 494
    new-instance v6, Lj49;

    .line 495
    .line 496
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 497
    .line 498
    .line 499
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 500
    .line 501
    .line 502
    iput-object v2, v6, Lj49;->a:Ljava/lang/String;

    .line 503
    .line 504
    iput-object v3, v6, Lj49;->b:Lu39;

    .line 505
    .line 506
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_a

    .line 507
    .line 508
    .line 509
    goto :goto_b

    .line 510
    :catchall_a
    move-exception v0

    .line 511
    goto :goto_c

    .line 512
    :cond_6
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 513
    .line 514
    .line 515
    return-object v0

    .line 516
    :goto_c
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 517
    .line 518
    .line 519
    throw v0

    .line 520
    :pswitch_b
    move-object/from16 v1, p1

    .line 521
    .line 522
    check-cast v1, Lqr6;

    .line 523
    .line 524
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 525
    .line 526
    .line 527
    const-string v2, "DELETE FROM workspec WHERE id=?"

    .line 528
    .line 529
    invoke-interface {v1, v2}, Lqr6;->X0(Ljava/lang/String;)Lxr6;

    .line 530
    .line 531
    .line 532
    move-result-object v1

    .line 533
    :try_start_b
    invoke-interface {v1, v5, v0}, Lxr6;->T(ILjava/lang/String;)V

    .line 534
    .line 535
    .line 536
    invoke-interface {v1}, Lxr6;->S0()Z
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_b

    .line 537
    .line 538
    .line 539
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 540
    .line 541
    .line 542
    return-object v3

    .line 543
    :catchall_b
    move-exception v0

    .line 544
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 545
    .line 546
    .line 547
    throw v0

    .line 548
    :pswitch_c
    move-object/from16 v1, p1

    .line 549
    .line 550
    check-cast v1, Lqr6;

    .line 551
    .line 552
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 553
    .line 554
    .line 555
    const-string v3, "SELECT state FROM workspec WHERE id=?"

    .line 556
    .line 557
    invoke-interface {v1, v3}, Lqr6;->X0(Ljava/lang/String;)Lxr6;

    .line 558
    .line 559
    .line 560
    move-result-object v1

    .line 561
    :try_start_c
    invoke-interface {v1, v5, v0}, Lxr6;->T(ILjava/lang/String;)V

    .line 562
    .line 563
    .line 564
    invoke-interface {v1}, Lxr6;->S0()Z

    .line 565
    .line 566
    .line 567
    move-result v0

    .line 568
    if-eqz v0, :cond_8

    .line 569
    .line 570
    invoke-interface {v1, v4}, Lxr6;->isNull(I)Z

    .line 571
    .line 572
    .line 573
    move-result v0

    .line 574
    if-eqz v0, :cond_7

    .line 575
    .line 576
    const/4 v0, 0x0

    .line 577
    goto :goto_d

    .line 578
    :cond_7
    invoke-interface {v1, v4}, Lxr6;->getLong(I)J

    .line 579
    .line 580
    .line 581
    move-result-wide v3

    .line 582
    long-to-int v0, v3

    .line 583
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 584
    .line 585
    .line 586
    move-result-object v0

    .line 587
    :goto_d
    if-nez v0, :cond_9

    .line 588
    .line 589
    :cond_8
    const/4 v2, 0x0

    .line 590
    goto :goto_e

    .line 591
    :cond_9
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 592
    .line 593
    .line 594
    move-result v0

    .line 595
    invoke-static {v0}, La28;->m(I)Lu39;

    .line 596
    .line 597
    .line 598
    move-result-object v2
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_c

    .line 599
    goto :goto_e

    .line 600
    :catchall_c
    move-exception v0

    .line 601
    goto :goto_f

    .line 602
    :goto_e
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 603
    .line 604
    .line 605
    return-object v2

    .line 606
    :goto_f
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 607
    .line 608
    .line 609
    throw v0

    .line 610
    :pswitch_d
    move-object/from16 v1, p1

    .line 611
    .line 612
    check-cast v1, Lqr6;

    .line 613
    .line 614
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 615
    .line 616
    .line 617
    const-string v3, "SELECT * FROM workspec WHERE id=?"

    .line 618
    .line 619
    invoke-interface {v1, v3}, Lqr6;->X0(Ljava/lang/String;)Lxr6;

    .line 620
    .line 621
    .line 622
    move-result-object v1

    .line 623
    :try_start_d
    invoke-interface {v1, v5, v0}, Lxr6;->T(ILjava/lang/String;)V

    .line 624
    .line 625
    .line 626
    const-string v0, "id"

    .line 627
    .line 628
    invoke-static {v1, v0}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 629
    .line 630
    .line 631
    move-result v0

    .line 632
    const-string v3, "state"

    .line 633
    .line 634
    invoke-static {v1, v3}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 635
    .line 636
    .line 637
    move-result v3

    .line 638
    const-string v6, "worker_class_name"

    .line 639
    .line 640
    invoke-static {v1, v6}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 641
    .line 642
    .line 643
    move-result v6

    .line 644
    const-string v7, "input_merger_class_name"

    .line 645
    .line 646
    invoke-static {v1, v7}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 647
    .line 648
    .line 649
    move-result v7

    .line 650
    const-string v8, "input"

    .line 651
    .line 652
    invoke-static {v1, v8}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 653
    .line 654
    .line 655
    move-result v8

    .line 656
    const-string v9, "output"

    .line 657
    .line 658
    invoke-static {v1, v9}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 659
    .line 660
    .line 661
    move-result v9

    .line 662
    const-string v10, "initial_delay"

    .line 663
    .line 664
    invoke-static {v1, v10}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 665
    .line 666
    .line 667
    move-result v10

    .line 668
    const-string v11, "interval_duration"

    .line 669
    .line 670
    invoke-static {v1, v11}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 671
    .line 672
    .line 673
    move-result v11

    .line 674
    const-string v12, "flex_duration"

    .line 675
    .line 676
    invoke-static {v1, v12}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 677
    .line 678
    .line 679
    move-result v12

    .line 680
    const-string v13, "run_attempt_count"

    .line 681
    .line 682
    invoke-static {v1, v13}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 683
    .line 684
    .line 685
    move-result v13

    .line 686
    const-string v14, "backoff_policy"

    .line 687
    .line 688
    invoke-static {v1, v14}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 689
    .line 690
    .line 691
    move-result v14

    .line 692
    const-string v15, "backoff_delay_duration"

    .line 693
    .line 694
    invoke-static {v1, v15}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 695
    .line 696
    .line 697
    move-result v15

    .line 698
    const-string v2, "last_enqueue_time"

    .line 699
    .line 700
    invoke-static {v1, v2}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 701
    .line 702
    .line 703
    move-result v2

    .line 704
    const-string v4, "minimum_retention_duration"

    .line 705
    .line 706
    invoke-static {v1, v4}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 707
    .line 708
    .line 709
    move-result v4

    .line 710
    const-string v5, "schedule_requested_at"

    .line 711
    .line 712
    invoke-static {v1, v5}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 713
    .line 714
    .line 715
    move-result v5

    .line 716
    move/from16 p0, v5

    .line 717
    .line 718
    const-string v5, "run_in_foreground"

    .line 719
    .line 720
    invoke-static {v1, v5}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 721
    .line 722
    .line 723
    move-result v5

    .line 724
    move/from16 p1, v5

    .line 725
    .line 726
    const-string v5, "out_of_quota_policy"

    .line 727
    .line 728
    invoke-static {v1, v5}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 729
    .line 730
    .line 731
    move-result v5

    .line 732
    move/from16 v16, v5

    .line 733
    .line 734
    const-string v5, "period_count"

    .line 735
    .line 736
    invoke-static {v1, v5}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 737
    .line 738
    .line 739
    move-result v5

    .line 740
    move/from16 v17, v5

    .line 741
    .line 742
    const-string v5, "generation"

    .line 743
    .line 744
    invoke-static {v1, v5}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 745
    .line 746
    .line 747
    move-result v5

    .line 748
    move/from16 v18, v5

    .line 749
    .line 750
    const-string v5, "next_schedule_time_override"

    .line 751
    .line 752
    invoke-static {v1, v5}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 753
    .line 754
    .line 755
    move-result v5

    .line 756
    move/from16 v19, v5

    .line 757
    .line 758
    const-string v5, "next_schedule_time_override_generation"

    .line 759
    .line 760
    invoke-static {v1, v5}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 761
    .line 762
    .line 763
    move-result v5

    .line 764
    move/from16 v20, v5

    .line 765
    .line 766
    const-string v5, "stop_reason"

    .line 767
    .line 768
    invoke-static {v1, v5}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 769
    .line 770
    .line 771
    move-result v5

    .line 772
    move/from16 v21, v5

    .line 773
    .line 774
    const-string v5, "trace_tag"

    .line 775
    .line 776
    invoke-static {v1, v5}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 777
    .line 778
    .line 779
    move-result v5

    .line 780
    move/from16 v22, v5

    .line 781
    .line 782
    const-string v5, "backoff_on_system_interruptions"

    .line 783
    .line 784
    invoke-static {v1, v5}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 785
    .line 786
    .line 787
    move-result v5

    .line 788
    move/from16 v23, v5

    .line 789
    .line 790
    const-string v5, "required_network_type"

    .line 791
    .line 792
    invoke-static {v1, v5}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 793
    .line 794
    .line 795
    move-result v5

    .line 796
    move/from16 v24, v5

    .line 797
    .line 798
    const-string v5, "required_network_request"

    .line 799
    .line 800
    invoke-static {v1, v5}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 801
    .line 802
    .line 803
    move-result v5

    .line 804
    move/from16 v25, v5

    .line 805
    .line 806
    const-string v5, "requires_charging"

    .line 807
    .line 808
    invoke-static {v1, v5}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 809
    .line 810
    .line 811
    move-result v5

    .line 812
    move/from16 v26, v5

    .line 813
    .line 814
    const-string v5, "requires_device_idle"

    .line 815
    .line 816
    invoke-static {v1, v5}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 817
    .line 818
    .line 819
    move-result v5

    .line 820
    move/from16 v27, v5

    .line 821
    .line 822
    const-string v5, "requires_battery_not_low"

    .line 823
    .line 824
    invoke-static {v1, v5}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 825
    .line 826
    .line 827
    move-result v5

    .line 828
    move/from16 v28, v5

    .line 829
    .line 830
    const-string v5, "requires_storage_not_low"

    .line 831
    .line 832
    invoke-static {v1, v5}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 833
    .line 834
    .line 835
    move-result v5

    .line 836
    move/from16 v29, v5

    .line 837
    .line 838
    const-string v5, "trigger_content_update_delay"

    .line 839
    .line 840
    invoke-static {v1, v5}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 841
    .line 842
    .line 843
    move-result v5

    .line 844
    move/from16 v30, v5

    .line 845
    .line 846
    const-string v5, "trigger_max_content_delay"

    .line 847
    .line 848
    invoke-static {v1, v5}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 849
    .line 850
    .line 851
    move-result v5

    .line 852
    move/from16 v31, v5

    .line 853
    .line 854
    const-string v5, "content_uri_triggers"

    .line 855
    .line 856
    invoke-static {v1, v5}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 857
    .line 858
    .line 859
    move-result v5

    .line 860
    invoke-interface {v1}, Lxr6;->S0()Z

    .line 861
    .line 862
    .line 863
    move-result v32

    .line 864
    if-eqz v32, :cond_13

    .line 865
    .line 866
    invoke-interface {v1, v0}, Lxr6;->p0(I)Ljava/lang/String;

    .line 867
    .line 868
    .line 869
    move-result-object v34

    .line 870
    move v0, v4

    .line 871
    invoke-interface {v1, v3}, Lxr6;->getLong(I)J

    .line 872
    .line 873
    .line 874
    move-result-wide v3

    .line 875
    long-to-int v3, v3

    .line 876
    invoke-static {v3}, La28;->m(I)Lu39;

    .line 877
    .line 878
    .line 879
    move-result-object v35

    .line 880
    invoke-interface {v1, v6}, Lxr6;->p0(I)Ljava/lang/String;

    .line 881
    .line 882
    .line 883
    move-result-object v36

    .line 884
    invoke-interface {v1, v7}, Lxr6;->p0(I)Ljava/lang/String;

    .line 885
    .line 886
    .line 887
    move-result-object v37

    .line 888
    invoke-interface {v1, v8}, Lxr6;->getBlob(I)[B

    .line 889
    .line 890
    .line 891
    move-result-object v3

    .line 892
    sget-object v4, Lu91;->b:Lu91;

    .line 893
    .line 894
    invoke-static {v3}, Lwl7;->A([B)Lu91;

    .line 895
    .line 896
    .line 897
    move-result-object v38

    .line 898
    invoke-interface {v1, v9}, Lxr6;->getBlob(I)[B

    .line 899
    .line 900
    .line 901
    move-result-object v3

    .line 902
    invoke-static {v3}, Lwl7;->A([B)Lu91;

    .line 903
    .line 904
    .line 905
    move-result-object v39

    .line 906
    invoke-interface {v1, v10}, Lxr6;->getLong(I)J

    .line 907
    .line 908
    .line 909
    move-result-wide v40

    .line 910
    invoke-interface {v1, v11}, Lxr6;->getLong(I)J

    .line 911
    .line 912
    .line 913
    move-result-wide v42

    .line 914
    invoke-interface {v1, v12}, Lxr6;->getLong(I)J

    .line 915
    .line 916
    .line 917
    move-result-wide v44

    .line 918
    invoke-interface {v1, v13}, Lxr6;->getLong(I)J

    .line 919
    .line 920
    .line 921
    move-result-wide v3

    .line 922
    long-to-int v3, v3

    .line 923
    invoke-interface {v1, v14}, Lxr6;->getLong(I)J

    .line 924
    .line 925
    .line 926
    move-result-wide v6

    .line 927
    long-to-int v4, v6

    .line 928
    invoke-static {v4}, La28;->j(I)Lz00;

    .line 929
    .line 930
    .line 931
    move-result-object v48

    .line 932
    invoke-interface {v1, v15}, Lxr6;->getLong(I)J

    .line 933
    .line 934
    .line 935
    move-result-wide v49

    .line 936
    invoke-interface {v1, v2}, Lxr6;->getLong(I)J

    .line 937
    .line 938
    .line 939
    move-result-wide v51

    .line 940
    invoke-interface {v1, v0}, Lxr6;->getLong(I)J

    .line 941
    .line 942
    .line 943
    move-result-wide v53

    .line 944
    move/from16 v0, p0

    .line 945
    .line 946
    invoke-interface {v1, v0}, Lxr6;->getLong(I)J

    .line 947
    .line 948
    .line 949
    move-result-wide v55

    .line 950
    move/from16 v0, p1

    .line 951
    .line 952
    invoke-interface {v1, v0}, Lxr6;->getLong(I)J

    .line 953
    .line 954
    .line 955
    move-result-wide v6

    .line 956
    long-to-int v0, v6

    .line 957
    if-eqz v0, :cond_a

    .line 958
    .line 959
    const/16 v57, 0x1

    .line 960
    .line 961
    :goto_10
    move/from16 v0, v16

    .line 962
    .line 963
    goto :goto_11

    .line 964
    :cond_a
    const/16 v57, 0x0

    .line 965
    .line 966
    goto :goto_10

    .line 967
    :goto_11
    invoke-interface {v1, v0}, Lxr6;->getLong(I)J

    .line 968
    .line 969
    .line 970
    move-result-wide v6

    .line 971
    long-to-int v0, v6

    .line 972
    invoke-static {v0}, La28;->l(I)Lyd5;

    .line 973
    .line 974
    .line 975
    move-result-object v58

    .line 976
    move/from16 v0, v17

    .line 977
    .line 978
    invoke-interface {v1, v0}, Lxr6;->getLong(I)J

    .line 979
    .line 980
    .line 981
    move-result-wide v6

    .line 982
    long-to-int v0, v6

    .line 983
    move/from16 v2, v18

    .line 984
    .line 985
    invoke-interface {v1, v2}, Lxr6;->getLong(I)J

    .line 986
    .line 987
    .line 988
    move-result-wide v6

    .line 989
    long-to-int v2, v6

    .line 990
    move/from16 v4, v19

    .line 991
    .line 992
    invoke-interface {v1, v4}, Lxr6;->getLong(I)J

    .line 993
    .line 994
    .line 995
    move-result-wide v61

    .line 996
    move/from16 v4, v20

    .line 997
    .line 998
    invoke-interface {v1, v4}, Lxr6;->getLong(I)J

    .line 999
    .line 1000
    .line 1001
    move-result-wide v6

    .line 1002
    long-to-int v4, v6

    .line 1003
    move/from16 v6, v21

    .line 1004
    .line 1005
    invoke-interface {v1, v6}, Lxr6;->getLong(I)J

    .line 1006
    .line 1007
    .line 1008
    move-result-wide v6

    .line 1009
    long-to-int v6, v6

    .line 1010
    move/from16 v7, v22

    .line 1011
    .line 1012
    invoke-interface {v1, v7}, Lxr6;->isNull(I)Z

    .line 1013
    .line 1014
    .line 1015
    move-result v8

    .line 1016
    if-eqz v8, :cond_b

    .line 1017
    .line 1018
    const/16 v65, 0x0

    .line 1019
    .line 1020
    :goto_12
    move/from16 v7, v23

    .line 1021
    .line 1022
    goto :goto_13

    .line 1023
    :cond_b
    invoke-interface {v1, v7}, Lxr6;->p0(I)Ljava/lang/String;

    .line 1024
    .line 1025
    .line 1026
    move-result-object v7

    .line 1027
    move-object/from16 v65, v7

    .line 1028
    .line 1029
    goto :goto_12

    .line 1030
    :goto_13
    invoke-interface {v1, v7}, Lxr6;->isNull(I)Z

    .line 1031
    .line 1032
    .line 1033
    move-result v8

    .line 1034
    if-eqz v8, :cond_c

    .line 1035
    .line 1036
    const/4 v7, 0x0

    .line 1037
    goto :goto_14

    .line 1038
    :cond_c
    invoke-interface {v1, v7}, Lxr6;->getLong(I)J

    .line 1039
    .line 1040
    .line 1041
    move-result-wide v7

    .line 1042
    long-to-int v7, v7

    .line 1043
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1044
    .line 1045
    .line 1046
    move-result-object v7

    .line 1047
    :goto_14
    if-eqz v7, :cond_e

    .line 1048
    .line 1049
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 1050
    .line 1051
    .line 1052
    move-result v7

    .line 1053
    if-eqz v7, :cond_d

    .line 1054
    .line 1055
    const/4 v7, 0x1

    .line 1056
    goto :goto_15

    .line 1057
    :cond_d
    const/4 v7, 0x0

    .line 1058
    :goto_15
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1059
    .line 1060
    .line 1061
    move-result-object v7

    .line 1062
    move-object/from16 v66, v7

    .line 1063
    .line 1064
    :goto_16
    move/from16 v7, v24

    .line 1065
    .line 1066
    goto :goto_17

    .line 1067
    :catchall_d
    move-exception v0

    .line 1068
    goto/16 :goto_21

    .line 1069
    .line 1070
    :cond_e
    const/16 v66, 0x0

    .line 1071
    .line 1072
    goto :goto_16

    .line 1073
    :goto_17
    invoke-interface {v1, v7}, Lxr6;->getLong(I)J

    .line 1074
    .line 1075
    .line 1076
    move-result-wide v7

    .line 1077
    long-to-int v7, v7

    .line 1078
    invoke-static {v7}, La28;->k(I)Lb45;

    .line 1079
    .line 1080
    .line 1081
    move-result-object v69

    .line 1082
    move/from16 v7, v25

    .line 1083
    .line 1084
    invoke-interface {v1, v7}, Lxr6;->getBlob(I)[B

    .line 1085
    .line 1086
    .line 1087
    move-result-object v7

    .line 1088
    invoke-static {v7}, La28;->w([B)Lu35;

    .line 1089
    .line 1090
    .line 1091
    move-result-object v68

    .line 1092
    move/from16 v7, v26

    .line 1093
    .line 1094
    invoke-interface {v1, v7}, Lxr6;->getLong(I)J

    .line 1095
    .line 1096
    .line 1097
    move-result-wide v7

    .line 1098
    long-to-int v7, v7

    .line 1099
    if-eqz v7, :cond_f

    .line 1100
    .line 1101
    const/16 v70, 0x1

    .line 1102
    .line 1103
    :goto_18
    move/from16 v7, v27

    .line 1104
    .line 1105
    goto :goto_19

    .line 1106
    :cond_f
    const/16 v70, 0x0

    .line 1107
    .line 1108
    goto :goto_18

    .line 1109
    :goto_19
    invoke-interface {v1, v7}, Lxr6;->getLong(I)J

    .line 1110
    .line 1111
    .line 1112
    move-result-wide v7

    .line 1113
    long-to-int v7, v7

    .line 1114
    if-eqz v7, :cond_10

    .line 1115
    .line 1116
    const/16 v71, 0x1

    .line 1117
    .line 1118
    :goto_1a
    move/from16 v7, v28

    .line 1119
    .line 1120
    goto :goto_1b

    .line 1121
    :cond_10
    const/16 v71, 0x0

    .line 1122
    .line 1123
    goto :goto_1a

    .line 1124
    :goto_1b
    invoke-interface {v1, v7}, Lxr6;->getLong(I)J

    .line 1125
    .line 1126
    .line 1127
    move-result-wide v7

    .line 1128
    long-to-int v7, v7

    .line 1129
    if-eqz v7, :cond_11

    .line 1130
    .line 1131
    const/16 v72, 0x1

    .line 1132
    .line 1133
    :goto_1c
    move/from16 v7, v29

    .line 1134
    .line 1135
    goto :goto_1d

    .line 1136
    :cond_11
    const/16 v72, 0x0

    .line 1137
    .line 1138
    goto :goto_1c

    .line 1139
    :goto_1d
    invoke-interface {v1, v7}, Lxr6;->getLong(I)J

    .line 1140
    .line 1141
    .line 1142
    move-result-wide v7

    .line 1143
    long-to-int v7, v7

    .line 1144
    if-eqz v7, :cond_12

    .line 1145
    .line 1146
    const/16 v73, 0x1

    .line 1147
    .line 1148
    :goto_1e
    move/from16 v7, v30

    .line 1149
    .line 1150
    goto :goto_1f

    .line 1151
    :cond_12
    const/16 v73, 0x0

    .line 1152
    .line 1153
    goto :goto_1e

    .line 1154
    :goto_1f
    invoke-interface {v1, v7}, Lxr6;->getLong(I)J

    .line 1155
    .line 1156
    .line 1157
    move-result-wide v74

    .line 1158
    move/from16 v7, v31

    .line 1159
    .line 1160
    invoke-interface {v1, v7}, Lxr6;->getLong(I)J

    .line 1161
    .line 1162
    .line 1163
    move-result-wide v76

    .line 1164
    invoke-interface {v1, v5}, Lxr6;->getBlob(I)[B

    .line 1165
    .line 1166
    .line 1167
    move-result-object v5

    .line 1168
    invoke-static {v5}, La28;->b([B)Ljava/util/LinkedHashSet;

    .line 1169
    .line 1170
    .line 1171
    move-result-object v78

    .line 1172
    new-instance v46, Lp31;

    .line 1173
    .line 1174
    move-object/from16 v67, v46

    .line 1175
    .line 1176
    invoke-direct/range {v67 .. v78}, Lp31;-><init>(Lu35;Lb45;ZZZZJJLjava/util/Set;)V

    .line 1177
    .line 1178
    .line 1179
    move-object/from16 v46, v67

    .line 1180
    .line 1181
    new-instance v33, Ll49;

    .line 1182
    .line 1183
    move/from16 v59, v0

    .line 1184
    .line 1185
    move/from16 v60, v2

    .line 1186
    .line 1187
    move/from16 v47, v3

    .line 1188
    .line 1189
    move/from16 v63, v4

    .line 1190
    .line 1191
    move/from16 v64, v6

    .line 1192
    .line 1193
    invoke-direct/range {v33 .. v66}, Ll49;-><init>(Ljava/lang/String;Lu39;Ljava/lang/String;Ljava/lang/String;Lu91;Lu91;JJJLp31;ILz00;JJJJZLyd5;IIJIILjava/lang/String;Ljava/lang/Boolean;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_d

    .line 1194
    .line 1195
    .line 1196
    move-object/from16 v2, v33

    .line 1197
    .line 1198
    goto :goto_20

    .line 1199
    :cond_13
    const/4 v2, 0x0

    .line 1200
    :goto_20
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 1201
    .line 1202
    .line 1203
    return-object v2

    .line 1204
    :goto_21
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 1205
    .line 1206
    .line 1207
    throw v0

    .line 1208
    :pswitch_e
    move-object/from16 v1, p1

    .line 1209
    .line 1210
    check-cast v1, Lqr6;

    .line 1211
    .line 1212
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1213
    .line 1214
    .line 1215
    const-string v2, "DELETE from WorkProgress where work_spec_id=?"

    .line 1216
    .line 1217
    invoke-interface {v1, v2}, Lqr6;->X0(Ljava/lang/String;)Lxr6;

    .line 1218
    .line 1219
    .line 1220
    move-result-object v1

    .line 1221
    const/4 v2, 0x1

    .line 1222
    :try_start_e
    invoke-interface {v1, v2, v0}, Lxr6;->T(ILjava/lang/String;)V

    .line 1223
    .line 1224
    .line 1225
    invoke-interface {v1}, Lxr6;->S0()Z
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_e

    .line 1226
    .line 1227
    .line 1228
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 1229
    .line 1230
    .line 1231
    return-object v3

    .line 1232
    :catchall_e
    move-exception v0

    .line 1233
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 1234
    .line 1235
    .line 1236
    throw v0

    .line 1237
    :pswitch_f
    move-object/from16 v1, p1

    .line 1238
    .line 1239
    check-cast v1, Lqr6;

    .line 1240
    .line 1241
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1242
    .line 1243
    .line 1244
    const-string v2, "SELECT name FROM workname WHERE work_spec_id=?"

    .line 1245
    .line 1246
    invoke-interface {v1, v2}, Lqr6;->X0(Ljava/lang/String;)Lxr6;

    .line 1247
    .line 1248
    .line 1249
    move-result-object v1

    .line 1250
    const/4 v2, 0x1

    .line 1251
    :try_start_f
    invoke-interface {v1, v2, v0}, Lxr6;->T(ILjava/lang/String;)V

    .line 1252
    .line 1253
    .line 1254
    new-instance v0, Ljava/util/ArrayList;

    .line 1255
    .line 1256
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1257
    .line 1258
    .line 1259
    :goto_22
    invoke-interface {v1}, Lxr6;->S0()Z

    .line 1260
    .line 1261
    .line 1262
    move-result v2

    .line 1263
    if-eqz v2, :cond_14

    .line 1264
    .line 1265
    const/4 v2, 0x0

    .line 1266
    invoke-interface {v1, v2}, Lxr6;->p0(I)Ljava/lang/String;

    .line 1267
    .line 1268
    .line 1269
    move-result-object v3

    .line 1270
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_f

    .line 1271
    .line 1272
    .line 1273
    goto :goto_22

    .line 1274
    :catchall_f
    move-exception v0

    .line 1275
    goto :goto_23

    .line 1276
    :cond_14
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 1277
    .line 1278
    .line 1279
    return-object v0

    .line 1280
    :goto_23
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 1281
    .line 1282
    .line 1283
    throw v0

    .line 1284
    :pswitch_10
    move-object/from16 v1, p1

    .line 1285
    .line 1286
    check-cast v1, Lf17;

    .line 1287
    .line 1288
    sget-object v2, Ld17;->a:[Lnw3;

    .line 1289
    .line 1290
    sget-object v2, Lc17;->O:Le17;

    .line 1291
    .line 1292
    invoke-interface {v1, v2, v0}, Lf17;->a(Le17;Ljava/lang/Object;)V

    .line 1293
    .line 1294
    .line 1295
    return-object v3

    .line 1296
    :pswitch_11
    move-object/from16 v1, p1

    .line 1297
    .line 1298
    check-cast v1, Lqr6;

    .line 1299
    .line 1300
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1301
    .line 1302
    .line 1303
    const-string v2, "DELETE FROM SystemIdInfo where work_spec_id=?"

    .line 1304
    .line 1305
    invoke-interface {v1, v2}, Lqr6;->X0(Ljava/lang/String;)Lxr6;

    .line 1306
    .line 1307
    .line 1308
    move-result-object v1

    .line 1309
    const/4 v2, 0x1

    .line 1310
    :try_start_10
    invoke-interface {v1, v2, v0}, Lxr6;->T(ILjava/lang/String;)V

    .line 1311
    .line 1312
    .line 1313
    invoke-interface {v1}, Lxr6;->S0()Z
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_10

    .line 1314
    .line 1315
    .line 1316
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 1317
    .line 1318
    .line 1319
    return-object v3

    .line 1320
    :catchall_10
    move-exception v0

    .line 1321
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 1322
    .line 1323
    .line 1324
    throw v0

    .line 1325
    :pswitch_12
    move-object/from16 v1, p1

    .line 1326
    .line 1327
    check-cast v1, Ljava/io/PrintWriter;

    .line 1328
    .line 1329
    invoke-static {v1}, Lp61;->q(Ljava/io/PrintWriter;)Ljava/util/Date;

    .line 1330
    .line 1331
    .line 1332
    move-result-object v2

    .line 1333
    new-instance v4, Ljava/lang/StringBuilder;

    .line 1334
    .line 1335
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 1336
    .line 1337
    .line 1338
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1339
    .line 1340
    .line 1341
    const-string v2, " SubscriptionUpdater: sub "

    .line 1342
    .line 1343
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1344
    .line 1345
    .line 1346
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1347
    .line 1348
    .line 1349
    const-string v0, " not found"

    .line 1350
    .line 1351
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1352
    .line 1353
    .line 1354
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1355
    .line 1356
    .line 1357
    move-result-object v0

    .line 1358
    invoke-virtual {v1, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 1359
    .line 1360
    .line 1361
    return-object v3

    .line 1362
    :pswitch_13
    move-object/from16 v1, p1

    .line 1363
    .line 1364
    check-cast v1, Lkf3;

    .line 1365
    .line 1366
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1367
    .line 1368
    .line 1369
    invoke-static {v0, v1}, Lfm7;->I0(Ljava/lang/CharSequence;Lkf3;)Ljava/lang/String;

    .line 1370
    .line 1371
    .line 1372
    move-result-object v0

    .line 1373
    return-object v0

    .line 1374
    nop

    .line 1375
    :pswitch_data_0
    .packed-switch 0x0
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
