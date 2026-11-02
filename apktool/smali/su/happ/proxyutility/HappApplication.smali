.class public final Lsu/happ/proxyutility/HappApplication;
.super Landroid/app/Application;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "Lsu/happ/proxyutility/HappApplication;",
        "Landroid/app/Application;",
        "<init>",
        "()V",
        "k32",
        "app"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static M0:Lsu/happ/proxyutility/HappApplication;

.field public static final N0:Lm51;

.field public static O0:Ljava/lang/String;

.field public static P0:Z

.field public static Q0:Z

.field public static R0:Z


# instance fields
.field public final A0:Lvz7;

.field public final B0:Lvz7;

.field public final C0:Lvz7;

.field public final D0:Lvz7;

.field public final E0:Lvz7;

.field public final F0:Lvz7;

.field public final G0:Lvz7;

.field public final H0:Lvz7;

.field public final I0:Lvz7;

.field public final J0:Lvz7;

.field public final K0:Lvz7;

.field public final L0:Lu5;

.field public final X:Lvz7;

.field public final Y:Lvz7;

.field public final Z:Lvz7;

.field public final f0:Lvz7;

.field public final g0:Lvz7;

.field public final h0:Lvz7;

.field public final i0:Lvz7;

.field public final j0:Lvz7;

.field public final k0:Lvz7;

.field public final l0:Lvz7;

.field public final m0:Lvz7;

.field public final n0:Lvz7;

.field public final o0:Lvz7;

.field public final p0:Lvz7;

.field public final q0:Lvz7;

.field public final r0:Lvz7;

.field public final s0:Lvz7;

.field public final t0:Lvz7;

.field public final u0:Lvz7;

.field public final v0:Lvz7;

.field public final w0:Lvz7;

.field public final x0:Lvz7;

.field public final y0:Lvz7;

