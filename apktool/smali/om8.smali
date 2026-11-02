.class public final Lom8;
.super Lhm8;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final synthetic a:B

.field public final b:I


# direct methods
.method public synthetic constructor <init>(BI)V
    .locals 0

    .line 1
    iput-byte p1, p0, Lom8;->a:B

    .line 2
    .line 3
    iput p2, p0, Lom8;->b:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    iget-byte v0, p0, Lom8;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget p0, p0, Lom8;->b:I

    .line 7
    .line 8
    return p0

    .line 9
    :pswitch_0
    iget p0, p0, Lom8;->b:I

    .line 10
    .line 11
    return p0

    .line 12
    :pswitch_1
    iget p0, p0, Lom8;->b:I

    .line 13
    .line 14
    return p0

    .line 15
    :pswitch_2
    iget p0, p0, Lom8;->b:I

    .line 16
    .line 17
    return p0

    .line 18
    :pswitch_3
    iget p0, p0, Lom8;->b:I

    .line 19
    .line 20
    return p0

    .line 21
    :pswitch_4
    iget p0, p0, Lom8;->b:I

    .line 22
    .line 23
    return p0

    .line 24
    :pswitch_5
    iget p0, p0, Lom8;->b:I

    .line 25
    .line 26
    return p0

    .line 27
    :pswitch_6
    iget p0, p0, Lom8;->b:I

    .line 28
    .line 29
    return p0

    .line 30
    :pswitch_7
    iget p0, p0, Lom8;->b:I

    .line 31
    .line 32
    return p0

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
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

.method public final b()C
    .locals 0

    .line 1
    iget-byte p0, p0, Lom8;->a:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/16 p0, 0x79

    .line 7
    .line 8
    return p0

    .line 9
    :pswitch_0
    const/16 p0, 0x75

    .line 10
    .line 11
    return p0

    .line 12
    :pswitch_1
    const/16 p0, 0x71

    .line 13
    .line 14
    return p0

    .line 15
    :pswitch_2
    const/16 p0, 0x4c

    .line 16
    .line 17
    return p0

    .line 18
    :pswitch_3
    const/16 p0, 0x72

    .line 19
    .line 20
    return p0

    .line 21
    :pswitch_4
    const/16 p0, 0x51

    .line 22
    .line 23
    return p0

    .line 24
    :pswitch_5
    const/16 p0, 0x4d

    .line 25
    .line 26
    return p0

    .line 27
    :pswitch_6
    const/16 p0, 0x47

    .line 28
    .line 29
    return p0

    .line 30
    :pswitch_7
    const/16 p0, 0x55

    .line 31
    .line 32
    return p0

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
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

