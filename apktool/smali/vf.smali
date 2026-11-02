.class public final synthetic Lvf;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ljava/lang/Object;

.field public final synthetic Z:Ljava/lang/Object;

.field public final synthetic f0:Ljava/lang/Object;

.field public final synthetic g0:Ljava/lang/Object;

.field public final synthetic h0:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lb83;Ljava/lang/String;Ljava/lang/String;Lgn2;Lkx4;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput-byte v0, p0, Lvf;->X:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lvf;->Y:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lvf;->g0:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lvf;->Z:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, Lvf;->f0:Ljava/lang/Object;

    .line 14
    .line 15
    iput-object p5, p0, Lvf;->h0:Ljava/lang/Object;

    .line 16
    .line 17
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/io/Serializable;B)V
    .locals 0

    .line 18
    iput-byte p6, p0, Lvf;->X:B

    iput-object p1, p0, Lvf;->Y:Ljava/lang/Object;

    iput-object p2, p0, Lvf;->Z:Ljava/lang/Object;

    iput-object p3, p0, Lvf;->f0:Ljava/lang/Object;

    iput-object p4, p0, Lvf;->g0:Ljava/lang/Object;

    iput-object p5, p0, Lvf;->h0:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, Lvf;->X:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    iget-object v3, p0, Lvf;->h0:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v4, p0, Lvf;->f0:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v5, p0, Lvf;->Z:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v6, p0, Lvf;->g0:Ljava/lang/Object;

    .line 12
    .line 13
    iget-object p0, p0, Lvf;->Y:Ljava/lang/Object;

    .line 14
    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    check-cast p0, Lb83;

    .line 19
    .line 20
    move-object v9, v6

    .line 21
    check-cast v9, Ljava/lang/String;

    .line 22
    .line 23
    move-object v10, v5

    .line 24
    check-cast v10, Ljava/lang/String;

    .line 25
    .line 26
    move-object v11, v4

    .line 27
    check-cast v11, Lgn2;

    .line 28
    .line 29
    move-object v12, v3

    .line 30
    check-cast v12, Lkx4;

    .line 31
    .line 32
    check-cast p1, Ly64;

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eqz v3, :cond_2

    .line 46
    .line 47
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    add-int/lit8 v4, v1, 0x1

    .line 52
    .line 53
    if-ltz v1, :cond_1

    .line 54
    .line 55
    move-object v8, v3

    .line 56
    check-cast v8, Lum6;

    .line 57
    .line 58
    iget-object v3, v8, Lum6;->c:Ljava/lang/String;

    .line 59
    .line 60
    new-instance v7, Lzv2;

    .line 61
    .line 62
    const/4 v13, 0x2

    .line 63
    invoke-direct/range {v7 .. v13}, Lzv2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 64
    .line 65
    .line 66
    new-instance v5, Lzy0;

    .line 67
    .line 68
    const v6, 0x332ca7ee

    .line 69
    .line 70
    .line 71
    invoke-direct {v5, v6, v2, v7}, Lzy0;-><init>(IZLjava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    invoke-static {p1, v3, v5}, Ly64;->a(Ly64;Ljava/lang/Object;Lzy0;)V

    .line 75
    .line 76
    .line 77
    move-object v3, p0

    .line 78
    check-cast v3, Lz0;

    .line 79
    .line 80
    invoke-virtual {v3}, Lz0;->size()I

    .line 81
    .line 82
    .line 83
    move-result v3

    .line 84
    sub-int/2addr v3, v2

    .line 85
    if-eq v1, v3, :cond_0

    .line 86
    .line 87
    iget-object v1, v8, Lum6;->c:Ljava/lang/String;

    .line 88
    .line 89
    const-string v3, "Divider"

    .line 90
    .line 91
    invoke-static {v3, v1}, Loi0;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    new-instance v3, Lhr2;

    .line 96
    .line 97
    const/4 v5, 0x2

    .line 98
    invoke-direct {v3, v12, v5}, Lhr2;-><init>(Lkx4;B)V

    .line 99
    .line 100
    .line 101
    new-instance v5, Lzy0;

    .line 102
    .line 103
    const v6, -0x78f4a9b7

    .line 104
    .line 105
    .line 106
    invoke-direct {v5, v6, v2, v3}, Lzy0;-><init>(IZLjava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    invoke-static {p1, v1, v5}, Ly64;->a(Ly64;Ljava/lang/Object;Lzy0;)V

    .line 110
    .line 111
    .line 112
    :cond_0
    move v1, v4

    .line 113
    goto :goto_0

    .line 114
    :cond_1
    invoke-static {}, Li21;->X()V

    .line 115
    .line 116
    .line 117
    const/4 p0, 0x0

    .line 118
    throw p0

    .line 119
    :cond_2
    sget-object p0, Ldn8;->a:Ldn8;

    .line 120
    .line 121
    return-object p0

    .line 122
    :pswitch_0
    check-cast p0, Luy4;

    .line 123
    .line 124
    check-cast v5, Lea6;

    .line 125
    .line 126
    check-cast v4, Lba6;

    .line 127
    .line 128
    check-cast v6, Lsy6;

    .line 129
    .line 130
    check-cast v3, Laa6;

    .line 131
    .line 132
    check-cast p1, Ljava/lang/Float;

    .line 133
    .line 134
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 135
    .line 136
    .line 137
    move-result p1

    .line 138
    iget-object v0, p0, Luy4;->g:Lx90;

    .line 139
    .line 140
    invoke-static {v0}, Luy4;->g(Lx90;)Lqy4;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    if-eqz v0, :cond_3

    .line 145
    .line 146
    iget-object p0, p0, Lw55;->e:Lmj0;

    .line 147
    .line 148
    iget-wide v7, v0, Lqy4;->b:J

    .line 149
    .line 150
    iget-wide v9, v0, Lqy4;->a:J

    .line 151
    .line 152
    iget-object v11, p0, Lmj0;->Y:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast v11, Lvu8;

    .line 155
    .line 156
    const/16 v12, 0x20

    .line 157
    .line 158
    shr-long v12, v9, v12

    .line 159
    .line 160
    long-to-int v12, v12

    .line 161
    invoke-static {v12}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 162
    .line 163
    .line 164
    move-result v12

    .line 165
    invoke-virtual {v11, v12, v7, v8}, Lvu8;->a(FJ)V

    .line 166
    .line 167
    .line 168
    iget-object p0, p0, Lmj0;->Z:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast p0, Lvu8;

    .line 171
    .line 172
    const-wide v11, 0xffffffffL

    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    and-long/2addr v9, v11

    .line 178
    long-to-int v9, v9

    .line 179
    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 180
    .line 181
    .line 182
    move-result v9

    .line 183
    invoke-virtual {p0, v9, v7, v8}, Lvu8;->a(FJ)V

    .line 184
    .line 185
    .line 186
    iget-object p0, v5, Lea6;->X:Ljava/lang/Object;

    .line 187
    .line 188
    check-cast p0, Lqy4;

    .line 189
    .line 190
    invoke-virtual {p0, v0}, Lqy4;->a(Lqy4;)Lqy4;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    iput-object p0, v5, Lea6;->X:Ljava/lang/Object;

    .line 195
    .line 196
    iget-wide v7, p0, Lqy4;->a:J

    .line 197
    .line 198
    invoke-virtual {v6, v7, v8}, Lsy6;->f(J)J

    .line 199
    .line 200
    .line 201
    move-result-wide v7

    .line 202
    invoke-virtual {v6, v7, v8}, Lsy6;->j(J)F

    .line 203
    .line 204
    .line 205
    move-result p0

    .line 206
    iput p0, v4, Lba6;->X:F

    .line 207
    .line 208
    sub-float/2addr p0, p1

    .line 209
    invoke-static {p0}, Lw79;->G(F)Z

    .line 210
    .line 211
    .line 212
    move-result p0

    .line 213
    xor-int/2addr p0, v2

    .line 214
    iput-boolean p0, v3, Laa6;->X:Z

    .line 215
    .line 216
    :cond_3
    if-eqz v0, :cond_4

    .line 217
    .line 218
    move v1, v2

    .line 219
    :cond_4
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 220
    .line 221
    .line 222
    move-result-object p0

    .line 223
    return-object p0

    .line 224
    :pswitch_1
    check-cast p0, Lir5;

    .line 225
    .line 226
    check-cast v5, Ldn2;

    .line 227
    .line 228
    check-cast v4, Lor5;

    .line 229
    .line 230
    check-cast v6, Ljava/lang/String;

    .line 231
    .line 232
    check-cast v3, Lz24;

    .line 233
    .line 234
    check-cast p1, Leq1;

    .line 235
    .line 236
    iget-object p1, p0, Lir5;->v0:Landroid/view/WindowManager;

    .line 237
    .line 238
    iget-object v0, p0, Lir5;->w0:Landroid/view/WindowManager$LayoutParams;

    .line 239
    .line 240
    invoke-interface {p1, p0, v0}, Landroid/view/ViewManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {p0, v5, v4, v6, v3}, Lir5;->n(Ldn2;Lor5;Ljava/lang/String;Lz24;)V

    .line 244
    .line 245
    .line 246
    new-instance p1, Ljd;

    .line 247
    .line 248
    invoke-direct {p1, p0, v2}, Ljd;-><init>(Ljava/lang/Object;B)V

    .line 249
    .line 250
    .line 251
    return-object p1

    .line 252
    nop

    .line 253
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