.field public final z0:Lvz7;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    invoke-static {}, Lpw7;->b()Low7;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Ltp1;->a:Lnf1;

    .line 6
    .line 7
    sget-object v1, Ldm4;->a:Lhv2;

    .line 8
    .line 9
    invoke-static {v0, v1}, Lg33;->K(Lq61;Ls61;)Ls61;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, Lgv3;->c(Ls61;)Lm51;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, Lsu/happ/proxyutility/HappApplication;->N0:Lm51;

    .line 18
    .line 19
    const-string v0, "pref_mode"

    .line 20
    .line 21
    sput-object v0, Lsu/happ/proxyutility/HappApplication;->O0:Ljava/lang/String;

    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    sput-boolean v0, Lsu/happ/proxyutility/HappApplication;->P0:Z

    .line 25
    .line 26
    sput-boolean v0, Lsu/happ/proxyutility/HappApplication;->Q0:Z

    .line 27
    .line 28
    sput-boolean v0, Lsu/happ/proxyutility/HappApplication;->R0:Z

    .line 29
    .line 30
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/app/Application;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lsv2;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p0, v1}, Lsv2;-><init>(Lsu/happ/proxyutility/HappApplication;B)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Lvz7;

    .line 11
    .line 12
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 13
    .line 14
    .line 15
    iput-object v1, p0, Lsu/happ/proxyutility/HappApplication;->X:Lvz7;

    .line 16
    .line 17
    new-instance v0, Lj72;

    .line 18
    .line 19
    invoke-direct {v0, p0}, Lj72;-><init>(Lsu/happ/proxyutility/HappApplication;)V

    .line 20
    .line 21
    .line 22
    new-instance v1, Lvz7;

    .line 23
    .line 24
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 25
    .line 26
    .line 27
    iput-object v1, p0, Lsu/happ/proxyutility/HappApplication;->Y:Lvz7;

    .line 28
    .line 29
    new-instance v0, Lj72;

    .line 30
    .line 31
    const/16 v1, 0x16

    .line 32
    .line 33
    invoke-direct {v0, v1}, Lj72;-><init>(B)V

    .line 34
    .line 35
    .line 36
    new-instance v1, Lvz7;

    .line 37
    .line 38
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 39
    .line 40
    .line 41
    iput-object v1, p0, Lsu/happ/proxyutility/HappApplication;->Z:Lvz7;

    .line 42
    .line 43
    new-instance v0, Lj72;

    .line 44
    .line 45
    const/16 v1, 0x1b

    .line 46
    .line 47
    invoke-direct {v0, v1}, Lj72;-><init>(B)V

    .line 48
    .line 49
    .line 50
    new-instance v1, Lvz7;

    .line 51
    .line 52
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 53
    .line 54
    .line 55
    iput-object v1, p0, Lsu/happ/proxyutility/HappApplication;->f0:Lvz7;

    .line 56
    .line 57
    new-instance v0, Lj72;

    .line 58
    .line 59
    const/16 v1, 0x1c

    .line 60
    .line 61
    invoke-direct {v0, v1}, Lj72;-><init>(B)V

    .line 62
    .line 63
    .line 64
    new-instance v1, Lvz7;

    .line 65
    .line 66
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 67
    .line 68
    .line 69
    iput-object v1, p0, Lsu/happ/proxyutility/HappApplication;->g0:Lvz7;

    .line 70
    .line 71
    new-instance v0, Lsv2;

    .line 72
    .line 73
    const/16 v1, 0xb

    .line 74
    .line 75
    invoke-direct {v0, p0, v1}, Lsv2;-><init>(Lsu/happ/proxyutility/HappApplication;B)V

    .line 76
    .line 77
    .line 78
    new-instance v1, Lvz7;

    .line 79
    .line 80
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 81
    .line 82
    .line 83
    iput-object v1, p0, Lsu/happ/proxyutility/HappApplication;->h0:Lvz7;

    .line 84
    .line 85
    new-instance v0, Lj72;

    .line 86
    .line 87
    const/16 v1, 0x1d

    .line 88
    .line 89
    invoke-direct {v0, v1}, Lj72;-><init>(B)V

    .line 90
    .line 91
    .line 92
    new-instance v1, Lvz7;

    .line 93
    .line 94
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 95
    .line 96
    .line 97
    iput-object v1, p0, Lsu/happ/proxyutility/HappApplication;->i0:Lvz7;

    .line 98
    .line 99
    new-instance v0, Ltv2;

    .line 100
    .line 101
    const/4 v1, 0x0

    .line 102
    invoke-direct {v0, v1}, Ltv2;-><init>(B)V

    .line 103
    .line 104
    .line 105
    new-instance v1, Lvz7;

    .line 106
    .line 107
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 108
    .line 109
    .line 110
    iput-object v1, p0, Lsu/happ/proxyutility/HappApplication;->j0:Lvz7;

    .line 111
    .line 112
    new-instance v0, Ltv2;

    .line 113
    .line 114
    const/4 v1, 0x1

    .line 115
    invoke-direct {v0, v1}, Ltv2;-><init>(B)V

    .line 116
    .line 117
    .line 118
    new-instance v1, Lvz7;

    .line 119
    .line 120
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 121
    .line 122
    .line 123
    iput-object v1, p0, Lsu/happ/proxyutility/HappApplication;->k0:Lvz7;

    .line 124
    .line 125
    new-instance v0, Ltv2;

    .line 126
    .line 127
    const/4 v1, 0x2

    .line 128
    invoke-direct {v0, v1}, Ltv2;-><init>(B)V

    .line 129
    .line 130
    .line 131
    new-instance v1, Lvz7;

    .line 132
    .line 133
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 134
    .line 135
    .line 136
    iput-object v1, p0, Lsu/happ/proxyutility/HappApplication;->l0:Lvz7;

    .line 137
    .line 138
    new-instance v0, Lsv2;

    .line 139
    .line 140
    const/4 v1, 0x6

    .line 141
    invoke-direct {v0, p0, v1}, Lsv2;-><init>(Lsu/happ/proxyutility/HappApplication;B)V

    .line 142
    .line 143
    .line 144
    new-instance v1, Lvz7;

    .line 145
    .line 146
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 147
    .line 148
    .line 149
    iput-object v1, p0, Lsu/happ/proxyutility/HappApplication;->m0:Lvz7;

    .line 150
    .line 151
    new-instance v0, Lsv2;

    .line 152
    .line 153
    const/16 v1, 0xa

    .line 154
    .line 155
    invoke-direct {v0, p0, v1}, Lsv2;-><init>(Lsu/happ/proxyutility/HappApplication;B)V

    .line 156
    .line 157
    .line 158
    new-instance v1, Lvz7;

    .line 159
    .line 160
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 161
    .line 162
    .line 163
    iput-object v1, p0, Lsu/happ/proxyutility/HappApplication;->n0:Lvz7;

    .line 164
    .line 165
    new-instance v0, Ltv2;

    .line 166
    .line 167
    const/4 v1, 0x3

    .line 168
    invoke-direct {v0, v1}, Ltv2;-><init>(B)V

    .line 169
    .line 170
    .line 171
    new-instance v1, Lvz7;

    .line 172
    .line 173
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 174
    .line 175
    .line 176
    iput-object v1, p0, Lsu/happ/proxyutility/HappApplication;->o0:Lvz7;

    .line 177
    .line 178
    new-instance v0, Lsv2;

    .line 179
    .line 180
    const/16 v1, 0xc

    .line 181
    .line 182
    invoke-direct {v0, p0, v1}, Lsv2;-><init>(Lsu/happ/proxyutility/HappApplication;B)V

    .line 183
    .line 184
    .line 185
    new-instance v1, Lvz7;

    .line 186
    .line 187
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 188
    .line 189
    .line 190
    iput-object v1, p0, Lsu/happ/proxyutility/HappApplication;->p0:Lvz7;

    .line 191
    .line 192
    new-instance v0, Ltv2;

    .line 193
    .line 194
    const/4 v1, 0x4

    .line 195
    invoke-direct {v0, v1}, Ltv2;-><init>(B)V

    .line 196
    .line 197
    .line 198
    new-instance v1, Lvz7;

    .line 199
    .line 200
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 201
    .line 202
    .line 203
    iput-object v1, p0, Lsu/happ/proxyutility/HappApplication;->q0:Lvz7;

    .line 204
    .line 205
    new-instance v0, Ltv2;

    .line 206
    .line 207
    const/4 v1, 0x5

    .line 208
    invoke-direct {v0, v1}, Ltv2;-><init>(B)V

    .line 209
    .line 210
    .line 211
    new-instance v1, Lvz7;

    .line 212
    .line 213
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 214
    .line 215
    .line 216
    iput-object v1, p0, Lsu/happ/proxyutility/HappApplication;->r0:Lvz7;

    .line 217
    .line 218
    new-instance v0, Ltv2;

    .line 219
    .line 220
    const/4 v1, 0x6

    .line 221
    invoke-direct {v0, v1}, Ltv2;-><init>(B)V

    .line 222
    .line 223
    .line 224
    new-instance v1, Lvz7;

    .line 225
    .line 226
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 227
    .line 228
    .line 229
    iput-object v1, p0, Lsu/happ/proxyutility/HappApplication;->s0:Lvz7;

    .line 230
    .line 231
    new-instance v0, Ltv2;

    .line 232
    .line 233
    const/4 v1, 0x7

    .line 234
    invoke-direct {v0, v1}, Ltv2;-><init>(B)V

    .line 235
    .line 236
    .line 237
    new-instance v1, Lvz7;

    .line 238
    .line 239
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 240
    .line 241
    .line 242
    iput-object v1, p0, Lsu/happ/proxyutility/HappApplication;->t0:Lvz7;

    .line 243
    .line 244
    new-instance v0, Lsv2;

    .line 245
    .line 246
    const/16 v1, 0xd

    .line 247
    .line 248
    invoke-direct {v0, p0, v1}, Lsv2;-><init>(Lsu/happ/proxyutility/HappApplication;B)V

    .line 249
    .line 250
    .line 251
    new-instance v1, Lvz7;

    .line 252
    .line 253
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 254
    .line 255
    .line 256
    iput-object v1, p0, Lsu/happ/proxyutility/HappApplication;->u0:Lvz7;

    .line 257
    .line 258
    new-instance v0, Lj72;

    .line 259
    .line 260
    const/16 v1, 0x11

    .line 261
    .line 262
    invoke-direct {v0, v1}, Lj72;-><init>(B)V

    .line 263
    .line 264
    .line 265
    new-instance v1, Lvz7;

    .line 266
    .line 267
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 268
    .line 269
    .line 270
    iput-object v1, p0, Lsu/happ/proxyutility/HappApplication;->v0:Lvz7;

    .line 271
    .line 272
    new-instance v0, Lj72;

    .line 273
    .line 274
    const/16 v1, 0x13

    .line 275
    .line 276
    invoke-direct {v0, v1}, Lj72;-><init>(B)V

    .line 277
    .line 278
    .line 279
    new-instance v1, Lvz7;

    .line 280
    .line 281
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 282
    .line 283
    .line 284
    iput-object v1, p0, Lsu/happ/proxyutility/HappApplication;->w0:Lvz7;

    .line 285
    .line 286
    new-instance v0, Lsv2;

    .line 287
    .line 288
    const/4 v1, 0x1

    .line 289
    invoke-direct {v0, p0, v1}, Lsv2;-><init>(Lsu/happ/proxyutility/HappApplication;B)V

    .line 290
    .line 291
    .line 292
    new-instance v1, Lvz7;

    .line 293
    .line 294
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 295
    .line 296
    .line 297
    iput-object v1, p0, Lsu/happ/proxyutility/HappApplication;->x0:Lvz7;

    .line 298
    .line 299
    new-instance v0, Lj72;

    .line 300
    .line 301
    const/16 v1, 0x14

    .line 302
    .line 303
    invoke-direct {v0, v1}, Lj72;-><init>(B)V

    .line 304
    .line 305
    .line 306
    new-instance v1, Lvz7;

    .line 307
    .line 308
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 309
    .line 310
    .line 311
    iput-object v1, p0, Lsu/happ/proxyutility/HappApplication;->y0:Lvz7;

    .line 312
    .line 313
    new-instance v0, Lsv2;

    .line 314
    .line 315
    const/4 v1, 0x2

    .line 316
    invoke-direct {v0, p0, v1}, Lsv2;-><init>(Lsu/happ/proxyutility/HappApplication;B)V

    .line 317
    .line 318
    .line 319
    new-instance v1, Lvz7;

    .line 320
    .line 321
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 322
    .line 323
    .line 324
    iput-object v1, p0, Lsu/happ/proxyutility/HappApplication;->z0:Lvz7;

    .line 325
    .line 326
    new-instance v0, Lsv2;

    .line 327
    .line 328
    const/4 v1, 0x3

    .line 329
    invoke-direct {v0, p0, v1}, Lsv2;-><init>(Lsu/happ/proxyutility/HappApplication;B)V

    .line 330
    .line 331
    .line 332
    new-instance v1, Lvz7;

    .line 333
    .line 334
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 335
    .line 336
    .line 337
    iput-object v1, p0, Lsu/happ/proxyutility/HappApplication;->A0:Lvz7;

    .line 338
    .line 339
    new-instance v0, Lsv2;

    .line 340
    .line 341
    const/4 v1, 0x4

    .line 342
    invoke-direct {v0, p0, v1}, Lsv2;-><init>(Lsu/happ/proxyutility/HappApplication;B)V

    .line 343
    .line 344
    .line 345
    new-instance v1, Lvz7;

    .line 346
    .line 347
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 348
    .line 349
    .line 350
    iput-object v1, p0, Lsu/happ/proxyutility/HappApplication;->B0:Lvz7;

    .line 351
    .line 352
    new-instance v0, Lj72;

    .line 353
    .line 354
    const/16 v1, 0x15

    .line 355
    .line 356
    invoke-direct {v0, v1}, Lj72;-><init>(B)V

    .line 357
    .line 358
    .line 359
    new-instance v1, Lvz7;

    .line 360
    .line 361
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 362
    .line 363
    .line 364
    iput-object v1, p0, Lsu/happ/proxyutility/HappApplication;->C0:Lvz7;

    .line 365
    .line 366
    new-instance v0, Lsv2;

    .line 367
    .line 368
    const/4 v1, 0x5

    .line 369
    invoke-direct {v0, p0, v1}, Lsv2;-><init>(Lsu/happ/proxyutility/HappApplication;B)V

    .line 370
    .line 371
    .line 372
    new-instance v1, Lvz7;

    .line 373
    .line 374
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 375
    .line 376
    .line 377
    iput-object v1, p0, Lsu/happ/proxyutility/HappApplication;->D0:Lvz7;

    .line 378
    .line 379
    new-instance v0, Lsv2;

    .line 380
    .line 381
    const/4 v1, 0x7

    .line 382
    invoke-direct {v0, p0, v1}, Lsv2;-><init>(Lsu/happ/proxyutility/HappApplication;B)V

    .line 383
    .line 384
    .line 385
    new-instance v1, Lvz7;

    .line 386
    .line 387
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 388
    .line 389
    .line 390
    iput-object v1, p0, Lsu/happ/proxyutility/HappApplication;->E0:Lvz7;

    .line 391
    .line 392
    new-instance v0, Lsv2;

    .line 393
    .line 394
    const/16 v1, 0x8

    .line 395
    .line 396
    invoke-direct {v0, p0, v1}, Lsv2;-><init>(Lsu/happ/proxyutility/HappApplication;B)V

    .line 397
    .line 398
    .line 399
    new-instance v1, Lvz7;

    .line 400
    .line 401
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 402
    .line 403
    .line 404
    iput-object v1, p0, Lsu/happ/proxyutility/HappApplication;->F0:Lvz7;

    .line 405
    .line 406
    new-instance v0, Lsv2;

    .line 407
    .line 408
    const/16 v1, 0x9

    .line 409
    .line 410
    invoke-direct {v0, p0, v1}, Lsv2;-><init>(Lsu/happ/proxyutility/HappApplication;B)V

    .line 411
    .line 412
    .line 413
    new-instance v1, Lvz7;

    .line 414
    .line 415
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 416
    .line 417
    .line 418
    iput-object v1, p0, Lsu/happ/proxyutility/HappApplication;->G0:Lvz7;

    .line 419
    .line 420
    new-instance v0, Lj72;

    .line 421
    .line 422
    const/16 v1, 0x17

    .line 423
    .line 424
    invoke-direct {v0, v1}, Lj72;-><init>(B)V

    .line 425
    .line 426
    .line 427
    new-instance v1, Lvz7;

    .line 428
    .line 429
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 430
    .line 431
    .line 432
    iput-object v1, p0, Lsu/happ/proxyutility/HappApplication;->H0:Lvz7;

    .line 433
    .line 434
    new-instance v0, Lj72;

    .line 435
    .line 436
    const/16 v1, 0x18

    .line 437
    .line 438
    invoke-direct {v0, v1}, Lj72;-><init>(B)V

    .line 439
    .line 440
    .line 441
    new-instance v1, Lvz7;

    .line 442
    .line 443
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 444
    .line 445
    .line 446
    iput-object v1, p0, Lsu/happ/proxyutility/HappApplication;->I0:Lvz7;

    .line 447
    .line 448
    new-instance v0, Lj72;

    .line 449
    .line 450
    const/16 v1, 0x19

    .line 451
    .line 452
    invoke-direct {v0, v1}, Lj72;-><init>(B)V

    .line 453
    .line 454
    .line 455
    new-instance v1, Lvz7;

    .line 456
    .line 457
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 458
    .line 459
    .line 460
    iput-object v1, p0, Lsu/happ/proxyutility/HappApplication;->J0:Lvz7;

    .line 461
    .line 462
    new-instance v0, Lj72;

    .line 463
    .line 464
    const/16 v1, 0x1a

    .line 465
    .line 466
    invoke-direct {v0, v1}, Lj72;-><init>(B)V

    .line 467
    .line 468
    .line 469
    new-instance v1, Lvz7;

    .line 470
    .line 471
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 472
    .line 473
    .line 474
    iput-object v1, p0, Lsu/happ/proxyutility/HappApplication;->K0:Lvz7;

    .line 475
    .line 476
    new-instance v0, Lu5;

    .line 477
    .line 478
    const/4 v1, 0x0

    .line 479
    invoke-direct {v0, v1}, Lu5;-><init>(B)V

    .line 480
    .line 481
    .line 482
    iput-object v0, p0, Lsu/happ/proxyutility/HappApplication;->L0:Lu5;

    .line 483
    .line 484
    return-void
