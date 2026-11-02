.class public final synthetic Ly2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 9
    iput-byte p1, p0, Ly2;->X:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lsu/happ/proxyutility/ui/BaseActivity;)V
    .locals 0

    .line 1
    const/16 p1, 0x1a

    .line 2
    .line 3
    iput-byte p1, p0, Ly2;->X:B

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
    .locals 3

    .line 1
    iget-byte p0, p0, Ly2;->X:B

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x1

    .line 5
    sget-object v2, Ldn8;->a:Ldn8;

    .line 6
    .line 7
    packed-switch p0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Ldo5;

    .line 11
    .line 12
    return-object v2

    .line 13
    :pswitch_0
    check-cast p1, Lp34;

    .line 14
    .line 15
    invoke-virtual {p1}, Lp34;->a()V

    .line 16
    .line 17
    .line 18
    return-object v2

    .line 19
    :pswitch_1
    check-cast p1, Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    const-string p0, "#"

    .line 25
    .line 26
    invoke-static {p1, v0, p0}, Lmm7;->Z(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :pswitch_2
    check-cast p1, Landroid/content/res/Resources;

    .line 36
    .line 37
    sget p0, Lsu/happ/proxyutility/ui/BaseActivity;->P0:I

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-static {p1}, Lsu/happ/proxyutility/ui/BaseActivity;->w(Landroid/content/res/Resources;)Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    return-object p0

    .line 51
    :pswitch_3
    check-cast p1, Ld10;

    .line 52
    .line 53
    invoke-virtual {p1}, Ld10;->a1()V

    .line 54
    .line 55
    .line 56
    return-object v2

    .line 57
    :pswitch_4
    check-cast p1, Ld10;

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    invoke-static {p1}, Lz68;->W(Lrv1;)V

    .line 63
    .line 64
    .line 65
    return-object v2

    .line 66
    :pswitch_5
    check-cast p1, Lav;

    .line 67
    .line 68
    return-object p1

    .line 69
    :pswitch_6
    check-cast p1, Ljava/io/PrintWriter;

    .line 70
    .line 71
    invoke-static {p1}, Lp61;->q(Ljava/io/PrintWriter;)Ljava/util/Date;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    new-instance v0, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string p0, " The URL has not changed as it is already the same"

    .line 84
    .line 85
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    invoke-virtual {p1, p0}, Ljava/io/PrintWriter;->write(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    return-object v2

    .line 96
    :pswitch_7
    check-cast p1, Ljava/io/PrintWriter;

    .line 97
    .line 98
    invoke-static {p1}, Lp61;->q(Ljava/io/PrintWriter;)Ljava/util/Date;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    new-instance v0, Ljava/lang/StringBuilder;

    .line 103
    .line 104
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    const-string p0, " The URL changed to NEW_URL"

    .line 111
    .line 112
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    invoke-virtual {p1, p0}, Ljava/io/PrintWriter;->write(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    return-object v2

    .line 123
    :pswitch_8
    check-cast p1, Ljava/io/PrintWriter;

    .line 124
    .line 125
    invoke-static {p1}, Lp61;->q(Ljava/io/PrintWriter;)Ljava/util/Date;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    new-instance v0, Ljava/lang/StringBuilder;

    .line 130
    .line 131
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    const-string p0, " New domain changed to NEW_DOMAIN"

    .line 138
    .line 139
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    invoke-virtual {p1, p0}, Ljava/io/PrintWriter;->write(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    return-object v2

    .line 150
    :pswitch_9
    check-cast p1, Ljava/io/PrintWriter;

    .line 151
    .line 152
    invoke-static {p1}, Lp61;->q(Ljava/io/PrintWriter;)Ljava/util/Date;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    new-instance v0, Ljava/lang/StringBuilder;

    .line 157
    .line 158
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    const-string p0, " The domain in URL has not changed as it is already the same"

    .line 165
    .line 166
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    invoke-virtual {p1, p0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    return-object v2

    .line 177
    :pswitch_a
    check-cast p1, Lkn3;

    .line 178
    .line 179
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    iput-boolean v1, p1, Lkn3;->a:Z

    .line 183
    .line 184
    return-object v2

    .line 185
    :pswitch_b
    check-cast p1, Lml;

    .line 186
    .line 187
    instance-of p0, p1, Lxg5;

    .line 188
    .line 189
    xor-int/2addr p0, v1

    .line 190
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    return-object p0

    .line 195
    :pswitch_c
    check-cast p1, Ljava/lang/Long;

    .line 196
    .line 197
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    return-object v2

    .line 201
    :pswitch_d
    check-cast p1, Ldo5;

    .line 202
    .line 203
    return-object v2

    .line 204
    :pswitch_e
    check-cast p1, Ljava/lang/Long;

    .line 205
    .line 206
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    return-object v2

    .line 210
    :pswitch_f
    check-cast p1, Lf17;

    .line 211
    .line 212
    sget-object p0, Ld17;->a:[Lnw3;

    .line 213
    .line 214
    sget-object p0, Lc17;->x:Le17;

    .line 215
    .line 216
    invoke-interface {p1, p0, v2}, Lf17;->a(Le17;Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    return-object v2

    .line 220
    :pswitch_10
    check-cast p1, Lf17;

    .line 221
    .line 222
    sget-object p0, Ld17;->a:[Lnw3;

    .line 223
    .line 224
    sget-object p0, Lc17;->y:Le17;

    .line 225
    .line 226
    invoke-interface {p1, p0, v2}, Lf17;->a(Le17;Ljava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    return-object v2

    .line 230
    :pswitch_11
    check-cast p1, Ly07;

    .line 231
    .line 232
    invoke-static {p1}, Lvr3;->I(Ly07;)Z

    .line 233
    .line 234
    .line 235
    move-result p0

    .line 236
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 237
    .line 238
    .line 239
    move-result-object p0

    .line 240
    return-object p0

    .line 241
    :pswitch_12
    check-cast p1, Lkl5;

    .line 242
    .line 243
    sget-object p0, Lpc;->a:Lox1;

    .line 244
    .line 245
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 246
    .line 247
    .line 248
    invoke-static {p1, p0}, Lx97;->S(Lkl5;Lq06;)Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    sget-object p0, Lpc;->b:Lox1;

    .line 252
    .line 253
    invoke-static {p1, p0}, Lx97;->S(Lkl5;Lq06;)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object p0

    .line 257
    check-cast p0, Landroid/content/Context;

    .line 258
    .line 259
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 260
    .line 261
    .line 262
    move-result-object p0

    .line 263
    return-object p0

    .line 264
    :pswitch_13
    check-cast p1, Lq78;

    .line 265
    .line 266
    return-object p1

    .line 267
    :pswitch_14
    check-cast p1, Ly07;

    .line 268
    .line 269
    invoke-static {p1}, Lvr3;->I(Ly07;)Z

    .line 270
    .line 271
    .line 272
    move-result p0

    .line 273
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 274
    .line 275
    .line 276
    move-result-object p0

    .line 277
    return-object p0

    .line 278
    :pswitch_15
    check-cast p1, Lai2;

    .line 279
    .line 280
    sget-object p0, Landroidx/compose/ui/platform/AndroidComposeView;->J1:Ljava/lang/Class;

    .line 281
    .line 282
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 283
    .line 284
    return-object p0

    .line 285
    :pswitch_16
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 286
    .line 287
    return-object p0

    .line 288
    :pswitch_17
    check-cast p1, Ljava/lang/Integer;

    .line 289
    .line 290
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 291
    .line 292
    .line 293
    const/high16 p0, 0x7fc00000    # Float.NaN

    .line 294
    .line 295
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 296
    .line 297
    .line 298
    move-result-object p0

    .line 299
    return-object p0

    .line 300
    :pswitch_18
    check-cast p1, Loq5;

    .line 301
    .line 302
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 303
    .line 304
    return-object p0

    .line 305
    :pswitch_19
    check-cast p1, Ljava/lang/Float;

    .line 306
    .line 307
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 308
    .line 309
    .line 310
    move-result p0

    .line 311
    const/high16 p1, 0x40000000    # 2.0f

    .line 312
    .line 313
    div-float/2addr p0, p1

    .line 314
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 315
    .line 316
    .line 317
    move-result-object p0

    .line 318
    return-object p0

    .line 319
    :pswitch_1a
    check-cast p1, Lf17;

    .line 320
    .line 321
    return-object v2

    .line 322
    :pswitch_1b
    check-cast p1, Lf17;

    .line 323
    .line 324
    return-object v2

    .line 325
    :pswitch_1c
    check-cast p1, Loq5;

    .line 326
    .line 327
    if-nez p1, :cond_0

    .line 328
    .line 329
    goto :goto_0

    .line 330
    :cond_0
    iget p0, p1, Loq5;->a:I

    .line 331
    .line 332
    const/4 p1, 0x2

    .line 333
    if-ne p0, p1, :cond_1

    .line 334
    .line 335
    move v0, v1

    .line 336
    :cond_1
    :goto_0
    xor-int/lit8 p0, v0, 0x1

    .line 337
    .line 338
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 339
    .line 340
    .line 341
    move-result-object p0

    .line 342
    return-object p0

    .line 343
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
