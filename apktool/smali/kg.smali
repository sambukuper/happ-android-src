.class public final synthetic Lkg;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Z

.field public final synthetic Z:Ljava/lang/Object;

.field public final synthetic f0:Ljava/lang/Object;

.field public final synthetic g0:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(BLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V
    .locals 0

    .line 16
    iput-byte p1, p0, Lkg;->X:B

    iput-object p2, p0, Lkg;->Z:Ljava/lang/Object;

    iput-boolean p5, p0, Lkg;->Y:Z

    iput-object p3, p0, Lkg;->f0:Ljava/lang/Object;

    iput-object p4, p0, Lkg;->g0:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ly05;Ljava/util/ArrayList;Ljava/util/List;Z)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, Lkg;->X:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lkg;->Z:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lkg;->f0:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lkg;->g0:Ljava/lang/Object;

    .line 12
    .line 13
    iput-boolean p4, p0, Lkg;->Y:Z

    .line 14
    .line 15
    return-void
.end method

.method public synthetic constructor <init>(ZLdn2;Ldn2;Lgn2;)V
    .locals 1

    .line 17
    const/4 v0, 0x2

    iput-byte v0, p0, Lkg;->X:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lkg;->Y:Z

    iput-object p2, p0, Lkg;->Z:Ljava/lang/Object;

    iput-object p3, p0, Lkg;->f0:Ljava/lang/Object;

    iput-object p4, p0, Lkg;->g0:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, Lkg;->X:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    sget-object v3, Ldn8;->a:Ldn8;

    .line 7
    .line 8
    iget-boolean v4, v0, Lkg;->Y:Z

    .line 9
    .line 10
    iget-object v5, v0, Lkg;->g0:Ljava/lang/Object;

    .line 11
    .line 12
    iget-object v6, v0, Lkg;->f0:Ljava/lang/Object;

    .line 13
    .line 14
    iget-object v7, v0, Lkg;->Z:Ljava/lang/Object;

    .line 15
    .line 16
    packed-switch v1, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    check-cast v7, Lec4;

    .line 20
    .line 21
    check-cast v6, Ljava/lang/String;

    .line 22
    .line 23
    check-cast v5, La59;

    .line 24
    .line 25
    move-object/from16 v0, p1

    .line 26
    .line 27
    check-cast v0, Ljava/lang/Throwable;

    .line 28
    .line 29
    instance-of v1, v0, Lr49;

    .line 30
    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    check-cast v0, Lr49;

    .line 34
    .line 35
    iget v0, v0, Lr49;->X:I

    .line 36
    .line 37
    invoke-virtual {v7, v0}, Lec4;->d(I)V

    .line 38
    .line 39
    .line 40
    :cond_0
    if-eqz v4, :cond_7

    .line 41
    .line 42
    if-eqz v6, :cond_7

    .line 43
    .line 44
    iget-object v0, v5, La59;->a:Ll49;

    .line 45
    .line 46
    invoke-virtual {v0}, Ll49;->hashCode()I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 51
    .line 52
    const/16 v4, 0x1d

    .line 53
    .line 54
    const/16 v5, 0x7f

    .line 55
    .line 56
    if-lt v1, v4, :cond_2

    .line 57
    .line 58
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-gt v1, v5, :cond_1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    invoke-virtual {v6, v2, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    :goto_0
    invoke-static {v0, v6}, Lwa;->m(ILjava/lang/String;)V

    .line 70
    .line 71
    .line 72
    goto :goto_4

    .line 73
    :cond_2
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-gt v1, v5, :cond_3

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_3
    invoke-virtual {v6, v2, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    :goto_1
    const-string v1, "asyncTraceEnd"

    .line 85
    .line 86
    const/4 v2, 0x0

    .line 87
    :try_start_0
    sget-object v4, Lln7;->d:Ljava/lang/reflect/Method;

    .line 88
    .line 89
    if-nez v4, :cond_4

    .line 90
    .line 91
    const-class v4, Landroid/os/Trace;

    .line 92
    .line 93
    sget-object v5, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 94
    .line 95
    const-class v7, Ljava/lang/String;

    .line 96
    .line 97
    sget-object v8, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 98
    .line 99
    filled-new-array {v5, v7, v8}, [Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    invoke-virtual {v4, v1, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    sput-object v4, Lln7;->d:Ljava/lang/reflect/Method;

    .line 108
    .line 109
    goto :goto_2

    .line 110
    :catch_0
    move-exception v0

    .line 111
    goto :goto_3

    .line 112
    :cond_4
    :goto_2
    if-eqz v4, :cond_5

    .line 113
    .line 114
    sget-wide v7, Lln7;->a:J

    .line 115
    .line 116
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    filled-new-array {v1, v6, v0}, [Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-virtual {v4, v2, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    goto :goto_4

    .line 132
    :cond_5
    const-string v0, "Required value was null."

    .line 133
    .line 134
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 135
    .line 136
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    throw v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 140
    :goto_3
    instance-of v1, v0, Ljava/lang/reflect/InvocationTargetException;

    .line 141
    .line 142
    if-eqz v1, :cond_7

    .line 143
    .line 144
    check-cast v0, Ljava/lang/reflect/InvocationTargetException;

    .line 145
    .line 146
    invoke-virtual {v0}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    instance-of v1, v0, Ljava/lang/RuntimeException;

    .line 151
    .line 152
    if-nez v1, :cond_6

    .line 153
    .line 154
    invoke-static {v0}, Lu52;->q(Ljava/lang/Throwable;)V

    .line 155
    .line 156
    .line 157
    move-object v3, v2

    .line 158
    goto :goto_4

    .line 159
    :cond_6
    throw v0

    .line 160
    :cond_7
    :goto_4
    return-object v3

    .line 161
    :pswitch_0
    check-cast v7, Ldn2;

    .line 162
    .line 163
    check-cast v6, Ldn2;

    .line 164
    .line 165
    move-object v9, v5

    .line 166
    check-cast v9, Lgn2;

    .line 167
    .line 168
    move-object/from16 v8, p1

    .line 169
    .line 170
    check-cast v8, Lp87;

    .line 171
    .line 172
    new-instance v4, Lo87;

    .line 173
    .line 174
    iget-boolean v5, v0, Lkg;->Y:Z

    .line 175
    .line 176
    move-object/from16 v16, v7

    .line 177
    .line 178
    move-object v7, v6

    .line 179
    move-object/from16 v6, v16

    .line 180
    .line 181
    invoke-direct/range {v4 .. v9}, Lo87;-><init>(ZLdn2;Ldn2;Lp87;Lgn2;)V

    .line 182
    .line 183
    .line 184
    return-object v4

    .line 185
    :pswitch_1
    check-cast v7, Ly05;

    .line 186
    .line 187
    check-cast v6, Ljava/util/ArrayList;

    .line 188
    .line 189
    check-cast v5, Ljava/util/List;

    .line 190
    .line 191
    move-object/from16 v0, p1

    .line 192
    .line 193
    check-cast v0, Ldo5;

    .line 194
    .line 195
    const/4 v1, 0x1

    .line 196
    iput-boolean v1, v0, Ldo5;->X:Z

    .line 197
    .line 198
    invoke-interface {v6}, Ljava/util/Collection;->size()I

    .line 199
    .line 200
    .line 201
    move-result v1

    .line 202
    move v8, v2

    .line 203
    :goto_5
    if-ge v8, v1, :cond_8

    .line 204
    .line 205
    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v9

    .line 209
    check-cast v9, Lf74;

    .line 210
    .line 211
    invoke-virtual {v9, v0, v4}, Lf74;->c(Ldo5;Z)V

    .line 212
    .line 213
    .line 214
    add-int/lit8 v8, v8, 0x1

    .line 215
    .line 216
    goto :goto_5

    .line 217
    :cond_8
    invoke-interface {v5}, Ljava/util/Collection;->size()I

    .line 218
    .line 219
    .line 220
    move-result v1

    .line 221
    move v6, v2

    .line 222
    :goto_6
    if-ge v6, v1, :cond_9

    .line 223
    .line 224
    invoke-interface {v5, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v8

    .line 228
    check-cast v8, Lf74;

    .line 229
    .line 230
    invoke-virtual {v8, v0, v4}, Lf74;->c(Ldo5;Z)V

    .line 231
    .line 232
    .line 233
    add-int/lit8 v6, v6, 0x1

    .line 234
    .line 235
    goto :goto_6

    .line 236
    :cond_9
    iput-boolean v2, v0, Ldo5;->X:Z

    .line 237
    .line 238
    invoke-interface {v7}, Llh7;->getValue()Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    return-object v3

    .line 242
    :pswitch_2
    check-cast v7, Ldn2;

    .line 243
    .line 244
    move-object v9, v6

    .line 245
    check-cast v9, Lje;

    .line 246
    .line 247
    move-object v13, v5

    .line 248
    check-cast v13, Lg60;

    .line 249
    .line 250
    move-object/from16 v8, p1

    .line 251
    .line 252
    check-cast v8, Lp34;

    .line 253
    .line 254
    invoke-virtual {v8}, Lp34;->a()V

    .line 255
    .line 256
    .line 257
    iget-object v0, v8, Lp34;->X:Lum0;

    .line 258
    .line 259
    invoke-interface {v7}, Ldn2;->invoke()Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v1

    .line 263
    check-cast v1, Ljava/lang/Boolean;

    .line 264
    .line 265
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 266
    .line 267
    .line 268
    move-result v1

    .line 269
    if-nez v1, :cond_a

    .line 270
    .line 271
    goto :goto_7

    .line 272
    :cond_a
    if-eqz v4, :cond_b

    .line 273
    .line 274
    invoke-interface {v0}, Lsv1;->A0()J

    .line 275
    .line 276
    .line 277
    move-result-wide v1

    .line 278
    iget-object v4, v0, Lum0;->Y:Llr;

    .line 279
    .line 280
    invoke-virtual {v4}, Llr;->p()J

    .line 281
    .line 282
    .line 283
    move-result-wide v5

    .line 284
    invoke-virtual {v4}, Llr;->k()Lsm0;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    invoke-interface {v0}, Lsm0;->g()V

    .line 289
    .line 290
    .line 291
    :try_start_1
    iget-object v0, v4, Llr;->Y:Ljava/lang/Object;

    .line 292
    .line 293
    check-cast v0, Lwl6;

    .line 294
    .line 295
    const/high16 v7, -0x40800000    # -1.0f

    .line 296
    .line 297
    const/high16 v10, 0x3f800000    # 1.0f

    .line 298
    .line 299
    invoke-virtual {v0, v7, v10, v1, v2}, Lwl6;->U(FFJ)V

    .line 300
    .line 301
    .line 302
    const/4 v14, 0x0

    .line 303
    const/16 v15, 0x2e

    .line 304
    .line 305
    const-wide/16 v10, 0x0

    .line 306
    .line 307
    const/4 v12, 0x0

    .line 308
    invoke-static/range {v8 .. v15}, Lsv1;->U(Lsv1;Lje;JFLg60;II)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 309
    .line 310
    .line 311
    invoke-static {v4, v5, v6}, Lp61;->w(Llr;J)V

    .line 312
    .line 313
    .line 314
    goto :goto_7

    .line 315
    :catchall_0
    move-exception v0

    .line 316
    invoke-static {v4, v5, v6}, Lp61;->w(Llr;J)V

    .line 317
    .line 318
    .line 319
    throw v0

    .line 320
    :cond_b
    const/4 v14, 0x0

    .line 321
    const/16 v15, 0x2e

    .line 322
    .line 323
    const-wide/16 v10, 0x0

    .line 324
    .line 325
    const/4 v12, 0x0

    .line 326
    invoke-static/range {v8 .. v15}, Lsv1;->U(Lsv1;Lje;JFLg60;II)V

    .line 327
    .line 328
    .line 329
    :goto_7
    return-object v3

    .line 330
    nop

    .line 331
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