.end method


# virtual methods
.method public final a()Lqo;
    .locals 0

    .line 1
    iget-object p0, p0, Lsu/happ/proxyutility/HappApplication;->h0:Lvz7;

    .line 2
    .line 3
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lqo;

    .line 8
    .line 9
    return-object p0
.end method

.method public final attachBaseContext(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Landroid/content/ContextWrapper;->attachBaseContext(Landroid/content/Context;)V

    .line 2
    .line 3
    .line 4
    sput-object p0, Lsu/happ/proxyutility/HappApplication;->M0:Lsu/happ/proxyutility/HappApplication;

    .line 5
    .line 6
    return-void
.end method

.method public final b()Lk61;
    .locals 0

    .line 1
    iget-object p0, p0, Lsu/happ/proxyutility/HappApplication;->g0:Lvz7;

    .line 2
    .line 3
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lk61;

    .line 8
    .line 9
    return-object p0
.end method

.method public final c()Lqc2;
    .locals 0

    .line 1
    iget-object p0, p0, Lsu/happ/proxyutility/HappApplication;->p0:Lvz7;

    .line 2
    .line 3
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lqc2;

    .line 8
    .line 9
    return-object p0
.end method

.method public final d()Lkf4;
    .locals 0

    .line 1
    iget-object p0, p0, Lsu/happ/proxyutility/HappApplication;->n0:Lvz7;

    .line 2
    .line 3
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lkf4;

    .line 8
    .line 9
    return-object p0
.end method

.method public final e()Lc16;
    .locals 0

    .line 1
    iget-object p0, p0, Lsu/happ/proxyutility/HappApplication;->u0:Lvz7;

    .line 2
    .line 3
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lc16;

    .line 8
    .line 9
    return-object p0
.end method

.method public final f()Lmn6;
    .locals 0

    .line 1
    iget-object p0, p0, Lsu/happ/proxyutility/HappApplication;->Z:Lvz7;

    .line 2
    .line 3
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lmn6;

    .line 8
    .line 9
    return-object p0
.end method

.method public final g()Lgk7;
    .locals 0

    .line 1
    iget-object p0, p0, Lsu/happ/proxyutility/HappApplication;->i0:Lvz7;

    .line 2
    .line 3
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lgk7;

    .line 8
    .line 9
    return-object p0
.end method

.method public final h()Lzt7;
    .locals 0

    .line 1
    iget-object p0, p0, Lsu/happ/proxyutility/HappApplication;->J0:Lvz7;

    .line 2
    .line 3
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lzt7;

    .line 8
    .line 9
    return-object p0
.end method

.method public final i()Lig8;
    .locals 0

    .line 1
    iget-object p0, p0, Lsu/happ/proxyutility/HappApplication;->t0:Lvz7;

    .line 2
    .line 3
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lig8;

    .line 8
    .line 9
    return-object p0
.end method

.method public final j()Lxy0;
    .locals 3

    .line 1
    new-instance v0, Lmj0;

    .line 2
    .line 3
    const/4 v1, 0x7

    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-direct {v0, v1, v2}, Lmj0;-><init>(BZ)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    const-string v1, ":bg_process"

    .line 13
    .line 14
    invoke-static {p0, v1}, Lpc6;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    iput-object p0, v0, Lmj0;->Z:Ljava/lang/Object;

    .line 19
    .line 20
    const/4 p0, 0x1

    .line 21
    invoke-static {p0}, Ljava/util/concurrent/Executors;->newFixedThreadPool(I)Ljava/util/concurrent/ExecutorService;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    iput-object p0, v0, Lmj0;->Y:Ljava/lang/Object;

    .line 29
    .line 30
    new-instance p0, Lxy0;

    .line 31
    .line 32
    invoke-direct {p0, v0}, Lxy0;-><init>(Lmj0;)V

    .line 33
    .line 34
    .line 35
    return-object p0
.end method

.method public final onCreate()V
    .locals 15

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    invoke-super {p0}, Landroid/app/Application;->onCreate()V

    .line 7
    .line 8
    .line 9
    invoke-static {p0}, Lcom/tencent/mmkv/MMKV;->r(Lsu/happ/proxyutility/HappApplication;)V

    .line 10
    .line 11
    .line 12
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 13
    .line 14
    const/4 v3, 0x1

    .line 15
    const/16 v4, 0x1d

    .line 16
    .line 17
    if-gt v2, v4, :cond_0

    .line 18
    .line 19
    invoke-static {}, Lorg/conscrypt/Conscrypt;->newProvider()Ljava/security/Provider;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-static {v2, v3}, Ljava/security/Security;->insertProviderAt(Ljava/security/Provider;I)I

    .line 24
    .line 25
    .line 26
    :cond_0
    sget-object v2, Lss8;->a:Lss8;

    .line 27
    .line 28
    const-string v2, "?"

    .line 29
    .line 30
    filled-new-array {v2}, [Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    const-string v5, "uWM0lcVs0849kTwk?AqHnQy35aOM/ZtgUip+BrTHHLnSYBNwQAX0y2g==?os8iL1DE8Dee/5roJ+ZzsQ=="

    .line 35
    .line 36
    const/4 v6, 0x6

    .line 37
    invoke-static {v5, v2, v6}, Lfm7;->F0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    sget-object v5, Lc12;->a:Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    check-cast v5, Ljava/lang/String;

    .line 48
    .line 49
    const/4 v7, 0x0

    .line 50
    invoke-interface {v2, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v8

    .line 54
    check-cast v8, Ljava/lang/String;

    .line 55
    .line 56
    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    check-cast v2, Ljava/lang/String;

    .line 61
    .line 62
    invoke-static {v5, v8, v2}, Lc12;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 67
    .line 68
    .line 69
    move-result-object v5

    .line 70
    invoke-static {v5}, Len;->k(Lsu/happ/proxyutility/HappApplication;)Ljava/util/List;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    check-cast v5, Ljava/lang/String;

    .line 79
    .line 80
    const-string v8, "\n"

    .line 81
    .line 82
    invoke-static {v5, v8}, Lfm7;->y0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    invoke-virtual {v5, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v2

    .line 90
    const/4 v5, 0x0

    .line 91
    if-nez v2, :cond_1

    .line 92
    .line 93
    invoke-static {}, Lc12;->e()V

    .line 94
    .line 95
    .line 96
    sput-object v5, Lsu/happ/proxyutility/HappApplication;->O0:Ljava/lang/String;

    .line 97
    .line 98
    :cond_1
    sget v2, Lq36;->ic_unfold_24dp:I

    .line 99
    .line 100
    const/4 v8, 0x3

    .line 101
    invoke-static {v8, v2}, Lc12;->a(II)V

    .line 102
    .line 103
    .line 104
    const/16 v2, 0x8

    .line 105
    .line 106
    sget v9, Lq36;->ic_tab_24dp:I

    .line 107
    .line 108
    invoke-static {v2, v9}, Lc12;->a(II)V

    .line 109
    .line 110
    .line 111
    const/4 v2, 0x4

    .line 112
    sget v9, Lq36;->ic_minimize_24dp:I

    .line 113
    .line 114
    invoke-static {v2, v9}, Lc12;->a(II)V

    .line 115
    .line 116
    .line 117
    const/4 v2, 0x5

    .line 118
    sget v9, Lq36;->ic_forward_24dp:I

    .line 119
    .line 120
    invoke-static {v2, v9}, Lc12;->a(II)V

    .line 121
    .line 122
    .line 123
    sget v2, Lq36;->ic_swap_24dp:I

    .line 124
    .line 125
    invoke-static {v0, v2}, Lc12;->a(II)V

    .line 126
    .line 127
    .line 128
    sget v2, Lq36;->ic_swipe_24dp:I

    .line 129
    .line 130
    invoke-static {v6, v2}, Lc12;->a(II)V

    .line 131
    .line 132
    .line 133
    const/4 v2, 0x7

    .line 134
    sget v6, Lq36;->ic_enable_24dp:I

    .line 135
    .line 136
    invoke-static {v2, v6}, Lc12;->a(II)V

    .line 137
    .line 138
    .line 139
    sget v2, Lq36;->ic_bolt_24dp:I

    .line 140
    .line 141
    invoke-static {v3, v2}, Lc12;->a(II)V

    .line 142
    .line 143
    .line 144
    sget v2, Lq36;->ic_favourite_24dp:I

    .line 145
    .line 146
    invoke-static {v7, v2}, Lc12;->a(II)V

    .line 147
    .line 148
    .line 149
    const/16 v2, 0x9

    .line 150
    .line 151
    sget v6, Lq36;->ic_width_24dp:I

    .line 152
    .line 153
    invoke-static {v2, v6}, Lc12;->a(II)V

    .line 154
    .line 155
    .line 156
    const/16 v2, 0x40

    .line 157
    .line 158
    sget v6, Lq36;->ic_slow_24dp:I

    .line 159
    .line 160
    invoke-static {v2, v6}, Lc12;->a(II)V

    .line 161
    .line 162
    .line 163
    const/16 v2, 0xf

    .line 164
    .line 165
    sget v6, Lq36;->ic_strict_24dp:I

    .line 166
    .line 167
    invoke-static {v2, v6}, Lc12;->a(II)V

    .line 168
    .line 169
    .line 170
    const/16 v2, 0x49

    .line 171
    .line 172
    sget v6, Lq36;->ic_launch_24dp:I

    .line 173
    .line 174
    invoke-static {v2, v6}, Lc12;->a(II)V

    .line 175
    .line 176
    .line 177
    const/16 v2, 0x32

    .line 178
    .line 179
    sget v6, Lq36;->ic_like_24dp:I

    .line 180
    .line 181
    invoke-static {v2, v6}, Lc12;->a(II)V

    .line 182
    .line 183
    .line 184
    const/16 v2, 0x25

    .line 185
    .line 186
    sget v6, Lq36;->ic_release_24dp:I

    .line 187
    .line 188
    invoke-static {v2, v6}, Lc12;->a(II)V

    .line 189
    .line 190
    .line 191
    const/16 v2, 0xc

    .line 192
    .line 193
    sget v6, Lq36;->ic_open_24dp:I

    .line 194
    .line 195
    invoke-static {v2, v6}, Lc12;->a(II)V

    .line 196
    .line 197
    .line 198
    const/16 v2, 0x55

    .line 199
    .line 200
    sget v6, Lq36;->ic_protected_24dp:I

    .line 201
    .line 202
    invoke-static {v2, v6}, Lc12;->a(II)V

    .line 203
    .line 204
    .line 205
    const/16 v2, 0xd

    .line 206
    .line 207
    sget v6, Lq36;->ic_warning_24dp:I

    .line 208
    .line 209
    invoke-static {v2, v6}, Lc12;->a(II)V

    .line 210
    .line 211
    .line 212
    const/16 v2, 0x1f

    .line 213
    .line 214
    sget v6, Lq36;->ic_rel_24dp:I

    .line 215
    .line 216
    invoke-static {v2, v6}, Lc12;->a(II)V

    .line 217
    .line 218
    .line 219
    const/16 v2, 0x50

    .line 220
    .line 221
    sget v6, Lq36;->ic_space_24dp:I

    .line 222
    .line 223
    invoke-static {v2, v6}, Lc12;->a(II)V

    .line 224
    .line 225
    .line 226
    const/16 v2, 0x33

    .line 227
    .line 228
    sget v6, Lq36;->ic_nice_24dp:I

    .line 229
    .line 230
    invoke-static {v2, v6}, Lc12;->a(II)V

    .line 231
    .line 232
    .line 233
    const/16 v2, 0x3d

    .line 234
    .line 235
    sget v6, Lq36;->ic_usage_24dp:I

    .line 236
    .line 237
    invoke-static {v2, v6}, Lc12;->a(II)V

    .line 238
    .line 239
    .line 240
    const/16 v2, 0x54

    .line 241
    .line 242
    sget v6, Lq36;->ic_move_24dp:I

    .line 243
    .line 244
    invoke-static {v2, v6}, Lc12;->a(II)V

    .line 245
    .line 246
    .line 247
    const/16 v2, 0x1c

    .line 248
    .line 249
    sget v6, Lq36;->ic_true_24dp:I

    .line 250
    .line 251
    invoke-static {v2, v6}, Lc12;->a(II)V

    .line 252
    .line 253
    .line 254
    const/16 v2, 0x22

    .line 255
    .line 256
    sget v6, Lq36;->ic_social_24dp:I

    .line 257
    .line 258
    invoke-static {v2, v6}, Lc12;->a(II)V

    .line 259
    .line 260
    .line 261
    const/16 v2, 0x51

    .line 262
    .line 263
    sget v6, Lq36;->ic_sheet_24dp:I

    .line 264
    .line 265
    invoke-static {v2, v6}, Lc12;->a(II)V

    .line 266
    .line 267
    .line 268
    const/16 v2, 0x27

    .line 269
    .line 270
    sget v6, Lq36;->ic_wall_24dp:I

    .line 271
    .line 272
    invoke-static {v2, v6}, Lc12;->a(II)V

    .line 273
    .line 274
    .line 275
    const/16 v2, 0x37

    .line 276
    .line 277
    sget v6, Lq36;->ic_gesture_24dp:I

    .line 278
    .line 279
    invoke-static {v2, v6}, Lc12;->a(II)V

    .line 280
    .line 281
    .line 282
    const/16 v2, 0x38

    .line 283
    .line 284
    sget v6, Lq36;->ic_side_24dp:I

    .line 285
    .line 286
    invoke-static {v2, v6}, Lc12;->a(II)V

    .line 287
    .line 288
    .line 289
    const/16 v2, 0x1e

    .line 290
    .line 291
    sget v6, Lq36;->ic_item_24dp:I

    .line 292
    .line 293
    invoke-static {v2, v6}, Lc12;->a(II)V

    .line 294
    .line 295
    .line 296
    const/16 v2, 0x14

    .line 297
    .line 298
    sget v6, Lq36;->ic_globe_24dp:I

    .line 299
    .line 300
    invoke-static {v2, v6}, Lc12;->a(II)V

    .line 301
    .line 302
    .line 303
    const/16 v2, 0x4a

    .line 304
    .line 305
    sget v6, Lq36;->ic_unit_24dp:I

    .line 306
    .line 307
    invoke-static {v2, v6}, Lc12;->a(II)V

    .line 308
    .line 309
    .line 310
    const/16 v2, 0x15

    .line 311
    .line 312
    sget v6, Lq36;->ic_property_24dp:I

    .line 313
    .line 314
    invoke-static {v2, v6}, Lc12;->a(II)V

    .line 315
    .line 316
    .line 317
    const/16 v2, 0x41

    .line 318
    .line 319
    sget v6, Lq36;->ic_normal_24dp:I

    .line 320
    .line 321
    invoke-static {v2, v6}, Lc12;->a(II)V

    .line 322
    .line 323
    .line 324
    const/16 v2, 0x56

    .line 325
    .line 326
    sget v6, Lq36;->ic_storage_24dp:I

    .line 327
    .line 328
    invoke-static {v2, v6}, Lc12;->a(II)V

    .line 329
    .line 330
    .line 331
    const/16 v2, 0x3a

    .line 332
    .line 333
    sget v6, Lq36;->ic_sync_24dp:I

    .line 334
    .line 335
    invoke-static {v2, v6}, Lc12;->a(II)V

    .line 336
    .line 337
    .line 338
    const/16 v2, 0x12

    .line 339
    .line 340
    sget v6, Lq36;->ic_splash_24dp:I

    .line 341
    .line 342
    invoke-static {v2, v6}, Lc12;->a(II)V

    .line 343
    .line 344
    .line 345
    const/16 v2, 0x16

    .line 346
    .line 347
    sget v6, Lq36;->ic_recent_24dp:I

    .line 348
    .line 349
    invoke-static {v2, v6}, Lc12;->a(II)V

    .line 350
    .line 351
    .line 352
    const/16 v2, 0x31

    .line 353
    .line 354
    sget v6, Lq36;->ic_topic_24dp:I

    .line 355
    .line 356
    invoke-static {v2, v6}, Lc12;->a(II)V

    .line 357
    .line 358
    .line 359
    const/16 v2, 0x4c

    .line 360
    .line 361
    sget v6, Lq36;->ic_free_24dp:I

    .line 362
    .line 363
    invoke-static {v2, v6}, Lc12;->a(II)V

    .line 364
    .line 365
    .line 366
    const/16 v2, 0x4d

    .line 367
    .line 368
    sget v6, Lq36;->ic_tag_24dp:I

    .line 369
    .line 370
    invoke-static {v2, v6}, Lc12;->a(II)V

    .line 371
    .line 372
    .line 373
    const/16 v2, 0x2a

    .line 374
    .line 375
    sget v6, Lq36;->ic_solid_24dp:I

    .line 376
    .line 377
    invoke-static {v2, v6}, Lc12;->a(II)V

    .line 378
    .line 379
    .line 380
    const/16 v2, 0x42

    .line 381
    .line 382
    sget v6, Lq36;->ic_redo_24dp:I

    .line 383
    .line 384
    invoke-static {v2, v6}, Lc12;->a(II)V

    .line 385
    .line 386
    .line 387
    const/16 v2, 0x2b

    .line 388
    .line 389
    sget v6, Lq36;->ic_music_24dp:I

    .line 390
    .line 391
    invoke-static {v2, v6}, Lc12;->a(II)V

    .line 392
    .line 393
    .line 394
    const/16 v2, 0x11

    .line 395
    .line 396
    sget v6, Lq36;->ic_key_24dp:I

    .line 397
    .line 398
    invoke-static {v2, v6}, Lc12;->a(II)V

    .line 399
    .line 400
    .line 401
    const/16 v2, 0x2c

    .line 402
    .line 403
    sget v6, Lq36;->ic_user_24dp:I

    .line 404
    .line 405
    invoke-static {v2, v6}, Lc12;->a(II)V

    .line 406
    .line 407
    .line 408
    const/16 v2, 0x57

    .line 409
    .line 410
    sget v6, Lq36;->ic_wrong_24dp:I

    .line 411
    .line 412
    invoke-static {v2, v6}, Lc12;->a(II)V

    .line 413
    .line 414
    .line 415
    const/16 v2, 0x45

    .line 416
    .line 417
    sget v6, Lq36;->ic_server_24dp:I

    .line 418
    .line 419
    invoke-static {v2, v6}, Lc12;->a(II)V

    .line 420
    .line 421
    .line 422
    const/16 v2, 0x46

    .line 423
    .line 424
    sget v6, Lq36;->ic_recycle_24dp:I

    .line 425
    .line 426
    invoke-static {v2, v6}, Lc12;->a(II)V

    .line 427
    .line 428
    .line 429
    const/16 v2, 0x28

    .line 430
    .line 431
    sget v6, Lq36;->ic_go_24dp:I

    .line 432
    .line 433
    invoke-static {v2, v6}, Lc12;->a(II)V

    .line 434
    .line 435
    .line 436
    const/16 v2, 0x13

    .line 437
    .line 438
    sget v6, Lq36;->ic_get_24dp:I

    .line 439
    .line 440
    invoke-static {v2, v6}, Lc12;->a(II)V

    .line 441
    .line 442
    .line 443
    const/16 v2, 0x20

    .line 444
    .line 445
    sget v6, Lq36;->ic_require_24dp:I

    .line 446
    .line 447
    invoke-static {v2, v6}, Lc12;->a(II)V

    .line 448
    .line 449
    .line 450
    const/16 v2, 0x24

    .line 451
    .line 452
    sget v6, Lq36;->ic_raw_24dp:I

    .line 453
    .line 454
    invoke-static {v2, v6}, Lc12;->a(II)V

    .line 455
    .line 456
    .line 457
    const/16 v2, 0x4e

    .line 458
    .line 459
    sget v6, Lq36;->ic_arrow_24dp:I

    .line 460
    .line 461
    invoke-static {v2, v6}, Lc12;->a(II)V

    .line 462
    .line 463
    .line 464
    sget v2, Lq36;->ic_player_24dp:I

    .line 465
    .line 466
    const/16 v6, 0x1a

    .line 467
    .line 468
    invoke-static {v6, v2}, Lc12;->a(II)V

    .line 469
    .line 470
    .line 471
    sget v2, Lq36;->ic_cancel_24dp:I

    .line 472
    .line 473
    const/16 v9, 0xe

    .line 474
    .line 475
    invoke-static {v9, v2}, Lc12;->a(II)V

    .line 476
    .line 477
    .line 478
    const/16 v2, 0x34

    .line 479
    .line 480
    sget v10, Lq36;->ic_visible_24dp:I

    .line 481
    .line 482
    invoke-static {v2, v10}, Lc12;->a(II)V

    .line 483
    .line 484
    .line 485
    const/16 v2, 0x17

    .line 486
    .line 487
    sget v10, Lq36;->ic_map_24dp:I

    .line 488
    .line 489
    invoke-static {v2, v10}, Lc12;->a(II)V

    .line 490
    .line 491
    .line 492
    const/16 v2, 0x35

    .line 493
    .line 494
    sget v10, Lq36;->ic_throw_24dp:I

    .line 495
    .line 496
    invoke-static {v2, v10}, Lc12;->a(II)V

    .line 497
    .line 498
    .line 499
    const/16 v2, 0x47

    .line 500
    .line 501
    sget v10, Lq36;->ic_search_24dp:I

    .line 502
    .line 503
    invoke-static {v2, v10}, Lc12;->a(II)V

    .line 504
    .line 505
    .line 506
    const/16 v2, 0x29

    .line 507
    .line 508
    sget v10, Lq36;->ic_home_24dp:I

    .line 509
    .line 510
    invoke-static {v2, v10}, Lc12;->a(II)V

    .line 511
    .line 512
    .line 513
    const/16 v2, 0x3e

    .line 514
    .line 515
    sget v10, Lq36;->ic_until_24dp:I

    .line 516
    .line 517
    invoke-static {v2, v10}, Lc12;->a(II)V

    .line 518
    .line 519
    .line 520
    const/16 v2, 0x2f

    .line 521
    .line 522
    sget v10, Lq36;->ic_travel_24dp:I

    .line 523
    .line 524
    invoke-static {v2, v10}, Lc12;->a(II)V

    .line 525
    .line 526
    .line 527
    const/16 v2, 0x19

    .line 528
    .line 529
    sget v10, Lq36;->ic_mix_24dp:I

    .line 530
    .line 531
    invoke-static {v2, v10}, Lc12;->a(II)V

    .line 532
    .line 533
    .line 534
    const/16 v2, 0x3c

    .line 535
    .line 536
    sget v10, Lq36;->ic_identify_24dp:I

    .line 537
    .line 538
    invoke-static {v2, v10}, Lc12;->a(II)V

    .line 539
    .line 540
    .line 541
    sget v2, Lq36;->ic_game_24dp:I

    .line 542
    .line 543
    const/16 v10, 0xa

    .line 544
    .line 545
    invoke-static {v10, v2}, Lc12;->a(II)V

    .line 546
    .line 547
    .line 548
    const/16 v2, 0x52

    .line 549
    .line 550
    sget v11, Lq36;->ic_send_24dp:I

    .line 551
    .line 552
    invoke-static {v2, v11}, Lc12;->a(II)V

    .line 553
    .line 554
    .line 555
    const/16 v2, 0x58

    .line 556
    .line 557
    sget v11, Lq36;->ic_paste_24dp:I

    .line 558
    .line 559
    invoke-static {v2, v11}, Lc12;->a(II)V

    .line 560
    .line 561
    .line 562
    const/16 v2, 0x48

    .line 563
    .line 564
    sget v11, Lq36;->ic_pending_24dp:I

    .line 565
    .line 566
    invoke-static {v2, v11}, Lc12;->a(II)V

    .line 567
    .line 568
    .line 569
    const/16 v2, 0x36

    .line 570
    .line 571
    sget v11, Lq36;->ic_battery_24dp:I

    .line 572
    .line 573
    invoke-static {v2, v11}, Lc12;->a(II)V

    .line 574
    .line 575
    .line 576
    const/16 v2, 0x2d

    .line 577
    .line 578
    sget v11, Lq36;->ic_scope_24dp:I

    .line 579
    .line 580
    invoke-static {v2, v11}, Lc12;->a(II)V

    .line 581
    .line 582
    .line 583
    const/16 v2, 0x44

    .line 584
    .line 585
    sget v11, Lq36;->ic_lock_24dp:I

    .line 586
    .line 587
    invoke-static {v2, v11}, Lc12;->a(II)V

    .line 588
    .line 589
    .line 590
    const/16 v2, 0x3b

    .line 591
    .line 592
    sget v11, Lq36;->ic_sleep_24dp:I

    .line 593
    .line 594
    invoke-static {v2, v11}, Lc12;->a(II)V

    .line 595
    .line 596
    .line 597
    const/16 v2, 0x59

    .line 598
    .line 599
    sget v11, Lq36;->ic_trail_24dp:I

    .line 600
    .line 601
    invoke-static {v2, v11}, Lc12;->a(II)V

    .line 602
    .line 603
    .line 604
    const/16 v2, 0x2e

    .line 605
    .line 606
    sget v11, Lq36;->ic_overline_24dp:I

    .line 607
    .line 608
    invoke-static {v2, v11}, Lc12;->a(II)V

    .line 609
    .line 610
    .line 611
    const/16 v2, 0x18

    .line 612
    .line 613
    sget v11, Lq36;->ic_thumb_24dp:I

    .line 614
    .line 615
    invoke-static {v2, v11}, Lc12;->a(II)V

    .line 616
    .line 617
    .line 618
    const/16 v2, 0x4f

    .line 619
    .line 620
    sget v11, Lq36;->ic_queue_24dp:I

    .line 621
    .line 622
    invoke-static {v2, v11}, Lc12;->a(II)V

    .line 623
    .line 624
    .line 625
    const/16 v2, 0x53

    .line 626
    .line 627
    sget v11, Lq36;->ic_task_24dp:I

    .line 628
    .line 629
    invoke-static {v2, v11}, Lc12;->a(II)V

    .line 630
    .line 631
    .line 632
    const/16 v2, 0x23

    .line 633
    .line 634
    sget v11, Lq36;->ic_stand_24dp:I

    .line 635
    .line 636
    invoke-static {v2, v11}, Lc12;->a(II)V

    .line 637
    .line 638
    .line 639
    const/16 v2, 0x39

    .line 640
    .line 641
    sget v11, Lq36;->ic_input_24dp:I

    .line 642
    .line 643
    invoke-static {v2, v11}, Lc12;->a(II)V

    .line 644
    .line 645
    .line 646
    const/16 v2, 0x10

    .line 647
    .line 648
    sget v11, Lq36;->ic_indent_24dp:I

    .line 649
    .line 650
    invoke-static {v2, v11}, Lc12;->a(II)V

    .line 651
    .line 652
    .line 653
    const/16 v2, 0xb

    .line 654
    .line 655
    sget v11, Lq36;->ic_native_24dp:I

    .line 656
    .line 657
    invoke-static {v2, v11}, Lc12;->a(II)V

    .line 658
    .line 659
    .line 660
    const/16 v2, 0x26

    .line 661
    .line 662
    sget v11, Lq36;->ic_cast_24dp:I

    .line 663
    .line 664
    invoke-static {v2, v11}, Lc12;->a(II)V

    .line 665
    .line 666
    .line 667
    const/16 v2, 0x4b

    .line 668
    .line 669
    sget v11, Lq36;->ic_worker_24dp:I

    .line 670
    .line 671
    invoke-static {v2, v11}, Lc12;->a(II)V

    .line 672
    .line 673
    .line 674
    const/16 v2, 0x43

    .line 675
    .line 676
    sget v11, Lq36;->ic_success_24dp:I

    .line 677
    .line 678
    invoke-static {v2, v11}, Lc12;->a(II)V

    .line 679
    .line 680
    .line 681
    const/16 v2, 0x21

    .line 682
    .line 683
    sget v11, Lq36;->ic_pause_24dp:I

    .line 684
    .line 685
    invoke-static {v2, v11}, Lc12;->a(II)V

    .line 686
    .line 687
    .line 688
    const/16 v2, 0x3f

    .line 689
    .line 690
    sget v11, Lq36;->ic_origin_24dp:I

    .line 691
    .line 692
    invoke-static {v2, v11}, Lc12;->a(II)V

    .line 693
    .line 694
    .line 695
    sget v2, Lq36;->ic_placeholder_24dp:I

    .line 696
    .line 697
    invoke-static {v4, v2}, Lc12;->a(II)V

    .line 698
    .line 699
    .line 700
    const/16 v2, 0x1b

    .line 701
    .line 702
    sget v4, Lq36;->ic_migration_24dp:I

    .line 703
    .line 704
    invoke-static {v2, v4}, Lc12;->a(II)V

    .line 705
    .line 706
    .line 707
    const/16 v2, 0x30

    .line 708
    .line 709
    sget v4, Lq36;->ic_font_24dp:I

    .line 710
    .line 711
    invoke-static {v2, v4}, Lc12;->a(II)V

    .line 712
    .line 713
    .line 714
    invoke-static {}, Lss8;->F()V

    .line 715
    .line 716
    .line 717
    sget-object v2, Lsu/happ/proxyutility/ui/foundation/component/HappTextView;->o0:Lvz7;

    .line 718
    .line 719
    invoke-virtual {v2}, Lvz7;->getValue()Ljava/lang/Object;

    .line 720
    .line 721
    .line 722
    move-result-object v2

    .line 723
    check-cast v2, Lcom/tencent/mmkv/MMKV;

    .line 724
    .line 725
    const-string v4, "pref_font_size"

    .line 726
    .line 727
    const/4 v11, -0x1

    .line 728
    invoke-virtual {v2, v11, v4}, Lcom/tencent/mmkv/MMKV;->e(ILjava/lang/String;)I

    .line 729
    .line 730
    .line 731
    move-result v2

    .line 732
    sget-object v4, Laj2;->X:Lk32;

    .line 733
    .line 734
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 735
    .line 736
    .line 737
    invoke-static {v2}, Lk32;->g(I)Laj2;

    .line 738
    .line 739
    .line 740
    move-result-object v2

    .line 741
    sput-object v2, Lsu/happ/proxyutility/ui/foundation/component/HappTextView;->p0:Laj2;

    .line 742
    .line 743
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 744
    .line 745
    .line 746
    move-result-object v2

    .line 747
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 748
    .line 749
    .line 750
    new-instance v4, Lsu/happ/proxyutility/HappApplication$registerUiAliveReceiver$receiver$1;

    .line 751
    .line 752
    invoke-direct {v4, p0}, Lsu/happ/proxyutility/HappApplication$registerUiAliveReceiver$receiver$1;-><init>(Lsu/happ/proxyutility/HappApplication;)V

    .line 753
    .line 754
    .line 755
    new-instance v11, Landroid/content/IntentFilter;

    .line 756
    .line 757
    const-string v12, "su.happ.proxyutility.action.check.main.process.alive"

    .line 758
    .line 759
    invoke-direct {v11, v12}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 760
    .line 761
    .line 762
    invoke-static {v2, v4, v11, v5}, Lue3;->I(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/Integer;)Landroid/content/Intent;

    .line 763
    .line 764
    .line 765
    invoke-virtual {p0}, Lsu/happ/proxyutility/HappApplication;->b()Lk61;

    .line 766
    .line 767
    .line 768
    move-result-object v2

    .line 769
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 770
    .line 771
    .line 772
    move-result-object v4

    .line 773
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 774
    .line 775
    .line 776
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 777
    .line 778
    .line 779
    iget-boolean v11, v2, Lk61;->a:Z

    .line 780
    .line 781
    const-string v12, "su.happ.proxyutility.action.activity"

    .line 782
    .line 783
    if-nez v11, :cond_3

    .line 784
    .line 785
    iget-object v11, v2, Lk61;->e:Lsu/happ/proxyutility/util/CoreInfoRepository$msgReceiver$1;

    .line 786
    .line 787
    new-instance v13, Landroid/content/IntentFilter;

    .line 788
    .line 789
    invoke-direct {v13, v12}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 790
    .line 791
    .line 792
    invoke-static {v4, v11, v13, v1}, Lue3;->I(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/Integer;)Landroid/content/Intent;

    .line 793
    .line 794
    .line 795
    const-string v11, ""

    .line 796
    .line 797
    const-string v13, "su.happ.proxyutility.action.service"

    .line 798
    .line 799
    :try_start_0
    new-instance v14, Landroid/content/Intent;

    .line 800
    .line 801
    invoke-direct {v14}, Landroid/content/Intent;-><init>()V

    .line 802
    .line 803
    .line 804
    invoke-virtual {v14, v13}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 805
    .line 806
    .line 807
    const-string v13, "su.happ.proxyutility"

    .line 808
    .line 809
    invoke-virtual {v14, v13}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 810
    .line 811
    .line 812
    const-string v13, "key"

    .line 813
    .line 814
    invoke-virtual {v14, v13, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 815
    .line 816
    .line 817
    const-string v13, "content"

    .line 818
    .line 819
    invoke-virtual {v14, v13, v11}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 820
    .line 821
    .line 822
    invoke-virtual {v4, v14}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 823
    .line 824
    .line 825
    goto :goto_0

    .line 826
    :catchall_0
    move-exception v4

    .line 827
    instance-of v11, v4, Ljava/lang/InterruptedException;

    .line 828
    .line 829
    if-nez v11, :cond_2

    .line 830
    .line 831
    instance-of v11, v4, Ljava/util/concurrent/CancellationException;

    .line 832
    .line 833
    if-nez v11, :cond_2

    .line 834
    .line 835
    :goto_0
    iput-boolean v3, v2, Lk61;->a:Z

    .line 836
    .line 837
    goto :goto_1

    .line 838
    :cond_2
    throw v4

    .line 839
    :cond_3
    :goto_1
    :try_start_1
    invoke-static {p0}, Lxa2;->f(Landroid/content/Context;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 840
    .line 841
    .line 842
    goto :goto_2

    .line 843
    :catchall_1
    move-exception v2

    .line 844
    instance-of v4, v2, Ljava/lang/InterruptedException;

    .line 845
    .line 846
    if-nez v4, :cond_16

    .line 847
    .line 848
    instance-of v4, v2, Ljava/util/concurrent/CancellationException;

    .line 849
    .line 850
    if-nez v4, :cond_16

    .line 851
    .line 852
    :goto_2
    new-instance v2, Lkp5;

    .line 853
    .line 854
    invoke-direct {v2, v6}, Lkp5;-><init>(B)V

    .line 855
    .line 856
    .line 857
    new-instance v4, Lio/sentry/android/core/v;

    .line 858
    .line 859
    invoke-direct {v4, v8}, Lio/sentry/android/core/v;-><init>(B)V

    .line 860
    .line 861
    .line 862
    invoke-static {p0, v4, v2}, Lio/sentry/android/core/s1;->b(Landroid/content/Context;Lio/sentry/android/core/v;Lio/sentry/u4;)V

    .line 863
    .line 864
    .line 865
    invoke-virtual {p0}, Lsu/happ/proxyutility/HappApplication;->j()Lxy0;

    .line 866
    .line 867
    .line 868
    move-result-object v2

    .line 869
    invoke-static {p0, v2}, Lx39;->w0(Landroid/content/Context;Lxy0;)V

    .line 870
    .line 871
    .line 872
    sget-object v2, Lev7;->a:Lvz7;

    .line 873
    .line 874
    invoke-static {}, Lk32;->i()Lsu/happ/proxyutility/HappApplication;

    .line 875
    .line 876
    .line 877
    move-result-object v2

    .line 878
    invoke-static {v2}, Lpd6;->c(Landroid/content/Context;)Lpd6;

    .line 879
    .line 880
    .line 881
    move-result-object v2

    .line 882
    new-instance v4, Leb5;

    .line 883
    .line 884
    sget-object v6, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    .line 885
    .line 886
    const-class v8, Lsu/happ/proxyutility/service/SubscriptionUpdater$ExpireReminderTask;

    .line 887
    .line 888
    const-wide/16 v13, 0x1

    .line 889
    .line 890
    invoke-direct {v4, v8, v13, v14, v6}, Leb5;-><init>(Ljava/lang/Class;JLjava/util/concurrent/TimeUnit;)V

    .line 891
    .line 892
    .line 893
    sget-object v6, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    .line 894
    .line 895
    invoke-virtual {v4, v13, v14, v6}, Lwb4;->e(JLjava/util/concurrent/TimeUnit;)V

    .line 896
    .line 897
    .line 898
    invoke-virtual {v4}, Lwb4;->a()Lg49;

    .line 899
    .line 900
    .line 901
    move-result-object v4

    .line 902
    check-cast v4, Lfl5;

    .line 903
    .line 904
    const-string v6, "expire_reminder"

    .line 905
    .line 906
    invoke-virtual {v2, v6, v4}, Lpd6;->b(Ljava/lang/String;Lfl5;)Lwy7;

    .line 907
    .line 908
    .line 909
    iget-object v2, p0, Lsu/happ/proxyutility/HappApplication;->L0:Lu5;

    .line 910
    .line 911
    invoke-virtual {p0, v2}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 912
    .line 913
    .line 914
    sget-object v2, Lsu/happ/proxyutility/receiver/WidgetProvider;->a:Lq15;

    .line 915
    .line 916
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 917
    .line 918
    .line 919
    move-result-object v2

    .line 920
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 921
    .line 922
    .line 923
    invoke-static {v2, v5}, Ldt7;->f(Landroid/content/Context;Ljava/lang/Integer;)V

    .line 924
    .line 925
    .line 926
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 927
    .line 928
    .line 929
    move-result-object v2

    .line 930
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 931
    .line 932
    .line 933
    move-result v4

    .line 934
    const-string v6, "activity"

    .line 935
    .line 936
    invoke-virtual {p0, v6}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 937
    .line 938
    .line 939
    move-result-object v8

    .line 940
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 941
    .line 942
    .line 943
    check-cast v8, Landroid/app/ActivityManager;

    .line 944
    .line 945
    invoke-virtual {v8}, Landroid/app/ActivityManager;->getRunningAppProcesses()Ljava/util/List;

    .line 946
    .line 947
    .line 948
    move-result-object v8

    .line 949
    if-eqz v8, :cond_6

    .line 950
    .line 951
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 952
    .line 953
    .line 954
    move-result-object v8

    .line 955
    :cond_4
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 956
    .line 957
    .line 958
    move-result v11

    .line 959
    if-eqz v11, :cond_5

    .line 960
    .line 961
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 962
    .line 963
    .line 964
    move-result-object v11

    .line 965
    move-object v13, v11

    .line 966
    check-cast v13, Landroid/app/ActivityManager$RunningAppProcessInfo;

    .line 967
    .line 968
    iget v13, v13, Landroid/app/ActivityManager$RunningAppProcessInfo;->pid:I

    .line 969
    .line 970
    if-ne v13, v4, :cond_4

    .line 971
    .line 972
    goto :goto_3

    .line 973
    :cond_5
    move-object v11, v5

    .line 974
    :goto_3
    check-cast v11, Landroid/app/ActivityManager$RunningAppProcessInfo;

    .line 975
    .line 976
    if-eqz v11, :cond_6

    .line 977
    .line 978
    iget-object v4, v11, Landroid/app/ActivityManager$RunningAppProcessInfo;->processName:Ljava/lang/String;

    .line 979
    .line 980
    goto :goto_4

    .line 981
    :cond_6
    move-object v4, v5

    .line 982
    :goto_4
    invoke-static {v2, v4}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 983
    .line 984
    .line 985
    move-result v2

    .line 986
    if-eqz v2, :cond_7

    .line 987
    .line 988
    sget-object v2, Lsu/happ/proxyutility/HappApplication;->N0:Lm51;

    .line 989
    .line 990
    sget-object v4, Lye1;->Z:Lye1;

    .line 991
    .line 992
    new-instance v8, Lr5;

    .line 993
    .line 994
    invoke-direct {v8, p0, v5, v9}, Lr5;-><init>(Ljava/lang/Object;Lq51;B)V

    .line 995
    .line 996
    .line 997
    invoke-static {v2, v4, v8, v0}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 998
    .line 999
    .line 1000
    :cond_7
    sget-object v2, Lsu/happ/proxyutility/HappApplication;->N0:Lm51;

    .line 1001
    .line 1002
    sget-object v4, Lye1;->Z:Lye1;

    .line 1003
    .line 1004
    new-instance v8, Luv2;

    .line 1005
    .line 1006
    invoke-direct {v8, p0, v5, v7}, Luv2;-><init>(Lsu/happ/proxyutility/HappApplication;Lq51;B)V

    .line 1007
    .line 1008
    .line 1009
    invoke-static {v2, v4, v8, v0}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 1010
    .line 1011
    .line 1012
    new-instance v8, Luv2;

    .line 1013
    .line 1014
    invoke-direct {v8, p0, v5, v3}, Luv2;-><init>(Lsu/happ/proxyutility/HappApplication;Lq51;B)V

    .line 1015
    .line 1016
    .line 1017
    invoke-static {v2, v4, v8, v0}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 1018
    .line 1019
    .line 1020
    iget-object v0, p0, Lsu/happ/proxyutility/HappApplication;->X:Lvz7;

    .line 1021
    .line 1022
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 1023
    .line 1024
    .line 1025
    move-result-object v0

    .line 1026
    check-cast v0, Lan7;

    .line 1027
    .line 1028
    iget-object v2, v0, Lan7;->a:Lsu/happ/proxyutility/HappApplication;

    .line 1029
    .line 1030
    iget-object v0, v0, Lan7;->d:Lsu/happ/proxyutility/util/SubBlacklistUtil$mMsgReceiver$1;

    .line 1031
    .line 1032
    new-instance v3, Landroid/content/IntentFilter;

    .line 1033
    .line 1034
    invoke-direct {v3, v12}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 1035
    .line 1036
    .line 1037
    invoke-static {v2, v0, v3, v1}, Lue3;->I(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;Ljava/lang/Integer;)Landroid/content/Intent;

    .line 1038
    .line 1039
    .line 1040
    iget-object v0, p0, Lsu/happ/proxyutility/HappApplication;->Y:Lvz7;

    .line 1041
    .line 1042
    invoke-virtual {v0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 1043
    .line 1044
    .line 1045
    move-result-object v0

    .line 1046
    check-cast v0, Lvp8;

    .line 1047
    .line 1048
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1049
    .line 1050
    .line 1051
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 1052
    .line 1053
    .line 1054
    move-result-object v0

    .line 1055
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 1056
    .line 1057
    .line 1058
    move-result v1

    .line 1059
    invoke-virtual {p0, v6}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 1060
    .line 1061
    .line 1062
    move-result-object v2

    .line 1063
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1064
    .line 1065
    .line 1066
    check-cast v2, Landroid/app/ActivityManager;

    .line 1067
    .line 1068
    invoke-virtual {v2}, Landroid/app/ActivityManager;->getRunningAppProcesses()Ljava/util/List;

    .line 1069
    .line 1070
    .line 1071
    move-result-object v2

    .line 1072
    if-eqz v2, :cond_a

    .line 1073
    .line 1074
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1075
    .line 1076
    .line 1077
    move-result-object v2

    .line 1078
    :cond_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1079
    .line 1080
    .line 1081
    move-result v3

    .line 1082
    if-eqz v3, :cond_9

    .line 1083
    .line 1084
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1085
    .line 1086
    .line 1087
    move-result-object v3

    .line 1088
    move-object v4, v3

    .line 1089
    check-cast v4, Landroid/app/ActivityManager$RunningAppProcessInfo;

    .line 1090
    .line 1091
    iget v4, v4, Landroid/app/ActivityManager$RunningAppProcessInfo;->pid:I

    .line 1092
    .line 1093
    if-ne v4, v1, :cond_8

    .line 1094
    .line 1095
    goto :goto_5

    .line 1096
    :cond_9
    move-object v3, v5

    .line 1097
    :goto_5
    check-cast v3, Landroid/app/ActivityManager$RunningAppProcessInfo;

    .line 1098
    .line 1099
    if-eqz v3, :cond_a

    .line 1100
    .line 1101
    iget-object v5, v3, Landroid/app/ActivityManager$RunningAppProcessInfo;->processName:Ljava/lang/String;

    .line 1102
    .line 1103
    :cond_a
    invoke-static {v0, v5}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1104
    .line 1105
    .line 1106
    move-result v0

    .line 1107
    if-eqz v0, :cond_15

    .line 1108
    .line 1109
    sget-object v0, Lkw4;->a:Lkw4;

    .line 1110
    .line 1111
    invoke-static {}, Lkw4;->c()Ljava/util/List;

    .line 1112
    .line 1113
    .line 1114
    move-result-object v0

    .line 1115
    invoke-static {v0}, Lwv0;->c1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 1116
    .line 1117
    .line 1118
    move-result-object v0

    .line 1119
    sget-object v1, Lkw4;->d:Lvz7;

    .line 1120
    .line 1121
    invoke-virtual {v1}, Lvz7;->getValue()Ljava/lang/Object;

    .line 1122
    .line 1123
    .line 1124
    move-result-object v2

    .line 1125
    check-cast v2, Lcom/tencent/mmkv/MMKV;

    .line 1126
    .line 1127
    invoke-static {v2, v0}, Lkw4;->s(Lcom/tencent/mmkv/MMKV;Ljava/util/Set;)V

    .line 1128
    .line 1129
    .line 1130
    invoke-static {}, Lkw4;->i()Lcom/tencent/mmkv/MMKV;

    .line 1131
    .line 1132
    .line 1133
    move-result-object v2

    .line 1134
    invoke-static {v2, v0}, Lkw4;->s(Lcom/tencent/mmkv/MMKV;Ljava/util/Set;)V

    .line 1135
    .line 1136
    .line 1137
    invoke-static {}, Lkw4;->j()Lcom/tencent/mmkv/MMKV;

    .line 1138
    .line 1139
    .line 1140
    move-result-object v2

    .line 1141
    invoke-static {v2, v0}, Lkw4;->s(Lcom/tencent/mmkv/MMKV;Ljava/util/Set;)V

    .line 1142
    .line 1143
    .line 1144
    invoke-static {}, Lkw4;->l()Lcom/tencent/mmkv/MMKV;

    .line 1145
    .line 1146
    .line 1147
    move-result-object v0

    .line 1148
    const-string v2, "trim_mmkv_timestamp"

    .line 1149
    .line 1150
    invoke-virtual {v0, v2}, Lcom/tencent/mmkv/MMKV;->g(Ljava/lang/String;)J

    .line 1151
    .line 1152
    .line 1153
    move-result-wide v3

    .line 1154
    sget-object v0, Lwe3;->a:Lmu0;

    .line 1155
    .line 1156
    invoke-interface {v0}, Lmu0;->a()Lte3;

    .line 1157
    .line 1158
    .line 1159
    move-result-object v0

    .line 1160
    invoke-virtual {v0}, Lte3;->a()J

    .line 1161
    .line 1162
    .line 1163
    move-result-wide v5

    .line 1164
    sub-long v3, v5, v3

    .line 1165
    .line 1166
    const-wide/32 v8, 0x14997000

    .line 1167
    .line 1168
    .line 1169
    cmp-long v0, v3, v8

    .line 1170
    .line 1171
    if-lez v0, :cond_c

    .line 1172
    .line 1173
    :try_start_2
    invoke-virtual {v1}, Lvz7;->getValue()Ljava/lang/Object;

    .line 1174
    .line 1175
    .line 1176
    move-result-object v0

    .line 1177
    check-cast v0, Lcom/tencent/mmkv/MMKV;

    .line 1178
    .line 1179
    invoke-virtual {v0}, Lcom/tencent/mmkv/MMKV;->trim()V

    .line 1180
    .line 1181
    .line 1182
    invoke-static {}, Lkw4;->i()Lcom/tencent/mmkv/MMKV;

    .line 1183
    .line 1184
    .line 1185
    move-result-object v0

    .line 1186
    invoke-virtual {v0}, Lcom/tencent/mmkv/MMKV;->trim()V

    .line 1187
    .line 1188
    .line 1189
    invoke-static {}, Lkw4;->j()Lcom/tencent/mmkv/MMKV;

    .line 1190
    .line 1191
    .line 1192
    move-result-object v0

    .line 1193
    invoke-virtual {v0}, Lcom/tencent/mmkv/MMKV;->trim()V

    .line 1194
    .line 1195
    .line 1196
    sget-object v0, Ldn8;->a:Ldn8;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 1197
    .line 1198
    goto :goto_6

    .line 1199
    :catchall_2
    move-exception v0

    .line 1200
    instance-of v1, v0, Ljava/lang/InterruptedException;

    .line 1201
    .line 1202
    if-nez v1, :cond_b

    .line 1203
    .line 1204
    instance-of v1, v0, Ljava/util/concurrent/CancellationException;

    .line 1205
    .line 1206
    if-nez v1, :cond_b

    .line 1207
    .line 1208
    new-instance v1, Lrj6;

    .line 1209
    .line 1210
    invoke-direct {v1, v0}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 1211
    .line 1212
    .line 1213
    move-object v0, v1

    .line 1214
    :goto_6
    nop

    .line 1215
    instance-of v1, v0, Lrj6;

    .line 1216
    .line 1217
    if-nez v1, :cond_c

    .line 1218
    .line 1219
    check-cast v0, Ldn8;

    .line 1220
    .line 1221
    invoke-static {}, Lkw4;->l()Lcom/tencent/mmkv/MMKV;

    .line 1222
    .line 1223
    .line 1224
    move-result-object v0

    .line 1225
    invoke-virtual {v0, v5, v6, v2}, Lcom/tencent/mmkv/MMKV;->m(JLjava/lang/String;)V

    .line 1226
    .line 1227
    .line 1228
    goto :goto_7

    .line 1229
    :cond_b
    throw v0

    .line 1230
    :cond_c
    :goto_7
    invoke-virtual {p0}, Lsu/happ/proxyutility/HappApplication;->f()Lmn6;

    .line 1231
    .line 1232
    .line 1233
    move-result-object p0

    .line 1234
    iget-object p0, p0, Lmn6;->g:Lh76;

    .line 1235
    .line 1236
    iget-object p0, p0, Lh76;->X:Loh7;

    .line 1237
    .line 1238
    invoke-virtual {p0}, Loh7;->getValue()Ljava/lang/Object;

    .line 1239
    .line 1240
    .line 1241
    move-result-object p0

    .line 1242
    check-cast p0, Lcm5;

    .line 1243
    .line 1244
    check-cast p0, Lb2;

    .line 1245
    .line 1246
    invoke-virtual {p0}, Lb2;->e()Ljava/util/Collection;

    .line 1247
    .line 1248
    .line 1249
    move-result-object p0

    .line 1250
    new-instance v0, Ljava/util/ArrayList;

    .line 1251
    .line 1252
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1253
    .line 1254
    .line 1255
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1256
    .line 1257
    .line 1258
    move-result-object p0

    .line 1259
    :goto_8
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 1260
    .line 1261
    .line 1262
    move-result v1

    .line 1263
    if-eqz v1, :cond_e

    .line 1264
    .line 1265
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1266
    .line 1267
    .line 1268
    move-result-object v1

    .line 1269
    check-cast v1, Lb83;

    .line 1270
    .line 1271
    new-instance v2, Ljava/util/ArrayList;

    .line 1272
    .line 1273
    invoke-static {v1, v10}, Lxv0;->Z(Ljava/lang/Iterable;I)I

    .line 1274
    .line 1275
    .line 1276
    move-result v3

    .line 1277
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 1278
    .line 1279
    .line 1280
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1281
    .line 1282
    .line 1283
    move-result-object v1

    .line 1284
    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1285
    .line 1286
    .line 1287
    move-result v3

    .line 1288
    if-eqz v3, :cond_d

    .line 1289
    .line 1290
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1291
    .line 1292
    .line 1293
    move-result-object v3

    .line 1294
    check-cast v3, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 1295
    .line 1296
    invoke-virtual {v3}, Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;->c()Ljava/lang/String;

    .line 1297
    .line 1298
    .line 1299
    move-result-object v3

    .line 1300
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1301
    .line 1302
    .line 1303
    goto :goto_9

    .line 1304
    :cond_d
    invoke-static {v0, v2}, Lbw0;->d0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 1305
    .line 1306
    .line 1307
    goto :goto_8

    .line 1308
    :cond_e
    invoke-static {v0}, Lwv0;->c1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 1309
    .line 1310
    .line 1311
    move-result-object p0

    .line 1312
    new-instance v0, Ljava/io/File;

    .line 1313
    .line 1314
    sget-object v1, Lss8;->a:Lss8;

    .line 1315
    .line 1316
    invoke-static {}, Lmn6;->j()Landroid/content/Context;

    .line 1317
    .line 1318
    .line 1319
    move-result-object v1

    .line 1320
    invoke-static {v1}, Lss8;->L(Landroid/content/Context;)Ljava/lang/String;

    .line 1321
    .line 1322
    .line 1323
    move-result-object v1

    .line 1324
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 1325
    .line 1326
    .line 1327
    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 1328
    .line 1329
    .line 1330
    move-result-object v0

    .line 1331
    if-eqz v0, :cond_11

    .line 1332
    .line 1333
    new-instance v1, Ljava/util/ArrayList;

    .line 1334
    .line 1335
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1336
    .line 1337
    .line 1338
    array-length v2, v0

    .line 1339
    :goto_a
    if-ge v7, v2, :cond_12

    .line 1340
    .line 1341
    aget-object v3, v0, v7

    .line 1342
    .line 1343
    invoke-virtual {v3}, Ljava/io/File;->isDirectory()Z

    .line 1344
    .line 1345
    .line 1346
    move-result v4

    .line 1347
    if-eqz v4, :cond_10

    .line 1348
    .line 1349
    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 1350
    .line 1351
    .line 1352
    move-result-object v4

    .line 1353
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1354
    .line 1355
    .line 1356
    :try_start_3
    invoke-static {v4}, Ljava/util/UUID;->fromString(Ljava/lang/String;)Ljava/util/UUID;

    .line 1357
    .line 1358
    .line 1359
    move-result-object v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 1360
    goto :goto_b

    .line 1361
    :catchall_3
    move-exception v4

    .line 1362
    instance-of v5, v4, Ljava/lang/InterruptedException;

    .line 1363
    .line 1364
    if-nez v5, :cond_f

    .line 1365
    .line 1366
    instance-of v5, v4, Ljava/util/concurrent/CancellationException;

    .line 1367
    .line 1368
    if-nez v5, :cond_f

    .line 1369
    .line 1370
    new-instance v5, Lrj6;

    .line 1371
    .line 1372
    invoke-direct {v5, v4}, Lrj6;-><init>(Ljava/lang/Throwable;)V

    .line 1373
    .line 1374
    .line 1375
    move-object v4, v5

    .line 1376
    :goto_b
    instance-of v4, v4, Lrj6;

    .line 1377
    .line 1378
    if-nez v4, :cond_10

    .line 1379
    .line 1380
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1381
    .line 1382
    .line 1383
    goto :goto_c

    .line 1384
    :cond_f
    throw v4

    .line 1385
    :cond_10
    :goto_c
    add-int/lit8 v7, v7, 0x1

    .line 1386
    .line 1387
    goto :goto_a

    .line 1388
    :cond_11
    sget-object v1, Ld02;->X:Ld02;

    .line 1389
    .line 1390
    :cond_12
    new-instance v0, Ljava/util/ArrayList;

    .line 1391
    .line 1392
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1393
    .line 1394
    .line 1395
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1396
    .line 1397
    .line 1398
    move-result-object v1

    .line 1399
    :cond_13
    :goto_d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1400
    .line 1401
    .line 1402
    move-result v2

    .line 1403
    if-eqz v2, :cond_14

    .line 1404
    .line 1405
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1406
    .line 1407
    .line 1408
    move-result-object v2

    .line 1409
    move-object v3, v2

    .line 1410
    check-cast v3, Ljava/io/File;

    .line 1411
    .line 1412
    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 1413
    .line 1414
    .line 1415
    move-result-object v3

    .line 1416
    invoke-interface {p0, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1417
    .line 1418
    .line 1419
    move-result v3

    .line 1420
    if-nez v3, :cond_13

    .line 1421
    .line 1422
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1423
    .line 1424
    .line 1425
    goto :goto_d

    .line 1426
    :cond_14
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1427
    .line 1428
    .line 1429
    move-result-object p0

    .line 1430
    :goto_e
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 1431
    .line 1432
    .line 1433
    move-result v0

    .line 1434
    if-eqz v0, :cond_15

    .line 1435
    .line 1436
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1437
    .line 1438
    .line 1439
    move-result-object v0

    .line 1440
    check-cast v0, Ljava/io/File;

    .line 1441
    .line 1442
    invoke-static {v0}, Lda2;->R(Ljava/io/File;)V

    .line 1443
    .line 1444
    .line 1445
    goto :goto_e

    .line 1446
    :cond_15
    return-void

    .line 1447
    :cond_16
    throw v2
.end method
