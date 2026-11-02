.class public final synthetic Lcd;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:F

.field public final synthetic Z:Ljava/lang/Object;

.field public final synthetic f0:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(FLje;Lg60;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, Lcd;->X:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput p1, p0, Lcd;->Y:F

    .line 8
    .line 9
    iput-object p2, p0, Lcd;->Z:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lcd;->f0:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(Leo5;Laa8;F)V
    .locals 1

    .line 14
    const/4 v0, 0x2

    iput-byte v0, p0, Lcd;->X:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcd;->Z:Ljava/lang/Object;

    iput-object p2, p0, Lcd;->f0:Ljava/lang/Object;

    iput p3, p0, Lcd;->Y:F

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;FLon2;B)V
    .locals 0

    .line 15
    iput-byte p4, p0, Lcd;->X:B

    iput-object p1, p0, Lcd;->Z:Ljava/lang/Object;

    iput p2, p0, Lcd;->Y:F

    iput-object p3, p0, Lcd;->f0:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, Lcd;->X:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    sget-object v3, Ldn8;->a:Ldn8;

    .line 7
    .line 8
    iget-object v4, v0, Lcd;->f0:Ljava/lang/Object;

    .line 9
    .line 10
    iget v5, v0, Lcd;->Y:F

    .line 11
    .line 12
    iget-object v0, v0, Lcd;->Z:Ljava/lang/Object;

    .line 13
    .line 14
    packed-switch v1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    check-cast v0, Lqo8;

    .line 18
    .line 19
    check-cast v4, Lgn2;

    .line 20
    .line 21
    move-object/from16 v1, p1

    .line 22
    .line 23
    check-cast v1, Ljava/lang/Long;

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 26
    .line 27
    .line 28
    move-result-wide v6

    .line 29
    iget-wide v8, v0, Lqo8;->b:J

    .line 30
    .line 31
    const-wide/high16 v10, -0x8000000000000000L

    .line 32
    .line 33
    cmp-long v1, v8, v10

    .line 34
    .line 35
    if-nez v1, :cond_0

    .line 36
    .line 37
    iput-wide v6, v0, Lqo8;->b:J

    .line 38
    .line 39
    move-wide v8, v6

    .line 40
    :cond_0
    new-instance v13, Lsk;

    .line 41
    .line 42
    iget v1, v0, Lqo8;->e:F

    .line 43
    .line 44
    invoke-direct {v13, v1}, Lsk;-><init>(F)V

    .line 45
    .line 46
    .line 47
    cmpg-float v2, v5, v2

    .line 48
    .line 49
    sget-object v14, Lqo8;->f:Lsk;

    .line 50
    .line 51
    if-nez v2, :cond_1

    .line 52
    .line 53
    iget-object v2, v0, Lqo8;->a:Lju8;

    .line 54
    .line 55
    new-instance v5, Lsk;

    .line 56
    .line 57
    invoke-direct {v5, v1}, Lsk;-><init>(F)V

    .line 58
    .line 59
    .line 60
    iget-object v1, v0, Lqo8;->c:Lsk;

    .line 61
    .line 62
    invoke-interface {v2, v5, v14, v1}, Lju8;->d(Lwk;Lwk;Lwk;)J

    .line 63
    .line 64
    .line 65
    move-result-wide v1

    .line 66
    :goto_0
    move-wide v11, v1

    .line 67
    goto :goto_1

    .line 68
    :cond_1
    sub-long v1, v6, v8

    .line 69
    .line 70
    long-to-float v1, v1

    .line 71
    div-float/2addr v1, v5

    .line 72
    float-to-double v1, v1

    .line 73
    invoke-static {v1, v2}, Lnr4;->P(D)J

    .line 74
    .line 75
    .line 76
    move-result-wide v1

    .line 77
    goto :goto_0

    .line 78
    :goto_1
    iget-object v10, v0, Lqo8;->a:Lju8;

    .line 79
    .line 80
    iget-object v15, v0, Lqo8;->c:Lsk;

    .line 81
    .line 82
    invoke-interface/range {v10 .. v15}, Lju8;->z(JLwk;Lwk;Lwk;)Lwk;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    check-cast v1, Lsk;

    .line 87
    .line 88
    iget v1, v1, Lsk;->a:F

    .line 89
    .line 90
    iget-object v10, v0, Lqo8;->a:Lju8;

    .line 91
    .line 92
    iget-object v15, v0, Lqo8;->c:Lsk;

    .line 93
    .line 94
    invoke-interface/range {v10 .. v15}, Lju8;->m(JLwk;Lwk;Lwk;)Lwk;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    check-cast v2, Lsk;

    .line 99
    .line 100
    iput-object v2, v0, Lqo8;->c:Lsk;

    .line 101
    .line 102
    iput-wide v6, v0, Lqo8;->b:J

    .line 103
    .line 104
    iget v2, v0, Lqo8;->e:F

    .line 105
    .line 106
    sub-float/2addr v2, v1

    .line 107
    iput v1, v0, Lqo8;->e:F

    .line 108
    .line 109
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-interface {v4, v0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    return-object v3

    .line 117
    :pswitch_0
    check-cast v0, Leo5;

    .line 118
    .line 119
    check-cast v4, Laa8;

    .line 120
    .line 121
    move-object/from16 v1, p1

    .line 122
    .line 123
    check-cast v1, Ldo5;

    .line 124
    .line 125
    iget-object v2, v4, Laa8;->u0:Loi;

    .line 126
    .line 127
    if-eqz v2, :cond_2

    .line 128
    .line 129
    invoke-virtual {v2}, Loi;->d()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    check-cast v2, Ljava/lang/Number;

    .line 134
    .line 135
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 136
    .line 137
    .line 138
    move-result v2

    .line 139
    float-to-int v2, v2

    .line 140
    goto :goto_2

    .line 141
    :cond_2
    float-to-int v2, v5

    .line 142
    :goto_2
    const/4 v4, 0x0

    .line 143
    invoke-static {v1, v0, v2, v4}, Ldo5;->h(Ldo5;Leo5;II)V

    .line 144
    .line 145
    .line 146
    return-object v3

    .line 147
    :pswitch_1
    check-cast v0, Loi;

    .line 148
    .line 149
    check-cast v4, Ldn2;

    .line 150
    .line 151
    move-object/from16 v1, p1

    .line 152
    .line 153
    check-cast v1, Lpk6;

    .line 154
    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v0}, Loi;->d()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    check-cast v0, Ljava/lang/Number;

    .line 163
    .line 164
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    invoke-virtual {v1, v0}, Lpk6;->n(F)V

    .line 169
    .line 170
    .line 171
    invoke-interface {v4}, Ldn2;->invoke()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    check-cast v0, Ljava/lang/Number;

    .line 176
    .line 177
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 178
    .line 179
    .line 180
    move-result v0

    .line 181
    mul-float/2addr v0, v5

    .line 182
    invoke-virtual {v1, v0}, Lpk6;->b(F)V

    .line 183
    .line 184
    .line 185
    new-instance v0, Lu24;

    .line 186
    .line 187
    const/high16 v2, 0x41000000    # 8.0f

    .line 188
    .line 189
    invoke-direct {v0, v2, v2, v2, v2}, Lu24;-><init>(FFFF)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v1, v0}, Lpk6;->f(Lu24;)V

    .line 193
    .line 194
    .line 195
    return-object v3

    .line 196
    :pswitch_2
    check-cast v0, Lje;

    .line 197
    .line 198
    move-object v9, v4

    .line 199
    check-cast v9, Lg60;

    .line 200
    .line 201
    move-object/from16 v4, p1

    .line 202
    .line 203
    check-cast v4, Lp34;

    .line 204
    .line 205
    invoke-virtual {v4}, Lp34;->a()V

    .line 206
    .line 207
    .line 208
    iget-object v1, v4, Lp34;->X:Lum0;

    .line 209
    .line 210
    iget-object v1, v1, Lum0;->Y:Llr;

    .line 211
    .line 212
    invoke-virtual {v1}, Llr;->p()J

    .line 213
    .line 214
    .line 215
    move-result-wide v12

    .line 216
    invoke-virtual {v1}, Llr;->k()Lsm0;

    .line 217
    .line 218
    .line 219
    move-result-object v6

    .line 220
    invoke-interface {v6}, Lsm0;->g()V

    .line 221
    .line 222
    .line 223
    :try_start_0
    iget-object v6, v1, Llr;->Y:Ljava/lang/Object;

    .line 224
    .line 225
    check-cast v6, Lwl6;

    .line 226
    .line 227
    invoke-virtual {v6, v5, v2}, Lwl6;->V(FF)V

    .line 228
    .line 229
    .line 230
    const/high16 v2, 0x42340000    # 45.0f

    .line 231
    .line 232
    const-wide/16 v7, 0x0

    .line 233
    .line 234
    invoke-virtual {v6, v2, v7, v8}, Lwl6;->T(FJ)V

    .line 235
    .line 236
    .line 237
    const/4 v10, 0x0

    .line 238
    const/16 v11, 0x2e

    .line 239
    .line 240
    const-wide/16 v6, 0x0

    .line 241
    .line 242
    const/4 v8, 0x0

    .line 243
    move-object v5, v0

    .line 244
    invoke-static/range {v4 .. v11}, Lsv1;->U(Lsv1;Lje;JFLg60;II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 245
    .line 246
    .line 247
    invoke-static {v1, v12, v13}, Lp61;->w(Llr;J)V

    .line 248
    .line 249
    .line 250
    return-object v3

    .line 251
    :catchall_0
    move-exception v0

    .line 252
    invoke-static {v1, v12, v13}, Lp61;->w(Llr;J)V

    .line 253
    .line 254
    .line 255
    throw v0

    .line 256
    nop

    .line 257
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
