.class public Lgx5;
.super Lqt8;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lfx5;


# instance fields
.field public A0:Lhx5;

.field public B0:Ltx5;

.field public C0:Ly82;

.field public D0:Ly82;

.field public final j0:Z

.field public k0:Lse4;

.field public l0:Ldn2;

.field public final m0:Lfx4;

.field public n0:Lfl1;

.field public o0:Ljava/util/Collection;

.field public final p0:Lfx5;

.field public final q0:I

.field public final r0:Z

.field public final s0:Z

.field public final t0:Z

.field public final u0:Z

.field public final v0:Z

.field public w0:Ljava/util/List;

.field public x0:Li44;

.field public y0:Li44;

.field public z0:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Led1;Lfx5;Lsm;Lfx4;Lfl1;ZLv15;ILke7;ZZZZZ)V
    .locals 8

    .line 1
    move/from16 v0, p8

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz p1, :cond_7

    .line 5
    .line 6
    if-eqz p3, :cond_6

    .line 7
    .line 8
    if-eqz p4, :cond_5

    .line 9
    .line 10
    if-eqz p5, :cond_4

    .line 11
    .line 12
    if-eqz p7, :cond_3

    .line 13
    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    if-eqz p9, :cond_1

    .line 17
    .line 18
    const/4 v6, 0x0

    .line 19
    move-object v2, p0

    .line 20
    move-object v3, p1

    .line 21
    move-object v4, p3

    .line 22
    move-object v5, p7

    .line 23
    move-object/from16 v7, p9

    .line 24
    .line 25
    invoke-direct/range {v2 .. v7}, Lqt8;-><init>(Led1;Lsm;Lv15;Lt14;Lke7;)V

    .line 26
    .line 27
    .line 28
    iput-boolean p6, p0, Lgx5;->j0:Z

    .line 29
    .line 30
    iput-object v1, p0, Lgx5;->o0:Ljava/util/Collection;

    .line 31
    .line 32
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 33
    .line 34
    iput-object p1, p0, Lgx5;->w0:Ljava/util/List;

    .line 35
    .line 36
    iput-object p4, p0, Lgx5;->m0:Lfx4;

    .line 37
    .line 38
    iput-object p5, p0, Lgx5;->n0:Lfl1;

    .line 39
    .line 40
    if-nez p2, :cond_0

    .line 41
    .line 42
    move-object p2, p0

    .line 43
    :cond_0
    iput-object p2, p0, Lgx5;->p0:Lfx5;

    .line 44
    .line 45
    iput v0, p0, Lgx5;->q0:I

    .line 46
    .line 47
    move/from16 p1, p10

    .line 48
    .line 49
    iput-boolean p1, p0, Lgx5;->r0:Z

    .line 50
    .line 51
    move/from16 p1, p11

    .line 52
    .line 53
    iput-boolean p1, p0, Lgx5;->s0:Z

    .line 54
    .line 55
    move/from16 p1, p12

    .line 56
    .line 57
    iput-boolean p1, p0, Lgx5;->t0:Z

    .line 58
    .line 59
    move/from16 p1, p13

    .line 60
    .line 61
    iput-boolean p1, p0, Lgx5;->u0:Z

    .line 62
    .line 63
    move/from16 p1, p14

    .line 64
    .line 65
    iput-boolean p1, p0, Lgx5;->v0:Z

    .line 66
    .line 67
    return-void

    .line 68
    :cond_1
    const/4 p0, 0x6

    .line 69
    invoke-static {p0}, Lgx5;->B(I)V

    .line 70
    .line 71
    .line 72
    throw v1

    .line 73
    :cond_2
    const/4 p0, 0x5

    .line 74
    invoke-static {p0}, Lgx5;->B(I)V

    .line 75
    .line 76
    .line 77
    throw v1

    .line 78
    :cond_3
    const/4 p0, 0x4

    .line 79
    invoke-static {p0}, Lgx5;->B(I)V

    .line 80
    .line 81
    .line 82
    throw v1

    .line 83
    :cond_4
    const/4 p0, 0x3

    .line 84
    invoke-static {p0}, Lgx5;->B(I)V

    .line 85
    .line 86
    .line 87
    throw v1

    .line 88
    :cond_5
    const/4 p0, 0x2

    .line 89
    invoke-static {p0}, Lgx5;->B(I)V

    .line 90
    .line 91
    .line 92
    throw v1

    .line 93
    :cond_6
    const/4 p0, 0x1

    .line 94
    invoke-static {p0}, Lgx5;->B(I)V

    .line 95
    .line 96
    .line 97
    throw v1

    .line 98
    :cond_7
    const/4 p0, 0x0

    .line 99
    invoke-static {p0}, Lgx5;->B(I)V

    .line 100
    .line 101
    .line 102
    throw v1
.end method

