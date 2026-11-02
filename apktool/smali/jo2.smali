.class public abstract Ljo2;
.super Lhd1;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lho2;


# instance fields
.field public A0:Z

.field public B0:Ljava/util/Collection;

.field public volatile C0:Lc3;

.field public final D0:Lho2;

.field public final E0:I

.field public F0:Lho2;

.field public G0:Ljava/util/Map;

.field public i0:Ljava/util/List;

.field public j0:Ljava/util/List;

.field public k0:Lt14;

.field public l0:Ljava/util/List;

.field public m0:Li44;

.field public n0:Li44;

.field public o0:Lfx4;

.field public p0:Lfl1;

.field public q0:Z

.field public r0:Z

.field public s0:Z

.field public t0:Z

.field public u0:Z

.field public v0:Z

.field public w0:Z

.field public x0:Z

.field public y0:Z

.field public z0:Z


# direct methods
.method public constructor <init>(ILsm;Led1;Lho2;Lv15;Lke7;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    if-eqz p3, :cond_5

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eqz p2, :cond_4

    .line 7
    .line 8
    if-eqz p5, :cond_3

    .line 9
    .line 10
    if-eqz p1, :cond_2

    .line 11
    .line 12
    if-eqz p6, :cond_1

    .line 13
    .line 14
    invoke-direct {p0, p3, p2, p5, p6}, Lhd1;-><init>(Led1;Lsm;Lv15;Lke7;)V

    .line 15
    .line 16
    .line 17
    sget-object p2, Lgl1;->i:Lfl1;

    .line 18
    .line 19
    iput-object p2, p0, Ljo2;->p0:Lfl1;

    .line 20
    .line 21
    iput-boolean v1, p0, Ljo2;->q0:Z

    .line 22
    .line 23
    iput-boolean v1, p0, Ljo2;->r0:Z

    .line 24
    .line 25
    iput-boolean v1, p0, Ljo2;->s0:Z

    .line 26
    .line 27
    iput-boolean v1, p0, Ljo2;->t0:Z

    .line 28
    .line 29
    iput-boolean v1, p0, Ljo2;->u0:Z

    .line 30
    .line 31
    iput-boolean v1, p0, Ljo2;->v0:Z

    .line 32
    .line 33
    iput-boolean v1, p0, Ljo2;->w0:Z

    .line 34
    .line 35
    iput-boolean v1, p0, Ljo2;->x0:Z

    .line 36
    .line 37
    iput-boolean v1, p0, Ljo2;->y0:Z

    .line 38
    .line 39
    iput-boolean v2, p0, Ljo2;->z0:Z

    .line 40
    .line 41
    iput-boolean v1, p0, Ljo2;->A0:Z

    .line 42
    .line 43
    iput-object v0, p0, Ljo2;->B0:Ljava/util/Collection;

    .line 44
    .line 45
    iput-object v0, p0, Ljo2;->C0:Lc3;

    .line 46
    .line 47
    iput-object v0, p0, Ljo2;->F0:Lho2;

    .line 48
    .line 49
    iput-object v0, p0, Ljo2;->G0:Ljava/util/Map;

    .line 50
    .line 51
    if-nez p4, :cond_0

    .line 52
    .line 53
    move-object p4, p0

    .line 54
    :cond_0
    iput-object p4, p0, Ljo2;->D0:Lho2;

    .line 55
    .line 56
    iput p1, p0, Ljo2;->E0:I

    .line 57
    .line 58
    return-void

    .line 59
    :cond_1
    const/4 p0, 0x4

    .line 60
    invoke-static {p0}, Ljo2;->B(I)V

    .line 61
    .line 62
    .line 63
    throw v0

    .line 64
    :cond_2
    const/4 p0, 0x3

    .line 65
    invoke-static {p0}, Ljo2;->B(I)V

    .line 66
    .line 67
    .line 68
    throw v0

    .line 69
    :cond_3
    const/4 p0, 0x2

    .line 70
    invoke-static {p0}, Ljo2;->B(I)V

    .line 71
    .line 72
    .line 73
    throw v0

    .line 74
    :cond_4
    invoke-static {v2}, Ljo2;->B(I)V

    .line 75
    .line 76
    .line 77
    throw v0

    .line 78
    :cond_5
    invoke-static {v1}, Ljo2;->B(I)V

    .line 79
    .line 80
    .line 81
    throw v0
.end method

.method public static synthetic B(I)V
    .locals 7

    .line 1
    packed-switch p0, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    :pswitch_0
    const-string v0, "Argument for @NotNull parameter \'%s\' of %s.%s must not be null"

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :pswitch_1
    const-string v0, "@NotNull method %s.%s must not return null"

    .line 8
    .line 9
    :goto_0
    const/4 v1, 0x2

    .line 10
    packed-switch p0, :pswitch_data_1

    .line 11
    .line 12
    .line 13
    :pswitch_2
    const/4 v2, 0x3

    .line 14
    goto :goto_1

    .line 15
    :pswitch_3
    move v2, v1

    .line 16
    :goto_1
    new-array v2, v2, [Ljava/lang/Object;

    .line 17
    .line 18
    const-string v3, "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl"

    .line 19
    .line 20
    const/4 v4, 0x0

    .line 21
    packed-switch p0, :pswitch_data_2

    .line 22
    .line 23
    .line 24
    const-string v5, "containingDeclaration"

    .line 25
    .line 26
    aput-object v5, v2, v4

    .line 27
    .line 28
    goto :goto_2

    .line 29
    :pswitch_4
    const-string v5, "configuration"

    .line 30
    .line 31
    aput-object v5, v2, v4

    .line 32
    .line 33
    goto :goto_2

    .line 34
    :pswitch_5
    const-string v5, "substitutor"

    .line 35
    .line 36
    aput-object v5, v2, v4

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :pswitch_6
    const-string v5, "originalSubstitutor"

    .line 40
    .line 41
    aput-object v5, v2, v4

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :pswitch_7
    const-string v5, "overriddenDescriptors"

    .line 45
    .line 46
    aput-object v5, v2, v4

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :pswitch_8
    const-string v5, "extensionReceiverParameter"

    .line 50
    .line 51
    aput-object v5, v2, v4

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :pswitch_9
    const-string v5, "unsubstitutedReturnType"

    .line 55
    .line 56
    aput-object v5, v2, v4

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :pswitch_a
    aput-object v3, v2, v4

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :pswitch_b
    const-string v5, "visibility"

    .line 63
    .line 64
    aput-object v5, v2, v4

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :pswitch_c
    const-string v5, "unsubstitutedValueParameters"

    .line 68
    .line 69
    aput-object v5, v2, v4

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :pswitch_d
    const-string v5, "typeParameters"

    .line 73
    .line 74
    aput-object v5, v2, v4

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :pswitch_e
    const-string v5, "contextReceiverParameters"

    .line 78
    .line 79
    aput-object v5, v2, v4

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :pswitch_f
    const-string v5, "source"

    .line 83
    .line 84
    aput-object v5, v2, v4

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :pswitch_10
    const-string v5, "kind"

    .line 88
    .line 89
    aput-object v5, v2, v4

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :pswitch_11
    const-string v5, "name"

    .line 93
    .line 94
    aput-object v5, v2, v4

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :pswitch_12
    const-string v5, "annotations"

    .line 98
    .line 99
    aput-object v5, v2, v4

    .line 100
    .line 101
    :goto_2
    const-string v4, "initialize"

    .line 102
    .line 103
    const-string v5, "newCopyBuilder"

    .line 104
    .line 105
    const/4 v6, 0x1

    .line 106
    packed-switch p0, :pswitch_data_3

    .line 107
    .line 108
    .line 109
    :pswitch_13
    aput-object v3, v2, v6

    .line 110
    .line 111
    goto :goto_3

    .line 112
    :pswitch_14
    const-string v3, "getSourceToUseForCopy"

    .line 113
    .line 114
    aput-object v3, v2, v6

    .line 115
    .line 116
    goto :goto_3

    .line 117
    :pswitch_15
    const-string v3, "copy"

    .line 118
    .line 119
    aput-object v3, v2, v6

    .line 120
    .line 121
    goto :goto_3

    .line 122
    :pswitch_16
    aput-object v5, v2, v6

    .line 123
    .line 124
    goto :goto_3

    .line 125
    :pswitch_17
    const-string v3, "getKind"

    .line 126
    .line 127
    aput-object v3, v2, v6

    .line 128
    .line 129
    goto :goto_3

    .line 130
    :pswitch_18
    const-string v3, "getOriginal"

    .line 131
    .line 132
    aput-object v3, v2, v6

    .line 133
    .line 134
    goto :goto_3

    .line 135
    :pswitch_19
    const-string v3, "getValueParameters"

    .line 136
    .line 137
    aput-object v3, v2, v6

    .line 138
    .line 139
    goto :goto_3

    .line 140
    :pswitch_1a
    const-string v3, "getTypeParameters"

    .line 141
    .line 142
    aput-object v3, v2, v6

    .line 143
    .line 144
    goto :goto_3

    .line 145
    :pswitch_1b
    const-string v3, "getVisibility"

    .line 146
    .line 147
    aput-object v3, v2, v6

    .line 148
    .line 149
    goto :goto_3

    .line 150
    :pswitch_1c
    const-string v3, "getModality"

    .line 151
    .line 152
    aput-object v3, v2, v6

    .line 153
    .line 154
    goto :goto_3

    .line 155
    :pswitch_1d
    const-string v3, "getOverriddenDescriptors"

    .line 156
    .line 157
    aput-object v3, v2, v6

    .line 158
    .line 159
    goto :goto_3

    .line 160
    :pswitch_1e
    const-string v3, "getContextReceiverParameters"

    .line 161
    .line 162
    aput-object v3, v2, v6

    .line 163
    .line 164
    goto :goto_3

    .line 165
    :pswitch_1f
    aput-object v4, v2, v6

    .line 166
    .line 167
    :goto_3
    packed-switch p0, :pswitch_data_4

    .line 168
    .line 169
    .line 170
    const-string v3, "<init>"

    .line 171
    .line 172
    aput-object v3, v2, v1

    .line 173
    .line 174
    goto :goto_4

    .line 175
    :pswitch_20
    const-string v3, "getSubstitutedValueParameters"

    .line 176
    .line 177
    aput-object v3, v2, v1

    .line 178
    .line 179
    goto :goto_4

    .line 180
    :pswitch_21
    const-string v3, "doSubstitute"

    .line 181
    .line 182
    aput-object v3, v2, v1

    .line 183
    .line 184
    goto :goto_4

    .line 185
    :pswitch_22
    aput-object v5, v2, v1

    .line 186
    .line 187
    goto :goto_4

    .line 188
    :pswitch_23
    const-string v3, "substitute"

    .line 189
    .line 190
    aput-object v3, v2, v1

    .line 191
    .line 192
    goto :goto_4

    .line 193
    :pswitch_24
    const-string v3, "setOverriddenDescriptors"

    .line 194
    .line 195
    aput-object v3, v2, v1

    .line 196
    .line 197
    goto :goto_4

    .line 198
    :pswitch_25
    const-string v3, "setExtensionReceiverParameter"

    .line 199
    .line 200
    aput-object v3, v2, v1

    .line 201
    .line 202
    goto :goto_4

    .line 203
    :pswitch_26
    const-string v3, "setReturnType"

    .line 204
    .line 205
    aput-object v3, v2, v1

    .line 206
    .line 207
    goto :goto_4

    .line 208
    :pswitch_27
    const-string v3, "setVisibility"

    .line 209
    .line 210
    aput-object v3, v2, v1

    .line 211
    .line 212
    goto :goto_4

    .line 213
    :pswitch_28
    aput-object v4, v2, v1

    .line 214
    .line 215
    :goto_4
    :pswitch_29
    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    packed-switch p0, :pswitch_data_5

    .line 220
    .line 221
    .line 222
    :pswitch_2a
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 223
    .line 224
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    goto :goto_5

    .line 228
    :pswitch_2b
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 229
    .line 230
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    :goto_5
    throw p0

    .line 234
    nop

    .line 235
    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
    .end packed-switch

    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    :pswitch_data_1
    .packed-switch 0x9
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_3
        :pswitch_3
    .end packed-switch

    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_b
        :pswitch_9
        :pswitch_8
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_7
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_a
        :pswitch_6
        :pswitch_a
        :pswitch_5
        :pswitch_4
        :pswitch_a
        :pswitch_a
        :pswitch_c
        :pswitch_5
        :pswitch_c
        :pswitch_5
    .end packed-switch

    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
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
    .packed-switch 0x9
        :pswitch_1f
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_13
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_13
        :pswitch_16
        :pswitch_13
        :pswitch_13
        :pswitch_15
        :pswitch_14
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x5
        :pswitch_28
        :pswitch_28
        :pswitch_28
        :pswitch_28
        :pswitch_29
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_29
        :pswitch_29
        :pswitch_29
        :pswitch_29
        :pswitch_24
        :pswitch_29
        :pswitch_29
        :pswitch_29
        :pswitch_29
        :pswitch_23
        :pswitch_29
        :pswitch_22
        :pswitch_21
        :pswitch_29
        :pswitch_29
        :pswitch_20
        :pswitch_20
        :pswitch_20
        :pswitch_20
    .end packed-switch

    :pswitch_data_5
    .packed-switch 0x9
        :pswitch_2b
        :pswitch_2a
        :pswitch_2a
        :pswitch_2a
        :pswitch_2b
        :pswitch_2b
        :pswitch_2b
        :pswitch_2b
        :pswitch_2a
        :pswitch_2b
        :pswitch_2b
        :pswitch_2b
        :pswitch_2b
        :pswitch_2a
        :pswitch_2b
        :pswitch_2a
        :pswitch_2a
        :pswitch_2b
        :pswitch_2b
    .end packed-switch
.end method

.method public static K0(Lho2;Ljava/util/List;Lwi8;ZZ[Z)Ljava/util/ArrayList;
    .locals 20

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz p1, :cond_9

    .line 5
    .line 6
    new-instance v2, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->size()I

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 13
    .line 14
    .line 15
    invoke-interface/range {p1 .. p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-eqz v4, :cond_8

    .line 24
    .line 25
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    check-cast v4, Lot8;

    .line 30
    .line 31
    invoke-virtual {v4}, Lqt8;->c()Lt14;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    sget-object v6, Lrt8;->f0:Lrt8;

    .line 36
    .line 37
    invoke-virtual {v0, v5, v6}, Lwi8;->h(Lt14;Lrt8;)Lt14;

    .line 38
    .line 39
    .line 40
    move-result-object v13

    .line 41
    iget-object v5, v4, Lot8;->n0:Lt14;

    .line 42
    .line 43
    if-nez v5, :cond_0

    .line 44
    .line 45
    move-object v6, v1

    .line 46
    goto :goto_1

    .line 47
    :cond_0
    invoke-virtual {v0, v5, v6}, Lwi8;->h(Lt14;Lrt8;)Lt14;

    .line 48
    .line 49
    .line 50
    move-result-object v6

    .line 51
    :goto_1
    if-nez v13, :cond_1

    .line 52
    .line 53
    return-object v1

    .line 54
    :cond_1
    invoke-virtual {v4}, Lqt8;->c()Lt14;

    .line 55
    .line 56
    .line 57
    move-result-object v7

    .line 58
    if-ne v13, v7, :cond_2

    .line 59
    .line 60
    if-eq v5, v6, :cond_3

    .line 61
    .line 62
    :cond_2
    if-eqz p5, :cond_3

    .line 63
    .line 64
    const/4 v5, 0x0

    .line 65
    const/4 v7, 0x1

    .line 66
    aput-boolean v7, p5, v5

    .line 67
    .line 68
    :cond_3
    instance-of v5, v4, Lnt8;

    .line 69
    .line 70
    if-eqz v5, :cond_4

    .line 71
    .line 72
    move-object v5, v4

    .line 73
    check-cast v5, Lnt8;

    .line 74
    .line 75
    iget-object v5, v5, Lnt8;->p0:Lvz7;

    .line 76
    .line 77
    invoke-virtual {v5}, Lvz7;->getValue()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    check-cast v5, Ljava/util/List;

    .line 82
    .line 83
    new-instance v7, Lf3;

    .line 84
    .line 85
    const/16 v8, 0x18

    .line 86
    .line 87
    invoke-direct {v7, v5, v8}, Lf3;-><init>(Ljava/lang/Object;B)V

    .line 88
    .line 89
    .line 90
    move-object/from16 v19, v7

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_4
    move-object/from16 v19, v1

    .line 94
    .line 95
    :goto_2
    if-eqz p3, :cond_5

    .line 96
    .line 97
    move-object v9, v1

    .line 98
    goto :goto_3

    .line 99
    :cond_5
    move-object v9, v4

    .line 100
    :goto_3
    iget v10, v4, Lot8;->j0:I

    .line 101
    .line 102
    invoke-virtual {v4}, Lcw0;->getAnnotations()Lsm;

    .line 103
    .line 104
    .line 105
    move-result-object v11

    .line 106
    invoke-virtual {v4}, Lfd1;->getName()Lv15;

    .line 107
    .line 108
    .line 109
    move-result-object v12

    .line 110
    invoke-virtual {v4}, Lot8;->I0()Z

    .line 111
    .line 112
    .line 113
    move-result v14

    .line 114
    iget-boolean v15, v4, Lot8;->l0:Z

    .line 115
    .line 116
    iget-boolean v5, v4, Lot8;->m0:Z

    .line 117
    .line 118
    if-eqz p4, :cond_6

    .line 119
    .line 120
    invoke-virtual {v4}, Lhd1;->getSource()Lke7;

    .line 121
    .line 122
    .line 123
    move-result-object v4

    .line 124
    :goto_4
    move-object/from16 v18, v4

    .line 125
    .line 126
    goto :goto_5

    .line 127
    :cond_6
    sget-object v4, Lke7;->G:Lg55;

    .line 128
    .line 129
    goto :goto_4

    .line 130
    :goto_5
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    if-nez v19, :cond_7

    .line 140
    .line 141
    new-instance v7, Lot8;

    .line 142
    .line 143
    move-object/from16 v8, p0

    .line 144
    .line 145
    move/from16 v16, v5

    .line 146
    .line 147
    move-object/from16 v17, v6

    .line 148
    .line 149
    invoke-direct/range {v7 .. v18}, Lot8;-><init>(Ljd0;Lot8;ILsm;Lv15;Lt14;ZZZLt14;Lke7;)V

    .line 150
    .line 151
    .line 152
    goto :goto_6

    .line 153
    :cond_7
    move/from16 v16, v5

    .line 154
    .line 155
    move-object/from16 v17, v6

    .line 156
    .line 157
    new-instance v7, Lnt8;

    .line 158
    .line 159
    move-object/from16 v8, p0

    .line 160
    .line 161
    invoke-direct/range {v7 .. v19}, Lnt8;-><init>(Ljd0;Lot8;ILsm;Lv15;Lt14;ZZZLt14;Lke7;Ldn2;)V

    .line 162
    .line 163
    .line 164
    :goto_6
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    goto/16 :goto_0

    .line 168
    .line 169
    :cond_8
    return-object v2

    .line 170
    :cond_9
    const/16 v0, 0x1e

    .line 171
    .line 172
    invoke-static {v0}, Ljo2;->B(I)V

    .line 173
    .line 174
    .line 175
    throw v1
.end method


# virtual methods
.method public final C()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Ljo2;->v0:Z

    .line 2
    .line 3
    return p0
.end method

.method public F()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Ljo2;->u0:Z

    .line 2
    .line 3
    return p0
.end method

.method public final H0(Led1;Lfx4;Lfl1;)Lho2;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljo2;->i0()Lgo2;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0, p1}, Lgo2;->w(Led1;)Lgo2;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-interface {p0, p2}, Lgo2;->m(Lfx4;)Lgo2;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-interface {p0, p3}, Lgo2;->k(Lfl1;)Lgo2;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    const/4 p1, 0x2

    .line 18
    invoke-interface {p0, p1}, Lgo2;->c(I)Lgo2;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-interface {p0}, Lgo2;->l()Lgo2;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-interface {p0}, Lgo2;->build()Lho2;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    if-eqz p0, :cond_0

    .line 31
    .line 32
    return-object p0

    .line 33
    :cond_0
    const/16 p0, 0x1a

    .line 34
    .line 35
    invoke-static {p0}, Ljo2;->B(I)V

    .line 36
    .line 37
    .line 38
    const/4 p0, 0x0

    .line 39
    throw p0
.end method

.method public abstract I0(ILsm;Led1;Lho2;Lv15;Lke7;)Ljo2;
.end method

.method public J(Lid1;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-interface {p1, p0, p2}, Lid1;->o(Lho2;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public J0(Lio2;)Ljo2;
    .locals 22

    .line 1
    move-object/from16 v7, p1

    .line 2
    .line 3
    sget-object v8, Lrt8;->f0:Lrt8;

    .line 4
    .line 5
    const/4 v9, 0x1

    .line 6
    new-array v10, v9, [Z

    .line 7
    .line 8
    iget-object v0, v7, Lio2;->u0:Lsm;

    .line 9
    .line 10
    const/4 v11, 0x0

    .line 11
    if-eqz v0, :cond_2

    .line 12
    .line 13
    invoke-virtual/range {p0 .. p0}, Lcw0;->getAnnotations()Lsm;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v1, v7, Lio2;->u0:Lsm;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-interface {v0}, Lsm;->isEmpty()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    move-object v0, v1

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    invoke-interface {v1}, Lsm;->isEmpty()Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    new-instance v2, Lvm;

    .line 41
    .line 42
    const/4 v3, 0x2

    .line 43
    new-array v3, v3, [Lsm;

    .line 44
    .line 45
    aput-object v0, v3, v11

    .line 46
    .line 47
    aput-object v1, v3, v9

    .line 48
    .line 49
    invoke-direct {v2, v3}, Lvm;-><init>([Lsm;)V

    .line 50
    .line 51
    .line 52
    move-object v0, v2

    .line 53
    :goto_0
    move-object v2, v0

    .line 54
    goto :goto_1

    .line 55
    :cond_2
    invoke-virtual/range {p0 .. p0}, Lcw0;->getAnnotations()Lsm;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    goto :goto_0

    .line 60
    :goto_1
    iget-object v3, v7, Lio2;->Y:Led1;

    .line 61
    .line 62
    iget-object v4, v7, Lio2;->g0:Lho2;

    .line 63
    .line 64
    iget v1, v7, Lio2;->h0:I

    .line 65
    .line 66
    iget-object v5, v7, Lio2;->n0:Lv15;

    .line 67
    .line 68
    iget-boolean v0, v7, Lio2;->q0:Z

    .line 69
    .line 70
    if-eqz v0, :cond_4

    .line 71
    .line 72
    if-eqz v4, :cond_3

    .line 73
    .line 74
    move-object v0, v4

    .line 75
    goto :goto_2

    .line 76
    :cond_3
    invoke-virtual/range {p0 .. p0}, Ljo2;->a()Lho2;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    :goto_2
    check-cast v0, Lhd1;

    .line 81
    .line 82
    invoke-virtual {v0}, Lhd1;->getSource()Lke7;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    :goto_3
    move-object v6, v0

    .line 87
    goto :goto_4

    .line 88
    :cond_4
    sget-object v0, Lke7;->G:Lg55;

    .line 89
    .line 90
    goto :goto_3

    .line 91
    :goto_4
    if-eqz v6, :cond_20

    .line 92
    .line 93
    move-object/from16 v0, p0

    .line 94
    .line 95
    invoke-virtual/range {v0 .. v6}, Ljo2;->I0(ILsm;Led1;Lho2;Lv15;Lke7;)Ljo2;

    .line 96
    .line 97
    .line 98
    move-result-object v13

    .line 99
    move-object v6, v0

    .line 100
    iget-object v0, v7, Lio2;->t0:Ljava/util/List;

    .line 101
    .line 102
    if-nez v0, :cond_5

    .line 103
    .line 104
    invoke-virtual {v6}, Ljo2;->getTypeParameters()Ljava/util/List;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    :cond_5
    aget-boolean v1, v10, v11

    .line 109
    .line 110
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    xor-int/2addr v2, v9

    .line 115
    or-int/2addr v1, v2

    .line 116
    aput-boolean v1, v10, v11

    .line 117
    .line 118
    new-instance v14, Ljava/util/ArrayList;

    .line 119
    .line 120
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    invoke-direct {v14, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 125
    .line 126
    .line 127
    iget-object v1, v7, Lio2;->X:Lui8;

    .line 128
    .line 129
    invoke-static {v0, v1, v13, v14, v10}, Ldh3;->S(Ljava/util/List;Lui8;Led1;Ljava/util/List;[Z)Lwi8;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    if-nez v2, :cond_6

    .line 134
    .line 135
    :goto_5
    const/4 v8, 0x0

    .line 136
    goto/16 :goto_d

    .line 137
    .line 138
    :cond_6
    new-instance v15, Ljava/util/ArrayList;

    .line 139
    .line 140
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 141
    .line 142
    .line 143
    iget-object v0, v7, Lio2;->j0:Ljava/util/List;

    .line 144
    .line 145
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    if-nez v0, :cond_9

    .line 150
    .line 151
    iget-object v0, v7, Lio2;->j0:Ljava/util/List;

    .line 152
    .line 153
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    move v1, v11

    .line 158
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 159
    .line 160
    .line 161
    move-result v3

    .line 162
    if-eqz v3, :cond_9

    .line 163
    .line 164
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v3

    .line 168
    check-cast v3, Li44;

    .line 169
    .line 170
    invoke-virtual {v3}, Li44;->c()Lt14;

    .line 171
    .line 172
    .line 173
    move-result-object v4

    .line 174
    invoke-virtual {v2, v4, v8}, Lwi8;->h(Lt14;Lrt8;)Lt14;

    .line 175
    .line 176
    .line 177
    move-result-object v4

    .line 178
    if-nez v4, :cond_7

    .line 179
    .line 180
    goto :goto_5

    .line 181
    :cond_7
    invoke-virtual {v3}, Li44;->H0()Li86;

    .line 182
    .line 183
    .line 184
    move-result-object v5

    .line 185
    check-cast v5, Lg51;

    .line 186
    .line 187
    invoke-virtual {v5}, Lg51;->F0()Lv15;

    .line 188
    .line 189
    .line 190
    move-result-object v5

    .line 191
    const/16 v16, 0x0

    .line 192
    .line 193
    invoke-virtual {v3}, Lcw0;->getAnnotations()Lsm;

    .line 194
    .line 195
    .line 196
    move-result-object v12

    .line 197
    add-int/lit8 v17, v1, 0x1

    .line 198
    .line 199
    invoke-static {v13, v4, v5, v12, v1}, Lz91;->r(Ljd0;Lt14;Lv15;Lsm;I)Li44;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    invoke-virtual {v15, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    aget-boolean v1, v10, v11

    .line 207
    .line 208
    invoke-virtual {v3}, Li44;->c()Lt14;

    .line 209
    .line 210
    .line 211
    move-result-object v3

    .line 212
    if-eq v4, v3, :cond_8

    .line 213
    .line 214
    move v3, v9

    .line 215
    goto :goto_7

    .line 216
    :cond_8
    move v3, v11

    .line 217
    :goto_7
    or-int/2addr v1, v3

    .line 218
    aput-boolean v1, v10, v11

    .line 219
    .line 220
    move/from16 v1, v17

    .line 221
    .line 222
    goto :goto_6

    .line 223
    :cond_9
    const/16 v16, 0x0

    .line 224
    .line 225
    iget-object v0, v7, Lio2;->k0:Li44;

    .line 226
    .line 227
    if-eqz v0, :cond_c

    .line 228
    .line 229
    invoke-virtual {v0}, Li44;->c()Lt14;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    invoke-virtual {v2, v0, v8}, Lwi8;->h(Lt14;Lrt8;)Lt14;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    if-nez v0, :cond_a

    .line 238
    .line 239
    :goto_8
    move-object/from16 v8, v16

    .line 240
    .line 241
    goto/16 :goto_d

    .line 242
    .line 243
    :cond_a
    new-instance v1, Li44;

    .line 244
    .line 245
    new-instance v3, Lo62;

    .line 246
    .line 247
    iget-object v4, v7, Lio2;->k0:Li44;

    .line 248
    .line 249
    invoke-virtual {v4}, Li44;->H0()Li86;

    .line 250
    .line 251
    .line 252
    invoke-direct {v3, v13, v0}, Lo62;-><init>(Ljd0;Lt14;)V

    .line 253
    .line 254
    .line 255
    iget-object v4, v7, Lio2;->k0:Li44;

    .line 256
    .line 257
    invoke-virtual {v4}, Lcw0;->getAnnotations()Lsm;

    .line 258
    .line 259
    .line 260
    move-result-object v4

    .line 261
    invoke-direct {v1, v13, v3, v4}, Li44;-><init>(Led1;Lcw0;Lsm;)V

    .line 262
    .line 263
    .line 264
    aget-boolean v3, v10, v11

    .line 265
    .line 266
    iget-object v4, v7, Lio2;->k0:Li44;

    .line 267
    .line 268
    invoke-virtual {v4}, Li44;->c()Lt14;

    .line 269
    .line 270
    .line 271
    move-result-object v4

    .line 272
    if-eq v0, v4, :cond_b

    .line 273
    .line 274
    move v0, v9

    .line 275
    goto :goto_9

    .line 276
    :cond_b
    move v0, v11

    .line 277
    :goto_9
    or-int/2addr v0, v3

    .line 278
    aput-boolean v0, v10, v11

    .line 279
    .line 280
    move-object/from16 v17, v14

    .line 281
    .line 282
    move-object v14, v1

    .line 283
    goto :goto_a

    .line 284
    :cond_c
    move-object/from16 v17, v14

    .line 285
    .line 286
    move-object/from16 v14, v16

    .line 287
    .line 288
    :goto_a
    iget-object v0, v7, Lio2;->l0:Li44;

    .line 289
    .line 290
    if-eqz v0, :cond_f

    .line 291
    .line 292
    invoke-virtual {v0, v2}, Li44;->I0(Lwi8;)Li44;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    if-nez v0, :cond_d

    .line 297
    .line 298
    goto :goto_8

    .line 299
    :cond_d
    aget-boolean v1, v10, v11

    .line 300
    .line 301
    iget-object v3, v7, Lio2;->l0:Li44;

    .line 302
    .line 303
    if-eq v0, v3, :cond_e

    .line 304
    .line 305
    move v3, v9

    .line 306
    goto :goto_b

    .line 307
    :cond_e
    move v3, v11

    .line 308
    :goto_b
    or-int/2addr v1, v3

    .line 309
    aput-boolean v1, v10, v11

    .line 310
    .line 311
    move-object/from16 v8, v16

    .line 312
    .line 313
    move-object/from16 v16, v15

    .line 314
    .line 315
    move-object v15, v0

    .line 316
    goto :goto_c

    .line 317
    :cond_f
    move-object/from16 v8, v16

    .line 318
    .line 319
    move-object/from16 v16, v15

    .line 320
    .line 321
    move-object v15, v8

    .line 322
    :goto_c
    iget-object v1, v7, Lio2;->i0:Ljava/util/List;

    .line 323
    .line 324
    iget-boolean v3, v7, Lio2;->r0:Z

    .line 325
    .line 326
    iget-boolean v4, v7, Lio2;->q0:Z

    .line 327
    .line 328
    move-object v5, v10

    .line 329
    move-object v0, v13

    .line 330
    invoke-static/range {v0 .. v5}, Ljo2;->K0(Lho2;Ljava/util/List;Lwi8;ZZ[Z)Ljava/util/ArrayList;

    .line 331
    .line 332
    .line 333
    move-result-object v18

    .line 334
    if-nez v18, :cond_10

    .line 335
    .line 336
    goto :goto_d

    .line 337
    :cond_10
    iget-object v1, v7, Lio2;->m0:Lt14;

    .line 338
    .line 339
    sget-object v3, Lrt8;->g0:Lrt8;

    .line 340
    .line 341
    invoke-virtual {v2, v1, v3}, Lwi8;->h(Lt14;Lrt8;)Lt14;

    .line 342
    .line 343
    .line 344
    move-result-object v1

    .line 345
    if-nez v1, :cond_11

    .line 346
    .line 347
    :goto_d
    return-object v8

    .line 348
    :cond_11
    aget-boolean v3, v5, v11

    .line 349
    .line 350
    iget-object v4, v7, Lio2;->m0:Lt14;

    .line 351
    .line 352
    if-eq v1, v4, :cond_12

    .line 353
    .line 354
    move v4, v9

    .line 355
    goto :goto_e

    .line 356
    :cond_12
    move v4, v11

    .line 357
    :goto_e
    or-int/2addr v3, v4

    .line 358
    aput-boolean v3, v5, v11

    .line 359
    .line 360
    if-nez v3, :cond_13

    .line 361
    .line 362
    iget-boolean v3, v7, Lio2;->y0:Z

    .line 363
    .line 364
    if-eqz v3, :cond_13

    .line 365
    .line 366
    return-object v6

    .line 367
    :cond_13
    iget-object v3, v7, Lio2;->Z:Lfx4;

    .line 368
    .line 369
    iget-object v4, v7, Lio2;->f0:Lfl1;

    .line 370
    .line 371
    move-object v13, v0

    .line 372
    move-object/from16 v19, v1

    .line 373
    .line 374
    move-object/from16 v20, v3

    .line 375
    .line 376
    move-object/from16 v21, v4

    .line 377
    .line 378
    invoke-virtual/range {v13 .. v21}, Ljo2;->L0(Li44;Li44;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lt14;Lfx4;Lfl1;)V

    .line 379
    .line 380
    .line 381
    iget-boolean v1, v6, Ljo2;->q0:Z

    .line 382
    .line 383
    iput-boolean v1, v0, Ljo2;->q0:Z

    .line 384
    .line 385
    iget-boolean v1, v6, Ljo2;->r0:Z

    .line 386
    .line 387
    iput-boolean v1, v0, Ljo2;->r0:Z

    .line 388
    .line 389
    iget-boolean v1, v6, Ljo2;->s0:Z

    .line 390
    .line 391
    iput-boolean v1, v0, Ljo2;->s0:Z

    .line 392
    .line 393
    iget-boolean v1, v6, Ljo2;->t0:Z

    .line 394
    .line 395
    iput-boolean v1, v0, Ljo2;->t0:Z

    .line 396
    .line 397
    iget-boolean v1, v6, Ljo2;->u0:Z

    .line 398
    .line 399
    iput-boolean v1, v0, Ljo2;->u0:Z

    .line 400
    .line 401
    iget-boolean v1, v6, Ljo2;->y0:Z

    .line 402
    .line 403
    iput-boolean v1, v0, Ljo2;->y0:Z

    .line 404
    .line 405
    iget-boolean v1, v6, Ljo2;->v0:Z

    .line 406
    .line 407
    iput-boolean v1, v0, Ljo2;->v0:Z

    .line 408
    .line 409
    iget-boolean v1, v6, Ljo2;->z0:Z

    .line 410
    .line 411
    invoke-virtual {v0, v1}, Ljo2;->N0(Z)V

    .line 412
    .line 413
    .line 414
    iget-boolean v1, v7, Lio2;->s0:Z

    .line 415
    .line 416
    iput-boolean v1, v0, Ljo2;->w0:Z

    .line 417
    .line 418
    iget-boolean v1, v7, Lio2;->v0:Z

    .line 419
    .line 420
    iput-boolean v1, v0, Ljo2;->x0:Z

    .line 421
    .line 422
    iget-object v1, v7, Lio2;->x0:Ljava/lang/Boolean;

    .line 423
    .line 424
    if-eqz v1, :cond_14

    .line 425
    .line 426
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 427
    .line 428
    .line 429
    move-result v1

    .line 430
    goto :goto_f

    .line 431
    :cond_14
    iget-boolean v1, v6, Ljo2;->A0:Z

    .line 432
    .line 433
    :goto_f
    invoke-virtual {v0, v1}, Ljo2;->O0(Z)V

    .line 434
    .line 435
    .line 436
    iget-object v1, v7, Lio2;->w0:Ljava/util/LinkedHashMap;

    .line 437
    .line 438
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    .line 439
    .line 440
    .line 441
    move-result v1

    .line 442
    if-eqz v1, :cond_15

    .line 443
    .line 444
    iget-object v1, v6, Ljo2;->G0:Ljava/util/Map;

    .line 445
    .line 446
    if-eqz v1, :cond_19

    .line 447
    .line 448
    :cond_15
    iget-object v1, v7, Lio2;->w0:Ljava/util/LinkedHashMap;

    .line 449
    .line 450
    iget-object v3, v6, Ljo2;->G0:Ljava/util/Map;

    .line 451
    .line 452
    if-eqz v3, :cond_17

    .line 453
    .line 454
    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 455
    .line 456
    .line 457
    move-result-object v3

    .line 458
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 459
    .line 460
    .line 461
    move-result-object v3

    .line 462
    :cond_16
    :goto_10
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 463
    .line 464
    .line 465
    move-result v4

    .line 466
    if-eqz v4, :cond_17

    .line 467
    .line 468
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 469
    .line 470
    .line 471
    move-result-object v4

    .line 472
    check-cast v4, Ljava/util/Map$Entry;

    .line 473
    .line 474
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 475
    .line 476
    .line 477
    move-result-object v5

    .line 478
    invoke-interface {v1, v5}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 479
    .line 480
    .line 481
    move-result v5

    .line 482
    if-nez v5, :cond_16

    .line 483
    .line 484
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 485
    .line 486
    .line 487
    move-result-object v5

    .line 488
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 489
    .line 490
    .line 491
    move-result-object v4

    .line 492
    invoke-interface {v1, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 493
    .line 494
    .line 495
    goto :goto_10

    .line 496
    :cond_17
    invoke-interface {v1}, Ljava/util/Map;->size()I

    .line 497
    .line 498
    .line 499
    move-result v3

    .line 500
    if-ne v3, v9, :cond_18

    .line 501
    .line 502
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 503
    .line 504
    .line 505
    move-result-object v3

    .line 506
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 507
    .line 508
    .line 509
    move-result-object v3

    .line 510
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 511
    .line 512
    .line 513
    move-result-object v3

    .line 514
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 515
    .line 516
    .line 517
    move-result-object v1

    .line 518
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 519
    .line 520
    .line 521
    move-result-object v1

    .line 522
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 523
    .line 524
    .line 525
    move-result-object v1

    .line 526
    invoke-static {v3, v1}, Ljava/util/Collections;->singletonMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map;

    .line 527
    .line 528
    .line 529
    move-result-object v1

    .line 530
    iput-object v1, v0, Ljo2;->G0:Ljava/util/Map;

    .line 531
    .line 532
    goto :goto_11

    .line 533
    :cond_18
    iput-object v1, v0, Ljo2;->G0:Ljava/util/Map;

    .line 534
    .line 535
    :cond_19
    :goto_11
    iget-boolean v1, v7, Lio2;->p0:Z

    .line 536
    .line 537
    if-nez v1, :cond_1a

    .line 538
    .line 539
    iget-object v1, v6, Ljo2;->F0:Lho2;

    .line 540
    .line 541
    if-eqz v1, :cond_1c

    .line 542
    .line 543
    :cond_1a
    iget-object v1, v6, Ljo2;->F0:Lho2;

    .line 544
    .line 545
    if-eqz v1, :cond_1b

    .line 546
    .line 547
    goto :goto_12

    .line 548
    :cond_1b
    move-object v1, v6

    .line 549
    :goto_12
    invoke-interface {v1, v2}, Lho2;->g(Lwi8;)Lho2;

    .line 550
    .line 551
    .line 552
    move-result-object v1

    .line 553
    iput-object v1, v0, Ljo2;->F0:Lho2;

    .line 554
    .line 555
    :cond_1c
    iget-boolean v1, v7, Lio2;->o0:Z

    .line 556
    .line 557
    if-eqz v1, :cond_1f

    .line 558
    .line 559
    invoke-virtual {v6}, Ljo2;->a()Lho2;

    .line 560
    .line 561
    .line 562
    move-result-object v1

    .line 563
    invoke-interface {v1}, Lld0;->q()Ljava/util/Collection;

    .line 564
    .line 565
    .line 566
    move-result-object v1

    .line 567
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 568
    .line 569
    .line 570
    move-result v1

    .line 571
    if-nez v1, :cond_1f

    .line 572
    .line 573
    iget-object v1, v7, Lio2;->X:Lui8;

    .line 574
    .line 575
    invoke-virtual {v1}, Lui8;->e()Z

    .line 576
    .line 577
    .line 578
    move-result v1

    .line 579
    if-eqz v1, :cond_1e

    .line 580
    .line 581
    iget-object v1, v6, Ljo2;->C0:Lc3;

    .line 582
    .line 583
    if-eqz v1, :cond_1d

    .line 584
    .line 585
    iput-object v1, v0, Ljo2;->C0:Lc3;

    .line 586
    .line 587
    return-object v0

    .line 588
    :cond_1d
    invoke-virtual {v6}, Ljo2;->q()Ljava/util/Collection;

    .line 589
    .line 590
    .line 591
    move-result-object v1

    .line 592
    invoke-virtual {v0, v1}, Ljo2;->e0(Ljava/util/Collection;)V

    .line 593
    .line 594
    .line 595
    return-object v0

    .line 596
    :cond_1e
    new-instance v1, Lc3;

    .line 597
    .line 598
    const/16 v3, 0xd

    .line 599
    .line 600
    invoke-direct {v1, v3, v6, v2, v11}, Lc3;-><init>(BLjava/lang/Object;Ljava/lang/Object;Z)V

    .line 601
    .line 602
    .line 603
    iput-object v1, v0, Ljo2;->C0:Lc3;

    .line 604
    .line 605
    :cond_1f
    return-object v0

    .line 606
    :cond_20
    const/4 v8, 0x0

    .line 607
    const/16 v0, 0x1b

    .line 608
    .line 609
    invoke-static {v0}, Ljo2;->B(I)V

    .line 610
    .line 611
    .line 612
    throw v8
.end method

.method public final L()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Ljo2;->j0:Ljava/util/List;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const/16 p0, 0x13

    .line 7
    .line 8
    invoke-static {p0}, Ljo2;->B(I)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

.method public L0(Li44;Li44;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lt14;Lfx4;Lfl1;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p3, :cond_7

    .line 3
    .line 4
    if-eqz p4, :cond_6

    .line 5
    .line 6
    if-eqz p5, :cond_5

    .line 7
    .line 8
    if-eqz p8, :cond_4

    .line 9
    .line 10
    invoke-static {p4}, Lwv0;->Y0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, Ljo2;->i0:Ljava/util/List;

    .line 15
    .line 16
    invoke-static {p5}, Lwv0;->Y0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iput-object v0, p0, Ljo2;->j0:Ljava/util/List;

    .line 21
    .line 22
    iput-object p6, p0, Ljo2;->k0:Lt14;

    .line 23
    .line 24
    iput-object p7, p0, Ljo2;->o0:Lfx4;

    .line 25
    .line 26
    iput-object p8, p0, Ljo2;->p0:Lfl1;

    .line 27
    .line 28
    iput-object p1, p0, Ljo2;->m0:Li44;

    .line 29
    .line 30
    iput-object p2, p0, Ljo2;->n0:Li44;

    .line 31
    .line 32
    iput-object p3, p0, Ljo2;->l0:Ljava/util/List;

    .line 33
    .line 34
    const/4 p0, 0x0

    .line 35
    move p1, p0

    .line 36
    :goto_0
    invoke-interface {p4}, Ljava/util/List;->size()I

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    const-string p3, " but position is "

    .line 41
    .line 42
    if-ge p1, p2, :cond_1

    .line 43
    .line 44
    invoke-interface {p4, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    check-cast p2, Lhi8;

    .line 49
    .line 50
    invoke-interface {p2}, Lhi8;->getIndex()I

    .line 51
    .line 52
    .line 53
    move-result p6

    .line 54
    if-ne p6, p1, :cond_0

    .line 55
    .line 56
    add-int/lit8 p1, p1, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 60
    .line 61
    new-instance p4, Ljava/lang/StringBuilder;

    .line 62
    .line 63
    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-interface {p2}, Lhi8;->getIndex()I

    .line 70
    .line 71
    .line 72
    move-result p2

    .line 73
    const-string p5, " index is "

    .line 74
    .line 75
    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    throw p0

    .line 95
    :cond_1
    :goto_1
    invoke-interface {p5}, Ljava/util/List;->size()I

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    if-ge p0, p1, :cond_3

    .line 100
    .line 101
    invoke-interface {p5, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    check-cast p1, Lot8;

    .line 106
    .line 107
    iget p2, p1, Lot8;->j0:I

    .line 108
    .line 109
    if-ne p2, p0, :cond_2

    .line 110
    .line 111
    add-int/lit8 p0, p0, 0x1

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_2
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 115
    .line 116
    new-instance p4, Ljava/lang/StringBuilder;

    .line 117
    .line 118
    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    iget p1, p1, Lot8;->j0:I

    .line 125
    .line 126
    const-string p5, "index is "

    .line 127
    .line 128
    invoke-virtual {p4, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {p4, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    invoke-direct {p2, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    throw p2

    .line 148
    :cond_3
    return-void

    .line 149
    :cond_4
    const/16 p0, 0x8

    .line 150
    .line 151
    invoke-static {p0}, Ljo2;->B(I)V

    .line 152
    .line 153
    .line 154
    throw v0

    .line 155
    :cond_5
    const/4 p0, 0x7

    .line 156
    invoke-static {p0}, Ljo2;->B(I)V

    .line 157
    .line 158
    .line 159
    throw v0

    .line 160
    :cond_6
    const/4 p0, 0x6

    .line 161
    invoke-static {p0}, Ljo2;->B(I)V

    .line 162
    .line 163
    .line 164
    throw v0

    .line 165
    :cond_7
    const/4 p0, 0x5

    .line 166
    invoke-static {p0}, Ljo2;->B(I)V

    .line 167
    .line 168
    .line 169
    throw v0
.end method

.method public final M0(Lwi8;)Lio2;
    .locals 11

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    new-instance v0, Lio2;

    .line 4
    .line 5
    iget-object v2, p1, Lwi8;->a:Lui8;

    .line 6
    .line 7
    invoke-virtual {p0}, Lhd1;->p()Led1;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    invoke-virtual {p0}, Ljo2;->m()Lfx4;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    invoke-virtual {p0}, Ljo2;->e()Lfl1;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    invoke-virtual {p0}, Ljo2;->r()I

    .line 20
    .line 21
    .line 22
    move-result v6

    .line 23
    invoke-virtual {p0}, Ljo2;->L()Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v7

    .line 27
    invoke-virtual {p0}, Ljo2;->Y()Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object v8

    .line 31
    iget-object v9, p0, Ljo2;->m0:Li44;

    .line 32
    .line 33
    invoke-virtual {p0}, Ljo2;->j()Lt14;

    .line 34
    .line 35
    .line 36
    move-result-object v10

    .line 37
    move-object v1, p0

    .line 38
    invoke-direct/range {v0 .. v10}, Lio2;-><init>(Ljo2;Lui8;Led1;Lfx4;Lfl1;ILjava/util/List;Ljava/util/List;Li44;Lt14;)V

    .line 39
    .line 40
    .line 41
    return-object v0

    .line 42
    :cond_0
    const/16 p0, 0x18

    .line 43
    .line 44
    invoke-static {p0}, Ljo2;->B(I)V

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    throw p0
.end method

.method public N0(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Ljo2;->z0:Z

    .line 2
    .line 3
    return-void
.end method

.method public final O()Lho2;
    .locals 0

    .line 1
    iget-object p0, p0, Ljo2;->F0:Lho2;

    .line 2
    .line 3
    return-object p0
.end method

.method public O0(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Ljo2;->A0:Z

    .line 2
    .line 3
    return-void
.end method

.method public final P()Li44;
    .locals 0

    .line 1
    iget-object p0, p0, Ljo2;->n0:Li44;

    .line 2
    .line 3
    return-object p0
.end method

.method public final P0(Laa7;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iput-object p1, p0, Ljo2;->k0:Lt14;

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/16 p0, 0xb

    .line 7
    .line 8
    invoke-static {p0}, Ljo2;->B(I)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

.method public final S()Li44;
    .locals 0

    .line 1
    iget-object p0, p0, Ljo2;->m0:Li44;

    .line 2
    .line 3
    return-object p0
.end method

.method public final Y()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, Ljo2;->l0:Ljava/util/List;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const/16 p0, 0xd

    .line 7
    .line 8
    invoke-static {p0}, Ljo2;->B(I)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

.method public a()Lho2;
    .locals 1

    .line 1
    iget-object v0, p0, Ljo2;->D0:Lho2;

    .line 2
    .line 3
    if-ne v0, p0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-interface {v0}, Lho2;->a()Lho2;

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
    const/16 p0, 0x14

    .line 14
    .line 15
    invoke-static {p0}, Ljo2;->B(I)V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    throw p0
.end method

.method public final c0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Ljo2;->w0:Z

    .line 2
    .line 3
    return p0
.end method

.method public final e()Lfl1;
    .locals 0

    .line 1
    iget-object p0, p0, Ljo2;->p0:Lfl1;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const/16 p0, 0x10

    .line 7
    .line 8
    invoke-static {p0}, Ljo2;->B(I)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

.method public e0(Ljava/util/Collection;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_2

    .line 2
    .line 3
    iput-object p1, p0, Ljo2;->B0:Ljava/util/Collection;

    .line 4
    .line 5
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Lho2;

    .line 20
    .line 21
    invoke-interface {v0}, Lho2;->h0()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    const/4 p1, 0x1

    .line 28
    iput-boolean p1, p0, Ljo2;->x0:Z

    .line 29
    .line 30
    :cond_1
    return-void

    .line 31
    :cond_2
    const/16 p0, 0x11

    .line 32
    .line 33
    invoke-static {p0}, Ljo2;->B(I)V

    .line 34
    .line 35
    .line 36
    const/4 p0, 0x0

    .line 37
    throw p0
.end method

.method public bridge synthetic g(Lwi8;)Lgd1;
    .locals 0

    .line 41
    invoke-virtual {p0, p1}, Ljo2;->g(Lwi8;)Lho2;

    move-result-object p0

    return-object p0
.end method

.method public g(Lwi8;)Lho2;
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    iget-object v0, p1, Lwi8;->a:Lui8;

    .line 4
    .line 5
    invoke-virtual {v0}, Lui8;->e()Z

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
    invoke-virtual {p0, p1}, Ljo2;->M0(Lwi8;)Lio2;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p0}, Ljo2;->a()Lho2;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    iput-object p0, p1, Lio2;->g0:Lho2;

    .line 21
    .line 22
    const/4 p0, 0x1

    .line 23
    iput-boolean p0, p1, Lio2;->q0:Z

    .line 24
    .line 25
    iput-boolean p0, p1, Lio2;->y0:Z

    .line 26
    .line 27
    iget-object p0, p1, Lio2;->z0:Ljo2;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, Ljo2;->J0(Lio2;)Ljo2;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :cond_1
    const/16 p0, 0x16

    .line 35
    .line 36
    invoke-static {p0}, Ljo2;->B(I)V

    .line 37
    .line 38
    .line 39
    const/4 p0, 0x0

    .line 40
    throw p0
.end method

.method public final getTypeParameters()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Ljo2;->i0:Ljava/util/List;

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

.method public h()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Ljo2;->y0:Z

    .line 2
    .line 3
    return p0
.end method

.method public final h0()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Ljo2;->x0:Z

    .line 2
    .line 3
    return p0
.end method

.method public i()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Ljo2;->t0:Z

    .line 2
    .line 3
    return p0
.end method

.method public i0()Lgo2;
    .locals 1

    .line 1
    sget-object v0, Lwi8;->b:Lwi8;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljo2;->M0(Lwi8;)Lio2;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public j()Lt14;
    .locals 0

    .line 1
    iget-object p0, p0, Ljo2;->k0:Lt14;

    .line 2
    .line 3
    return-object p0
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
    iget-boolean p0, p0, Ljo2;->s0:Z

    .line 2
    .line 3
    return p0
.end method

.method public final m()Lfx4;
    .locals 0

    .line 1
    iget-object p0, p0, Ljo2;->o0:Lfx4;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const/16 p0, 0xf

    .line 7
    .line 8
    invoke-static {p0}, Ljo2;->B(I)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

.method public final o()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ljo2;->q0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p0}, Ljo2;->a()Lho2;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-interface {p0}, Lld0;->q()Ljava/util/Collection;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Lho2;

    .line 29
    .line 30
    invoke-interface {v0}, Lho2;->o()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    :goto_0
    const/4 p0, 0x1

    .line 37
    return p0

    .line 38
    :cond_2
    const/4 p0, 0x0

    .line 39
    return p0
.end method

.method public q()Ljava/util/Collection;
    .locals 2

    .line 1
    iget-object v0, p0, Ljo2;->C0:Lc3;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {v0}, Lc3;->invoke()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, Ljava/util/Collection;

    .line 11
    .line 12
    iput-object v0, p0, Ljo2;->B0:Ljava/util/Collection;

    .line 13
    .line 14
    iput-object v1, p0, Ljo2;->C0:Lc3;

    .line 15
    .line 16
    :cond_0
    iget-object p0, p0, Ljo2;->B0:Ljava/util/Collection;

    .line 17
    .line 18
    if-eqz p0, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 22
    .line 23
    :goto_0
    if-eqz p0, :cond_2

    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_2
    const/16 p0, 0xe

    .line 27
    .line 28
    invoke-static {p0}, Ljo2;->B(I)V

    .line 29
    .line 30
    .line 31
    throw v1
.end method

.method public final r()I
    .locals 0

    .line 1
    iget p0, p0, Ljo2;->E0:I

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return p0

    .line 6
    :cond_0
    const/16 p0, 0x15

    .line 7
    .line 8
    invoke-static {p0}, Ljo2;->B(I)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
.end method

.method public final s()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Ljo2;->r0:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p0}, Ljo2;->a()Lho2;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-interface {p0}, Lld0;->q()Ljava/util/Collection;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    check-cast v0, Lho2;

    .line 29
    .line 30
    invoke-interface {v0}, Lho2;->s()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_1

    .line 35
    .line 36
    :goto_0
    const/4 p0, 0x1

    .line 37
    return p0

    .line 38
    :cond_2
    const/4 p0, 0x0

    .line 39
    return p0
.end method

.method public v(Lyl1;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Ljo2;->G0:Ljava/util/Map;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return-object p0

    .line 7
    :cond_0
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public z()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Ljo2;->A0:Z

    .line 2
    .line 3
    return p0
.end method
