.class public final synthetic Ln73;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:I

.field public final synthetic Z:I


# direct methods
.method public synthetic constructor <init>(IIB)V
    .locals 0

    .line 1
    iput-byte p3, p0, Ln73;->X:B

    .line 2
    .line 3
    iput p1, p0, Ln73;->Y:I

    .line 4
    .line 5
    iput p2, p0, Ln73;->Z:I

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, Ln73;->X:B

    .line 2
    .line 3
    const-string v1, "http"

    .line 4
    .line 5
    const-string v2, "socks"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x1

    .line 9
    iget v5, p0, Ln73;->Z:I

    .line 10
    .line 11
    iget p0, p0, Ln73;->Y:I

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast p1, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean;

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean;->b()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v0, v2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean;->a()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eq v0, p0, :cond_1

    .line 36
    .line 37
    :cond_0
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean;->b()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-static {p0, v1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    if-eqz p0, :cond_2

    .line 46
    .line 47
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/XRayConfig$InboundBean;->a()I

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    if-ne p0, v5, :cond_2

    .line 52
    .line 53
    :cond_1
    move v3, v4

    .line 54
    :cond_2
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0

    .line 59
    :pswitch_0
    check-cast p1, Lbq3;

    .line 60
    .line 61
    const-string v0, "protocol"

    .line 62
    .line 63
    invoke-virtual {p1, v0}, Lbq3;->j(Ljava/lang/String;)Lbo3;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-virtual {v0}, Lbo3;->d()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    const-string v6, "port"

    .line 72
    .line 73
    invoke-virtual {p1, v6}, Lbq3;->j(Ljava/lang/String;)Lbo3;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-virtual {p1}, Lbo3;->a()I

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    invoke-static {v0, v2}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    if-eqz v2, :cond_3

    .line 86
    .line 87
    if-eq p1, p0, :cond_4

    .line 88
    .line 89
    :cond_3
    invoke-static {v0, v1}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result p0

    .line 93
    if-eqz p0, :cond_5

    .line 94
    .line 95
    if-ne p1, v5, :cond_5

    .line 96
    .line 97
    :cond_4
    move v3, v4

    .line 98
    :cond_5
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    return-object p0

    .line 103
    :pswitch_1
    check-cast p1, Lg48;

    .line 104
    .line 105
    if-ltz p0, :cond_6

    .line 106
    .line 107
    if-ltz v5, :cond_6

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 111
    .line 112
    const-string v1, "Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were "

    .line 113
    .line 114
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    const-string v1, " and "

    .line 121
    .line 122
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    const-string v1, " respectively."

    .line 129
    .line 130
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    invoke-static {v0}, Lzc3;->a(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    :goto_0
    move v0, v3

    .line 141
    move v1, v0

    .line 142
    :goto_1
    if-ge v0, p0, :cond_9

    .line 143
    .line 144
    add-int/lit8 v2, v1, 0x1

    .line 145
    .line 146
    iget-wide v6, p1, Lg48;->i0:J

    .line 147
    .line 148
    iget-object v8, p1, Lg48;->Z:Lmi5;

    .line 149
    .line 150
    invoke-static {v6, v7}, Lf88;->d(J)I

    .line 151
    .line 152
    .line 153
    move-result v6

    .line 154
    iget-wide v9, p1, Lg48;->i0:J

    .line 155
    .line 156
    if-le v6, v2, :cond_8

    .line 157
    .line 158
    invoke-static {v9, v10}, Lf88;->d(J)I

    .line 159
    .line 160
    .line 161
    move-result v6

    .line 162
    sub-int/2addr v6, v2

    .line 163
    sub-int/2addr v6, v4

    .line 164
    invoke-virtual {v8, v6}, Lmi5;->charAt(I)C

    .line 165
    .line 166
    .line 167
    move-result v6

    .line 168
    iget-wide v9, p1, Lg48;->i0:J

    .line 169
    .line 170
    invoke-static {v9, v10}, Lf88;->d(J)I

    .line 171
    .line 172
    .line 173
    move-result v7

    .line 174
    sub-int/2addr v7, v2

    .line 175
    invoke-virtual {v8, v7}, Lmi5;->charAt(I)C

    .line 176
    .line 177
    .line 178
    move-result v7

    .line 179
    invoke-static {v6}, Ljava/lang/Character;->isHighSurrogate(C)Z

    .line 180
    .line 181
    .line 182
    move-result v6

    .line 183
    if-eqz v6, :cond_7

    .line 184
    .line 185
    invoke-static {v7}, Ljava/lang/Character;->isLowSurrogate(C)Z

    .line 186
    .line 187
    .line 188
    move-result v6

    .line 189
    if-eqz v6, :cond_7

    .line 190
    .line 191
    add-int/lit8 v1, v1, 0x2

    .line 192
    .line 193
    goto :goto_2

    .line 194
    :cond_7
    move v1, v2

    .line 195
    :goto_2
    add-int/lit8 v0, v0, 0x1

    .line 196
    .line 197
    goto :goto_1

    .line 198
    :cond_8
    invoke-static {v9, v10}, Lf88;->d(J)I

    .line 199
    .line 200
    .line 201
    move-result v1

    .line 202
    :cond_9
    move p0, v3

    .line 203
    :goto_3
    if-ge v3, v5, :cond_c

    .line 204
    .line 205
    add-int/lit8 v0, p0, 0x1

    .line 206
    .line 207
    iget-wide v6, p1, Lg48;->i0:J

    .line 208
    .line 209
    iget-object v2, p1, Lg48;->Z:Lmi5;

    .line 210
    .line 211
    invoke-static {v6, v7}, Lf88;->c(J)I

    .line 212
    .line 213
    .line 214
    move-result v6

    .line 215
    add-int/2addr v6, v0

    .line 216
    invoke-virtual {v2}, Lmi5;->length()I

    .line 217
    .line 218
    .line 219
    move-result v7

    .line 220
    if-ge v6, v7, :cond_b

    .line 221
    .line 222
    iget-wide v6, p1, Lg48;->i0:J

    .line 223
    .line 224
    invoke-static {v6, v7}, Lf88;->c(J)I

    .line 225
    .line 226
    .line 227
    move-result v6

    .line 228
    add-int/2addr v6, v0

    .line 229
    sub-int/2addr v6, v4

    .line 230
    invoke-virtual {v2, v6}, Lmi5;->charAt(I)C

    .line 231
    .line 232
    .line 233
    move-result v6

    .line 234
    iget-wide v7, p1, Lg48;->i0:J

    .line 235
    .line 236
    invoke-static {v7, v8}, Lf88;->c(J)I

    .line 237
    .line 238
    .line 239
    move-result v7

    .line 240
    add-int/2addr v7, v0

    .line 241
    invoke-virtual {v2, v7}, Lmi5;->charAt(I)C

    .line 242
    .line 243
    .line 244
    move-result v2

    .line 245
    invoke-static {v6}, Ljava/lang/Character;->isHighSurrogate(C)Z

    .line 246
    .line 247
    .line 248
    move-result v6

    .line 249
    if-eqz v6, :cond_a

    .line 250
    .line 251
    invoke-static {v2}, Ljava/lang/Character;->isLowSurrogate(C)Z

    .line 252
    .line 253
    .line 254
    move-result v2

    .line 255
    if-eqz v2, :cond_a

    .line 256
    .line 257
    add-int/lit8 p0, p0, 0x2

    .line 258
    .line 259
    goto :goto_4

    .line 260
    :cond_a
    move p0, v0

    .line 261
    :goto_4
    add-int/lit8 v3, v3, 0x1

    .line 262
    .line 263
    goto :goto_3

    .line 264
    :cond_b
    invoke-virtual {v2}, Lmi5;->length()I

    .line 265
    .line 266
    .line 267
    move-result p0

    .line 268
    iget-wide v2, p1, Lg48;->i0:J

    .line 269
    .line 270
    invoke-static {v2, v3}, Lf88;->c(J)I

    .line 271
    .line 272
    .line 273
    move-result v0

    .line 274
    sub-int/2addr p0, v0

    .line 275
    :cond_c
    iget-wide v2, p1, Lg48;->i0:J

    .line 276
    .line 277
    invoke-static {v2, v3}, Lf88;->c(J)I

    .line 278
    .line 279
    .line 280
    move-result v0

    .line 281
    iget-wide v2, p1, Lg48;->i0:J

    .line 282
    .line 283
    invoke-static {v2, v3}, Lf88;->c(J)I

    .line 284
    .line 285
    .line 286
    move-result v2

    .line 287
    add-int/2addr v2, p0

    .line 288
    invoke-static {p1, v0, v2}, Lw79;->D(Lg48;II)V

    .line 289
    .line 290
    .line 291
    iget-wide v2, p1, Lg48;->i0:J

    .line 292
    .line 293
    invoke-static {v2, v3}, Lf88;->d(J)I

    .line 294
    .line 295
    .line 296
    move-result p0

    .line 297
    sub-int/2addr p0, v1

    .line 298
    iget-wide v0, p1, Lg48;->i0:J

    .line 299
    .line 300
    invoke-static {v0, v1}, Lf88;->d(J)I

    .line 301
    .line 302
    .line 303
    move-result v0

    .line 304
    invoke-static {p1, p0, v0}, Lw79;->D(Lg48;II)V

    .line 305
    .line 306
    .line 307
    sget-object p0, Ldn8;->a:Ldn8;

    .line 308
    .line 309
    return-object p0

    .line 310
    nop

    .line 311
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
