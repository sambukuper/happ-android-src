.class public final Lcc2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lxe2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lxe2;

.field public final synthetic Z:Lqc2;


# direct methods
.method public synthetic constructor <init>(Lxe2;Lqc2;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Lcc2;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lcc2;->Y:Lxe2;

    .line 4
    .line 5
    iput-object p2, p0, Lcc2;->Z:Lqc2;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(Lze2;Lq51;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, Lcc2;->X:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    iget-object v2, p0, Lcc2;->Z:Lqc2;

    .line 6
    .line 7
    iget-object v3, p0, Lcc2;->Y:Lxe2;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const-string v5, "call to \'resume\' before \'invoke\' with coroutine"

    .line 11
    .line 12
    sget-object v6, Lc71;->X:Lc71;

    .line 13
    .line 14
    const/high16 v7, -0x80000000

    .line 15
    .line 16
    const/4 v8, 0x1

    .line 17
    packed-switch v0, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    instance-of v0, p2, Ljc2;

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    move-object v0, p2

    .line 25
    check-cast v0, Ljc2;

    .line 26
    .line 27
    iget v9, v0, Ljc2;->g0:I

    .line 28
    .line 29
    and-int v10, v9, v7

    .line 30
    .line 31
    if-eqz v10, :cond_0

    .line 32
    .line 33
    sub-int/2addr v9, v7

    .line 34
    iput v9, v0, Ljc2;->g0:I

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    new-instance v0, Ljc2;

    .line 38
    .line 39
    invoke-direct {v0, p0, p2}, Ljc2;-><init>(Lcc2;Lq51;)V

    .line 40
    .line 41
    .line 42
    :goto_0
    iget-object p0, v0, Ljc2;->f0:Ljava/lang/Object;

    .line 43
    .line 44
    iget p2, v0, Ljc2;->g0:I

    .line 45
    .line 46
    if-eqz p2, :cond_2

    .line 47
    .line 48
    if-ne p2, v8, :cond_1

    .line 49
    .line 50
    invoke-static {p0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    invoke-static {v5}, Lbt;->i(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    move-object v1, v4

    .line 58
    goto :goto_1

    .line 59
    :cond_2
    invoke-static {p0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    new-instance p0, Lbc2;

    .line 63
    .line 64
    const/4 p2, 0x3

    .line 65
    invoke-direct {p0, p1, v2, p2}, Lbc2;-><init>(Lze2;Lqc2;B)V

    .line 66
    .line 67
    .line 68
    iput v8, v0, Ljc2;->g0:I

    .line 69
    .line 70
    invoke-interface {v3, p0, v0}, Lxe2;->a(Lze2;Lq51;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    if-ne p0, v6, :cond_3

    .line 75
    .line 76
    move-object v1, v6

    .line 77
    :cond_3
    :goto_1
    return-object v1

    .line 78
    :pswitch_0
    instance-of v0, p2, Lhc2;

    .line 79
    .line 80
    if-eqz v0, :cond_4

    .line 81
    .line 82
    move-object v0, p2

    .line 83
    check-cast v0, Lhc2;

    .line 84
    .line 85
    iget v9, v0, Lhc2;->g0:I

    .line 86
    .line 87
    and-int v10, v9, v7

    .line 88
    .line 89
    if-eqz v10, :cond_4

    .line 90
    .line 91
    sub-int/2addr v9, v7

    .line 92
    iput v9, v0, Lhc2;->g0:I

    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_4
    new-instance v0, Lhc2;

    .line 96
    .line 97
    invoke-direct {v0, p0, p2}, Lhc2;-><init>(Lcc2;Lq51;)V

    .line 98
    .line 99
    .line 100
    :goto_2
    iget-object p0, v0, Lhc2;->f0:Ljava/lang/Object;

    .line 101
    .line 102
    iget p2, v0, Lhc2;->g0:I

    .line 103
    .line 104
    if-eqz p2, :cond_6

    .line 105
    .line 106
    if-ne p2, v8, :cond_5

    .line 107
    .line 108
    invoke-static {p0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_5
    invoke-static {v5}, Lbt;->i(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    move-object v1, v4

    .line 116
    goto :goto_3

    .line 117
    :cond_6
    invoke-static {p0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    new-instance p0, Lbc2;

    .line 121
    .line 122
    const/4 p2, 0x2

    .line 123
    invoke-direct {p0, p1, v2, p2}, Lbc2;-><init>(Lze2;Lqc2;B)V

    .line 124
    .line 125
    .line 126
    iput v8, v0, Lhc2;->g0:I

    .line 127
    .line 128
    invoke-interface {v3, p0, v0}, Lxe2;->a(Lze2;Lq51;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    if-ne p0, v6, :cond_7

    .line 133
    .line 134
    move-object v1, v6

    .line 135
    :cond_7
    :goto_3
    return-object v1

    .line 136
    :pswitch_1
    instance-of v0, p2, Lfc2;

    .line 137
    .line 138
    if-eqz v0, :cond_8

    .line 139
    .line 140
    move-object v0, p2

    .line 141
    check-cast v0, Lfc2;

    .line 142
    .line 143
    iget v9, v0, Lfc2;->g0:I

    .line 144
    .line 145
    and-int v10, v9, v7

    .line 146
    .line 147
    if-eqz v10, :cond_8

    .line 148
    .line 149
    sub-int/2addr v9, v7

    .line 150
    iput v9, v0, Lfc2;->g0:I

    .line 151
    .line 152
    goto :goto_4

    .line 153
    :cond_8
    new-instance v0, Lfc2;

    .line 154
    .line 155
    invoke-direct {v0, p0, p2}, Lfc2;-><init>(Lcc2;Lq51;)V

    .line 156
    .line 157
    .line 158
    :goto_4
    iget-object p0, v0, Lfc2;->f0:Ljava/lang/Object;

    .line 159
    .line 160
    iget p2, v0, Lfc2;->g0:I

    .line 161
    .line 162
    if-eqz p2, :cond_a

    .line 163
    .line 164
    if-ne p2, v8, :cond_9

    .line 165
    .line 166
    invoke-static {p0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 167
    .line 168
    .line 169
    goto :goto_5

    .line 170
    :cond_9
    invoke-static {v5}, Lbt;->i(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    move-object v1, v4

    .line 174
    goto :goto_5

    .line 175
    :cond_a
    invoke-static {p0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    new-instance p0, Lbc2;

    .line 179
    .line 180
    invoke-direct {p0, p1, v2, v8}, Lbc2;-><init>(Lze2;Lqc2;B)V

    .line 181
    .line 182
    .line 183
    iput v8, v0, Lfc2;->g0:I

    .line 184
    .line 185
    invoke-interface {v3, p0, v0}, Lxe2;->a(Lze2;Lq51;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object p0

    .line 189
    if-ne p0, v6, :cond_b

    .line 190
    .line 191
    move-object v1, v6

    .line 192
    :cond_b
    :goto_5
    return-object v1

    .line 193
    :pswitch_2
    instance-of v0, p2, Lzb2;

    .line 194
    .line 195
    if-eqz v0, :cond_c

    .line 196
    .line 197
    move-object v0, p2

    .line 198
    check-cast v0, Lzb2;

    .line 199
    .line 200
    iget v9, v0, Lzb2;->g0:I

    .line 201
    .line 202
    and-int v10, v9, v7

    .line 203
    .line 204
    if-eqz v10, :cond_c

    .line 205
    .line 206
    sub-int/2addr v9, v7

    .line 207
    iput v9, v0, Lzb2;->g0:I

    .line 208
    .line 209
    goto :goto_6

    .line 210
    :cond_c
    new-instance v0, Lzb2;

    .line 211
    .line 212
    invoke-direct {v0, p0, p2}, Lzb2;-><init>(Lcc2;Lq51;)V

    .line 213
    .line 214
    .line 215
    :goto_6
    iget-object p0, v0, Lzb2;->f0:Ljava/lang/Object;

    .line 216
    .line 217
    iget p2, v0, Lzb2;->g0:I

    .line 218
    .line 219
    if-eqz p2, :cond_e

    .line 220
    .line 221
    if-ne p2, v8, :cond_d

    .line 222
    .line 223
    invoke-static {p0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    goto :goto_7

    .line 227
    :cond_d
    invoke-static {v5}, Lbt;->i(Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    move-object v1, v4

    .line 231
    goto :goto_7

    .line 232
    :cond_e
    invoke-static {p0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    new-instance p0, Lbc2;

    .line 236
    .line 237
    const/4 p2, 0x0

    .line 238
    invoke-direct {p0, p1, v2, p2}, Lbc2;-><init>(Lze2;Lqc2;B)V

    .line 239
    .line 240
    .line 241
    iput v8, v0, Lzb2;->g0:I

    .line 242
    .line 243
    invoke-interface {v3, p0, v0}, Lxe2;->a(Lze2;Lq51;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object p0

    .line 247
    if-ne p0, v6, :cond_f

    .line 248
    .line 249
    move-object v1, v6

    .line 250
    :cond_f
    :goto_7
    return-object v1

    .line 251
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