.method public final c(Lzb1;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lom8;->d(Lbc1;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final d(Lbc1;)V
    .locals 10

    .line 1
    iget-byte v0, p0, Lom8;->a:B

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    sget-object v2, Ldg5;->X:Ldg5;

    .line 5
    .line 6
    sget-object v3, Ldg5;->Y:Ldg5;

    .line 7
    .line 8
    const/4 v4, 0x4

    .line 9
    const/4 v5, 0x3

    .line 10
    const/4 v6, 0x2

    .line 11
    const/4 v7, 0x1

    .line 12
    iget v8, p0, Lom8;->b:I

    .line 13
    .line 14
    const/4 v9, 0x0

    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    if-eq v8, v7, :cond_3

    .line 19
    .line 20
    if-eq v8, v6, :cond_2

    .line 21
    .line 22
    if-eq v8, v5, :cond_1

    .line 23
    .line 24
    if-ne v8, v4, :cond_0

    .line 25
    .line 26
    sget-object p0, Ld79;->a:Lhb3;

    .line 27
    .line 28
    check-cast p1, Lp3;

    .line 29
    .line 30
    new-instance p0, Lc30;

    .line 31
    .line 32
    new-instance v0, Ls69;

    .line 33
    .line 34
    invoke-direct {v0, v3, v7}, Ls69;-><init>(Ldg5;Z)V

    .line 35
    .line 36
    .line 37
    invoke-direct {p0, v0}, Lc30;-><init>(Lz82;)V

    .line 38
    .line 39
    .line 40
    invoke-interface {p1, p0}, Lp3;->h(Lc30;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_0
    invoke-static {p0, v8}, Lvm8;->g(Lom8;I)V

    .line 45
    .line 46
    .line 47
    throw v9

    .line 48
    :cond_1
    invoke-static {p0, v8}, Lvm8;->g(Lom8;I)V

    .line 49
    .line 50
    .line 51
    throw v9

    .line 52
    :cond_2
    sget-object p0, Ld79;->a:Lhb3;

    .line 53
    .line 54
    check-cast p1, Lp3;

    .line 55
    .line 56
    new-instance p0, Lc30;

    .line 57
    .line 58
    new-instance v0, Ly96;

    .line 59
    .line 60
    invoke-direct {v0, v7}, Ly96;-><init>(Z)V

    .line 61
    .line 62
    .line 63
    invoke-direct {p0, v0}, Lc30;-><init>(Lz82;)V

    .line 64
    .line 65
    .line 66
    invoke-interface {p1, p0}, Lp3;->h(Lc30;)V

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_3
    sget-object p0, Ld79;->a:Lhb3;

    .line 71
    .line 72
    check-cast p1, Lp3;

    .line 73
    .line 74
    new-instance p0, Lc30;

    .line 75
    .line 76
    new-instance v0, Ls69;

    .line 77
    .line 78
    invoke-direct {v0, v2, v7}, Ls69;-><init>(Ldg5;Z)V

    .line 79
    .line 80
    .line 81
    invoke-direct {p0, v0}, Lc30;-><init>(Lz82;)V

    .line 82
    .line 83
    .line 84
    invoke-interface {p1, p0}, Lp3;->h(Lc30;)V

    .line 85
    .line 86
    .line 87
    :goto_0
    return-void

    .line 88
    :pswitch_0
    if-eq v8, v7, :cond_7

    .line 89
    .line 90
    if-eq v8, v6, :cond_6

    .line 91
    .line 92
    if-eq v8, v5, :cond_5

    .line 93
    .line 94
    if-ne v8, v4, :cond_4

    .line 95
    .line 96
    invoke-interface {p1, v3}, Lbc1;->d(Ldg5;)V

    .line 97
    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_4
    invoke-static {p0, v8}, Lvm8;->g(Lom8;I)V

    .line 101
    .line 102
    .line 103
    throw v9

    .line 104
    :cond_5
    invoke-static {p0, v8}, Lvm8;->g(Lom8;I)V

    .line 105
    .line 106
    .line 107
    throw v9

    .line 108
    :cond_6
    check-cast p1, Lp3;

    .line 109
    .line 110
    new-instance p0, Lc30;

    .line 111
    .line 112
    new-instance v0, Ly96;

    .line 113
    .line 114
    const/4 v1, 0x0

    .line 115
    invoke-direct {v0, v1}, Ly96;-><init>(Z)V

    .line 116
    .line 117
    .line 118
    invoke-direct {p0, v0}, Lc30;-><init>(Lz82;)V

    .line 119
    .line 120
    .line 121
    invoke-interface {p1, p0}, Lp3;->h(Lc30;)V

    .line 122
    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_7
    invoke-interface {p1, v2}, Lbc1;->d(Ldg5;)V

    .line 126
    .line 127
    .line 128
    :goto_1
    return-void

    .line 129
    :pswitch_1
    if-eq v8, v7, :cond_9

    .line 130
    .line 131
    if-eq v8, v6, :cond_9

    .line 132
    .line 133
    if-eq v8, v5, :cond_8

    .line 134
    .line 135
    if-eq v8, v4, :cond_8

    .line 136
    .line 137
    if-eq v8, v1, :cond_8

    .line 138
    .line 139
    invoke-static {p0}, Lvm8;->e(Lqm8;)V

    .line 140
    .line 141
    .line 142
    throw v9

    .line 143
    :cond_8
    invoke-static {p0}, Lvm8;->c(Lqm8;)V

    .line 144
    .line 145
    .line 146
    throw v9

    .line 147
    :cond_9
    const-string p0, "standalone-quarter-of-year"

    .line 148
    .line 149
    invoke-static {p0, v9}, Lvm8;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    throw v9

    .line 153
    :pswitch_2
    if-eq v8, v7, :cond_c

    .line 154
    .line 155
    if-eq v8, v6, :cond_b

    .line 156
    .line 157
    if-eq v8, v5, :cond_a

    .line 158
    .line 159
    if-eq v8, v4, :cond_a

    .line 160
    .line 161
    if-eq v8, v1, :cond_a

    .line 162
    .line 163
    invoke-static {p0}, Lvm8;->e(Lqm8;)V

    .line 164
    .line 165
    .line 166
    throw v9

    .line 167
    :cond_a
    invoke-static {p0}, Lvm8;->c(Lqm8;)V

    .line 168
    .line 169
    .line 170
    throw v9

    .line 171
    :cond_b
    invoke-interface {p1, v3}, Lbc1;->e(Ldg5;)V

    .line 172
    .line 173
    .line 174
    goto :goto_2

    .line 175
    :cond_c
    invoke-interface {p1, v2}, Lbc1;->e(Ldg5;)V

    .line 176
    .line 177
    .line 178
    :goto_2
    return-void

    .line 179
    :pswitch_3
    const-string p0, "related-gregorian-year"

    .line 180
    .line 181
    invoke-static {p0, v9}, Lvm8;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    throw v9

    .line 185
    :pswitch_4
    if-eq v8, v7, :cond_e

    .line 186
    .line 187
    if-eq v8, v6, :cond_e

    .line 188
    .line 189
    if-eq v8, v5, :cond_d

    .line 190
    .line 191
    if-eq v8, v4, :cond_d

    .line 192
    .line 193
    if-eq v8, v1, :cond_d

    .line 194
    .line 195
    invoke-static {p0}, Lvm8;->e(Lqm8;)V

    .line 196
    .line 197
    .line 198
    throw v9

    .line 199
    :cond_d
    invoke-static {p0}, Lvm8;->c(Lqm8;)V

    .line 200
    .line 201
    .line 202
    throw v9

    .line 203
    :cond_e
    const-string p0, "quarter-of-year"

    .line 204
    .line 205
    invoke-static {p0, v9}, Lvm8;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    throw v9

    .line 209
    :pswitch_5
    if-eq v8, v7, :cond_11

    .line 210
    .line 211
    if-eq v8, v6, :cond_10

    .line 212
    .line 213
    if-eq v8, v5, :cond_f

    .line 214
    .line 215
    if-eq v8, v4, :cond_f

    .line 216
    .line 217
    if-eq v8, v1, :cond_f

    .line 218
    .line 219
    invoke-static {p0}, Lvm8;->e(Lqm8;)V

    .line 220
    .line 221
    .line 222
    throw v9

    .line 223
    :cond_f
    invoke-static {p0}, Lvm8;->c(Lqm8;)V

    .line 224
    .line 225
    .line 226
    throw v9

    .line 227
    :cond_10
    invoke-interface {p1, v3}, Lbc1;->e(Ldg5;)V

    .line 228
    .line 229
    .line 230
    goto :goto_3

    .line 231
    :cond_11
    invoke-interface {p1, v2}, Lbc1;->e(Ldg5;)V

    .line 232
    .line 233
    .line 234
    :goto_3
    return-void

    .line 235
    :pswitch_6
    invoke-static {p0}, Lvm8;->c(Lqm8;)V

    .line 236
    .line 237
    .line 238
    throw v9

    .line 239
    :pswitch_7
    const-string p0, "cyclic-year"

    .line 240
    .line 241
    invoke-static {p0, v9}, Lvm8;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    throw v9

    .line 245
    :pswitch_data_0
    .packed-switch 0x0
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