.method public static synthetic B(I)V
    .locals 11

    .line 1
    const/16 v0, 0x2a

    .line 2
    .line 3
    const/16 v1, 0x29

    .line 4
    .line 5
    const/16 v2, 0x27

    .line 6
    .line 7
    const/16 v3, 0x26

    .line 8
    .line 9
    const/16 v4, 0x1c

    .line 10
    .line 11
    if-eq p0, v4, :cond_0

    .line 12
    .line 13
    if-eq p0, v3, :cond_0

    .line 14
    .line 15
    if-eq p0, v2, :cond_0

    .line 16
    .line 17
    if-eq p0, v1, :cond_0

    .line 18
    .line 19
    if-eq p0, v0, :cond_0

    .line 20
    .line 21
    packed-switch p0, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    const-string v5, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    :pswitch_0
    const-string v5, "@NotNull method %s.%s must not return null"

    .line 28
    .line 29
    :goto_0
    const/4 v6, 0x2

    .line 30
    if-eq p0, v4, :cond_1

    .line 31
    .line 32
    if-eq p0, v3, :cond_1

    .line 33
    .line 34
    if-eq p0, v2, :cond_1

    .line 35
    .line 36
    if-eq p0, v1, :cond_1

    .line 37
    .line 38
    if-eq p0, v0, :cond_1

    .line 39
    .line 40
    packed-switch p0, :pswitch_data_1

    .line 41
    .line 42
    .line 43
    const/4 v7, 0x3

    .line 44
    goto :goto_1

    .line 45
    :cond_1
    :pswitch_1
    move v7, v6

    .line 46
    :goto_1
    new-array v7, v7, [Ljava/lang/Object;

    .line 47
    .line 48
    const-string v8, "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl"

    .line 49
    .line 50
    const/4 v9, 0x0

    .line 51
    packed-switch p0, :pswitch_data_2

    .line 52
    .line 53
    .line 54
    :pswitch_2
    const-string v10, "containingDeclaration"

    .line 55
    .line 56
    aput-object v10, v7, v9

    .line 57
    .line 58
    goto/16 :goto_2

    .line 59
    .line 60
    :pswitch_3
    const-string v10, "overriddenDescriptors"

    .line 61
    .line 62
    aput-object v10, v7, v9

    .line 63
    .line 64
    goto/16 :goto_2

    .line 65
    .line 66
    :pswitch_4
    const-string v10, "newName"

    .line 67
    .line 68
    aput-object v10, v7, v9

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :pswitch_5
    const-string v10, "newVisibility"

    .line 72
    .line 73
    aput-object v10, v7, v9

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :pswitch_6
    const-string v10, "newModality"

    .line 77
    .line 78
    aput-object v10, v7, v9

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :pswitch_7
    const-string v10, "newOwner"

    .line 82
    .line 83
    aput-object v10, v7, v9

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :pswitch_8
    const-string v10, "accessorDescriptor"

    .line 87
    .line 88
    aput-object v10, v7, v9

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :pswitch_9
    const-string v10, "substitutor"

    .line 92
    .line 93
    aput-object v10, v7, v9

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :pswitch_a
    const-string v10, "copyConfiguration"

    .line 97
    .line 98
    aput-object v10, v7, v9

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :pswitch_b
    const-string v10, "originalSubstitutor"

    .line 102
    .line 103
    aput-object v10, v7, v9

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :pswitch_c
    aput-object v8, v7, v9

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :pswitch_d
    const-string v10, "contextReceiverParameters"

    .line 110
    .line 111
    aput-object v10, v7, v9

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :pswitch_e
    const-string v10, "typeParameters"

    .line 115
    .line 116
    aput-object v10, v7, v9

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :pswitch_f
    const-string v10, "outType"

    .line 120
    .line 121
    aput-object v10, v7, v9

    .line 122
    .line 123
    goto :goto_2

    .line 124
    :pswitch_10
    const-string v10, "inType"

    .line 125
    .line 126
    aput-object v10, v7, v9

    .line 127
    .line 128
    goto :goto_2

    .line 129
    :pswitch_11
    const-string v10, "source"

    .line 130
    .line 131
    aput-object v10, v7, v9

    .line 132
    .line 133
    goto :goto_2

    .line 134
    :pswitch_12
    const-string v10, "kind"

    .line 135
    .line 136
    aput-object v10, v7, v9

    .line 137
    .line 138
    goto :goto_2

    .line 139
    :pswitch_13
    const-string v10, "name"

    .line 140
    .line 141
    aput-object v10, v7, v9

    .line 142
    .line 143
    goto :goto_2

    .line 144
    :pswitch_14
    const-string v10, "visibility"

    .line 145
    .line 146
    aput-object v10, v7, v9

    .line 147
    .line 148
    goto :goto_2

    .line 149
    :pswitch_15
    const-string v10, "modality"

    .line 150
    .line 151
    aput-object v10, v7, v9

    .line 152
    .line 153
    goto :goto_2

    .line 154
    :pswitch_16
    const-string v10, "annotations"

    .line 155
    .line 156
    aput-object v10, v7, v9

    .line 157
    .line 158
    :goto_2
    const/4 v9, 0x1

    .line 159
    if-eq p0, v4, :cond_6

    .line 160
    .line 161
    if-eq p0, v3, :cond_5

    .line 162
    .line 163
    if-eq p0, v2, :cond_4

    .line 164
    .line 165
    if-eq p0, v1, :cond_3

    .line 166
    .line 167
    if-eq p0, v0, :cond_2

    .line 168
    .line 169
    packed-switch p0, :pswitch_data_3

    .line 170
    .line 171
    .line 172
    aput-object v8, v7, v9

    .line 173
    .line 174
    goto :goto_3

    .line 175
    :pswitch_17
    const-string v8, "getAccessors"

    .line 176
    .line 177
    aput-object v8, v7, v9

    .line 178
    .line 179
    goto :goto_3

    .line 180
    :pswitch_18
    const-string v8, "getVisibility"

    .line 181
    .line 182
    aput-object v8, v7, v9

    .line 183
    .line 184
    goto :goto_3

    .line 185
    :pswitch_19
    const-string v8, "getModality"

    .line 186
    .line 187
    aput-object v8, v7, v9

    .line 188
    .line 189
    goto :goto_3

    .line 190
    :pswitch_1a
    const-string v8, "getReturnType"

    .line 191
    .line 192
    aput-object v8, v7, v9

    .line 193
    .line 194
    goto :goto_3

    .line 195
    :pswitch_1b
    const-string v8, "getContextReceiverParameters"

    .line 196
    .line 197
    aput-object v8, v7, v9

    .line 198
    .line 199
    goto :goto_3

    .line 200
    :pswitch_1c
    const-string v8, "getTypeParameters"

    .line 201
    .line 202
    aput-object v8, v7, v9

    .line 203
    .line 204
    goto :goto_3

    .line 205
    :cond_2
    const-string v8, "copy"

    .line 206
    .line 207
    aput-object v8, v7, v9

    .line 208
    .line 209
    goto :goto_3

    .line 210
    :cond_3
    const-string v8, "getOverriddenDescriptors"

    .line 211
    .line 212
    aput-object v8, v7, v9

    .line 213
    .line 214
    goto :goto_3

    .line 215
    :cond_4
    const-string v8, "getKind"

    .line 216
    .line 217
    aput-object v8, v7, v9

    .line 218
    .line 219
    goto :goto_3

    .line 220
    :cond_5
    const-string v8, "getOriginal"

    .line 221
    .line 222
    aput-object v8, v7, v9

    .line 223
    .line 224
    goto :goto_3

    .line 225
    :cond_6
    const-string v8, "getSourceToUseForCopy"

    .line 226
    .line 227
    aput-object v8, v7, v9

    .line 228
    .line 229
    :goto_3
    packed-switch p0, :pswitch_data_4

    .line 230
    .line 231
    .line 232
    const-string v8, "<init>"

    .line 233
    .line 234
    aput-object v8, v7, v6

    .line 235
    .line 236
    goto :goto_4

    .line 237
    :pswitch_1d
    const-string v8, "setOverriddenDescriptors"

    .line 238
    .line 239
    aput-object v8, v7, v6

    .line 240
    .line 241
    goto :goto_4

    .line 242
    :pswitch_1e
    const-string v8, "createSubstitutedCopy"

    .line 243
    .line 244
    aput-object v8, v7, v6

    .line 245
    .line 246
    goto :goto_4

    .line 247
    :pswitch_1f
    const-string v8, "getSubstitutedInitialSignatureDescriptor"

    .line 248
    .line 249
    aput-object v8, v7, v6

    .line 250
    .line 251
    goto :goto_4

    .line 252
    :pswitch_20
    const-string v8, "doSubstitute"

    .line 253
    .line 254
    aput-object v8, v7, v6

    .line 255
    .line 256
    goto :goto_4

    .line 257
    :pswitch_21
    const-string v8, "substitute"

    .line 258
    .line 259
    aput-object v8, v7, v6

    .line 260
    .line 261
    goto :goto_4

    .line 262
    :pswitch_22
    const-string v8, "setVisibility"

    .line 263
    .line 264
    aput-object v8, v7, v6

    .line 265
    .line 266
    goto :goto_4

    .line 267
    :pswitch_23
    const-string v8, "setType"

    .line 268
    .line 269
    aput-object v8, v7, v6

    .line 270
    .line 271
    goto :goto_4

    .line 272
    :pswitch_24
    const-string v8, "setInType"

    .line 273
    .line 274
    aput-object v8, v7, v6

    .line 275
    .line 276
    goto :goto_4

    .line 277
    :pswitch_25
    const-string v8, "create"

    .line 278
    .line 279
    aput-object v8, v7, v6

    .line 280
    .line 281
    :goto_4
    :pswitch_26
    invoke-static {v5, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v5

    .line 285
    if-eq p0, v4, :cond_7

    .line 286
    .line 287
    if-eq p0, v3, :cond_7

    .line 288
    .line 289
    if-eq p0, v2, :cond_7

    .line 290
    .line 291
    if-eq p0, v1, :cond_7

    .line 292
    .line 293
    if-eq p0, v0, :cond_7

    .line 294
    .line 295
    packed-switch p0, :pswitch_data_5

    .line 296
    .line 297
    .line 298
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 299
    .line 300
    invoke-direct {p0, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    goto :goto_5

    .line 304
    :cond_7
    :pswitch_27
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 305
    .line 306
    invoke-direct {p0, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    :goto_5
    throw p0

    .line 310
    nop

    .line 311
    :pswitch_data_0
    .packed-switch 0x15
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    :pswitch_data_1
    .packed-switch 0x15
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch

    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_2
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_14
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_b
        :pswitch_c
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_12
        :pswitch_4
        :pswitch_11
        :pswitch_c
        :pswitch_c
        :pswitch_3
        :pswitch_c
        :pswitch_c
    .end packed-switch

    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    :pswitch_data_3
    .packed-switch 0x15
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x7
        :pswitch_25
        :pswitch_25
        :pswitch_25
        :pswitch_25
        :pswitch_25
        :pswitch_25
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_23
        :pswitch_23
        :pswitch_23
        :pswitch_23
        :pswitch_22
        :pswitch_26
        :pswitch_26
        :pswitch_26
        :pswitch_26
        :pswitch_26
        :pswitch_26
        :pswitch_21
        :pswitch_26
        :pswitch_20
        :pswitch_1f
        :pswitch_1f
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_1e
        :pswitch_26
        :pswitch_26
        :pswitch_1d
        :pswitch_26
        :pswitch_26
    .end packed-switch

    :pswitch_data_5
    .packed-switch 0x15
        :pswitch_27
        :pswitch_27
        :pswitch_27
        :pswitch_27
        :pswitch_27
        :pswitch_27
    .end packed-switch
.end method

.method public static I0(Led1;Lfx4;Lfl1;ZLv15;ILke7;)Lgx5;
    .locals 15

    .line 1
    sget-object v3, Loy1;->f0:Lrm;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p0, :cond_4

    .line 5
    .line 6
    if-eqz p2, :cond_3

    .line 7
    .line 8
    if-eqz p4, :cond_2

    .line 9
    .line 10
    if-eqz p5, :cond_1

    .line 11
    .line 12
    if-eqz p6, :cond_0

    .line 13
    .line 14
    new-instance v0, Lgx5;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    const/4 v10, 0x0

    .line 18
    const/4 v11, 0x0

    .line 19
    const/4 v12, 0x0

    .line 20
    const/4 v13, 0x0

    .line 21
    const/4 v14, 0x0

    .line 22
    move-object v1, p0

    .line 23
    move-object/from16 v4, p1

    .line 24
    .line 25
    move-object/from16 v5, p2

    .line 26
    .line 27
    move/from16 v6, p3

    .line 28
    .line 29
    move-object/from16 v7, p4

    .line 30
    .line 31
    move/from16 v8, p5

    .line 32
    .line 33
    move-object/from16 v9, p6

    .line 34
    .line 35
    invoke-direct/range {v0 .. v14}, Lgx5;-><init>(Led1;Lfx5;Lsm;Lfx4;Lfl1;ZLv15;ILke7;ZZZZZ)V

    .line 36
    .line 37
    .line 38
    return-object v0

    .line 39
    :cond_0
    const/16 p0, 0xd

    .line 40
    .line 41
    invoke-static {p0}, Lgx5;->B(I)V

    .line 42
    .line 43
    .line 44
    throw v0

    .line 45
    :cond_1
    const/16 p0, 0xc

    .line 46
    .line 47
    invoke-static {p0}, Lgx5;->B(I)V

    .line 48
    .line 49
    .line 50
    throw v0

    .line 51
    :cond_2
    const/16 p0, 0xb

    .line 52
    .line 53
    invoke-static {p0}, Lgx5;->B(I)V

    .line 54
    .line 55
    .line 56
    throw v0

    .line 57
    :cond_3
    const/16 p0, 0xa

    .line 58
    .line 59
    invoke-static {p0}, Lgx5;->B(I)V

    .line 60
    .line 61
    .line 62
    throw v0

    .line 63
    :cond_4
    const/4 p0, 0x7

    .line 64
    invoke-static {p0}, Lgx5;->B(I)V

    .line 65
    .line 66
    .line 67
    throw v0
.end method

.method public static K0(Lwi8;Lcx5;)Lho2;
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    iget-object p1, p1, Lcx5;->p0:Lho2;

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    invoke-interface {p1, p0}, Lho2;->g(Lwi8;)Lho2;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :cond_0
    return-object v0

    .line 14
    :cond_1
    const/16 p0, 0x1f

    .line 15
    .line 16
    invoke-static {p0}, Lgx5;->B(I)V

    .line 17
    .line 18
    .line 19
    throw v0
.end method


# virtual methods
.method public final C()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lgx5;->t0:Z

    .line 2
    .line 3
    return p0
.end method

.method public final E()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lgx5;->v0:Z

    .line 2
    .line 3
    return p0
.end method

.method public final bridge synthetic G0()Lgd1;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lgx5;->a()Lfx5;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final H()Ls21;
    .locals 0

    .line 1
    iget-object p0, p0, Lgx5;->k0:Lse4;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-interface {p0}, Ldn2;->invoke()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ls21;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return-object p0
.end method

.method public final H0(Led1;Lfx4;Lfl1;)Lgx5;
    .locals 2

    .line 1
    new-instance v0, Lx7;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lx7;-><init>(Lgx5;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, v0, Lx7;->c:Ljava/lang/Object;

    .line 7
    .line 8
    const/4 p0, 0x0

    .line 9
    iput-object p0, v0, Lx7;->f:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p2, v0, Lx7;->d:Ljava/lang/Object;

    .line 12
    .line 13
    const/4 p1, 0x2

    .line 14
    const/4 p2, 0x0

    .line 15
    if-eqz p3, :cond_1

    .line 16
    .line 17
    iput-object p3, v0, Lx7;->e:Ljava/lang/Object;

    .line 18
    .line 19
    iput p1, v0, Lx7;->a:I

    .line 20
    .line 21
    iput-boolean p2, v0, Lx7;->b:Z

    .line 22
    .line 23
    invoke-virtual {v0}, Lx7;->a()Lgx5;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    if-eqz p1, :cond_0

    .line 28
    .line 29
    return-object p1

    .line 30
    :cond_0
    const/16 p1, 0x2a

    .line 31
    .line 32
    invoke-static {p1}, Lgx5;->B(I)V

    .line 33
    .line 34
    .line 35
    throw p0

    .line 36
    :cond_1
    const/4 p0, 0x3

    .line 37
    new-array p0, p0, [Ljava/lang/Object;

    .line 38
    .line 39
    const/16 p3, 0x8

    .line 40
    .line 41
    const-string v0, "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration"

    .line 42
    .line 43
    packed-switch p3, :pswitch_data_0

    .line 44
    .line 45
    .line 46
    const-string v1, "owner"

    .line 47
    .line 48
    aput-object v1, p0, p2

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :pswitch_0
    const-string v1, "name"

    .line 52
    .line 53
    aput-object v1, p0, p2

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :pswitch_1
    const-string v1, "substitution"

    .line 57
    .line 58
    aput-object v1, p0, p2

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :pswitch_2
    const-string v1, "typeParameters"

    .line 62
    .line 63
    aput-object v1, p0, p2

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :pswitch_3
    const-string v1, "kind"

    .line 67
    .line 68
    aput-object v1, p0, p2

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :pswitch_4
    const-string v1, "visibility"

    .line 72
    .line 73
    aput-object v1, p0, p2

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :pswitch_5
    const-string v1, "modality"

    .line 77
    .line 78
    aput-object v1, p0, p2

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :pswitch_6
    const-string v1, "type"

    .line 82
    .line 83
    aput-object v1, p0, p2

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :pswitch_7
    aput-object v0, p0, p2

    .line 87
    .line 88
    :goto_0
    const/4 p2, 0x1

    .line 89
    aput-object v0, p0, p2

    .line 90
    .line 91
    packed-switch p3, :pswitch_data_1

    .line 92
    .line 93
    .line 94
    const-string p2, "setOwner"

    .line 95
    .line 96
    aput-object p2, p0, p1

    .line 97
    .line 98
    goto :goto_1

    .line 99
    :pswitch_8
    const-string p2, "setName"

    .line 100
    .line 101
    aput-object p2, p0, p1

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :pswitch_9
    const-string p2, "setSubstitution"

    .line 105
    .line 106
    aput-object p2, p0, p1

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :pswitch_a
    const-string p2, "setTypeParameters"

    .line 110
    .line 111
    aput-object p2, p0, p1

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :pswitch_b
    const-string p2, "setKind"

    .line 115
    .line 116
    aput-object p2, p0, p1

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :pswitch_c
    const-string p2, "setVisibility"

    .line 120
    .line 121
    aput-object p2, p0, p1

    .line 122
    .line 123
    goto :goto_1

    .line 124
    :pswitch_d
    const-string p2, "setModality"

    .line 125
    .line 126
    aput-object p2, p0, p1

    .line 127
    .line 128
    goto :goto_1

    .line 129
    :pswitch_e
    const-string p2, "setReturnType"

    .line 130
    .line 131
    aput-object p2, p0, p1

    .line 132
    .line 133
    :goto_1
    :pswitch_f
    const-string p1, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    .line 134
    .line 135
    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 140
    .line 141
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    throw p1

    .line 145
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_6
        :pswitch_7
        :pswitch_5
        :pswitch_7
        :pswitch_4
        :pswitch_7
        :pswitch_3
        :pswitch_7
        :pswitch_2
        :pswitch_7
        :pswitch_7
        :pswitch_1
        :pswitch_7
        :pswitch_7
        :pswitch_0
        :pswitch_7
    .end packed-switch

    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_f
        :pswitch_f
        :pswitch_f
        :pswitch_e
        :pswitch_f
        :pswitch_d
        :pswitch_f
        :pswitch_c
        :pswitch_f
        :pswitch_b
        :pswitch_f
        :pswitch_a
        :pswitch_f
        :pswitch_f
        :pswitch_9
        :pswitch_f
        :pswitch_f
        :pswitch_8
        :pswitch_f
    .end packed-switch
.end method

.method public final bridge synthetic I(Led1;Lfx4;Lfl1;)Lld0;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lgx5;->H0(Led1;Lfx4;Lfl1;)Lgx5;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final J(Lid1;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p1, p0, p2}, Lid1;->n(Lgx5;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public J0(Led1;Lfx4;Lfl1;Lfx5;ILv15;)Lgx5;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz p1, :cond_4

    .line 5
    .line 6
    if-eqz p2, :cond_3

    .line 7
    .line 8
    if-eqz p3, :cond_2

    .line 9
    .line 10
    if-eqz p5, :cond_1

    .line 11
    .line 12
    if-eqz p6, :cond_0

    .line 13
    .line 14
    new-instance v2, Lgx5;

    .line 15
    .line 16
    invoke-virtual {v0}, Lcw0;->getAnnotations()Lsm;

    .line 17
    .line 18
    .line 19
    move-result-object v5

    .line 20
    invoke-virtual {v0}, Lgx5;->w()Z

    .line 21
    .line 22
    .line 23
    move-result v13

    .line 24
    invoke-virtual {v0}, Lgx5;->k()Z

    .line 25
    .line 26
    .line 27
    move-result v15

    .line 28
    iget-boolean v1, v0, Lgx5;->v0:Z

    .line 29
    .line 30
    iget-boolean v8, v0, Lgx5;->j0:Z

    .line 31
    .line 32
    sget-object v11, Lke7;->G:Lg55;

    .line 33
    .line 34
    iget-boolean v12, v0, Lgx5;->r0:Z

    .line 35
    .line 36
    iget-boolean v14, v0, Lgx5;->t0:Z

    .line 37
    .line 38
    move-object/from16 v3, p1

    .line 39
    .line 40
    move-object/from16 v6, p2

    .line 41
    .line 42
    move-object/from16 v7, p3

    .line 43
    .line 44
    move-object/from16 v4, p4

    .line 45
    .line 46
    move/from16 v10, p5

    .line 47
    .line 48
    move-object/from16 v9, p6

    .line 49
    .line 50
    move/from16 v16, v1

    .line 51
    .line 52
    invoke-direct/range {v2 .. v16}, Lgx5;-><init>(Led1;Lfx5;Lsm;Lfx4;Lfl1;ZLv15;ILke7;ZZZZZ)V

    .line 53
    .line 54
    .line 55
    return-object v2

    .line 56
    :cond_0
    const/16 v0, 0x24

    .line 57
    .line 58
    invoke-static {v0}, Lgx5;->B(I)V

    .line 59
    .line 60
    .line 61
    throw v1

    .line 62
    :cond_1
    const/16 v0, 0x23

    .line 63
    .line 64
    invoke-static {v0}, Lgx5;->B(I)V

    .line 65
    .line 66
    .line 67
    throw v1

    .line 68
    :cond_2
    const/16 v0, 0x22

    .line 69
    .line 70
    invoke-static {v0}, Lgx5;->B(I)V

    .line 71
    .line 72
    .line 73
    throw v1

    .line 74
    :cond_3
    const/16 v0, 0x21

    .line 75
    .line 76
    invoke-static {v0}, Lgx5;->B(I)V

    .line 77
    .line 78
    .line 79
    throw v1

    .line 80
    :cond_4
    const/16 v0, 0x20

    .line 81
    .line 82
    invoke-static {v0}, Lgx5;->B(I)V

    .line 83
    .line 84
    .line 85
    throw v1
.end method

.method public final L0(Lhx5;Ltx5;Ly82;Ly82;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lgx5;->A0:Lhx5;

    .line 2
    .line 3
    iput-object p2, p0, Lgx5;->B0:Ltx5;

    .line 4
    .line 5
    iput-object p3, p0, Lgx5;->C0:Ly82;

    .line 6
    .line 7
    iput-object p4, p0, Lgx5;->D0:Ly82;

    .line 8
    .line 9
    return-void
.end method

.method public final M0(Lse4;Ldn2;)V
    .locals 0

    .line 1
    if-eqz p2, :cond_1

    .line 2
    .line 3
    iput-object p2, p0, Lgx5;->l0:Ldn2;

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-interface {p2}, Ldn2;->invoke()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Lse4;

    .line 13
    .line 14
    :goto_0
    iput-object p1, p0, Lgx5;->k0:Lse4;

    .line 15
    .line 16
    return-void

    .line 17
    :cond_1
    const/4 p0, 0x3

    .line 18
    new-array p0, p0, [Ljava/lang/Object;

    .line 19
    .line 20
    const-string p1, "compileTimeInitializerFactory"

    .line 21
    .line 22
    const/4 p2, 0x0

    .line 23
    aput-object p1, p0, p2

    .line 24
    .line 25
    const-string p1, "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl"

    .line 26
    .line 27
    const/4 p2, 0x1

    .line 28
    aput-object p1, p0, p2

    .line 29
    .line 30
    const-string p1, "setCompileTimeInitializer"

    .line 31
    .line 32
    const/4 p2, 0x2

    .line 33
    aput-object p1, p0, p2

    .line 34
    .line 35
    const-string p1, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    .line 36
    .line 37
    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 42
    .line 43
    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw p1
.end method

.method public N0(Lt14;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final O0(Lt14;Ljava/util/List;Li44;Li44;Ljava/util/List;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_2

    .line 3
    .line 4
    if-eqz p2, :cond_1

    .line 5
    .line 6
    if-eqz p5, :cond_0

    .line 7
    .line 8
    iput-object p1, p0, Lqt8;->i0:Lt14;

    .line 9
    .line 10
    new-instance p1, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lgx5;->z0:Ljava/util/ArrayList;

    .line 16
    .line 17
    iput-object p4, p0, Lgx5;->y0:Li44;

    .line 18
    .line 19
    iput-object p3, p0, Lgx5;->x0:Li44;

    .line 20
    .line 21
    iput-object p5, p0, Lgx5;->w0:Ljava/util/List;

    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    const/16 p0, 0x13

    .line 25
    .line 26
    invoke-static {p0}, Lgx5;->B(I)V

    .line 27
    .line 28
    .line 29
    throw v0

    .line 30
    :cond_1
    const/16 p0, 0x12

    .line 31
    .line 32
    invoke-static {p0}, Lgx5;->B(I)V

    .line 33
    .line 34
    .line 35
    throw v0

    .line 36
    :cond_2
    const/16 p0, 0x11

    .line 37
    .line 38
    invoke-static {p0}, Lgx5;->B(I)V

    .line 39
    .line 40
    .line 41
    throw v0
.end method

.method public final P()Li44;
    .locals 0

    .line 1
    iget-object p0, p0, Lgx5;->x0:Li44;

    .line 2
    .line 3
    return-object p0
.end method

.method public final R()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lgx5;->j0:Z

    .line 2
    .line 3
    return p0
.end method

.method public final S()Li44;
    .locals 0

    .line 1
    iget-object p0, p0, Lgx5;->y0:Li44;

    .line 2
    .line 3
    return-object p0
.end method

.method public final T()Ly82;
    .locals 0

    .line 1
    iget-object p0, p0, Lgx5;->D0:Ly82;

    .line 2
    .line 3
    return-object p0
.end method

.method public final V()Ly82;
    .locals 0

    .line 1
    iget-object p0, p0, Lgx5;->C0:Ly82;

    .line 2
    .line 3
    return-object p0
.end method

.method public final Y()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Lgx5;->w0:Ljava/util/List;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const/16 p0, 0x16

    .line 7
    .line 8
    invoke-static {p0}, Lgx5;->B(I)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

.method public final Z()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lgx5;->r0:Z

    .line 2
    .line 3
    return p0
.end method

.method public final bridge synthetic a()Led1;
    .locals 0

    .line 21
    invoke-virtual {p0}, Lgx5;->a()Lfx5;

    move-result-object p0

    return-object p0
.end method

.method public final a()Lfx5;
    .locals 1

    .line 1
    iget-object v0, p0, Lgx5;->p0:Lfx5;

    .line 2
    .line 3
    if-ne v0, p0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-interface {v0}, Lfx5;->a()Lfx5;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :goto_0
    if-eqz p0, :cond_1

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_1
    const/16 p0, 0x26

    .line 14
    .line 15
    invoke-static {p0}, Lgx5;->B(I)V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    throw p0
.end method

.method public final bridge synthetic a()Ljd0;
    .locals 0

    .line 22
    invoke-virtual {p0}, Lgx5;->a()Lfx5;

    move-result-object p0

    return-object p0
.end method

.method public final bridge synthetic a()Lld0;
    .locals 0

    .line 20
    invoke-virtual {p0}, Lgx5;->a()Lfx5;

    move-result-object p0

    return-object p0
.end method

.method public final b()Lhx5;
    .locals 0

    .line 1
    iget-object p0, p0, Lgx5;->A0:Lhx5;

    .line 2
    .line 3
    return-object p0
.end method

.method public final d()Ltx5;
    .locals 0

    .line 1
    iget-object p0, p0, Lgx5;->B0:Ltx5;

    .line 2
    .line 3
    return-object p0
.end method

.method public final e()Lfl1;
    .locals 0

    .line 1
    iget-object p0, p0, Lgx5;->n0:Lfl1;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const/16 p0, 0x19

    .line 7
    .line 8
    invoke-static {p0}, Lgx5;->B(I)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

.method public final e0(Ljava/util/Collection;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, Lgx5;->o0:Ljava/util/Collection;

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/16 p0, 0x28

    .line 7
    .line 8
    invoke-static {p0}, Lgx5;->B(I)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

.method public final g(Lwi8;)Lfx5;
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object p1, p1, Lwi8;->a:Lui8;

    .line 4
    .line 5
    invoke-virtual {p1}, Lui8;->e()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    new-instance v0, Lx7;

    .line 13
    .line 14
    invoke-direct {v0, p0}, Lx7;-><init>(Lgx5;)V

    .line 15
    .line 16
    .line 17
    iput-object p1, v0, Lx7;->g:Ljava/lang/Object;

    .line 18
    .line 19
    invoke-virtual {p0}, Lgx5;->a()Lfx5;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    iput-object p0, v0, Lx7;->f:Ljava/lang/Object;

    .line 24
    .line 25
    invoke-virtual {v0}, Lx7;->a()Lgx5;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0

    .line 30
    :cond_1
    const/16 p0, 0x1b

    .line 31
    .line 32
    invoke-static {p0}, Lgx5;->B(I)V

    .line 33
    .line 34
    .line 35
    const/4 p0, 0x0

    .line 36
    throw p0
.end method

.method public final bridge synthetic g(Lwi8;)Lgd1;
    .locals 0

    .line 37
    invoke-virtual {p0, p1}, Lgx5;->g(Lwi8;)Lfx5;

    move-result-object p0

    return-object p0
.end method

.method public final getTypeParameters()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lgx5;->z0:Ljava/util/ArrayList;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const-string v0, "typeParameters == null for "

    .line 7
    .line 8
    invoke-static {p0, v0}, Lu52;->r(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0
.end method

.method public final j()Lt14;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lqt8;->c()Lt14;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    const/16 p0, 0x17

    .line 9
    .line 10
    invoke-static {p0}, Lgx5;->B(I)V

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    throw p0
.end method

.method public final j0()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public k()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lgx5;->u0:Z

    .line 2
    .line 3
    return p0
.end method

.method public final m()Lfx4;
    .locals 0

    .line 1
    iget-object p0, p0, Lgx5;->m0:Lfx4;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const/16 p0, 0x18

    .line 7
    .line 8
    invoke-static {p0}, Lgx5;->B(I)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

.method public final q()Ljava/util/Collection;
    .locals 0

    .line 1
    iget-object p0, p0, Lgx5;->o0:Ljava/util/Collection;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 7
    .line 8
    :goto_0
    if-eqz p0, :cond_1

    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_1
    const/16 p0, 0x29

    .line 12
    .line 13
    invoke-static {p0}, Lgx5;->B(I)V

    .line 14
    .line 15
    .line 16
    const/4 p0, 0x0

    .line 17
    throw p0
.end method

.method public final r()I
    .locals 0

    .line 1
    iget p0, p0, Lgx5;->q0:I

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return p0

    .line 6
    :cond_0
    const/16 p0, 0x27

    .line 7
    .line 8
    invoke-static {p0}, Lgx5;->B(I)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

.method public final u()Ljava/util/ArrayList;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 5
    .line 6
    .line 7
    iget-object v1, p0, Lgx5;->A0:Lhx5;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object p0, p0, Lgx5;->B0:Ltx5;

    .line 15
    .line 16
    if-eqz p0, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    :cond_1
    return-object v0
.end method

.method public v(Lyl1;)Ljava/lang/Object;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public w()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lgx5;->s0:Z

    .line 2
    .line 3
    return p0
.end method
