.class public final Loi1;
.super Lz91;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final synthetic f:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, Loi1;->f:B

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final j(Lxr6;Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget-byte p0, p0, Loi1;->f:B

    .line 2
    .line 3
    const/4 v0, 0x3

    .line 4
    const/4 v1, 0x2

    .line 5
    const/4 v2, 0x1

    .line 6
    packed-switch p0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p2, Lo49;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object p0, p2, Lo49;->a:Ljava/lang/String;

    .line 18
    .line 19
    invoke-interface {p1, v2, p0}, Lxr6;->T(ILjava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iget-object p0, p2, Lo49;->b:Ljava/lang/String;

    .line 23
    .line 24
    invoke-interface {p1, v1, p0}, Lxr6;->T(ILjava/lang/String;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_0
    check-cast p2, Ll49;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    iget-object p0, p2, Ll49;->a:Ljava/lang/String;

    .line 37
    .line 38
    invoke-interface {p1, v2, p0}, Lxr6;->T(ILjava/lang/String;)V

    .line 39
    .line 40
    .line 41
    iget-object p0, p2, Ll49;->b:Lu39;

    .line 42
    .line 43
    invoke-static {p0}, La28;->u(Lu39;)I

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    int-to-long v2, p0

    .line 48
    invoke-interface {p1, v1, v2, v3}, Lxr6;->i(IJ)V

    .line 49
    .line 50
    .line 51
    iget-object p0, p2, Ll49;->c:Ljava/lang/String;

    .line 52
    .line 53
    invoke-interface {p1, v0, p0}, Lxr6;->T(ILjava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const/4 p0, 0x4

    .line 57
    iget-object v0, p2, Ll49;->d:Ljava/lang/String;

    .line 58
    .line 59
    invoke-interface {p1, p0, v0}, Lxr6;->T(ILjava/lang/String;)V

    .line 60
    .line 61
    .line 62
    sget-object p0, Lu91;->b:Lu91;

    .line 63
    .line 64
    iget-object p0, p2, Ll49;->e:Lu91;

    .line 65
    .line 66
    invoke-static {p0}, Lwl7;->c0(Lu91;)[B

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    const/4 v0, 0x5

    .line 71
    invoke-interface {p1, v0, p0}, Lxr6;->j(I[B)V

    .line 72
    .line 73
    .line 74
    iget-object p0, p2, Ll49;->f:Lu91;

    .line 75
    .line 76
    invoke-static {p0}, Lwl7;->c0(Lu91;)[B

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    const/4 v0, 0x6

    .line 81
    invoke-interface {p1, v0, p0}, Lxr6;->j(I[B)V

    .line 82
    .line 83
    .line 84
    const/4 p0, 0x7

    .line 85
    iget-wide v0, p2, Ll49;->g:J

    .line 86
    .line 87
    invoke-interface {p1, p0, v0, v1}, Lxr6;->i(IJ)V

    .line 88
    .line 89
    .line 90
    const/16 p0, 0x8

    .line 91
    .line 92
    iget-wide v0, p2, Ll49;->h:J

    .line 93
    .line 94
    invoke-interface {p1, p0, v0, v1}, Lxr6;->i(IJ)V

    .line 95
    .line 96
    .line 97
    const/16 p0, 0x9

    .line 98
    .line 99
    iget-wide v0, p2, Ll49;->i:J

    .line 100
    .line 101
    invoke-interface {p1, p0, v0, v1}, Lxr6;->i(IJ)V

    .line 102
    .line 103
    .line 104
    iget p0, p2, Ll49;->k:I

    .line 105
    .line 106
    int-to-long v0, p0

    .line 107
    const/16 p0, 0xa

    .line 108
    .line 109
    invoke-interface {p1, p0, v0, v1}, Lxr6;->i(IJ)V

    .line 110
    .line 111
    .line 112
    iget-object p0, p2, Ll49;->l:Lz00;

    .line 113
    .line 114
    invoke-static {p0}, La28;->a(Lz00;)I

    .line 115
    .line 116
    .line 117
    move-result p0

    .line 118
    const/16 v0, 0xb

    .line 119
    .line 120
    int-to-long v1, p0

    .line 121
    invoke-interface {p1, v0, v1, v2}, Lxr6;->i(IJ)V

    .line 122
    .line 123
    .line 124
    const/16 p0, 0xc

    .line 125
    .line 126
    iget-wide v0, p2, Ll49;->m:J

    .line 127
    .line 128
    invoke-interface {p1, p0, v0, v1}, Lxr6;->i(IJ)V

    .line 129
    .line 130
    .line 131
    const/16 p0, 0xd

    .line 132
    .line 133
    iget-wide v0, p2, Ll49;->n:J

    .line 134
    .line 135
    invoke-interface {p1, p0, v0, v1}, Lxr6;->i(IJ)V

    .line 136
    .line 137
    .line 138
    const/16 p0, 0xe

    .line 139
    .line 140
    iget-wide v0, p2, Ll49;->o:J

    .line 141
    .line 142
    invoke-interface {p1, p0, v0, v1}, Lxr6;->i(IJ)V

    .line 143
    .line 144
    .line 145
    const/16 p0, 0xf

    .line 146
    .line 147
    iget-wide v0, p2, Ll49;->p:J

    .line 148
    .line 149
    invoke-interface {p1, p0, v0, v1}, Lxr6;->i(IJ)V

    .line 150
    .line 151
    .line 152
    iget-boolean p0, p2, Ll49;->q:Z

    .line 153
    .line 154
    const/16 v0, 0x10

    .line 155
    .line 156
    int-to-long v1, p0

    .line 157
    invoke-interface {p1, v0, v1, v2}, Lxr6;->i(IJ)V

    .line 158
    .line 159
    .line 160
    iget-object p0, p2, Ll49;->r:Lyd5;

    .line 161
    .line 162
    invoke-static {p0}, La28;->r(Lyd5;)I

    .line 163
    .line 164
    .line 165
    move-result p0

    .line 166
    const/16 v0, 0x11

    .line 167
    .line 168
    int-to-long v1, p0

    .line 169
    invoke-interface {p1, v0, v1, v2}, Lxr6;->i(IJ)V

    .line 170
    .line 171
    .line 172
    iget p0, p2, Ll49;->s:I

    .line 173
    .line 174
    int-to-long v0, p0

    .line 175
    const/16 p0, 0x12

    .line 176
    .line 177
    invoke-interface {p1, p0, v0, v1}, Lxr6;->i(IJ)V

    .line 178
    .line 179
    .line 180
    iget p0, p2, Ll49;->t:I

    .line 181
    .line 182
    int-to-long v0, p0

    .line 183
    const/16 p0, 0x13

    .line 184
    .line 185
    invoke-interface {p1, p0, v0, v1}, Lxr6;->i(IJ)V

    .line 186
    .line 187
    .line 188
    const/16 p0, 0x14

    .line 189
    .line 190
    iget-wide v0, p2, Ll49;->u:J

    .line 191
    .line 192
    invoke-interface {p1, p0, v0, v1}, Lxr6;->i(IJ)V

    .line 193
    .line 194
    .line 195
    iget p0, p2, Ll49;->v:I

    .line 196
    .line 197
    int-to-long v0, p0

    .line 198
    const/16 p0, 0x15

    .line 199
    .line 200
    invoke-interface {p1, p0, v0, v1}, Lxr6;->i(IJ)V

    .line 201
    .line 202
    .line 203
    iget p0, p2, Ll49;->w:I

    .line 204
    .line 205
    int-to-long v0, p0

    .line 206
    const/16 p0, 0x16

    .line 207
    .line 208
    invoke-interface {p1, p0, v0, v1}, Lxr6;->i(IJ)V

    .line 209
    .line 210
    .line 211
    iget-object p0, p2, Ll49;->x:Ljava/lang/String;

    .line 212
    .line 213
    const/16 v0, 0x17

    .line 214
    .line 215
    if-nez p0, :cond_0

    .line 216
    .line 217
    invoke-interface {p1, v0}, Lxr6;->l(I)V

    .line 218
    .line 219
    .line 220
    goto :goto_0

    .line 221
    :cond_0
    invoke-interface {p1, v0, p0}, Lxr6;->T(ILjava/lang/String;)V

    .line 222
    .line 223
    .line 224
    :goto_0
    iget-object p0, p2, Ll49;->y:Ljava/lang/Boolean;

    .line 225
    .line 226
    if-eqz p0, :cond_1

    .line 227
    .line 228
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 229
    .line 230
    .line 231
    move-result p0

    .line 232
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 233
    .line 234
    .line 235
    move-result-object p0

    .line 236
    goto :goto_1

    .line 237
    :cond_1
    const/4 p0, 0x0

    .line 238
    :goto_1
    const/16 v0, 0x18

    .line 239
    .line 240
    if-nez p0, :cond_2

    .line 241
    .line 242
    invoke-interface {p1, v0}, Lxr6;->l(I)V

    .line 243
    .line 244
    .line 245
    goto :goto_2

    .line 246
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 247
    .line 248
    .line 249
    move-result p0

    .line 250
    int-to-long v1, p0

    .line 251
    invoke-interface {p1, v0, v1, v2}, Lxr6;->i(IJ)V

    .line 252
    .line 253
    .line 254
    :goto_2
    iget-object p0, p2, Ll49;->j:Lp31;

    .line 255
    .line 256
    iget-object p2, p0, Lp31;->a:Lb45;

    .line 257
    .line 258
    invoke-static {p2}, La28;->p(Lb45;)I

    .line 259
    .line 260
    .line 261
    move-result p2

    .line 262
    const/16 v0, 0x19

    .line 263
    .line 264
    int-to-long v1, p2

    .line 265
    invoke-interface {p1, v0, v1, v2}, Lxr6;->i(IJ)V

    .line 266
    .line 267
    .line 268
    iget-object p2, p0, Lp31;->b:Lu35;

    .line 269
    .line 270
    invoke-static {p2}, La28;->d(Lu35;)[B

    .line 271
    .line 272
    .line 273
    move-result-object p2

    .line 274
    const/16 v0, 0x1a

    .line 275
    .line 276
    invoke-interface {p1, v0, p2}, Lxr6;->j(I[B)V

    .line 277
    .line 278
    .line 279
    iget-boolean p2, p0, Lp31;->c:Z

    .line 280
    .line 281
    const/16 v0, 0x1b

    .line 282
    .line 283
    int-to-long v1, p2

    .line 284
    invoke-interface {p1, v0, v1, v2}, Lxr6;->i(IJ)V

    .line 285
    .line 286
    .line 287
    iget-boolean p2, p0, Lp31;->d:Z

    .line 288
    .line 289
    const/16 v0, 0x1c

    .line 290
    .line 291
    int-to-long v1, p2

    .line 292
    invoke-interface {p1, v0, v1, v2}, Lxr6;->i(IJ)V

    .line 293
    .line 294
    .line 295
    iget-boolean p2, p0, Lp31;->e:Z

    .line 296
    .line 297
    const/16 v0, 0x1d

    .line 298
    .line 299
    int-to-long v1, p2

    .line 300
    invoke-interface {p1, v0, v1, v2}, Lxr6;->i(IJ)V

    .line 301
    .line 302
    .line 303
    iget-boolean p2, p0, Lp31;->f:Z

    .line 304
    .line 305
    const/16 v0, 0x1e

    .line 306
    .line 307
    int-to-long v1, p2

    .line 308
    invoke-interface {p1, v0, v1, v2}, Lxr6;->i(IJ)V

    .line 309
    .line 310
    .line 311
    const/16 p2, 0x1f

    .line 312
    .line 313
    iget-wide v0, p0, Lp31;->g:J

    .line 314
    .line 315
    invoke-interface {p1, p2, v0, v1}, Lxr6;->i(IJ)V

    .line 316
    .line 317
    .line 318
    const/16 p2, 0x20

    .line 319
    .line 320
    iget-wide v0, p0, Lp31;->h:J

    .line 321
    .line 322
    invoke-interface {p1, p2, v0, v1}, Lxr6;->i(IJ)V

    .line 323
    .line 324
    .line 325
    iget-object p0, p0, Lp31;->i:Ljava/util/Set;

    .line 326
    .line 327
    invoke-static {p0}, La28;->s(Ljava/util/Set;)[B

    .line 328
    .line 329
    .line 330
    move-result-object p0

    .line 331
    const/16 p2, 0x21

    .line 332
    .line 333
    invoke-interface {p1, p2, p0}, Lxr6;->j(I[B)V

    .line 334
    .line 335
    .line 336
    return-void

    .line 337
    :pswitch_1
    check-cast p2, Lc49;

    .line 338
    .line 339
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 340
    .line 341
    .line 342
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 343
    .line 344
    .line 345
    iget-object p0, p2, Lc49;->a:Ljava/lang/String;

    .line 346
    .line 347
    invoke-interface {p1, v2, p0}, Lxr6;->T(ILjava/lang/String;)V

    .line 348
    .line 349
    .line 350
    sget-object p0, Lu91;->b:Lu91;

    .line 351
    .line 352
    iget-object p0, p2, Lc49;->b:Lu91;

    .line 353
    .line 354
    invoke-static {p0}, Lwl7;->c0(Lu91;)[B

    .line 355
    .line 356
    .line 357
    move-result-object p0

    .line 358
    invoke-interface {p1, v1, p0}, Lxr6;->j(I[B)V

    .line 359
    .line 360
    .line 361
    return-void

    .line 362
    :pswitch_2
    check-cast p2, La49;

    .line 363
    .line 364
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 365
    .line 366
    .line 367
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 368
    .line 369
    .line 370
    iget-object p0, p2, La49;->a:Ljava/lang/String;

    .line 371
    .line 372
    invoke-interface {p1, v2, p0}, Lxr6;->T(ILjava/lang/String;)V

    .line 373
    .line 374
    .line 375
    iget-object p0, p2, La49;->b:Ljava/lang/String;

    .line 376
    .line 377
    invoke-interface {p1, v1, p0}, Lxr6;->T(ILjava/lang/String;)V

    .line 378
    .line 379
    .line 380
    return-void

    .line 381
    :pswitch_3
    check-cast p2, Lj08;

    .line 382
    .line 383
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 384
    .line 385
    .line 386
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 387
    .line 388
    .line 389
    iget-object p0, p2, Lj08;->a:Ljava/lang/String;

    .line 390
    .line 391
    invoke-interface {p1, v2, p0}, Lxr6;->T(ILjava/lang/String;)V

    .line 392
    .line 393
    .line 394
    iget p0, p2, Lj08;->b:I

    .line 395
    .line 396
    int-to-long v2, p0

    .line 397
    invoke-interface {p1, v1, v2, v3}, Lxr6;->i(IJ)V

    .line 398
    .line 399
    .line 400
    iget p0, p2, Lj08;->c:I

    .line 401
    .line 402
    int-to-long v1, p0

    .line 403
    invoke-interface {p1, v0, v1, v2}, Lxr6;->i(IJ)V

    .line 404
    .line 405
    .line 406
    return-void

    .line 407
    :pswitch_4
    check-cast p2, Lfs5;

    .line 408
    .line 409
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 410
    .line 411
    .line 412
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 413
    .line 414
    .line 415
    iget-object p0, p2, Lfs5;->a:Ljava/lang/String;

    .line 416
    .line 417
    invoke-interface {p1, v2, p0}, Lxr6;->T(ILjava/lang/String;)V

    .line 418
    .line 419
    .line 420
    iget-object p0, p2, Lfs5;->b:Ljava/lang/Long;

    .line 421
    .line 422
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 423
    .line 424
    .line 425
    move-result-wide v2

    .line 426
    invoke-interface {p1, v1, v2, v3}, Lxr6;->i(IJ)V

    .line 427
    .line 428
    .line 429
    return-void

    .line 430
    :pswitch_5
    check-cast p2, Lki1;

    .line 431
    .line 432
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 433
    .line 434
    .line 435
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 436
    .line 437
    .line 438
    iget-object p0, p2, Lki1;->a:Ljava/lang/String;

    .line 439
    .line 440
    invoke-interface {p1, v2, p0}, Lxr6;->T(ILjava/lang/String;)V

    .line 441
    .line 442
    .line 443
    iget-object p0, p2, Lki1;->b:Ljava/lang/String;

    .line 444
    .line 445
    invoke-interface {p1, v1, p0}, Lxr6;->T(ILjava/lang/String;)V

    .line 446
    .line 447
    .line 448
    return-void

    .line 449
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final z()Ljava/lang/String;
    .locals 0

    .line 1
    iget-byte p0, p0, Loi1;->f:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string p0, "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)"

    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    const-string p0, "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`backoff_on_system_interruptions`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"

    .line 10
    .line 11
    return-object p0

    .line 12
    :pswitch_1
    const-string p0, "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)"

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_2
    const-string p0, "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)"

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_3
    const-string p0, "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)"

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_4
    const-string p0, "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)"

    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_5
    const-string p0, "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)"

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
