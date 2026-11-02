.class public final synthetic Lut8;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, Lut8;->X:B

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method private final c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 84

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    check-cast v0, Lqr6;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const-string v1, "SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?"

    .line 9
    .line 10
    invoke-interface {v0, v1}, Lqr6;->X0(Ljava/lang/String;)Lxr6;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const-wide/16 v2, 0xc8

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    :try_start_0
    invoke-interface {v1, v0, v2, v3}, Lxr6;->i(IJ)V

    .line 18
    .line 19
    .line 20
    const-string v2, "id"

    .line 21
    .line 22
    invoke-static {v1, v2}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    const-string v3, "state"

    .line 27
    .line 28
    invoke-static {v1, v3}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    const-string v4, "worker_class_name"

    .line 33
    .line 34
    invoke-static {v1, v4}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    const-string v5, "input_merger_class_name"

    .line 39
    .line 40
    invoke-static {v1, v5}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    const-string v6, "input"

    .line 45
    .line 46
    invoke-static {v1, v6}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    const-string v7, "output"

    .line 51
    .line 52
    invoke-static {v1, v7}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    const-string v8, "initial_delay"

    .line 57
    .line 58
    invoke-static {v1, v8}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    move-result v8

    .line 62
    const-string v9, "interval_duration"

    .line 63
    .line 64
    invoke-static {v1, v9}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 65
    .line 66
    .line 67
    move-result v9

    .line 68
    const-string v10, "flex_duration"

    .line 69
    .line 70
    invoke-static {v1, v10}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    move-result v10

    .line 74
    const-string v11, "run_attempt_count"

    .line 75
    .line 76
    invoke-static {v1, v11}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 77
    .line 78
    .line 79
    move-result v11

    .line 80
    const-string v12, "backoff_policy"

    .line 81
    .line 82
    invoke-static {v1, v12}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 83
    .line 84
    .line 85
    move-result v12

    .line 86
    const-string v13, "backoff_delay_duration"

    .line 87
    .line 88
    invoke-static {v1, v13}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 89
    .line 90
    .line 91
    move-result v13

    .line 92
    const-string v14, "last_enqueue_time"

    .line 93
    .line 94
    invoke-static {v1, v14}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 95
    .line 96
    .line 97
    move-result v14

    .line 98
    const-string v15, "minimum_retention_duration"

    .line 99
    .line 100
    invoke-static {v1, v15}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 101
    .line 102
    .line 103
    move-result v15

    .line 104
    const-string v0, "schedule_requested_at"

    .line 105
    .line 106
    invoke-static {v1, v0}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    move/from16 p1, v0

    .line 111
    .line 112
    const-string v0, "run_in_foreground"

    .line 113
    .line 114
    invoke-static {v1, v0}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    move/from16 v16, v0

    .line 119
    .line 120
    const-string v0, "out_of_quota_policy"

    .line 121
    .line 122
    invoke-static {v1, v0}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    move/from16 v17, v0

    .line 127
    .line 128
    const-string v0, "period_count"

    .line 129
    .line 130
    invoke-static {v1, v0}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    move/from16 v18, v0

    .line 135
    .line 136
    const-string v0, "generation"

    .line 137
    .line 138
    invoke-static {v1, v0}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    move/from16 v19, v0

    .line 143
    .line 144
    const-string v0, "next_schedule_time_override"

    .line 145
    .line 146
    invoke-static {v1, v0}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    move/from16 v20, v0

    .line 151
    .line 152
    const-string v0, "next_schedule_time_override_generation"

    .line 153
    .line 154
    invoke-static {v1, v0}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    move/from16 v21, v0

    .line 159
    .line 160
    const-string v0, "stop_reason"

    .line 161
    .line 162
    invoke-static {v1, v0}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    move/from16 v22, v0

    .line 167
    .line 168
    const-string v0, "trace_tag"

    .line 169
    .line 170
    invoke-static {v1, v0}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    move/from16 v23, v0

    .line 175
    .line 176
    const-string v0, "backoff_on_system_interruptions"

    .line 177
    .line 178
    invoke-static {v1, v0}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    move/from16 v24, v0

    .line 183
    .line 184
    const-string v0, "required_network_type"

    .line 185
    .line 186
    invoke-static {v1, v0}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 187
    .line 188
    .line 189
    move-result v0

    .line 190
    move/from16 v25, v0

    .line 191
    .line 192
    const-string v0, "required_network_request"

    .line 193
    .line 194
    invoke-static {v1, v0}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 195
    .line 196
    .line 197
    move-result v0

    .line 198
    move/from16 v26, v0

    .line 199
    .line 200
    const-string v0, "requires_charging"

    .line 201
    .line 202
    invoke-static {v1, v0}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 203
    .line 204
    .line 205
    move-result v0

    .line 206
    move/from16 v27, v0

    .line 207
    .line 208
    const-string v0, "requires_device_idle"

    .line 209
    .line 210
    invoke-static {v1, v0}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 211
    .line 212
    .line 213
    move-result v0

    .line 214
    move/from16 v28, v0

    .line 215
    .line 216
    const-string v0, "requires_battery_not_low"

    .line 217
    .line 218
    invoke-static {v1, v0}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 219
    .line 220
    .line 221
    move-result v0

    .line 222
    move/from16 v29, v0

    .line 223
    .line 224
    const-string v0, "requires_storage_not_low"

    .line 225
    .line 226
    invoke-static {v1, v0}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 227
    .line 228
    .line 229
    move-result v0

    .line 230
    move/from16 v30, v0

    .line 231
    .line 232
    const-string v0, "trigger_content_update_delay"

    .line 233
    .line 234
    invoke-static {v1, v0}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 235
    .line 236
    .line 237
    move-result v0

    .line 238
    move/from16 v31, v0

    .line 239
    .line 240
    const-string v0, "trigger_max_content_delay"

    .line 241
    .line 242
    invoke-static {v1, v0}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 243
    .line 244
    .line 245
    move-result v0

    .line 246
    move/from16 v32, v0

    .line 247
    .line 248
    const-string v0, "content_uri_triggers"

    .line 249
    .line 250
    invoke-static {v1, v0}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 251
    .line 252
    .line 253
    move-result v0

    .line 254
    move/from16 v33, v0

    .line 255
    .line 256
    new-instance v0, Ljava/util/ArrayList;

    .line 257
    .line 258
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 259
    .line 260
    .line 261
    :goto_0
    invoke-interface {v1}, Lxr6;->S0()Z

    .line 262
    .line 263
    .line 264
    move-result v34

    .line 265
    if-eqz v34, :cond_9

    .line 266
    .line 267
    invoke-interface {v1, v2}, Lxr6;->p0(I)Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v36

    .line 271
    move/from16 v34, v14

    .line 272
    .line 273
    move/from16 v69, v15

    .line 274
    .line 275
    invoke-interface {v1, v3}, Lxr6;->getLong(I)J

    .line 276
    .line 277
    .line 278
    move-result-wide v14

    .line 279
    long-to-int v14, v14

    .line 280
    invoke-static {v14}, La28;->m(I)Lu39;

    .line 281
    .line 282
    .line 283
    move-result-object v37

    .line 284
    invoke-interface {v1, v4}, Lxr6;->p0(I)Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v38

    .line 288
    invoke-interface {v1, v5}, Lxr6;->p0(I)Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v39

    .line 292
    invoke-interface {v1, v6}, Lxr6;->getBlob(I)[B

    .line 293
    .line 294
    .line 295
    move-result-object v14

    .line 296
    sget-object v15, Lu91;->b:Lu91;

    .line 297
    .line 298
    invoke-static {v14}, Lwl7;->A([B)Lu91;

    .line 299
    .line 300
    .line 301
    move-result-object v40

    .line 302
    invoke-interface {v1, v7}, Lxr6;->getBlob(I)[B

    .line 303
    .line 304
    .line 305
    move-result-object v14

    .line 306
    invoke-static {v14}, Lwl7;->A([B)Lu91;

    .line 307
    .line 308
    .line 309
    move-result-object v41

    .line 310
    invoke-interface {v1, v8}, Lxr6;->getLong(I)J

    .line 311
    .line 312
    .line 313
    move-result-wide v42

    .line 314
    invoke-interface {v1, v9}, Lxr6;->getLong(I)J

    .line 315
    .line 316
    .line 317
    move-result-wide v44

    .line 318
    invoke-interface {v1, v10}, Lxr6;->getLong(I)J

    .line 319
    .line 320
    .line 321
    move-result-wide v46

    .line 322
    invoke-interface {v1, v11}, Lxr6;->getLong(I)J

    .line 323
    .line 324
    .line 325
    move-result-wide v14

    .line 326
    long-to-int v14, v14

    .line 327
    move v15, v2

    .line 328
    move/from16 v70, v3

    .line 329
    .line 330
    invoke-interface {v1, v12}, Lxr6;->getLong(I)J

    .line 331
    .line 332
    .line 333
    move-result-wide v2

    .line 334
    long-to-int v2, v2

    .line 335
    invoke-static {v2}, La28;->j(I)Lz00;

    .line 336
    .line 337
    .line 338
    move-result-object v50

    .line 339
    invoke-interface {v1, v13}, Lxr6;->getLong(I)J

    .line 340
    .line 341
    .line 342
    move-result-wide v51

    .line 343
    move/from16 v2, v34

    .line 344
    .line 345
    invoke-interface {v1, v2}, Lxr6;->getLong(I)J

    .line 346
    .line 347
    .line 348
    move-result-wide v53

    .line 349
    move/from16 v3, v69

    .line 350
    .line 351
    invoke-interface {v1, v3}, Lxr6;->getLong(I)J

    .line 352
    .line 353
    .line 354
    move-result-wide v55

    .line 355
    move/from16 v34, v2

    .line 356
    .line 357
    move/from16 v2, p1

    .line 358
    .line 359
    invoke-interface {v1, v2}, Lxr6;->getLong(I)J

    .line 360
    .line 361
    .line 362
    move-result-wide v57

    .line 363
    move/from16 p1, v2

    .line 364
    .line 365
    move/from16 v69, v3

    .line 366
    .line 367
    move/from16 v2, v16

    .line 368
    .line 369
    move/from16 v16, v4

    .line 370
    .line 371
    invoke-interface {v1, v2}, Lxr6;->getLong(I)J

    .line 372
    .line 373
    .line 374
    move-result-wide v3

    .line 375
    long-to-int v3, v3

    .line 376
    if-eqz v3, :cond_0

    .line 377
    .line 378
    const/16 v59, 0x1

    .line 379
    .line 380
    :goto_1
    move/from16 v3, v17

    .line 381
    .line 382
    move/from16 v17, v5

    .line 383
    .line 384
    goto :goto_2

    .line 385
    :cond_0
    const/16 v59, 0x0

    .line 386
    .line 387
    goto :goto_1

    .line 388
    :goto_2
    invoke-interface {v1, v3}, Lxr6;->getLong(I)J

    .line 389
    .line 390
    .line 391
    move-result-wide v4

    .line 392
    long-to-int v4, v4

    .line 393
    invoke-static {v4}, La28;->l(I)Lyd5;

    .line 394
    .line 395
    .line 396
    move-result-object v60

    .line 397
    move v5, v2

    .line 398
    move/from16 v4, v18

    .line 399
    .line 400
    move/from16 v18, v3

    .line 401
    .line 402
    invoke-interface {v1, v4}, Lxr6;->getLong(I)J

    .line 403
    .line 404
    .line 405
    move-result-wide v2

    .line 406
    long-to-int v2, v2

    .line 407
    move/from16 v71, v5

    .line 408
    .line 409
    move/from16 v3, v19

    .line 410
    .line 411
    move/from16 v19, v4

    .line 412
    .line 413
    invoke-interface {v1, v3}, Lxr6;->getLong(I)J

    .line 414
    .line 415
    .line 416
    move-result-wide v4

    .line 417
    long-to-int v4, v4

    .line 418
    move/from16 v5, v20

    .line 419
    .line 420
    invoke-interface {v1, v5}, Lxr6;->getLong(I)J

    .line 421
    .line 422
    .line 423
    move-result-wide v63

    .line 424
    move/from16 v61, v2

    .line 425
    .line 426
    move/from16 v20, v3

    .line 427
    .line 428
    move/from16 v62, v4

    .line 429
    .line 430
    move/from16 v2, v21

    .line 431
    .line 432
    invoke-interface {v1, v2}, Lxr6;->getLong(I)J

    .line 433
    .line 434
    .line 435
    move-result-wide v3

    .line 436
    long-to-int v3, v3

    .line 437
    move/from16 v21, v2

    .line 438
    .line 439
    move/from16 v65, v3

    .line 440
    .line 441
    move/from16 v4, v22

    .line 442
    .line 443
    invoke-interface {v1, v4}, Lxr6;->getLong(I)J

    .line 444
    .line 445
    .line 446
    move-result-wide v2

    .line 447
    long-to-int v2, v2

    .line 448
    move/from16 v3, v23

    .line 449
    .line 450
    invoke-interface {v1, v3}, Lxr6;->isNull(I)Z

    .line 451
    .line 452
    .line 453
    move-result v22

    .line 454
    const/16 v23, 0x0

    .line 455
    .line 456
    if-eqz v22, :cond_1

    .line 457
    .line 458
    move-object/from16 v67, v23

    .line 459
    .line 460
    :goto_3
    move/from16 v66, v2

    .line 461
    .line 462
    move/from16 v2, v24

    .line 463
    .line 464
    goto :goto_4

    .line 465
    :cond_1
    invoke-interface {v1, v3}, Lxr6;->p0(I)Ljava/lang/String;

    .line 466
    .line 467
    .line 468
    move-result-object v22

    .line 469
    move-object/from16 v67, v22

    .line 470
    .line 471
    goto :goto_3

    .line 472
    :goto_4
    invoke-interface {v1, v2}, Lxr6;->isNull(I)Z

    .line 473
    .line 474
    .line 475
    move-result v22

    .line 476
    if-eqz v22, :cond_2

    .line 477
    .line 478
    move/from16 v24, v3

    .line 479
    .line 480
    move/from16 v22, v4

    .line 481
    .line 482
    move-object/from16 v3, v23

    .line 483
    .line 484
    goto :goto_5

    .line 485
    :cond_2
    move/from16 v24, v3

    .line 486
    .line 487
    move/from16 v22, v4

    .line 488
    .line 489
    invoke-interface {v1, v2}, Lxr6;->getLong(I)J

    .line 490
    .line 491
    .line 492
    move-result-wide v3

    .line 493
    long-to-int v3, v3

    .line 494
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 495
    .line 496
    .line 497
    move-result-object v3

    .line 498
    :goto_5
    if-eqz v3, :cond_4

    .line 499
    .line 500
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 501
    .line 502
    .line 503
    move-result v3

    .line 504
    if-eqz v3, :cond_3

    .line 505
    .line 506
    const/4 v3, 0x1

    .line 507
    goto :goto_6

    .line 508
    :cond_3
    const/4 v3, 0x0

    .line 509
    :goto_6
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 510
    .line 511
    .line 512
    move-result-object v23

    .line 513
    :cond_4
    move-object/from16 v68, v23

    .line 514
    .line 515
    move/from16 v3, v25

    .line 516
    .line 517
    move/from16 v23, v5

    .line 518
    .line 519
    goto :goto_7

    .line 520
    :catchall_0
    move-exception v0

    .line 521
    goto/16 :goto_10

    .line 522
    .line 523
    :goto_7
    invoke-interface {v1, v3}, Lxr6;->getLong(I)J

    .line 524
    .line 525
    .line 526
    move-result-wide v4

    .line 527
    long-to-int v4, v4

    .line 528
    invoke-static {v4}, La28;->k(I)Lb45;

    .line 529
    .line 530
    .line 531
    move-result-object v74

    .line 532
    move/from16 v4, v26

    .line 533
    .line 534
    invoke-interface {v1, v4}, Lxr6;->getBlob(I)[B

    .line 535
    .line 536
    .line 537
    move-result-object v5

    .line 538
    invoke-static {v5}, La28;->w([B)Lu35;

    .line 539
    .line 540
    .line 541
    move-result-object v73

    .line 542
    move/from16 v25, v2

    .line 543
    .line 544
    move/from16 v26, v3

    .line 545
    .line 546
    move/from16 v5, v27

    .line 547
    .line 548
    invoke-interface {v1, v5}, Lxr6;->getLong(I)J

    .line 549
    .line 550
    .line 551
    move-result-wide v2

    .line 552
    long-to-int v2, v2

    .line 553
    if-eqz v2, :cond_5

    .line 554
    .line 555
    const/16 v75, 0x1

    .line 556
    .line 557
    :goto_8
    move/from16 v27, v4

    .line 558
    .line 559
    move/from16 v2, v28

    .line 560
    .line 561
    goto :goto_9

    .line 562
    :cond_5
    const/16 v75, 0x0

    .line 563
    .line 564
    goto :goto_8

    .line 565
    :goto_9
    invoke-interface {v1, v2}, Lxr6;->getLong(I)J

    .line 566
    .line 567
    .line 568
    move-result-wide v3

    .line 569
    long-to-int v3, v3

    .line 570
    if-eqz v3, :cond_6

    .line 571
    .line 572
    const/16 v76, 0x1

    .line 573
    .line 574
    :goto_a
    move/from16 v28, v5

    .line 575
    .line 576
    move/from16 v3, v29

    .line 577
    .line 578
    goto :goto_b

    .line 579
    :cond_6
    const/16 v76, 0x0

    .line 580
    .line 581
    goto :goto_a

    .line 582
    :goto_b
    invoke-interface {v1, v3}, Lxr6;->getLong(I)J

    .line 583
    .line 584
    .line 585
    move-result-wide v4

    .line 586
    long-to-int v4, v4

    .line 587
    if-eqz v4, :cond_7

    .line 588
    .line 589
    const/16 v77, 0x1

    .line 590
    .line 591
    :goto_c
    move v5, v2

    .line 592
    move/from16 v29, v3

    .line 593
    .line 594
    move/from16 v4, v30

    .line 595
    .line 596
    goto :goto_d

    .line 597
    :cond_7
    const/16 v77, 0x0

    .line 598
    .line 599
    goto :goto_c

    .line 600
    :goto_d
    invoke-interface {v1, v4}, Lxr6;->getLong(I)J

    .line 601
    .line 602
    .line 603
    move-result-wide v2

    .line 604
    long-to-int v2, v2

    .line 605
    if-eqz v2, :cond_8

    .line 606
    .line 607
    const/16 v78, 0x1

    .line 608
    .line 609
    :goto_e
    move/from16 v2, v31

    .line 610
    .line 611
    goto :goto_f

    .line 612
    :cond_8
    const/16 v78, 0x0

    .line 613
    .line 614
    goto :goto_e

    .line 615
    :goto_f
    invoke-interface {v1, v2}, Lxr6;->getLong(I)J

    .line 616
    .line 617
    .line 618
    move-result-wide v79

    .line 619
    move/from16 v3, v32

    .line 620
    .line 621
    invoke-interface {v1, v3}, Lxr6;->getLong(I)J

    .line 622
    .line 623
    .line 624
    move-result-wide v81

    .line 625
    move/from16 v31, v2

    .line 626
    .line 627
    move/from16 v2, v33

    .line 628
    .line 629
    invoke-interface {v1, v2}, Lxr6;->getBlob(I)[B

    .line 630
    .line 631
    .line 632
    move-result-object v30

    .line 633
    invoke-static/range {v30 .. v30}, La28;->b([B)Ljava/util/LinkedHashSet;

    .line 634
    .line 635
    .line 636
    move-result-object v83

    .line 637
    new-instance v48, Lp31;

    .line 638
    .line 639
    move-object/from16 v72, v48

    .line 640
    .line 641
    invoke-direct/range {v72 .. v83}, Lp31;-><init>(Lu35;Lb45;ZZZZJJLjava/util/Set;)V

    .line 642
    .line 643
    .line 644
    move-object/from16 v48, v72

    .line 645
    .line 646
    new-instance v35, Ll49;

    .line 647
    .line 648
    move/from16 v49, v14

    .line 649
    .line 650
    invoke-direct/range {v35 .. v68}, Ll49;-><init>(Ljava/lang/String;Lu39;Ljava/lang/String;Ljava/lang/String;Lu91;Lu91;JJJLp31;ILz00;JJJJZLyd5;IIJIILjava/lang/String;Ljava/lang/Boolean;)V

    .line 651
    .line 652
    .line 653
    move-object/from16 v14, v35

    .line 654
    .line 655
    invoke-virtual {v0, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 656
    .line 657
    .line 658
    move/from16 v14, v28

    .line 659
    .line 660
    move/from16 v28, v5

    .line 661
    .line 662
    move/from16 v5, v17

    .line 663
    .line 664
    move/from16 v17, v18

    .line 665
    .line 666
    move/from16 v18, v19

    .line 667
    .line 668
    move/from16 v19, v20

    .line 669
    .line 670
    move/from16 v20, v23

    .line 671
    .line 672
    move/from16 v23, v24

    .line 673
    .line 674
    move/from16 v24, v25

    .line 675
    .line 676
    move/from16 v25, v26

    .line 677
    .line 678
    move/from16 v26, v27

    .line 679
    .line 680
    move/from16 v27, v14

    .line 681
    .line 682
    move/from16 v33, v2

    .line 683
    .line 684
    move/from16 v32, v3

    .line 685
    .line 686
    move/from16 v30, v4

    .line 687
    .line 688
    move v2, v15

    .line 689
    move/from16 v4, v16

    .line 690
    .line 691
    move/from16 v14, v34

    .line 692
    .line 693
    move/from16 v15, v69

    .line 694
    .line 695
    move/from16 v3, v70

    .line 696
    .line 697
    move/from16 v16, v71

    .line 698
    .line 699
    goto/16 :goto_0

    .line 700
    .line 701
    :cond_9
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 702
    .line 703
    .line 704
    return-object v0

    .line 705
    :goto_10
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 706
    .line 707
    .line 708
    throw v0
.end method

.method private final e(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 84

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    check-cast v0, Lqr6;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const-string v1, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))"

    .line 9
    .line 10
    invoke-interface {v0, v1}, Lqr6;->X0(Ljava/lang/String;)Lxr6;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const-wide/16 v2, 0x14

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    :try_start_0
    invoke-interface {v1, v0, v2, v3}, Lxr6;->i(IJ)V

    .line 18
    .line 19
    .line 20
    const-string v2, "id"

    .line 21
    .line 22
    invoke-static {v1, v2}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    const-string v3, "state"

    .line 27
    .line 28
    invoke-static {v1, v3}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    const-string v4, "worker_class_name"

    .line 33
    .line 34
    invoke-static {v1, v4}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    const-string v5, "input_merger_class_name"

    .line 39
    .line 40
    invoke-static {v1, v5}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    const-string v6, "input"

    .line 45
    .line 46
    invoke-static {v1, v6}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    const-string v7, "output"

    .line 51
    .line 52
    invoke-static {v1, v7}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    const-string v8, "initial_delay"

    .line 57
    .line 58
    invoke-static {v1, v8}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    move-result v8

    .line 62
    const-string v9, "interval_duration"

    .line 63
    .line 64
    invoke-static {v1, v9}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 65
    .line 66
    .line 67
    move-result v9

    .line 68
    const-string v10, "flex_duration"

    .line 69
    .line 70
    invoke-static {v1, v10}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    move-result v10

    .line 74
    const-string v11, "run_attempt_count"

    .line 75
    .line 76
    invoke-static {v1, v11}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 77
    .line 78
    .line 79
    move-result v11

    .line 80
    const-string v12, "backoff_policy"

    .line 81
    .line 82
    invoke-static {v1, v12}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 83
    .line 84
    .line 85
    move-result v12

    .line 86
    const-string v13, "backoff_delay_duration"

    .line 87
    .line 88
    invoke-static {v1, v13}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 89
    .line 90
    .line 91
    move-result v13

    .line 92
    const-string v14, "last_enqueue_time"

    .line 93
    .line 94
    invoke-static {v1, v14}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 95
    .line 96
    .line 97
    move-result v14

    .line 98
    const-string v15, "minimum_retention_duration"

    .line 99
    .line 100
    invoke-static {v1, v15}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 101
    .line 102
    .line 103
    move-result v15

    .line 104
    const-string v0, "schedule_requested_at"

    .line 105
    .line 106
    invoke-static {v1, v0}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    move/from16 p1, v0

    .line 111
    .line 112
    const-string v0, "run_in_foreground"

    .line 113
    .line 114
    invoke-static {v1, v0}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    move/from16 v16, v0

    .line 119
    .line 120
    const-string v0, "out_of_quota_policy"

    .line 121
    .line 122
    invoke-static {v1, v0}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    move/from16 v17, v0

    .line 127
    .line 128
    const-string v0, "period_count"

    .line 129
    .line 130
    invoke-static {v1, v0}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    move/from16 v18, v0

    .line 135
    .line 136
    const-string v0, "generation"

    .line 137
    .line 138
    invoke-static {v1, v0}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    move/from16 v19, v0

    .line 143
    .line 144
    const-string v0, "next_schedule_time_override"

    .line 145
    .line 146
    invoke-static {v1, v0}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    move/from16 v20, v0

    .line 151
    .line 152
    const-string v0, "next_schedule_time_override_generation"

    .line 153
    .line 154
    invoke-static {v1, v0}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 155
    .line 156
    .line 157
    move-result v0

    .line 158
    move/from16 v21, v0

    .line 159
    .line 160
    const-string v0, "stop_reason"

    .line 161
    .line 162
    invoke-static {v1, v0}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    move/from16 v22, v0

    .line 167
    .line 168
    const-string v0, "trace_tag"

    .line 169
    .line 170
    invoke-static {v1, v0}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    move/from16 v23, v0

    .line 175
    .line 176
    const-string v0, "backoff_on_system_interruptions"

    .line 177
    .line 178
    invoke-static {v1, v0}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    move/from16 v24, v0

    .line 183
    .line 184
    const-string v0, "required_network_type"

    .line 185
    .line 186
    invoke-static {v1, v0}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 187
    .line 188
    .line 189
    move-result v0

    .line 190
    move/from16 v25, v0

    .line 191
    .line 192
    const-string v0, "required_network_request"

    .line 193
    .line 194
    invoke-static {v1, v0}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 195
    .line 196
    .line 197
    move-result v0

    .line 198
    move/from16 v26, v0

    .line 199
    .line 200
    const-string v0, "requires_charging"

    .line 201
    .line 202
    invoke-static {v1, v0}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 203
    .line 204
    .line 205
    move-result v0

    .line 206
    move/from16 v27, v0

    .line 207
    .line 208
    const-string v0, "requires_device_idle"

    .line 209
    .line 210
    invoke-static {v1, v0}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 211
    .line 212
    .line 213
    move-result v0

    .line 214
    move/from16 v28, v0

    .line 215
    .line 216
    const-string v0, "requires_battery_not_low"

    .line 217
    .line 218
    invoke-static {v1, v0}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 219
    .line 220
    .line 221
    move-result v0

    .line 222
    move/from16 v29, v0

    .line 223
    .line 224
    const-string v0, "requires_storage_not_low"

    .line 225
    .line 226
    invoke-static {v1, v0}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 227
    .line 228
    .line 229
    move-result v0

    .line 230
    move/from16 v30, v0

    .line 231
    .line 232
    const-string v0, "trigger_content_update_delay"

    .line 233
    .line 234
    invoke-static {v1, v0}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 235
    .line 236
    .line 237
    move-result v0

    .line 238
    move/from16 v31, v0

    .line 239
    .line 240
    const-string v0, "trigger_max_content_delay"

    .line 241
    .line 242
    invoke-static {v1, v0}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 243
    .line 244
    .line 245
    move-result v0

    .line 246
    move/from16 v32, v0

    .line 247
    .line 248
    const-string v0, "content_uri_triggers"

    .line 249
    .line 250
    invoke-static {v1, v0}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 251
    .line 252
    .line 253
    move-result v0

    .line 254
    move/from16 v33, v0

    .line 255
    .line 256
    new-instance v0, Ljava/util/ArrayList;

    .line 257
    .line 258
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 259
    .line 260
    .line 261
    :goto_0
    invoke-interface {v1}, Lxr6;->S0()Z

    .line 262
    .line 263
    .line 264
    move-result v34

    .line 265
    if-eqz v34, :cond_9

    .line 266
    .line 267
    invoke-interface {v1, v2}, Lxr6;->p0(I)Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v36

    .line 271
    move/from16 v34, v14

    .line 272
    .line 273
    move/from16 v69, v15

    .line 274
    .line 275
    invoke-interface {v1, v3}, Lxr6;->getLong(I)J

    .line 276
    .line 277
    .line 278
    move-result-wide v14

    .line 279
    long-to-int v14, v14

    .line 280
    invoke-static {v14}, La28;->m(I)Lu39;

    .line 281
    .line 282
    .line 283
    move-result-object v37

    .line 284
    invoke-interface {v1, v4}, Lxr6;->p0(I)Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v38

    .line 288
    invoke-interface {v1, v5}, Lxr6;->p0(I)Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v39

    .line 292
    invoke-interface {v1, v6}, Lxr6;->getBlob(I)[B

    .line 293
    .line 294
    .line 295
    move-result-object v14

    .line 296
    sget-object v15, Lu91;->b:Lu91;

    .line 297
    .line 298
    invoke-static {v14}, Lwl7;->A([B)Lu91;

    .line 299
    .line 300
    .line 301
    move-result-object v40

    .line 302
    invoke-interface {v1, v7}, Lxr6;->getBlob(I)[B

    .line 303
    .line 304
    .line 305
    move-result-object v14

    .line 306
    invoke-static {v14}, Lwl7;->A([B)Lu91;

    .line 307
    .line 308
    .line 309
    move-result-object v41

    .line 310
    invoke-interface {v1, v8}, Lxr6;->getLong(I)J

    .line 311
    .line 312
    .line 313
    move-result-wide v42

    .line 314
    invoke-interface {v1, v9}, Lxr6;->getLong(I)J

    .line 315
    .line 316
    .line 317
    move-result-wide v44

    .line 318
    invoke-interface {v1, v10}, Lxr6;->getLong(I)J

    .line 319
    .line 320
    .line 321
    move-result-wide v46

    .line 322
    invoke-interface {v1, v11}, Lxr6;->getLong(I)J

    .line 323
    .line 324
    .line 325
    move-result-wide v14

    .line 326
    long-to-int v14, v14

    .line 327
    move v15, v2

    .line 328
    move/from16 v70, v3

    .line 329
    .line 330
    invoke-interface {v1, v12}, Lxr6;->getLong(I)J

    .line 331
    .line 332
    .line 333
    move-result-wide v2

    .line 334
    long-to-int v2, v2

    .line 335
    invoke-static {v2}, La28;->j(I)Lz00;

    .line 336
    .line 337
    .line 338
    move-result-object v50

    .line 339
    invoke-interface {v1, v13}, Lxr6;->getLong(I)J

    .line 340
    .line 341
    .line 342
    move-result-wide v51

    .line 343
    move/from16 v2, v34

    .line 344
    .line 345
    invoke-interface {v1, v2}, Lxr6;->getLong(I)J

    .line 346
    .line 347
    .line 348
    move-result-wide v53

    .line 349
    move/from16 v3, v69

    .line 350
    .line 351
    invoke-interface {v1, v3}, Lxr6;->getLong(I)J

    .line 352
    .line 353
    .line 354
    move-result-wide v55

    .line 355
    move/from16 v34, v2

    .line 356
    .line 357
    move/from16 v2, p1

    .line 358
    .line 359
    invoke-interface {v1, v2}, Lxr6;->getLong(I)J

    .line 360
    .line 361
    .line 362
    move-result-wide v57

    .line 363
    move/from16 p1, v2

    .line 364
    .line 365
    move/from16 v69, v3

    .line 366
    .line 367
    move/from16 v2, v16

    .line 368
    .line 369
    move/from16 v16, v4

    .line 370
    .line 371
    invoke-interface {v1, v2}, Lxr6;->getLong(I)J

    .line 372
    .line 373
    .line 374
    move-result-wide v3

    .line 375
    long-to-int v3, v3

    .line 376
    if-eqz v3, :cond_0

    .line 377
    .line 378
    const/16 v59, 0x1

    .line 379
    .line 380
    :goto_1
    move/from16 v3, v17

    .line 381
    .line 382
    move/from16 v17, v5

    .line 383
    .line 384
    goto :goto_2

    .line 385
    :cond_0
    const/16 v59, 0x0

    .line 386
    .line 387
    goto :goto_1

    .line 388
    :goto_2
    invoke-interface {v1, v3}, Lxr6;->getLong(I)J

    .line 389
    .line 390
    .line 391
    move-result-wide v4

    .line 392
    long-to-int v4, v4

    .line 393
    invoke-static {v4}, La28;->l(I)Lyd5;

    .line 394
    .line 395
    .line 396
    move-result-object v60

    .line 397
    move v5, v2

    .line 398
    move/from16 v4, v18

    .line 399
    .line 400
    move/from16 v18, v3

    .line 401
    .line 402
    invoke-interface {v1, v4}, Lxr6;->getLong(I)J

    .line 403
    .line 404
    .line 405
    move-result-wide v2

    .line 406
    long-to-int v2, v2

    .line 407
    move/from16 v71, v5

    .line 408
    .line 409
    move/from16 v3, v19

    .line 410
    .line 411
    move/from16 v19, v4

    .line 412
    .line 413
    invoke-interface {v1, v3}, Lxr6;->getLong(I)J

    .line 414
    .line 415
    .line 416
    move-result-wide v4

    .line 417
    long-to-int v4, v4

    .line 418
    move/from16 v5, v20

    .line 419
    .line 420
    invoke-interface {v1, v5}, Lxr6;->getLong(I)J

    .line 421
    .line 422
    .line 423
    move-result-wide v63

    .line 424
    move/from16 v61, v2

    .line 425
    .line 426
    move/from16 v20, v3

    .line 427
    .line 428
    move/from16 v62, v4

    .line 429
    .line 430
    move/from16 v2, v21

    .line 431
    .line 432
    invoke-interface {v1, v2}, Lxr6;->getLong(I)J

    .line 433
    .line 434
    .line 435
    move-result-wide v3

    .line 436
    long-to-int v3, v3

    .line 437
    move/from16 v21, v2

    .line 438
    .line 439
    move/from16 v65, v3

    .line 440
    .line 441
    move/from16 v4, v22

    .line 442
    .line 443
    invoke-interface {v1, v4}, Lxr6;->getLong(I)J

    .line 444
    .line 445
    .line 446
    move-result-wide v2

    .line 447
    long-to-int v2, v2

    .line 448
    move/from16 v3, v23

    .line 449
    .line 450
    invoke-interface {v1, v3}, Lxr6;->isNull(I)Z

    .line 451
    .line 452
    .line 453
    move-result v22

    .line 454
    const/16 v23, 0x0

    .line 455
    .line 456
    if-eqz v22, :cond_1

    .line 457
    .line 458
    move-object/from16 v67, v23

    .line 459
    .line 460
    :goto_3
    move/from16 v66, v2

    .line 461
    .line 462
    move/from16 v2, v24

    .line 463
    .line 464
    goto :goto_4

    .line 465
    :cond_1
    invoke-interface {v1, v3}, Lxr6;->p0(I)Ljava/lang/String;

    .line 466
    .line 467
    .line 468
    move-result-object v22

    .line 469
    move-object/from16 v67, v22

    .line 470
    .line 471
    goto :goto_3

    .line 472
    :goto_4
    invoke-interface {v1, v2}, Lxr6;->isNull(I)Z

    .line 473
    .line 474
    .line 475
    move-result v22

    .line 476
    if-eqz v22, :cond_2

    .line 477
    .line 478
    move/from16 v24, v3

    .line 479
    .line 480
    move/from16 v22, v4

    .line 481
    .line 482
    move-object/from16 v3, v23

    .line 483
    .line 484
    goto :goto_5

    .line 485
    :cond_2
    move/from16 v24, v3

    .line 486
    .line 487
    move/from16 v22, v4

    .line 488
    .line 489
    invoke-interface {v1, v2}, Lxr6;->getLong(I)J

    .line 490
    .line 491
    .line 492
    move-result-wide v3

    .line 493
    long-to-int v3, v3

    .line 494
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 495
    .line 496
    .line 497
    move-result-object v3

    .line 498
    :goto_5
    if-eqz v3, :cond_4

    .line 499
    .line 500
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 501
    .line 502
    .line 503
    move-result v3

    .line 504
    if-eqz v3, :cond_3

    .line 505
    .line 506
    const/4 v3, 0x1

    .line 507
    goto :goto_6

    .line 508
    :cond_3
    const/4 v3, 0x0

    .line 509
    :goto_6
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 510
    .line 511
    .line 512
    move-result-object v23

    .line 513
    :cond_4
    move-object/from16 v68, v23

    .line 514
    .line 515
    move/from16 v3, v25

    .line 516
    .line 517
    move/from16 v23, v5

    .line 518
    .line 519
    goto :goto_7

    .line 520
    :catchall_0
    move-exception v0

    .line 521
    goto/16 :goto_10

    .line 522
    .line 523
    :goto_7
    invoke-interface {v1, v3}, Lxr6;->getLong(I)J

    .line 524
    .line 525
    .line 526
    move-result-wide v4

    .line 527
    long-to-int v4, v4

    .line 528
    invoke-static {v4}, La28;->k(I)Lb45;

    .line 529
    .line 530
    .line 531
    move-result-object v74

    .line 532
    move/from16 v4, v26

    .line 533
    .line 534
    invoke-interface {v1, v4}, Lxr6;->getBlob(I)[B

    .line 535
    .line 536
    .line 537
    move-result-object v5

    .line 538
    invoke-static {v5}, La28;->w([B)Lu35;

    .line 539
    .line 540
    .line 541
    move-result-object v73

    .line 542
    move/from16 v25, v2

    .line 543
    .line 544
    move/from16 v26, v3

    .line 545
    .line 546
    move/from16 v5, v27

    .line 547
    .line 548
    invoke-interface {v1, v5}, Lxr6;->getLong(I)J

    .line 549
    .line 550
    .line 551
    move-result-wide v2

    .line 552
    long-to-int v2, v2

    .line 553
    if-eqz v2, :cond_5

    .line 554
    .line 555
    const/16 v75, 0x1

    .line 556
    .line 557
    :goto_8
    move/from16 v27, v4

    .line 558
    .line 559
    move/from16 v2, v28

    .line 560
    .line 561
    goto :goto_9

    .line 562
    :cond_5
    const/16 v75, 0x0

    .line 563
    .line 564
    goto :goto_8

    .line 565
    :goto_9
    invoke-interface {v1, v2}, Lxr6;->getLong(I)J

    .line 566
    .line 567
    .line 568
    move-result-wide v3

    .line 569
    long-to-int v3, v3

    .line 570
    if-eqz v3, :cond_6

    .line 571
    .line 572
    const/16 v76, 0x1

    .line 573
    .line 574
    :goto_a
    move/from16 v28, v5

    .line 575
    .line 576
    move/from16 v3, v29

    .line 577
    .line 578
    goto :goto_b

    .line 579
    :cond_6
    const/16 v76, 0x0

    .line 580
    .line 581
    goto :goto_a

    .line 582
    :goto_b
    invoke-interface {v1, v3}, Lxr6;->getLong(I)J

    .line 583
    .line 584
    .line 585
    move-result-wide v4

    .line 586
    long-to-int v4, v4

    .line 587
    if-eqz v4, :cond_7

    .line 588
    .line 589
    const/16 v77, 0x1

    .line 590
    .line 591
    :goto_c
    move v5, v2

    .line 592
    move/from16 v29, v3

    .line 593
    .line 594
    move/from16 v4, v30

    .line 595
    .line 596
    goto :goto_d

    .line 597
    :cond_7
    const/16 v77, 0x0

    .line 598
    .line 599
    goto :goto_c

    .line 600
    :goto_d
    invoke-interface {v1, v4}, Lxr6;->getLong(I)J

    .line 601
    .line 602
    .line 603
    move-result-wide v2

    .line 604
    long-to-int v2, v2

    .line 605
    if-eqz v2, :cond_8

    .line 606
    .line 607
    const/16 v78, 0x1

    .line 608
    .line 609
    :goto_e
    move/from16 v2, v31

    .line 610
    .line 611
    goto :goto_f

    .line 612
    :cond_8
    const/16 v78, 0x0

    .line 613
    .line 614
    goto :goto_e

    .line 615
    :goto_f
    invoke-interface {v1, v2}, Lxr6;->getLong(I)J

    .line 616
    .line 617
    .line 618
    move-result-wide v79

    .line 619
    move/from16 v3, v32

    .line 620
    .line 621
    invoke-interface {v1, v3}, Lxr6;->getLong(I)J

    .line 622
    .line 623
    .line 624
    move-result-wide v81

    .line 625
    move/from16 v31, v2

    .line 626
    .line 627
    move/from16 v2, v33

    .line 628
    .line 629
    invoke-interface {v1, v2}, Lxr6;->getBlob(I)[B

    .line 630
    .line 631
    .line 632
    move-result-object v30

    .line 633
    invoke-static/range {v30 .. v30}, La28;->b([B)Ljava/util/LinkedHashSet;

    .line 634
    .line 635
    .line 636
    move-result-object v83

    .line 637
    new-instance v48, Lp31;

    .line 638
    .line 639
    move-object/from16 v72, v48

    .line 640
    .line 641
    invoke-direct/range {v72 .. v83}, Lp31;-><init>(Lu35;Lb45;ZZZZJJLjava/util/Set;)V

    .line 642
    .line 643
    .line 644
    move-object/from16 v48, v72

    .line 645
    .line 646
    new-instance v35, Ll49;

    .line 647
    .line 648
    move/from16 v49, v14

    .line 649
    .line 650
    invoke-direct/range {v35 .. v68}, Ll49;-><init>(Ljava/lang/String;Lu39;Ljava/lang/String;Ljava/lang/String;Lu91;Lu91;JJJLp31;ILz00;JJJJZLyd5;IIJIILjava/lang/String;Ljava/lang/Boolean;)V

    .line 651
    .line 652
    .line 653
    move-object/from16 v14, v35

    .line 654
    .line 655
    invoke-virtual {v0, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 656
    .line 657
    .line 658
    move/from16 v14, v28

    .line 659
    .line 660
    move/from16 v28, v5

    .line 661
    .line 662
    move/from16 v5, v17

    .line 663
    .line 664
    move/from16 v17, v18

    .line 665
    .line 666
    move/from16 v18, v19

    .line 667
    .line 668
    move/from16 v19, v20

    .line 669
    .line 670
    move/from16 v20, v23

    .line 671
    .line 672
    move/from16 v23, v24

    .line 673
    .line 674
    move/from16 v24, v25

    .line 675
    .line 676
    move/from16 v25, v26

    .line 677
    .line 678
    move/from16 v26, v27

    .line 679
    .line 680
    move/from16 v27, v14

    .line 681
    .line 682
    move/from16 v33, v2

    .line 683
    .line 684
    move/from16 v32, v3

    .line 685
    .line 686
    move/from16 v30, v4

    .line 687
    .line 688
    move v2, v15

    .line 689
    move/from16 v4, v16

    .line 690
    .line 691
    move/from16 v14, v34

    .line 692
    .line 693
    move/from16 v15, v69

    .line 694
    .line 695
    move/from16 v3, v70

    .line 696
    .line 697
    move/from16 v16, v71

    .line 698
    .line 699
    goto/16 :goto_0

    .line 700
    .line 701
    :cond_9
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 702
    .line 703
    .line 704
    return-object v0

    .line 705
    :goto_10
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 706
    .line 707
    .line 708
    throw v0
.end method

.method private final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 83

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    check-cast v0, Lqr6;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const-string v1, "SELECT * FROM workspec WHERE state=1"

    .line 9
    .line 10
    invoke-interface {v0, v1}, Lqr6;->X0(Ljava/lang/String;)Lxr6;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    :try_start_0
    const-string v0, "id"

    .line 15
    .line 16
    invoke-static {v1, v0}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const-string v2, "state"

    .line 21
    .line 22
    invoke-static {v1, v2}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    const-string v3, "worker_class_name"

    .line 27
    .line 28
    invoke-static {v1, v3}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    const-string v4, "input_merger_class_name"

    .line 33
    .line 34
    invoke-static {v1, v4}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    const-string v5, "input"

    .line 39
    .line 40
    invoke-static {v1, v5}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    const-string v6, "output"

    .line 45
    .line 46
    invoke-static {v1, v6}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    const-string v7, "initial_delay"

    .line 51
    .line 52
    invoke-static {v1, v7}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    const-string v8, "interval_duration"

    .line 57
    .line 58
    invoke-static {v1, v8}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 59
    .line 60
    .line 61
    move-result v8

    .line 62
    const-string v9, "flex_duration"

    .line 63
    .line 64
    invoke-static {v1, v9}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 65
    .line 66
    .line 67
    move-result v9

    .line 68
    const-string v10, "run_attempt_count"

    .line 69
    .line 70
    invoke-static {v1, v10}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    move-result v10

    .line 74
    const-string v11, "backoff_policy"

    .line 75
    .line 76
    invoke-static {v1, v11}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 77
    .line 78
    .line 79
    move-result v11

    .line 80
    const-string v12, "backoff_delay_duration"

    .line 81
    .line 82
    invoke-static {v1, v12}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 83
    .line 84
    .line 85
    move-result v12

    .line 86
    const-string v13, "last_enqueue_time"

    .line 87
    .line 88
    invoke-static {v1, v13}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 89
    .line 90
    .line 91
    move-result v13

    .line 92
    const-string v14, "minimum_retention_duration"

    .line 93
    .line 94
    invoke-static {v1, v14}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 95
    .line 96
    .line 97
    move-result v14

    .line 98
    const-string v15, "schedule_requested_at"

    .line 99
    .line 100
    invoke-static {v1, v15}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 101
    .line 102
    .line 103
    move-result v15

    .line 104
    move/from16 p0, v15

    .line 105
    .line 106
    const-string v15, "run_in_foreground"

    .line 107
    .line 108
    invoke-static {v1, v15}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 109
    .line 110
    .line 111
    move-result v15

    .line 112
    move/from16 p1, v15

    .line 113
    .line 114
    const-string v15, "out_of_quota_policy"

    .line 115
    .line 116
    invoke-static {v1, v15}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 117
    .line 118
    .line 119
    move-result v15

    .line 120
    move/from16 v16, v15

    .line 121
    .line 122
    const-string v15, "period_count"

    .line 123
    .line 124
    invoke-static {v1, v15}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 125
    .line 126
    .line 127
    move-result v15

    .line 128
    move/from16 v17, v15

    .line 129
    .line 130
    const-string v15, "generation"

    .line 131
    .line 132
    invoke-static {v1, v15}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 133
    .line 134
    .line 135
    move-result v15

    .line 136
    move/from16 v18, v15

    .line 137
    .line 138
    const-string v15, "next_schedule_time_override"

    .line 139
    .line 140
    invoke-static {v1, v15}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 141
    .line 142
    .line 143
    move-result v15

    .line 144
    move/from16 v19, v15

    .line 145
    .line 146
    const-string v15, "next_schedule_time_override_generation"

    .line 147
    .line 148
    invoke-static {v1, v15}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 149
    .line 150
    .line 151
    move-result v15

    .line 152
    move/from16 v20, v15

    .line 153
    .line 154
    const-string v15, "stop_reason"

    .line 155
    .line 156
    invoke-static {v1, v15}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 157
    .line 158
    .line 159
    move-result v15

    .line 160
    move/from16 v21, v15

    .line 161
    .line 162
    const-string v15, "trace_tag"

    .line 163
    .line 164
    invoke-static {v1, v15}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 165
    .line 166
    .line 167
    move-result v15

    .line 168
    move/from16 v22, v15

    .line 169
    .line 170
    const-string v15, "backoff_on_system_interruptions"

    .line 171
    .line 172
    invoke-static {v1, v15}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 173
    .line 174
    .line 175
    move-result v15

    .line 176
    move/from16 v23, v15

    .line 177
    .line 178
    const-string v15, "required_network_type"

    .line 179
    .line 180
    invoke-static {v1, v15}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 181
    .line 182
    .line 183
    move-result v15

    .line 184
    move/from16 v24, v15

    .line 185
    .line 186
    const-string v15, "required_network_request"

    .line 187
    .line 188
    invoke-static {v1, v15}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 189
    .line 190
    .line 191
    move-result v15

    .line 192
    move/from16 v25, v15

    .line 193
    .line 194
    const-string v15, "requires_charging"

    .line 195
    .line 196
    invoke-static {v1, v15}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 197
    .line 198
    .line 199
    move-result v15

    .line 200
    move/from16 v26, v15

    .line 201
    .line 202
    const-string v15, "requires_device_idle"

    .line 203
    .line 204
    invoke-static {v1, v15}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 205
    .line 206
    .line 207
    move-result v15

    .line 208
    move/from16 v27, v15

    .line 209
    .line 210
    const-string v15, "requires_battery_not_low"

    .line 211
    .line 212
    invoke-static {v1, v15}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 213
    .line 214
    .line 215
    move-result v15

    .line 216
    move/from16 v28, v15

    .line 217
    .line 218
    const-string v15, "requires_storage_not_low"

    .line 219
    .line 220
    invoke-static {v1, v15}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 221
    .line 222
    .line 223
    move-result v15

    .line 224
    move/from16 v29, v15

    .line 225
    .line 226
    const-string v15, "trigger_content_update_delay"

    .line 227
    .line 228
    invoke-static {v1, v15}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 229
    .line 230
    .line 231
    move-result v15

    .line 232
    move/from16 v30, v15

    .line 233
    .line 234
    const-string v15, "trigger_max_content_delay"

    .line 235
    .line 236
    invoke-static {v1, v15}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 237
    .line 238
    .line 239
    move-result v15

    .line 240
    move/from16 v31, v15

    .line 241
    .line 242
    const-string v15, "content_uri_triggers"

    .line 243
    .line 244
    invoke-static {v1, v15}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 245
    .line 246
    .line 247
    move-result v15

    .line 248
    move/from16 v32, v15

    .line 249
    .line 250
    new-instance v15, Ljava/util/ArrayList;

    .line 251
    .line 252
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 253
    .line 254
    .line 255
    :goto_0
    invoke-interface {v1}, Lxr6;->S0()Z

    .line 256
    .line 257
    .line 258
    move-result v33

    .line 259
    if-eqz v33, :cond_9

    .line 260
    .line 261
    invoke-interface {v1, v0}, Lxr6;->p0(I)Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v35

    .line 265
    move/from16 v33, v14

    .line 266
    .line 267
    move-object/from16 v68, v15

    .line 268
    .line 269
    invoke-interface {v1, v2}, Lxr6;->getLong(I)J

    .line 270
    .line 271
    .line 272
    move-result-wide v14

    .line 273
    long-to-int v14, v14

    .line 274
    invoke-static {v14}, La28;->m(I)Lu39;

    .line 275
    .line 276
    .line 277
    move-result-object v36

    .line 278
    invoke-interface {v1, v3}, Lxr6;->p0(I)Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v37

    .line 282
    invoke-interface {v1, v4}, Lxr6;->p0(I)Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v38

    .line 286
    invoke-interface {v1, v5}, Lxr6;->getBlob(I)[B

    .line 287
    .line 288
    .line 289
    move-result-object v14

    .line 290
    sget-object v15, Lu91;->b:Lu91;

    .line 291
    .line 292
    invoke-static {v14}, Lwl7;->A([B)Lu91;

    .line 293
    .line 294
    .line 295
    move-result-object v39

    .line 296
    invoke-interface {v1, v6}, Lxr6;->getBlob(I)[B

    .line 297
    .line 298
    .line 299
    move-result-object v14

    .line 300
    invoke-static {v14}, Lwl7;->A([B)Lu91;

    .line 301
    .line 302
    .line 303
    move-result-object v40

    .line 304
    invoke-interface {v1, v7}, Lxr6;->getLong(I)J

    .line 305
    .line 306
    .line 307
    move-result-wide v41

    .line 308
    invoke-interface {v1, v8}, Lxr6;->getLong(I)J

    .line 309
    .line 310
    .line 311
    move-result-wide v43

    .line 312
    invoke-interface {v1, v9}, Lxr6;->getLong(I)J

    .line 313
    .line 314
    .line 315
    move-result-wide v45

    .line 316
    invoke-interface {v1, v10}, Lxr6;->getLong(I)J

    .line 317
    .line 318
    .line 319
    move-result-wide v14

    .line 320
    long-to-int v14, v14

    .line 321
    move v15, v2

    .line 322
    move/from16 v69, v3

    .line 323
    .line 324
    invoke-interface {v1, v11}, Lxr6;->getLong(I)J

    .line 325
    .line 326
    .line 327
    move-result-wide v2

    .line 328
    long-to-int v2, v2

    .line 329
    invoke-static {v2}, La28;->j(I)Lz00;

    .line 330
    .line 331
    .line 332
    move-result-object v49

    .line 333
    invoke-interface {v1, v12}, Lxr6;->getLong(I)J

    .line 334
    .line 335
    .line 336
    move-result-wide v50

    .line 337
    invoke-interface {v1, v13}, Lxr6;->getLong(I)J

    .line 338
    .line 339
    .line 340
    move-result-wide v52

    .line 341
    move/from16 v2, v33

    .line 342
    .line 343
    invoke-interface {v1, v2}, Lxr6;->getLong(I)J

    .line 344
    .line 345
    .line 346
    move-result-wide v54

    .line 347
    move/from16 v3, p0

    .line 348
    .line 349
    invoke-interface {v1, v3}, Lxr6;->getLong(I)J

    .line 350
    .line 351
    .line 352
    move-result-wide v56

    .line 353
    move/from16 p0, v0

    .line 354
    .line 355
    move/from16 v33, v2

    .line 356
    .line 357
    move/from16 v0, p1

    .line 358
    .line 359
    move/from16 p1, v3

    .line 360
    .line 361
    invoke-interface {v1, v0}, Lxr6;->getLong(I)J

    .line 362
    .line 363
    .line 364
    move-result-wide v2

    .line 365
    long-to-int v2, v2

    .line 366
    const/16 v34, 0x1

    .line 367
    .line 368
    if-eqz v2, :cond_0

    .line 369
    .line 370
    move/from16 v58, v34

    .line 371
    .line 372
    :goto_1
    move/from16 v2, v16

    .line 373
    .line 374
    move/from16 v16, v4

    .line 375
    .line 376
    goto :goto_2

    .line 377
    :cond_0
    const/16 v58, 0x0

    .line 378
    .line 379
    goto :goto_1

    .line 380
    :goto_2
    invoke-interface {v1, v2}, Lxr6;->getLong(I)J

    .line 381
    .line 382
    .line 383
    move-result-wide v3

    .line 384
    long-to-int v3, v3

    .line 385
    invoke-static {v3}, La28;->l(I)Lyd5;

    .line 386
    .line 387
    .line 388
    move-result-object v59

    .line 389
    move/from16 v3, v17

    .line 390
    .line 391
    move/from16 v17, v5

    .line 392
    .line 393
    invoke-interface {v1, v3}, Lxr6;->getLong(I)J

    .line 394
    .line 395
    .line 396
    move-result-wide v4

    .line 397
    long-to-int v4, v4

    .line 398
    move/from16 v70, v3

    .line 399
    .line 400
    move/from16 v5, v18

    .line 401
    .line 402
    move/from16 v18, v2

    .line 403
    .line 404
    invoke-interface {v1, v5}, Lxr6;->getLong(I)J

    .line 405
    .line 406
    .line 407
    move-result-wide v2

    .line 408
    long-to-int v2, v2

    .line 409
    move/from16 v3, v19

    .line 410
    .line 411
    invoke-interface {v1, v3}, Lxr6;->getLong(I)J

    .line 412
    .line 413
    .line 414
    move-result-wide v62

    .line 415
    move/from16 v19, v0

    .line 416
    .line 417
    move/from16 v61, v2

    .line 418
    .line 419
    move/from16 v0, v20

    .line 420
    .line 421
    move/from16 v20, v3

    .line 422
    .line 423
    invoke-interface {v1, v0}, Lxr6;->getLong(I)J

    .line 424
    .line 425
    .line 426
    move-result-wide v2

    .line 427
    long-to-int v2, v2

    .line 428
    move/from16 v60, v4

    .line 429
    .line 430
    move/from16 v3, v21

    .line 431
    .line 432
    move/from16 v21, v5

    .line 433
    .line 434
    invoke-interface {v1, v3}, Lxr6;->getLong(I)J

    .line 435
    .line 436
    .line 437
    move-result-wide v4

    .line 438
    long-to-int v4, v4

    .line 439
    move/from16 v5, v22

    .line 440
    .line 441
    invoke-interface {v1, v5}, Lxr6;->isNull(I)Z

    .line 442
    .line 443
    .line 444
    move-result v22

    .line 445
    const/16 v48, 0x0

    .line 446
    .line 447
    if-eqz v22, :cond_1

    .line 448
    .line 449
    move-object/from16 v66, v48

    .line 450
    .line 451
    :goto_3
    move/from16 v22, v0

    .line 452
    .line 453
    move/from16 v0, v23

    .line 454
    .line 455
    goto :goto_4

    .line 456
    :cond_1
    invoke-interface {v1, v5}, Lxr6;->p0(I)Ljava/lang/String;

    .line 457
    .line 458
    .line 459
    move-result-object v22

    .line 460
    move-object/from16 v66, v22

    .line 461
    .line 462
    goto :goto_3

    .line 463
    :goto_4
    invoke-interface {v1, v0}, Lxr6;->isNull(I)Z

    .line 464
    .line 465
    .line 466
    move-result v23

    .line 467
    if-eqz v23, :cond_2

    .line 468
    .line 469
    move/from16 v64, v2

    .line 470
    .line 471
    move/from16 v23, v3

    .line 472
    .line 473
    move-object/from16 v2, v48

    .line 474
    .line 475
    goto :goto_5

    .line 476
    :cond_2
    move/from16 v64, v2

    .line 477
    .line 478
    move/from16 v23, v3

    .line 479
    .line 480
    invoke-interface {v1, v0}, Lxr6;->getLong(I)J

    .line 481
    .line 482
    .line 483
    move-result-wide v2

    .line 484
    long-to-int v2, v2

    .line 485
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 486
    .line 487
    .line 488
    move-result-object v2

    .line 489
    :goto_5
    if-eqz v2, :cond_4

    .line 490
    .line 491
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 492
    .line 493
    .line 494
    move-result v2

    .line 495
    if-eqz v2, :cond_3

    .line 496
    .line 497
    move/from16 v2, v34

    .line 498
    .line 499
    goto :goto_6

    .line 500
    :cond_3
    const/4 v2, 0x0

    .line 501
    :goto_6
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 502
    .line 503
    .line 504
    move-result-object v48

    .line 505
    :cond_4
    move/from16 v65, v4

    .line 506
    .line 507
    move/from16 v2, v24

    .line 508
    .line 509
    move-object/from16 v67, v48

    .line 510
    .line 511
    goto :goto_7

    .line 512
    :catchall_0
    move-exception v0

    .line 513
    goto/16 :goto_10

    .line 514
    .line 515
    :goto_7
    invoke-interface {v1, v2}, Lxr6;->getLong(I)J

    .line 516
    .line 517
    .line 518
    move-result-wide v3

    .line 519
    long-to-int v3, v3

    .line 520
    invoke-static {v3}, La28;->k(I)Lb45;

    .line 521
    .line 522
    .line 523
    move-result-object v73

    .line 524
    move/from16 v3, v25

    .line 525
    .line 526
    invoke-interface {v1, v3}, Lxr6;->getBlob(I)[B

    .line 527
    .line 528
    .line 529
    move-result-object v4

    .line 530
    invoke-static {v4}, La28;->w([B)Lu35;

    .line 531
    .line 532
    .line 533
    move-result-object v72

    .line 534
    move/from16 v24, v2

    .line 535
    .line 536
    move/from16 v25, v3

    .line 537
    .line 538
    move/from16 v4, v26

    .line 539
    .line 540
    invoke-interface {v1, v4}, Lxr6;->getLong(I)J

    .line 541
    .line 542
    .line 543
    move-result-wide v2

    .line 544
    long-to-int v2, v2

    .line 545
    if-eqz v2, :cond_5

    .line 546
    .line 547
    move/from16 v74, v34

    .line 548
    .line 549
    :goto_8
    move/from16 v26, v4

    .line 550
    .line 551
    move/from16 v2, v27

    .line 552
    .line 553
    goto :goto_9

    .line 554
    :cond_5
    const/16 v74, 0x0

    .line 555
    .line 556
    goto :goto_8

    .line 557
    :goto_9
    invoke-interface {v1, v2}, Lxr6;->getLong(I)J

    .line 558
    .line 559
    .line 560
    move-result-wide v3

    .line 561
    long-to-int v3, v3

    .line 562
    if-eqz v3, :cond_6

    .line 563
    .line 564
    move/from16 v75, v34

    .line 565
    .line 566
    :goto_a
    move/from16 v27, v5

    .line 567
    .line 568
    move/from16 v3, v28

    .line 569
    .line 570
    goto :goto_b

    .line 571
    :cond_6
    const/16 v75, 0x0

    .line 572
    .line 573
    goto :goto_a

    .line 574
    :goto_b
    invoke-interface {v1, v3}, Lxr6;->getLong(I)J

    .line 575
    .line 576
    .line 577
    move-result-wide v4

    .line 578
    long-to-int v4, v4

    .line 579
    if-eqz v4, :cond_7

    .line 580
    .line 581
    move/from16 v76, v34

    .line 582
    .line 583
    :goto_c
    move v5, v2

    .line 584
    move/from16 v28, v3

    .line 585
    .line 586
    move/from16 v4, v29

    .line 587
    .line 588
    goto :goto_d

    .line 589
    :cond_7
    const/16 v76, 0x0

    .line 590
    .line 591
    goto :goto_c

    .line 592
    :goto_d
    invoke-interface {v1, v4}, Lxr6;->getLong(I)J

    .line 593
    .line 594
    .line 595
    move-result-wide v2

    .line 596
    long-to-int v2, v2

    .line 597
    if-eqz v2, :cond_8

    .line 598
    .line 599
    move/from16 v77, v34

    .line 600
    .line 601
    :goto_e
    move/from16 v2, v30

    .line 602
    .line 603
    goto :goto_f

    .line 604
    :cond_8
    const/16 v77, 0x0

    .line 605
    .line 606
    goto :goto_e

    .line 607
    :goto_f
    invoke-interface {v1, v2}, Lxr6;->getLong(I)J

    .line 608
    .line 609
    .line 610
    move-result-wide v78

    .line 611
    move/from16 v3, v31

    .line 612
    .line 613
    invoke-interface {v1, v3}, Lxr6;->getLong(I)J

    .line 614
    .line 615
    .line 616
    move-result-wide v80

    .line 617
    move/from16 v29, v0

    .line 618
    .line 619
    move/from16 v0, v32

    .line 620
    .line 621
    invoke-interface {v1, v0}, Lxr6;->getBlob(I)[B

    .line 622
    .line 623
    .line 624
    move-result-object v30

    .line 625
    invoke-static/range {v30 .. v30}, La28;->b([B)Ljava/util/LinkedHashSet;

    .line 626
    .line 627
    .line 628
    move-result-object v82

    .line 629
    new-instance v47, Lp31;

    .line 630
    .line 631
    move-object/from16 v71, v47

    .line 632
    .line 633
    invoke-direct/range {v71 .. v82}, Lp31;-><init>(Lu35;Lb45;ZZZZJJLjava/util/Set;)V

    .line 634
    .line 635
    .line 636
    move-object/from16 v47, v71

    .line 637
    .line 638
    new-instance v34, Ll49;

    .line 639
    .line 640
    move/from16 v48, v14

    .line 641
    .line 642
    invoke-direct/range {v34 .. v67}, Ll49;-><init>(Ljava/lang/String;Lu39;Ljava/lang/String;Ljava/lang/String;Lu91;Lu91;JJJLp31;ILz00;JJJJZLyd5;IIJIILjava/lang/String;Ljava/lang/Boolean;)V

    .line 643
    .line 644
    .line 645
    move-object/from16 v14, v34

    .line 646
    .line 647
    move/from16 v32, v0

    .line 648
    .line 649
    move-object/from16 v0, v68

    .line 650
    .line 651
    invoke-virtual {v0, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 652
    .line 653
    .line 654
    move/from16 v14, v29

    .line 655
    .line 656
    move/from16 v29, v4

    .line 657
    .line 658
    move/from16 v4, v16

    .line 659
    .line 660
    move/from16 v16, v18

    .line 661
    .line 662
    move/from16 v18, v21

    .line 663
    .line 664
    move/from16 v21, v23

    .line 665
    .line 666
    move/from16 v23, v14

    .line 667
    .line 668
    move/from16 v30, v2

    .line 669
    .line 670
    move/from16 v31, v3

    .line 671
    .line 672
    move v2, v15

    .line 673
    move/from16 v14, v33

    .line 674
    .line 675
    move/from16 v3, v69

    .line 676
    .line 677
    move-object v15, v0

    .line 678
    move/from16 v0, p0

    .line 679
    .line 680
    move/from16 p0, p1

    .line 681
    .line 682
    move/from16 p1, v19

    .line 683
    .line 684
    move/from16 v19, v20

    .line 685
    .line 686
    move/from16 v20, v22

    .line 687
    .line 688
    move/from16 v22, v27

    .line 689
    .line 690
    move/from16 v27, v5

    .line 691
    .line 692
    move/from16 v5, v17

    .line 693
    .line 694
    move/from16 v17, v70

    .line 695
    .line 696
    goto/16 :goto_0

    .line 697
    .line 698
    :cond_9
    move-object v0, v15

    .line 699
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 700
    .line 701
    .line 702
    return-object v0

    .line 703
    :goto_10
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 704
    .line 705
    .line 706
    throw v0
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 86

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, Lut8;->X:B

    .line 4
    .line 5
    const-string v2, "out_of_quota_policy"

    .line 6
    .line 7
    const-string v3, "run_in_foreground"

    .line 8
    .line 9
    const-string v4, "schedule_requested_at"

    .line 10
    .line 11
    const-string v5, "minimum_retention_duration"

    .line 12
    .line 13
    const-string v6, "last_enqueue_time"

    .line 14
    .line 15
    const-string v7, "backoff_delay_duration"

    .line 16
    .line 17
    const-string v8, "backoff_policy"

    .line 18
    .line 19
    const-string v9, "run_attempt_count"

    .line 20
    .line 21
    const-string v10, "flex_duration"

    .line 22
    .line 23
    const-string v11, "interval_duration"

    .line 24
    .line 25
    const-string v12, "initial_delay"

    .line 26
    .line 27
    const-string v13, "output"

    .line 28
    .line 29
    const-string v14, "input"

    .line 30
    .line 31
    const-string v15, "input_merger_class_name"

    .line 32
    .line 33
    const-string v0, "worker_class_name"

    .line 34
    .line 35
    move/from16 v16, v1

    .line 36
    .line 37
    const-string v1, "state"

    .line 38
    .line 39
    move-object/from16 v17, v2

    .line 40
    .line 41
    const-string v2, "id"

    .line 42
    .line 43
    const/16 v18, 0x0

    .line 44
    .line 45
    const/16 v19, 0x1

    .line 46
    .line 47
    move-object/from16 v20, v3

    .line 48
    .line 49
    const/4 v3, 0x0

    .line 50
    const-wide v21, 0xffffffffL

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    const/16 v23, 0x20

    .line 56
    .line 57
    packed-switch v16, :pswitch_data_0

    .line 58
    .line 59
    .line 60
    move-object/from16 v0, p1

    .line 61
    .line 62
    check-cast v0, Lbo3;

    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    instance-of v0, v0, Lbq3;

    .line 68
    .line 69
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    return-object v0

    .line 74
    :pswitch_0
    move-object/from16 v0, p1

    .line 75
    .line 76
    check-cast v0, Lbo3;

    .line 77
    .line 78
    invoke-virtual {v0}, Lbo3;->c()Lbq3;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    return-object v0

    .line 83
    :pswitch_1
    move-object/from16 v0, p1

    .line 84
    .line 85
    check-cast v0, Lbo3;

    .line 86
    .line 87
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    instance-of v0, v0, Lbq3;

    .line 91
    .line 92
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    return-object v0

    .line 97
    :pswitch_2
    move-object/from16 v0, p1

    .line 98
    .line 99
    check-cast v0, Lbq3;

    .line 100
    .line 101
    const-string v1, "protocol"

    .line 102
    .line 103
    invoke-virtual {v0, v1}, Lbq3;->j(Ljava/lang/String;)Lbo3;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    invoke-virtual {v1}, Lbo3;->d()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    const-string v2, "port"

    .line 112
    .line 113
    invoke-virtual {v0, v2}, Lbq3;->j(Ljava/lang/String;)Lbo3;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-virtual {v0}, Lbo3;->a()I

    .line 118
    .line 119
    .line 120
    move-result v0

    .line 121
    const-string v2, "socks"

    .line 122
    .line 123
    invoke-static {v1, v2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    if-eqz v2, :cond_0

    .line 128
    .line 129
    invoke-static {}, Ln67;->d()I

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    if-eq v0, v2, :cond_2

    .line 134
    .line 135
    :cond_0
    const-string v2, "http"

    .line 136
    .line 137
    invoke-static {v1, v2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    if-eqz v1, :cond_1

    .line 142
    .line 143
    invoke-static {}, Ln67;->b()I

    .line 144
    .line 145
    .line 146
    move-result v1

    .line 147
    if-ne v0, v1, :cond_1

    .line 148
    .line 149
    goto :goto_0

    .line 150
    :cond_1
    move/from16 v19, v3

    .line 151
    .line 152
    :cond_2
    :goto_0
    invoke-static/range {v19 .. v19}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    return-object v0

    .line 157
    :pswitch_3
    invoke-direct/range {p0 .. p1}, Lut8;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    return-object v0

    .line 162
    :pswitch_4
    invoke-direct/range {p0 .. p1}, Lut8;->e(Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    return-object v0

    .line 167
    :pswitch_5
    move-object/from16 v0, p1

    .line 168
    .line 169
    check-cast v0, Lqr6;

    .line 170
    .line 171
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    const-string v1, "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)"

    .line 175
    .line 176
    invoke-interface {v0, v1}, Lqr6;->X0(Ljava/lang/String;)Lxr6;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    :try_start_0
    invoke-interface {v1}, Lxr6;->S0()Z

    .line 181
    .line 182
    .line 183
    invoke-static {v0}, Los4;->r(Lqr6;)I

    .line 184
    .line 185
    .line 186
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 187
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 188
    .line 189
    .line 190
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    return-object v0

    .line 195
    :catchall_0
    move-exception v0

    .line 196
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 197
    .line 198
    .line 199
    throw v0

    .line 200
    :pswitch_6
    invoke-direct/range {p0 .. p1}, Lut8;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    return-object v0

    .line 205
    :pswitch_7
    move-object/from16 v0, p1

    .line 206
    .line 207
    check-cast v0, Lqr6;

    .line 208
    .line 209
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    const-string v1, "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1"

    .line 213
    .line 214
    invoke-interface {v0, v1}, Lqr6;->X0(Ljava/lang/String;)Lxr6;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    :try_start_1
    invoke-interface {v1}, Lxr6;->S0()Z

    .line 219
    .line 220
    .line 221
    move-result v0

    .line 222
    if-eqz v0, :cond_4

    .line 223
    .line 224
    invoke-interface {v1, v3}, Lxr6;->getLong(I)J

    .line 225
    .line 226
    .line 227
    move-result-wide v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 228
    long-to-int v0, v4

    .line 229
    if-eqz v0, :cond_3

    .line 230
    .line 231
    goto :goto_1

    .line 232
    :cond_3
    move/from16 v19, v3

    .line 233
    .line 234
    :goto_1
    move/from16 v3, v19

    .line 235
    .line 236
    goto :goto_2

    .line 237
    :catchall_1
    move-exception v0

    .line 238
    goto :goto_3

    .line 239
    :cond_4
    :goto_2
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 240
    .line 241
    .line 242
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    return-object v0

    .line 247
    :goto_3
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 248
    .line 249
    .line 250
    throw v0

    .line 251
    :pswitch_8
    move-object/from16 v3, p1

    .line 252
    .line 253
    check-cast v3, Lqr6;

    .line 254
    .line 255
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 256
    .line 257
    .line 258
    move-object/from16 v24, v4

    .line 259
    .line 260
    const-string v4, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1"

    .line 261
    .line 262
    invoke-interface {v3, v4}, Lqr6;->X0(Ljava/lang/String;)Lxr6;

    .line 263
    .line 264
    .line 265
    move-result-object v3

    .line 266
    :try_start_2
    invoke-static {v3, v2}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 267
    .line 268
    .line 269
    move-result v2

    .line 270
    invoke-static {v3, v1}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 271
    .line 272
    .line 273
    move-result v1

    .line 274
    invoke-static {v3, v0}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 275
    .line 276
    .line 277
    move-result v0

    .line 278
    invoke-static {v3, v15}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 279
    .line 280
    .line 281
    move-result v4

    .line 282
    invoke-static {v3, v14}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 283
    .line 284
    .line 285
    move-result v14

    .line 286
    invoke-static {v3, v13}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 287
    .line 288
    .line 289
    move-result v13

    .line 290
    invoke-static {v3, v12}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 291
    .line 292
    .line 293
    move-result v12

    .line 294
    invoke-static {v3, v11}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 295
    .line 296
    .line 297
    move-result v11

    .line 298
    invoke-static {v3, v10}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 299
    .line 300
    .line 301
    move-result v10

    .line 302
    invoke-static {v3, v9}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 303
    .line 304
    .line 305
    move-result v9

    .line 306
    invoke-static {v3, v8}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 307
    .line 308
    .line 309
    move-result v8

    .line 310
    invoke-static {v3, v7}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 311
    .line 312
    .line 313
    move-result v7

    .line 314
    invoke-static {v3, v6}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 315
    .line 316
    .line 317
    move-result v6

    .line 318
    invoke-static {v3, v5}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 319
    .line 320
    .line 321
    move-result v5

    .line 322
    move-object/from16 v15, v24

    .line 323
    .line 324
    invoke-static {v3, v15}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 325
    .line 326
    .line 327
    move-result v15

    .line 328
    move/from16 p0, v15

    .line 329
    .line 330
    move-object/from16 v15, v20

    .line 331
    .line 332
    invoke-static {v3, v15}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 333
    .line 334
    .line 335
    move-result v15

    .line 336
    move/from16 p1, v15

    .line 337
    .line 338
    move-object/from16 v15, v17

    .line 339
    .line 340
    invoke-static {v3, v15}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 341
    .line 342
    .line 343
    move-result v15

    .line 344
    move/from16 v17, v15

    .line 345
    .line 346
    const-string v15, "period_count"

    .line 347
    .line 348
    invoke-static {v3, v15}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 349
    .line 350
    .line 351
    move-result v15

    .line 352
    move/from16 v20, v15

    .line 353
    .line 354
    const-string v15, "generation"

    .line 355
    .line 356
    invoke-static {v3, v15}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 357
    .line 358
    .line 359
    move-result v15

    .line 360
    move/from16 v21, v15

    .line 361
    .line 362
    const-string v15, "next_schedule_time_override"

    .line 363
    .line 364
    invoke-static {v3, v15}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 365
    .line 366
    .line 367
    move-result v15

    .line 368
    move/from16 v22, v15

    .line 369
    .line 370
    const-string v15, "next_schedule_time_override_generation"

    .line 371
    .line 372
    invoke-static {v3, v15}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 373
    .line 374
    .line 375
    move-result v15

    .line 376
    move/from16 v23, v15

    .line 377
    .line 378
    const-string v15, "stop_reason"

    .line 379
    .line 380
    invoke-static {v3, v15}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 381
    .line 382
    .line 383
    move-result v15

    .line 384
    move/from16 v24, v15

    .line 385
    .line 386
    const-string v15, "trace_tag"

    .line 387
    .line 388
    invoke-static {v3, v15}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 389
    .line 390
    .line 391
    move-result v15

    .line 392
    move/from16 v25, v15

    .line 393
    .line 394
    const-string v15, "backoff_on_system_interruptions"

    .line 395
    .line 396
    invoke-static {v3, v15}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 397
    .line 398
    .line 399
    move-result v15

    .line 400
    move/from16 v26, v15

    .line 401
    .line 402
    const-string v15, "required_network_type"

    .line 403
    .line 404
    invoke-static {v3, v15}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 405
    .line 406
    .line 407
    move-result v15

    .line 408
    move/from16 v27, v15

    .line 409
    .line 410
    const-string v15, "required_network_request"

    .line 411
    .line 412
    invoke-static {v3, v15}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 413
    .line 414
    .line 415
    move-result v15

    .line 416
    move/from16 v28, v15

    .line 417
    .line 418
    const-string v15, "requires_charging"

    .line 419
    .line 420
    invoke-static {v3, v15}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 421
    .line 422
    .line 423
    move-result v15

    .line 424
    move/from16 v29, v15

    .line 425
    .line 426
    const-string v15, "requires_device_idle"

    .line 427
    .line 428
    invoke-static {v3, v15}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 429
    .line 430
    .line 431
    move-result v15

    .line 432
    move/from16 v30, v15

    .line 433
    .line 434
    const-string v15, "requires_battery_not_low"

    .line 435
    .line 436
    invoke-static {v3, v15}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 437
    .line 438
    .line 439
    move-result v15

    .line 440
    move/from16 v31, v15

    .line 441
    .line 442
    const-string v15, "requires_storage_not_low"

    .line 443
    .line 444
    invoke-static {v3, v15}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 445
    .line 446
    .line 447
    move-result v15

    .line 448
    move/from16 v32, v15

    .line 449
    .line 450
    const-string v15, "trigger_content_update_delay"

    .line 451
    .line 452
    invoke-static {v3, v15}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 453
    .line 454
    .line 455
    move-result v15

    .line 456
    move/from16 v33, v15

    .line 457
    .line 458
    const-string v15, "trigger_max_content_delay"

    .line 459
    .line 460
    invoke-static {v3, v15}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 461
    .line 462
    .line 463
    move-result v15

    .line 464
    move/from16 v34, v15

    .line 465
    .line 466
    const-string v15, "content_uri_triggers"

    .line 467
    .line 468
    invoke-static {v3, v15}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 469
    .line 470
    .line 471
    move-result v15

    .line 472
    move/from16 v35, v15

    .line 473
    .line 474
    new-instance v15, Ljava/util/ArrayList;

    .line 475
    .line 476
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 477
    .line 478
    .line 479
    :goto_4
    invoke-interface {v3}, Lxr6;->S0()Z

    .line 480
    .line 481
    .line 482
    move-result v36

    .line 483
    if-eqz v36, :cond_e

    .line 484
    .line 485
    invoke-interface {v3, v2}, Lxr6;->p0(I)Ljava/lang/String;

    .line 486
    .line 487
    .line 488
    move-result-object v38

    .line 489
    move/from16 v71, v5

    .line 490
    .line 491
    move/from16 v36, v6

    .line 492
    .line 493
    invoke-interface {v3, v1}, Lxr6;->getLong(I)J

    .line 494
    .line 495
    .line 496
    move-result-wide v5

    .line 497
    long-to-int v5, v5

    .line 498
    invoke-static {v5}, La28;->m(I)Lu39;

    .line 499
    .line 500
    .line 501
    move-result-object v39

    .line 502
    invoke-interface {v3, v0}, Lxr6;->p0(I)Ljava/lang/String;

    .line 503
    .line 504
    .line 505
    move-result-object v40

    .line 506
    invoke-interface {v3, v4}, Lxr6;->p0(I)Ljava/lang/String;

    .line 507
    .line 508
    .line 509
    move-result-object v41

    .line 510
    invoke-interface {v3, v14}, Lxr6;->getBlob(I)[B

    .line 511
    .line 512
    .line 513
    move-result-object v5

    .line 514
    sget-object v6, Lu91;->b:Lu91;

    .line 515
    .line 516
    invoke-static {v5}, Lwl7;->A([B)Lu91;

    .line 517
    .line 518
    .line 519
    move-result-object v42

    .line 520
    invoke-interface {v3, v13}, Lxr6;->getBlob(I)[B

    .line 521
    .line 522
    .line 523
    move-result-object v5

    .line 524
    invoke-static {v5}, Lwl7;->A([B)Lu91;

    .line 525
    .line 526
    .line 527
    move-result-object v43

    .line 528
    invoke-interface {v3, v12}, Lxr6;->getLong(I)J

    .line 529
    .line 530
    .line 531
    move-result-wide v44

    .line 532
    invoke-interface {v3, v11}, Lxr6;->getLong(I)J

    .line 533
    .line 534
    .line 535
    move-result-wide v46

    .line 536
    invoke-interface {v3, v10}, Lxr6;->getLong(I)J

    .line 537
    .line 538
    .line 539
    move-result-wide v48

    .line 540
    invoke-interface {v3, v9}, Lxr6;->getLong(I)J

    .line 541
    .line 542
    .line 543
    move-result-wide v5

    .line 544
    long-to-int v5, v5

    .line 545
    move/from16 v73, v0

    .line 546
    .line 547
    move/from16 v72, v1

    .line 548
    .line 549
    invoke-interface {v3, v8}, Lxr6;->getLong(I)J

    .line 550
    .line 551
    .line 552
    move-result-wide v0

    .line 553
    long-to-int v0, v0

    .line 554
    invoke-static {v0}, La28;->j(I)Lz00;

    .line 555
    .line 556
    .line 557
    move-result-object v52

    .line 558
    invoke-interface {v3, v7}, Lxr6;->getLong(I)J

    .line 559
    .line 560
    .line 561
    move-result-wide v53

    .line 562
    move/from16 v0, v36

    .line 563
    .line 564
    invoke-interface {v3, v0}, Lxr6;->getLong(I)J

    .line 565
    .line 566
    .line 567
    move-result-wide v55

    .line 568
    move/from16 v1, v71

    .line 569
    .line 570
    invoke-interface {v3, v1}, Lxr6;->getLong(I)J

    .line 571
    .line 572
    .line 573
    move-result-wide v57

    .line 574
    move/from16 v6, p0

    .line 575
    .line 576
    invoke-interface {v3, v6}, Lxr6;->getLong(I)J

    .line 577
    .line 578
    .line 579
    move-result-wide v59

    .line 580
    move/from16 v36, v0

    .line 581
    .line 582
    move/from16 v71, v1

    .line 583
    .line 584
    move/from16 p0, v2

    .line 585
    .line 586
    move/from16 v0, p1

    .line 587
    .line 588
    invoke-interface {v3, v0}, Lxr6;->getLong(I)J

    .line 589
    .line 590
    .line 591
    move-result-wide v1

    .line 592
    long-to-int v1, v1

    .line 593
    if-eqz v1, :cond_5

    .line 594
    .line 595
    move/from16 v61, v19

    .line 596
    .line 597
    :goto_5
    move/from16 p1, v4

    .line 598
    .line 599
    move/from16 v51, v5

    .line 600
    .line 601
    move/from16 v1, v17

    .line 602
    .line 603
    goto :goto_6

    .line 604
    :cond_5
    const/16 v61, 0x0

    .line 605
    .line 606
    goto :goto_5

    .line 607
    :goto_6
    invoke-interface {v3, v1}, Lxr6;->getLong(I)J

    .line 608
    .line 609
    .line 610
    move-result-wide v4

    .line 611
    long-to-int v2, v4

    .line 612
    invoke-static {v2}, La28;->l(I)Lyd5;

    .line 613
    .line 614
    .line 615
    move-result-object v62

    .line 616
    move/from16 v2, v20

    .line 617
    .line 618
    invoke-interface {v3, v2}, Lxr6;->getLong(I)J

    .line 619
    .line 620
    .line 621
    move-result-wide v4

    .line 622
    long-to-int v4, v4

    .line 623
    move/from16 v17, v0

    .line 624
    .line 625
    move/from16 v20, v1

    .line 626
    .line 627
    move/from16 v5, v21

    .line 628
    .line 629
    invoke-interface {v3, v5}, Lxr6;->getLong(I)J

    .line 630
    .line 631
    .line 632
    move-result-wide v0

    .line 633
    long-to-int v0, v0

    .line 634
    move/from16 v1, v22

    .line 635
    .line 636
    invoke-interface {v3, v1}, Lxr6;->getLong(I)J

    .line 637
    .line 638
    .line 639
    move-result-wide v65

    .line 640
    move/from16 v64, v0

    .line 641
    .line 642
    move/from16 v21, v2

    .line 643
    .line 644
    move/from16 v0, v23

    .line 645
    .line 646
    invoke-interface {v3, v0}, Lxr6;->getLong(I)J

    .line 647
    .line 648
    .line 649
    move-result-wide v1

    .line 650
    long-to-int v1, v1

    .line 651
    move/from16 v23, v0

    .line 652
    .line 653
    move/from16 v67, v1

    .line 654
    .line 655
    move/from16 v2, v24

    .line 656
    .line 657
    invoke-interface {v3, v2}, Lxr6;->getLong(I)J

    .line 658
    .line 659
    .line 660
    move-result-wide v0

    .line 661
    long-to-int v0, v0

    .line 662
    move/from16 v1, v25

    .line 663
    .line 664
    invoke-interface {v3, v1}, Lxr6;->isNull(I)Z

    .line 665
    .line 666
    .line 667
    move-result v24

    .line 668
    if-eqz v24, :cond_6

    .line 669
    .line 670
    move-object/from16 v69, v18

    .line 671
    .line 672
    :goto_7
    move/from16 v68, v0

    .line 673
    .line 674
    move/from16 v0, v26

    .line 675
    .line 676
    goto :goto_8

    .line 677
    :cond_6
    invoke-interface {v3, v1}, Lxr6;->p0(I)Ljava/lang/String;

    .line 678
    .line 679
    .line 680
    move-result-object v24

    .line 681
    move-object/from16 v69, v24

    .line 682
    .line 683
    goto :goto_7

    .line 684
    :goto_8
    invoke-interface {v3, v0}, Lxr6;->isNull(I)Z

    .line 685
    .line 686
    .line 687
    move-result v24

    .line 688
    if-eqz v24, :cond_7

    .line 689
    .line 690
    move/from16 v25, v1

    .line 691
    .line 692
    move/from16 v24, v2

    .line 693
    .line 694
    move-object/from16 v1, v18

    .line 695
    .line 696
    goto :goto_9

    .line 697
    :cond_7
    move/from16 v25, v1

    .line 698
    .line 699
    move/from16 v24, v2

    .line 700
    .line 701
    invoke-interface {v3, v0}, Lxr6;->getLong(I)J

    .line 702
    .line 703
    .line 704
    move-result-wide v1

    .line 705
    long-to-int v1, v1

    .line 706
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 707
    .line 708
    .line 709
    move-result-object v1

    .line 710
    :goto_9
    if-eqz v1, :cond_9

    .line 711
    .line 712
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 713
    .line 714
    .line 715
    move-result v1

    .line 716
    if-eqz v1, :cond_8

    .line 717
    .line 718
    move/from16 v1, v19

    .line 719
    .line 720
    goto :goto_a

    .line 721
    :cond_8
    const/4 v1, 0x0

    .line 722
    :goto_a
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 723
    .line 724
    .line 725
    move-result-object v1

    .line 726
    move-object/from16 v70, v1

    .line 727
    .line 728
    :goto_b
    move/from16 v63, v4

    .line 729
    .line 730
    move v2, v5

    .line 731
    move/from16 v1, v27

    .line 732
    .line 733
    goto :goto_c

    .line 734
    :catchall_2
    move-exception v0

    .line 735
    goto/16 :goto_15

    .line 736
    .line 737
    :cond_9
    move-object/from16 v70, v18

    .line 738
    .line 739
    goto :goto_b

    .line 740
    :goto_c
    invoke-interface {v3, v1}, Lxr6;->getLong(I)J

    .line 741
    .line 742
    .line 743
    move-result-wide v4

    .line 744
    long-to-int v4, v4

    .line 745
    invoke-static {v4}, La28;->k(I)Lb45;

    .line 746
    .line 747
    .line 748
    move-result-object v76

    .line 749
    move/from16 v4, v28

    .line 750
    .line 751
    invoke-interface {v3, v4}, Lxr6;->getBlob(I)[B

    .line 752
    .line 753
    .line 754
    move-result-object v5

    .line 755
    invoke-static {v5}, La28;->w([B)Lu35;

    .line 756
    .line 757
    .line 758
    move-result-object v75

    .line 759
    move/from16 v26, v0

    .line 760
    .line 761
    move/from16 v27, v1

    .line 762
    .line 763
    move/from16 v5, v29

    .line 764
    .line 765
    invoke-interface {v3, v5}, Lxr6;->getLong(I)J

    .line 766
    .line 767
    .line 768
    move-result-wide v0

    .line 769
    long-to-int v0, v0

    .line 770
    if-eqz v0, :cond_a

    .line 771
    .line 772
    move/from16 v77, v19

    .line 773
    .line 774
    :goto_d
    move/from16 v28, v2

    .line 775
    .line 776
    move/from16 v0, v30

    .line 777
    .line 778
    goto :goto_e

    .line 779
    :cond_a
    const/16 v77, 0x0

    .line 780
    .line 781
    goto :goto_d

    .line 782
    :goto_e
    invoke-interface {v3, v0}, Lxr6;->getLong(I)J

    .line 783
    .line 784
    .line 785
    move-result-wide v1

    .line 786
    long-to-int v1, v1

    .line 787
    if-eqz v1, :cond_b

    .line 788
    .line 789
    move/from16 v78, v19

    .line 790
    .line 791
    :goto_f
    move v2, v4

    .line 792
    move/from16 v29, v5

    .line 793
    .line 794
    move/from16 v1, v31

    .line 795
    .line 796
    goto :goto_10

    .line 797
    :cond_b
    const/16 v78, 0x0

    .line 798
    .line 799
    goto :goto_f

    .line 800
    :goto_10
    invoke-interface {v3, v1}, Lxr6;->getLong(I)J

    .line 801
    .line 802
    .line 803
    move-result-wide v4

    .line 804
    long-to-int v4, v4

    .line 805
    if-eqz v4, :cond_c

    .line 806
    .line 807
    move/from16 v79, v19

    .line 808
    .line 809
    :goto_11
    move/from16 v30, v0

    .line 810
    .line 811
    move/from16 v31, v1

    .line 812
    .line 813
    move/from16 v4, v32

    .line 814
    .line 815
    goto :goto_12

    .line 816
    :cond_c
    const/16 v79, 0x0

    .line 817
    .line 818
    goto :goto_11

    .line 819
    :goto_12
    invoke-interface {v3, v4}, Lxr6;->getLong(I)J

    .line 820
    .line 821
    .line 822
    move-result-wide v0

    .line 823
    long-to-int v0, v0

    .line 824
    if-eqz v0, :cond_d

    .line 825
    .line 826
    move/from16 v80, v19

    .line 827
    .line 828
    :goto_13
    move/from16 v0, v33

    .line 829
    .line 830
    goto :goto_14

    .line 831
    :cond_d
    const/16 v80, 0x0

    .line 832
    .line 833
    goto :goto_13

    .line 834
    :goto_14
    invoke-interface {v3, v0}, Lxr6;->getLong(I)J

    .line 835
    .line 836
    .line 837
    move-result-wide v81

    .line 838
    move/from16 v1, v34

    .line 839
    .line 840
    invoke-interface {v3, v1}, Lxr6;->getLong(I)J

    .line 841
    .line 842
    .line 843
    move-result-wide v83

    .line 844
    move/from16 v5, v35

    .line 845
    .line 846
    invoke-interface {v3, v5}, Lxr6;->getBlob(I)[B

    .line 847
    .line 848
    .line 849
    move-result-object v32

    .line 850
    invoke-static/range {v32 .. v32}, La28;->b([B)Ljava/util/LinkedHashSet;

    .line 851
    .line 852
    .line 853
    move-result-object v85

    .line 854
    new-instance v50, Lp31;

    .line 855
    .line 856
    move-object/from16 v74, v50

    .line 857
    .line 858
    invoke-direct/range {v74 .. v85}, Lp31;-><init>(Lu35;Lb45;ZZZZJJLjava/util/Set;)V

    .line 859
    .line 860
    .line 861
    move-object/from16 v50, v74

    .line 862
    .line 863
    new-instance v37, Ll49;

    .line 864
    .line 865
    invoke-direct/range {v37 .. v70}, Ll49;-><init>(Ljava/lang/String;Lu39;Ljava/lang/String;Ljava/lang/String;Lu91;Lu91;JJJLp31;ILz00;JJJJZLyd5;IIJIILjava/lang/String;Ljava/lang/Boolean;)V

    .line 866
    .line 867
    .line 868
    move/from16 v33, v0

    .line 869
    .line 870
    move-object/from16 v0, v37

    .line 871
    .line 872
    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 873
    .line 874
    .line 875
    move/from16 v34, v1

    .line 876
    .line 877
    move/from16 v32, v4

    .line 878
    .line 879
    move/from16 v35, v5

    .line 880
    .line 881
    move/from16 v5, v71

    .line 882
    .line 883
    move/from16 v1, v72

    .line 884
    .line 885
    move/from16 v0, v73

    .line 886
    .line 887
    move/from16 v4, p1

    .line 888
    .line 889
    move/from16 p1, v17

    .line 890
    .line 891
    move/from16 v17, v20

    .line 892
    .line 893
    move/from16 v20, v21

    .line 894
    .line 895
    move/from16 v21, v28

    .line 896
    .line 897
    move/from16 v28, v2

    .line 898
    .line 899
    move/from16 v2, p0

    .line 900
    .line 901
    move/from16 p0, v6

    .line 902
    .line 903
    move/from16 v6, v36

    .line 904
    .line 905
    goto/16 :goto_4

    .line 906
    .line 907
    :cond_e
    invoke-interface {v3}, Ljava/lang/AutoCloseable;->close()V

    .line 908
    .line 909
    .line 910
    return-object v15

    .line 911
    :goto_15
    invoke-interface {v3}, Ljava/lang/AutoCloseable;->close()V

    .line 912
    .line 913
    .line 914
    throw v0

    .line 915
    :pswitch_9
    move-object/from16 v0, p1

    .line 916
    .line 917
    check-cast v0, Lqr6;

    .line 918
    .line 919
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 920
    .line 921
    .line 922
    const-string v1, "Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)"

    .line 923
    .line 924
    invoke-interface {v0, v1}, Lqr6;->X0(Ljava/lang/String;)Lxr6;

    .line 925
    .line 926
    .line 927
    move-result-object v1

    .line 928
    :try_start_3
    invoke-interface {v1}, Lxr6;->S0()Z

    .line 929
    .line 930
    .line 931
    move-result v0

    .line 932
    if-eqz v0, :cond_f

    .line 933
    .line 934
    const/4 v0, 0x0

    .line 935
    invoke-interface {v1, v0}, Lxr6;->getLong(I)J

    .line 936
    .line 937
    .line 938
    move-result-wide v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 939
    long-to-int v3, v2

    .line 940
    goto :goto_16

    .line 941
    :catchall_3
    move-exception v0

    .line 942
    goto :goto_17

    .line 943
    :cond_f
    const/4 v3, 0x0

    .line 944
    :goto_16
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 945
    .line 946
    .line 947
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 948
    .line 949
    .line 950
    move-result-object v0

    .line 951
    return-object v0

    .line 952
    :goto_17
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 953
    .line 954
    .line 955
    throw v0

    .line 956
    :pswitch_a
    move-object/from16 v3, p1

    .line 957
    .line 958
    check-cast v3, Lqr6;

    .line 959
    .line 960
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 961
    .line 962
    .line 963
    move-object/from16 v24, v4

    .line 964
    .line 965
    const-string v4, "SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time"

    .line 966
    .line 967
    invoke-interface {v3, v4}, Lqr6;->X0(Ljava/lang/String;)Lxr6;

    .line 968
    .line 969
    .line 970
    move-result-object v3

    .line 971
    :try_start_4
    invoke-static {v3, v2}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 972
    .line 973
    .line 974
    move-result v2

    .line 975
    invoke-static {v3, v1}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 976
    .line 977
    .line 978
    move-result v1

    .line 979
    invoke-static {v3, v0}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 980
    .line 981
    .line 982
    move-result v0

    .line 983
    invoke-static {v3, v15}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 984
    .line 985
    .line 986
    move-result v4

    .line 987
    invoke-static {v3, v14}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 988
    .line 989
    .line 990
    move-result v14

    .line 991
    invoke-static {v3, v13}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 992
    .line 993
    .line 994
    move-result v13

    .line 995
    invoke-static {v3, v12}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 996
    .line 997
    .line 998
    move-result v12

    .line 999
    invoke-static {v3, v11}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 1000
    .line 1001
    .line 1002
    move-result v11

    .line 1003
    invoke-static {v3, v10}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 1004
    .line 1005
    .line 1006
    move-result v10

    .line 1007
    invoke-static {v3, v9}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 1008
    .line 1009
    .line 1010
    move-result v9

    .line 1011
    invoke-static {v3, v8}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 1012
    .line 1013
    .line 1014
    move-result v8

    .line 1015
    invoke-static {v3, v7}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 1016
    .line 1017
    .line 1018
    move-result v7

    .line 1019
    invoke-static {v3, v6}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 1020
    .line 1021
    .line 1022
    move-result v6

    .line 1023
    invoke-static {v3, v5}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 1024
    .line 1025
    .line 1026
    move-result v5

    .line 1027
    move-object/from16 v15, v24

    .line 1028
    .line 1029
    invoke-static {v3, v15}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 1030
    .line 1031
    .line 1032
    move-result v15

    .line 1033
    move/from16 p0, v15

    .line 1034
    .line 1035
    move-object/from16 v15, v20

    .line 1036
    .line 1037
    invoke-static {v3, v15}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 1038
    .line 1039
    .line 1040
    move-result v15

    .line 1041
    move/from16 p1, v15

    .line 1042
    .line 1043
    move-object/from16 v15, v17

    .line 1044
    .line 1045
    invoke-static {v3, v15}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 1046
    .line 1047
    .line 1048
    move-result v15

    .line 1049
    move/from16 v17, v15

    .line 1050
    .line 1051
    const-string v15, "period_count"

    .line 1052
    .line 1053
    invoke-static {v3, v15}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 1054
    .line 1055
    .line 1056
    move-result v15

    .line 1057
    move/from16 v20, v15

    .line 1058
    .line 1059
    const-string v15, "generation"

    .line 1060
    .line 1061
    invoke-static {v3, v15}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 1062
    .line 1063
    .line 1064
    move-result v15

    .line 1065
    move/from16 v21, v15

    .line 1066
    .line 1067
    const-string v15, "next_schedule_time_override"

    .line 1068
    .line 1069
    invoke-static {v3, v15}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 1070
    .line 1071
    .line 1072
    move-result v15

    .line 1073
    move/from16 v22, v15

    .line 1074
    .line 1075
    const-string v15, "next_schedule_time_override_generation"

    .line 1076
    .line 1077
    invoke-static {v3, v15}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 1078
    .line 1079
    .line 1080
    move-result v15

    .line 1081
    move/from16 v23, v15

    .line 1082
    .line 1083
    const-string v15, "stop_reason"

    .line 1084
    .line 1085
    invoke-static {v3, v15}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 1086
    .line 1087
    .line 1088
    move-result v15

    .line 1089
    move/from16 v24, v15

    .line 1090
    .line 1091
    const-string v15, "trace_tag"

    .line 1092
    .line 1093
    invoke-static {v3, v15}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 1094
    .line 1095
    .line 1096
    move-result v15

    .line 1097
    move/from16 v25, v15

    .line 1098
    .line 1099
    const-string v15, "backoff_on_system_interruptions"

    .line 1100
    .line 1101
    invoke-static {v3, v15}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 1102
    .line 1103
    .line 1104
    move-result v15

    .line 1105
    move/from16 v26, v15

    .line 1106
    .line 1107
    const-string v15, "required_network_type"

    .line 1108
    .line 1109
    invoke-static {v3, v15}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 1110
    .line 1111
    .line 1112
    move-result v15

    .line 1113
    move/from16 v27, v15

    .line 1114
    .line 1115
    const-string v15, "required_network_request"

    .line 1116
    .line 1117
    invoke-static {v3, v15}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 1118
    .line 1119
    .line 1120
    move-result v15

    .line 1121
    move/from16 v28, v15

    .line 1122
    .line 1123
    const-string v15, "requires_charging"

    .line 1124
    .line 1125
    invoke-static {v3, v15}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 1126
    .line 1127
    .line 1128
    move-result v15

    .line 1129
    move/from16 v29, v15

    .line 1130
    .line 1131
    const-string v15, "requires_device_idle"

    .line 1132
    .line 1133
    invoke-static {v3, v15}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 1134
    .line 1135
    .line 1136
    move-result v15

    .line 1137
    move/from16 v30, v15

    .line 1138
    .line 1139
    const-string v15, "requires_battery_not_low"

    .line 1140
    .line 1141
    invoke-static {v3, v15}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 1142
    .line 1143
    .line 1144
    move-result v15

    .line 1145
    move/from16 v31, v15

    .line 1146
    .line 1147
    const-string v15, "requires_storage_not_low"

    .line 1148
    .line 1149
    invoke-static {v3, v15}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 1150
    .line 1151
    .line 1152
    move-result v15

    .line 1153
    move/from16 v32, v15

    .line 1154
    .line 1155
    const-string v15, "trigger_content_update_delay"

    .line 1156
    .line 1157
    invoke-static {v3, v15}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 1158
    .line 1159
    .line 1160
    move-result v15

    .line 1161
    move/from16 v33, v15

    .line 1162
    .line 1163
    const-string v15, "trigger_max_content_delay"

    .line 1164
    .line 1165
    invoke-static {v3, v15}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 1166
    .line 1167
    .line 1168
    move-result v15

    .line 1169
    move/from16 v34, v15

    .line 1170
    .line 1171
    const-string v15, "content_uri_triggers"

    .line 1172
    .line 1173
    invoke-static {v3, v15}, Lu15;->q(Lxr6;Ljava/lang/String;)I

    .line 1174
    .line 1175
    .line 1176
    move-result v15

    .line 1177
    move/from16 v35, v15

    .line 1178
    .line 1179
    new-instance v15, Ljava/util/ArrayList;

    .line 1180
    .line 1181
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 1182
    .line 1183
    .line 1184
    :goto_18
    invoke-interface {v3}, Lxr6;->S0()Z

    .line 1185
    .line 1186
    .line 1187
    move-result v36

    .line 1188
    if-eqz v36, :cond_19

    .line 1189
    .line 1190
    invoke-interface {v3, v2}, Lxr6;->p0(I)Ljava/lang/String;

    .line 1191
    .line 1192
    .line 1193
    move-result-object v38

    .line 1194
    move/from16 v71, v5

    .line 1195
    .line 1196
    move/from16 v36, v6

    .line 1197
    .line 1198
    invoke-interface {v3, v1}, Lxr6;->getLong(I)J

    .line 1199
    .line 1200
    .line 1201
    move-result-wide v5

    .line 1202
    long-to-int v5, v5

    .line 1203
    invoke-static {v5}, La28;->m(I)Lu39;

    .line 1204
    .line 1205
    .line 1206
    move-result-object v39

    .line 1207
    invoke-interface {v3, v0}, Lxr6;->p0(I)Ljava/lang/String;

    .line 1208
    .line 1209
    .line 1210
    move-result-object v40

    .line 1211
    invoke-interface {v3, v4}, Lxr6;->p0(I)Ljava/lang/String;

    .line 1212
    .line 1213
    .line 1214
    move-result-object v41

    .line 1215
    invoke-interface {v3, v14}, Lxr6;->getBlob(I)[B

    .line 1216
    .line 1217
    .line 1218
    move-result-object v5

    .line 1219
    sget-object v6, Lu91;->b:Lu91;

    .line 1220
    .line 1221
    invoke-static {v5}, Lwl7;->A([B)Lu91;

    .line 1222
    .line 1223
    .line 1224
    move-result-object v42

    .line 1225
    invoke-interface {v3, v13}, Lxr6;->getBlob(I)[B

    .line 1226
    .line 1227
    .line 1228
    move-result-object v5

    .line 1229
    invoke-static {v5}, Lwl7;->A([B)Lu91;

    .line 1230
    .line 1231
    .line 1232
    move-result-object v43

    .line 1233
    invoke-interface {v3, v12}, Lxr6;->getLong(I)J

    .line 1234
    .line 1235
    .line 1236
    move-result-wide v44

    .line 1237
    invoke-interface {v3, v11}, Lxr6;->getLong(I)J

    .line 1238
    .line 1239
    .line 1240
    move-result-wide v46

    .line 1241
    invoke-interface {v3, v10}, Lxr6;->getLong(I)J

    .line 1242
    .line 1243
    .line 1244
    move-result-wide v48

    .line 1245
    invoke-interface {v3, v9}, Lxr6;->getLong(I)J

    .line 1246
    .line 1247
    .line 1248
    move-result-wide v5

    .line 1249
    long-to-int v5, v5

    .line 1250
    move/from16 v72, v0

    .line 1251
    .line 1252
    move v6, v1

    .line 1253
    invoke-interface {v3, v8}, Lxr6;->getLong(I)J

    .line 1254
    .line 1255
    .line 1256
    move-result-wide v0

    .line 1257
    long-to-int v0, v0

    .line 1258
    invoke-static {v0}, La28;->j(I)Lz00;

    .line 1259
    .line 1260
    .line 1261
    move-result-object v52

    .line 1262
    invoke-interface {v3, v7}, Lxr6;->getLong(I)J

    .line 1263
    .line 1264
    .line 1265
    move-result-wide v53

    .line 1266
    move/from16 v0, v36

    .line 1267
    .line 1268
    invoke-interface {v3, v0}, Lxr6;->getLong(I)J

    .line 1269
    .line 1270
    .line 1271
    move-result-wide v55

    .line 1272
    move/from16 v1, v71

    .line 1273
    .line 1274
    invoke-interface {v3, v1}, Lxr6;->getLong(I)J

    .line 1275
    .line 1276
    .line 1277
    move-result-wide v57

    .line 1278
    move/from16 v36, v0

    .line 1279
    .line 1280
    move/from16 v0, p0

    .line 1281
    .line 1282
    invoke-interface {v3, v0}, Lxr6;->getLong(I)J

    .line 1283
    .line 1284
    .line 1285
    move-result-wide v59

    .line 1286
    move/from16 p0, v0

    .line 1287
    .line 1288
    move/from16 v71, v1

    .line 1289
    .line 1290
    move/from16 v0, p1

    .line 1291
    .line 1292
    move/from16 p1, v2

    .line 1293
    .line 1294
    invoke-interface {v3, v0}, Lxr6;->getLong(I)J

    .line 1295
    .line 1296
    .line 1297
    move-result-wide v1

    .line 1298
    long-to-int v1, v1

    .line 1299
    if-eqz v1, :cond_10

    .line 1300
    .line 1301
    move/from16 v61, v19

    .line 1302
    .line 1303
    :goto_19
    move v2, v4

    .line 1304
    move/from16 v51, v5

    .line 1305
    .line 1306
    move/from16 v1, v17

    .line 1307
    .line 1308
    goto :goto_1a

    .line 1309
    :cond_10
    const/16 v61, 0x0

    .line 1310
    .line 1311
    goto :goto_19

    .line 1312
    :goto_1a
    invoke-interface {v3, v1}, Lxr6;->getLong(I)J

    .line 1313
    .line 1314
    .line 1315
    move-result-wide v4

    .line 1316
    long-to-int v4, v4

    .line 1317
    invoke-static {v4}, La28;->l(I)Lyd5;

    .line 1318
    .line 1319
    .line 1320
    move-result-object v62

    .line 1321
    move v5, v0

    .line 1322
    move/from16 v17, v1

    .line 1323
    .line 1324
    move/from16 v4, v20

    .line 1325
    .line 1326
    invoke-interface {v3, v4}, Lxr6;->getLong(I)J

    .line 1327
    .line 1328
    .line 1329
    move-result-wide v0

    .line 1330
    long-to-int v0, v0

    .line 1331
    move/from16 v20, v4

    .line 1332
    .line 1333
    move/from16 v1, v21

    .line 1334
    .line 1335
    move/from16 v21, v5

    .line 1336
    .line 1337
    invoke-interface {v3, v1}, Lxr6;->getLong(I)J

    .line 1338
    .line 1339
    .line 1340
    move-result-wide v4

    .line 1341
    long-to-int v4, v4

    .line 1342
    move/from16 v5, v22

    .line 1343
    .line 1344
    invoke-interface {v3, v5}, Lxr6;->getLong(I)J

    .line 1345
    .line 1346
    .line 1347
    move-result-wide v65

    .line 1348
    move/from16 v63, v0

    .line 1349
    .line 1350
    move/from16 v22, v2

    .line 1351
    .line 1352
    move/from16 v0, v23

    .line 1353
    .line 1354
    move/from16 v23, v1

    .line 1355
    .line 1356
    invoke-interface {v3, v0}, Lxr6;->getLong(I)J

    .line 1357
    .line 1358
    .line 1359
    move-result-wide v1

    .line 1360
    long-to-int v1, v1

    .line 1361
    move/from16 v67, v1

    .line 1362
    .line 1363
    move/from16 v2, v24

    .line 1364
    .line 1365
    move/from16 v24, v0

    .line 1366
    .line 1367
    invoke-interface {v3, v2}, Lxr6;->getLong(I)J

    .line 1368
    .line 1369
    .line 1370
    move-result-wide v0

    .line 1371
    long-to-int v0, v0

    .line 1372
    move/from16 v1, v25

    .line 1373
    .line 1374
    invoke-interface {v3, v1}, Lxr6;->isNull(I)Z

    .line 1375
    .line 1376
    .line 1377
    move-result v25

    .line 1378
    if-eqz v25, :cond_11

    .line 1379
    .line 1380
    move-object/from16 v69, v18

    .line 1381
    .line 1382
    :goto_1b
    move/from16 v68, v0

    .line 1383
    .line 1384
    move/from16 v0, v26

    .line 1385
    .line 1386
    goto :goto_1c

    .line 1387
    :cond_11
    invoke-interface {v3, v1}, Lxr6;->p0(I)Ljava/lang/String;

    .line 1388
    .line 1389
    .line 1390
    move-result-object v25

    .line 1391
    move-object/from16 v69, v25

    .line 1392
    .line 1393
    goto :goto_1b

    .line 1394
    :goto_1c
    invoke-interface {v3, v0}, Lxr6;->isNull(I)Z

    .line 1395
    .line 1396
    .line 1397
    move-result v25

    .line 1398
    if-eqz v25, :cond_12

    .line 1399
    .line 1400
    move/from16 v26, v1

    .line 1401
    .line 1402
    move/from16 v25, v2

    .line 1403
    .line 1404
    move-object/from16 v1, v18

    .line 1405
    .line 1406
    goto :goto_1d

    .line 1407
    :cond_12
    move/from16 v26, v1

    .line 1408
    .line 1409
    move/from16 v25, v2

    .line 1410
    .line 1411
    invoke-interface {v3, v0}, Lxr6;->getLong(I)J

    .line 1412
    .line 1413
    .line 1414
    move-result-wide v1

    .line 1415
    long-to-int v1, v1

    .line 1416
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1417
    .line 1418
    .line 1419
    move-result-object v1

    .line 1420
    :goto_1d
    if-eqz v1, :cond_14

    .line 1421
    .line 1422
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 1423
    .line 1424
    .line 1425
    move-result v1

    .line 1426
    if-eqz v1, :cond_13

    .line 1427
    .line 1428
    move/from16 v1, v19

    .line 1429
    .line 1430
    goto :goto_1e

    .line 1431
    :cond_13
    const/4 v1, 0x0

    .line 1432
    :goto_1e
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1433
    .line 1434
    .line 1435
    move-result-object v1

    .line 1436
    move-object/from16 v70, v1

    .line 1437
    .line 1438
    :goto_1f
    move/from16 v64, v4

    .line 1439
    .line 1440
    move v2, v5

    .line 1441
    move/from16 v1, v27

    .line 1442
    .line 1443
    goto :goto_20

    .line 1444
    :catchall_4
    move-exception v0

    .line 1445
    goto/16 :goto_29

    .line 1446
    .line 1447
    :cond_14
    move-object/from16 v70, v18

    .line 1448
    .line 1449
    goto :goto_1f

    .line 1450
    :goto_20
    invoke-interface {v3, v1}, Lxr6;->getLong(I)J

    .line 1451
    .line 1452
    .line 1453
    move-result-wide v4

    .line 1454
    long-to-int v4, v4

    .line 1455
    invoke-static {v4}, La28;->k(I)Lb45;

    .line 1456
    .line 1457
    .line 1458
    move-result-object v75

    .line 1459
    move/from16 v4, v28

    .line 1460
    .line 1461
    invoke-interface {v3, v4}, Lxr6;->getBlob(I)[B

    .line 1462
    .line 1463
    .line 1464
    move-result-object v5

    .line 1465
    invoke-static {v5}, La28;->w([B)Lu35;

    .line 1466
    .line 1467
    .line 1468
    move-result-object v74

    .line 1469
    move/from16 v27, v0

    .line 1470
    .line 1471
    move/from16 v28, v1

    .line 1472
    .line 1473
    move/from16 v5, v29

    .line 1474
    .line 1475
    invoke-interface {v3, v5}, Lxr6;->getLong(I)J

    .line 1476
    .line 1477
    .line 1478
    move-result-wide v0

    .line 1479
    long-to-int v0, v0

    .line 1480
    if-eqz v0, :cond_15

    .line 1481
    .line 1482
    move/from16 v76, v19

    .line 1483
    .line 1484
    :goto_21
    move/from16 v29, v2

    .line 1485
    .line 1486
    move/from16 v0, v30

    .line 1487
    .line 1488
    goto :goto_22

    .line 1489
    :cond_15
    const/16 v76, 0x0

    .line 1490
    .line 1491
    goto :goto_21

    .line 1492
    :goto_22
    invoke-interface {v3, v0}, Lxr6;->getLong(I)J

    .line 1493
    .line 1494
    .line 1495
    move-result-wide v1

    .line 1496
    long-to-int v1, v1

    .line 1497
    if-eqz v1, :cond_16

    .line 1498
    .line 1499
    move/from16 v77, v19

    .line 1500
    .line 1501
    :goto_23
    move v2, v4

    .line 1502
    move/from16 v30, v5

    .line 1503
    .line 1504
    move/from16 v1, v31

    .line 1505
    .line 1506
    goto :goto_24

    .line 1507
    :cond_16
    const/16 v77, 0x0

    .line 1508
    .line 1509
    goto :goto_23

    .line 1510
    :goto_24
    invoke-interface {v3, v1}, Lxr6;->getLong(I)J

    .line 1511
    .line 1512
    .line 1513
    move-result-wide v4

    .line 1514
    long-to-int v4, v4

    .line 1515
    if-eqz v4, :cond_17

    .line 1516
    .line 1517
    move/from16 v78, v19

    .line 1518
    .line 1519
    :goto_25
    move v5, v0

    .line 1520
    move/from16 v31, v1

    .line 1521
    .line 1522
    move/from16 v4, v32

    .line 1523
    .line 1524
    goto :goto_26

    .line 1525
    :cond_17
    const/16 v78, 0x0

    .line 1526
    .line 1527
    goto :goto_25

    .line 1528
    :goto_26
    invoke-interface {v3, v4}, Lxr6;->getLong(I)J

    .line 1529
    .line 1530
    .line 1531
    move-result-wide v0

    .line 1532
    long-to-int v0, v0

    .line 1533
    if-eqz v0, :cond_18

    .line 1534
    .line 1535
    move/from16 v79, v19

    .line 1536
    .line 1537
    :goto_27
    move/from16 v0, v33

    .line 1538
    .line 1539
    goto :goto_28

    .line 1540
    :cond_18
    const/16 v79, 0x0

    .line 1541
    .line 1542
    goto :goto_27

    .line 1543
    :goto_28
    invoke-interface {v3, v0}, Lxr6;->getLong(I)J

    .line 1544
    .line 1545
    .line 1546
    move-result-wide v80

    .line 1547
    move/from16 v1, v34

    .line 1548
    .line 1549
    invoke-interface {v3, v1}, Lxr6;->getLong(I)J

    .line 1550
    .line 1551
    .line 1552
    move-result-wide v82

    .line 1553
    move/from16 v33, v0

    .line 1554
    .line 1555
    move/from16 v0, v35

    .line 1556
    .line 1557
    invoke-interface {v3, v0}, Lxr6;->getBlob(I)[B

    .line 1558
    .line 1559
    .line 1560
    move-result-object v32

    .line 1561
    invoke-static/range {v32 .. v32}, La28;->b([B)Ljava/util/LinkedHashSet;

    .line 1562
    .line 1563
    .line 1564
    move-result-object v84

    .line 1565
    new-instance v50, Lp31;

    .line 1566
    .line 1567
    move-object/from16 v73, v50

    .line 1568
    .line 1569
    invoke-direct/range {v73 .. v84}, Lp31;-><init>(Lu35;Lb45;ZZZZJJLjava/util/Set;)V

    .line 1570
    .line 1571
    .line 1572
    move-object/from16 v50, v73

    .line 1573
    .line 1574
    new-instance v37, Ll49;

    .line 1575
    .line 1576
    invoke-direct/range {v37 .. v70}, Ll49;-><init>(Ljava/lang/String;Lu39;Ljava/lang/String;Ljava/lang/String;Lu91;Lu91;JJJLp31;ILz00;JJJJZLyd5;IIJIILjava/lang/String;Ljava/lang/Boolean;)V

    .line 1577
    .line 1578
    .line 1579
    move/from16 v35, v0

    .line 1580
    .line 1581
    move-object/from16 v0, v37

    .line 1582
    .line 1583
    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 1584
    .line 1585
    .line 1586
    move v0, v2

    .line 1587
    move/from16 v2, p1

    .line 1588
    .line 1589
    move/from16 p1, v21

    .line 1590
    .line 1591
    move/from16 v21, v23

    .line 1592
    .line 1593
    move/from16 v23, v24

    .line 1594
    .line 1595
    move/from16 v24, v25

    .line 1596
    .line 1597
    move/from16 v25, v26

    .line 1598
    .line 1599
    move/from16 v26, v27

    .line 1600
    .line 1601
    move/from16 v27, v28

    .line 1602
    .line 1603
    move/from16 v28, v0

    .line 1604
    .line 1605
    move/from16 v34, v1

    .line 1606
    .line 1607
    move/from16 v32, v4

    .line 1608
    .line 1609
    move v1, v6

    .line 1610
    move/from16 v4, v22

    .line 1611
    .line 1612
    move/from16 v22, v29

    .line 1613
    .line 1614
    move/from16 v29, v30

    .line 1615
    .line 1616
    move/from16 v6, v36

    .line 1617
    .line 1618
    move/from16 v0, v72

    .line 1619
    .line 1620
    move/from16 v30, v5

    .line 1621
    .line 1622
    move/from16 v5, v71

    .line 1623
    .line 1624
    goto/16 :goto_18

    .line 1625
    .line 1626
    :cond_19
    invoke-interface {v3}, Ljava/lang/AutoCloseable;->close()V

    .line 1627
    .line 1628
    .line 1629
    return-object v15

    .line 1630
    :goto_29
    invoke-interface {v3}, Ljava/lang/AutoCloseable;->close()V

    .line 1631
    .line 1632
    .line 1633
    throw v0

    .line 1634
    :pswitch_b
    move-object/from16 v0, p1

    .line 1635
    .line 1636
    check-cast v0, Lqr6;

    .line 1637
    .line 1638
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1639
    .line 1640
    .line 1641
    const-string v1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)"

    .line 1642
    .line 1643
    invoke-interface {v0, v1}, Lqr6;->X0(Ljava/lang/String;)Lxr6;

    .line 1644
    .line 1645
    .line 1646
    move-result-object v1

    .line 1647
    :try_start_5
    new-instance v0, Ljava/util/ArrayList;

    .line 1648
    .line 1649
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1650
    .line 1651
    .line 1652
    :goto_2a
    invoke-interface {v1}, Lxr6;->S0()Z

    .line 1653
    .line 1654
    .line 1655
    move-result v2

    .line 1656
    if-eqz v2, :cond_1a

    .line 1657
    .line 1658
    const/4 v2, 0x0

    .line 1659
    invoke-interface {v1, v2}, Lxr6;->p0(I)Ljava/lang/String;

    .line 1660
    .line 1661
    .line 1662
    move-result-object v3

    .line 1663
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 1664
    .line 1665
    .line 1666
    goto :goto_2a

    .line 1667
    :catchall_5
    move-exception v0

    .line 1668
    goto :goto_2b

    .line 1669
    :cond_1a
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 1670
    .line 1671
    .line 1672
    return-object v0

    .line 1673
    :goto_2b
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 1674
    .line 1675
    .line 1676
    throw v0

    .line 1677
    :pswitch_c
    move-object/from16 v0, p1

    .line 1678
    .line 1679
    check-cast v0, Lqr6;

    .line 1680
    .line 1681
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1682
    .line 1683
    .line 1684
    const-string v1, "DELETE FROM WorkProgress"

    .line 1685
    .line 1686
    invoke-interface {v0, v1}, Lqr6;->X0(Ljava/lang/String;)Lxr6;

    .line 1687
    .line 1688
    .line 1689
    move-result-object v1

    .line 1690
    :try_start_6
    invoke-interface {v1}, Lxr6;->S0()Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 1691
    .line 1692
    .line 1693
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 1694
    .line 1695
    .line 1696
    sget-object v0, Ldn8;->a:Ldn8;

    .line 1697
    .line 1698
    return-object v0

    .line 1699
    :catchall_6
    move-exception v0

    .line 1700
    invoke-interface {v1}, Ljava/lang/AutoCloseable;->close()V

    .line 1701
    .line 1702
    .line 1703
    throw v0

    .line 1704
    :pswitch_d
    move-object/from16 v0, p1

    .line 1705
    .line 1706
    check-cast v0, Lw21;

    .line 1707
    .line 1708
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1709
    .line 1710
    .line 1711
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1712
    .line 1713
    .line 1714
    move-result-object v0

    .line 1715
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1716
    .line 1717
    .line 1718
    move-result-object v0

    .line 1719
    return-object v0

    .line 1720
    :pswitch_e
    move-object/from16 v0, p1

    .line 1721
    .line 1722
    check-cast v0, Lj29;

    .line 1723
    .line 1724
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1725
    .line 1726
    .line 1727
    return-object v0

    .line 1728
    :pswitch_f
    move-object/from16 v0, p1

    .line 1729
    .line 1730
    check-cast v0, Lc29;

    .line 1731
    .line 1732
    iget-object v0, v0, Lc29;->c:Lhi;

    .line 1733
    .line 1734
    return-object v0

    .line 1735
    :pswitch_10
    move-object/from16 v0, p1

    .line 1736
    .line 1737
    check-cast v0, Lc29;

    .line 1738
    .line 1739
    iget-object v0, v0, Lc29;->f:Lhi;

    .line 1740
    .line 1741
    return-object v0

    .line 1742
    :pswitch_11
    move-object/from16 v0, p1

    .line 1743
    .line 1744
    check-cast v0, Lc29;

    .line 1745
    .line 1746
    iget-object v0, v0, Lc29;->g:Lhi;

    .line 1747
    .line 1748
    return-object v0

    .line 1749
    :pswitch_12
    move-object/from16 v0, p1

    .line 1750
    .line 1751
    check-cast v0, Lsk;

    .line 1752
    .line 1753
    iget v0, v0, Lsk;->a:F

    .line 1754
    .line 1755
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1756
    .line 1757
    .line 1758
    move-result-object v0

    .line 1759
    return-object v0

    .line 1760
    :pswitch_13
    move-object/from16 v0, p1

    .line 1761
    .line 1762
    check-cast v0, Lvk;

    .line 1763
    .line 1764
    new-instance v1, Ls86;

    .line 1765
    .line 1766
    iget v2, v0, Lvk;->a:F

    .line 1767
    .line 1768
    iget v3, v0, Lvk;->b:F

    .line 1769
    .line 1770
    iget v4, v0, Lvk;->c:F

    .line 1771
    .line 1772
    iget v0, v0, Lvk;->d:F

    .line 1773
    .line 1774
    invoke-direct {v1, v2, v3, v4, v0}, Ls86;-><init>(FFFF)V

    .line 1775
    .line 1776
    .line 1777
    return-object v1

    .line 1778
    :pswitch_14
    move-object/from16 v0, p1

    .line 1779
    .line 1780
    check-cast v0, Ls86;

    .line 1781
    .line 1782
    new-instance v1, Lvk;

    .line 1783
    .line 1784
    iget v2, v0, Ls86;->a:F

    .line 1785
    .line 1786
    iget v3, v0, Ls86;->b:F

    .line 1787
    .line 1788
    iget v4, v0, Ls86;->c:F

    .line 1789
    .line 1790
    iget v0, v0, Ls86;->d:F

    .line 1791
    .line 1792
    invoke-direct {v1, v2, v3, v4, v0}, Lvk;-><init>(FFFF)V

    .line 1793
    .line 1794
    .line 1795
    return-object v1

    .line 1796
    :pswitch_15
    move v2, v3

    .line 1797
    move-object/from16 v0, p1

    .line 1798
    .line 1799
    check-cast v0, Ltk;

    .line 1800
    .line 1801
    iget v1, v0, Ltk;->a:F

    .line 1802
    .line 1803
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 1804
    .line 1805
    .line 1806
    move-result v1

    .line 1807
    if-gez v1, :cond_1b

    .line 1808
    .line 1809
    move v1, v2

    .line 1810
    :cond_1b
    iget v0, v0, Ltk;->b:F

    .line 1811
    .line 1812
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 1813
    .line 1814
    .line 1815
    move-result v0

    .line 1816
    if-gez v0, :cond_1c

    .line 1817
    .line 1818
    move v3, v2

    .line 1819
    goto :goto_2c

    .line 1820
    :cond_1c
    move v3, v0

    .line 1821
    :goto_2c
    int-to-long v0, v1

    .line 1822
    shl-long v0, v0, v23

    .line 1823
    .line 1824
    int-to-long v2, v3

    .line 1825
    and-long v2, v2, v21

    .line 1826
    .line 1827
    or-long/2addr v0, v2

    .line 1828
    new-instance v2, Lpf3;

    .line 1829
    .line 1830
    invoke-direct {v2, v0, v1}, Lpf3;-><init>(J)V

    .line 1831
    .line 1832
    .line 1833
    return-object v2

    .line 1834
    :pswitch_16
    move-object/from16 v0, p1

    .line 1835
    .line 1836
    check-cast v0, Lpf3;

    .line 1837
    .line 1838
    new-instance v1, Ltk;

    .line 1839
    .line 1840
    iget-wide v2, v0, Lpf3;->a:J

    .line 1841
    .line 1842
    shr-long v4, v2, v23

    .line 1843
    .line 1844
    long-to-int v0, v4

    .line 1845
    int-to-float v0, v0

    .line 1846
    and-long v2, v2, v21

    .line 1847
    .line 1848
    long-to-int v2, v2

    .line 1849
    int-to-float v2, v2

    .line 1850
    invoke-direct {v1, v0, v2}, Ltk;-><init>(FF)V

    .line 1851
    .line 1852
    .line 1853
    return-object v1

    .line 1854
    :pswitch_17
    move-object/from16 v0, p1

    .line 1855
    .line 1856
    check-cast v0, Ltk;

    .line 1857
    .line 1858
    iget v1, v0, Ltk;->a:F

    .line 1859
    .line 1860
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 1861
    .line 1862
    .line 1863
    move-result v1

    .line 1864
    iget v0, v0, Ltk;->b:F

    .line 1865
    .line 1866
    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    .line 1867
    .line 1868
    .line 1869
    move-result v0

    .line 1870
    int-to-long v1, v1

    .line 1871
    shl-long v1, v1, v23

    .line 1872
    .line 1873
    int-to-long v3, v0

    .line 1874
    and-long v3, v3, v21

    .line 1875
    .line 1876
    or-long v0, v1, v3

    .line 1877
    .line 1878
    new-instance v2, Lhf3;

    .line 1879
    .line 1880
    invoke-direct {v2, v0, v1}, Lhf3;-><init>(J)V

    .line 1881
    .line 1882
    .line 1883
    return-object v2

    .line 1884
    :pswitch_18
    move-object/from16 v0, p1

    .line 1885
    .line 1886
    check-cast v0, Lhf3;

    .line 1887
    .line 1888
    new-instance v1, Ltk;

    .line 1889
    .line 1890
    iget-wide v2, v0, Lhf3;->a:J

    .line 1891
    .line 1892
    shr-long v4, v2, v23

    .line 1893
    .line 1894
    long-to-int v0, v4

    .line 1895
    int-to-float v0, v0

    .line 1896
    and-long v2, v2, v21

    .line 1897
    .line 1898
    long-to-int v2, v2

    .line 1899
    int-to-float v2, v2

    .line 1900
    invoke-direct {v1, v0, v2}, Ltk;-><init>(FF)V

    .line 1901
    .line 1902
    .line 1903
    return-object v1

    .line 1904
    :pswitch_19
    move-object/from16 v0, p1

    .line 1905
    .line 1906
    check-cast v0, Ltk;

    .line 1907
    .line 1908
    iget v1, v0, Ltk;->a:F

    .line 1909
    .line 1910
    iget v0, v0, Ltk;->b:F

    .line 1911
    .line 1912
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1913
    .line 1914
    .line 1915
    move-result v1

    .line 1916
    int-to-long v1, v1

    .line 1917
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1918
    .line 1919
    .line 1920
    move-result v0

    .line 1921
    int-to-long v3, v0

    .line 1922
    shl-long v0, v1, v23

    .line 1923
    .line 1924
    and-long v2, v3, v21

    .line 1925
    .line 1926
    or-long/2addr v0, v2

    .line 1927
    new-instance v2, Lz85;

    .line 1928
    .line 1929
    invoke-direct {v2, v0, v1}, Lz85;-><init>(J)V

    .line 1930
    .line 1931
    .line 1932
    return-object v2

    .line 1933
    :pswitch_1a
    move-object/from16 v0, p1

    .line 1934
    .line 1935
    check-cast v0, Lz85;

    .line 1936
    .line 1937
    new-instance v1, Ltk;

    .line 1938
    .line 1939
    iget-wide v2, v0, Lz85;->a:J

    .line 1940
    .line 1941
    shr-long v2, v2, v23

    .line 1942
    .line 1943
    long-to-int v2, v2

    .line 1944
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1945
    .line 1946
    .line 1947
    move-result v2

    .line 1948
    iget-wide v3, v0, Lz85;->a:J

    .line 1949
    .line 1950
    and-long v3, v3, v21

    .line 1951
    .line 1952
    long-to-int v0, v3

    .line 1953
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1954
    .line 1955
    .line 1956
    move-result v0

    .line 1957
    invoke-direct {v1, v2, v0}, Ltk;-><init>(FF)V

    .line 1958
    .line 1959
    .line 1960
    return-object v1

    .line 1961
    :pswitch_1b
    move-object/from16 v0, p1

    .line 1962
    .line 1963
    check-cast v0, Ltk;

    .line 1964
    .line 1965
    iget v1, v0, Ltk;->a:F

    .line 1966
    .line 1967
    iget v0, v0, Ltk;->b:F

    .line 1968
    .line 1969
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1970
    .line 1971
    .line 1972
    move-result v1

    .line 1973
    int-to-long v1, v1

    .line 1974
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1975
    .line 1976
    .line 1977
    move-result v0

    .line 1978
    int-to-long v3, v0

    .line 1979
    shl-long v0, v1, v23

    .line 1980
    .line 1981
    and-long v2, v3, v21

    .line 1982
    .line 1983
    or-long/2addr v0, v2

    .line 1984
    new-instance v2, Lua7;

    .line 1985
    .line 1986
    invoke-direct {v2, v0, v1}, Lua7;-><init>(J)V

    .line 1987
    .line 1988
    .line 1989
    return-object v2

    .line 1990
    :pswitch_1c
    move-object/from16 v0, p1

    .line 1991
    .line 1992
    check-cast v0, Lua7;

    .line 1993
    .line 1994
    new-instance v1, Ltk;

    .line 1995
    .line 1996
    iget-wide v2, v0, Lua7;->a:J

    .line 1997
    .line 1998
    shr-long v2, v2, v23

    .line 1999
    .line 2000
    long-to-int v2, v2

    .line 2001
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 2002
    .line 2003
    .line 2004
    move-result v2

    .line 2005
    iget-wide v3, v0, Lua7;->a:J

    .line 2006
    .line 2007
    and-long v3, v3, v21

    .line 2008
    .line 2009
    long-to-int v0, v3

    .line 2010
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 2011
    .line 2012
    .line 2013
    move-result v0

    .line 2014
    invoke-direct {v1, v2, v0}, Ltk;-><init>(FF)V

    .line 2015
    .line 2016
    .line 2017
    return-object v1

    .line 2018
    nop

    .line 2019
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
