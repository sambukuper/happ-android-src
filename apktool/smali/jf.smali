.class public final synthetic Ljf;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ltn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Ljf;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Ljf;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, Ljf;->X:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    const/4 v3, 0x4

    .line 6
    const/4 v4, 0x1

    .line 7
    iget-object p0, p0, Ljf;->Y:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p0, Lzy0;

    .line 13
    .line 14
    check-cast p1, Lk44;

    .line 15
    .line 16
    check-cast p2, Ljava/lang/Integer;

    .line 17
    .line 18
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    check-cast p3, Llp2;

    .line 22
    .line 23
    check-cast p4, Ljava/lang/Integer;

    .line 24
    .line 25
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    and-int/lit8 p4, p2, 0x6

    .line 30
    .line 31
    if-nez p4, :cond_1

    .line 32
    .line 33
    invoke-virtual {p3, p1}, Llp2;->f(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p4

    .line 37
    if-eqz p4, :cond_0

    .line 38
    .line 39
    move v2, v3

    .line 40
    :cond_0
    or-int/2addr p2, v2

    .line 41
    :cond_1
    and-int/lit16 p4, p2, 0x83

    .line 42
    .line 43
    const/16 v0, 0x82

    .line 44
    .line 45
    if-eq p4, v0, :cond_2

    .line 46
    .line 47
    move v1, v4

    .line 48
    :cond_2
    and-int/lit8 p4, p2, 0x1

    .line 49
    .line 50
    invoke-virtual {p3, p4, v1}, Llp2;->N(IZ)Z

    .line 51
    .line 52
    .line 53
    move-result p4

    .line 54
    if-eqz p4, :cond_3

    .line 55
    .line 56
    and-int/lit8 p2, p2, 0xe

    .line 57
    .line 58
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    invoke-virtual {p0, p1, p3, p2}, Lzy0;->x(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_3
    invoke-virtual {p3}, Llp2;->Q()V

    .line 67
    .line 68
    .line 69
    :goto_0
    sget-object p0, Ldn8;->a:Ldn8;

    .line 70
    .line 71
    return-object p0

    .line 72
    :pswitch_0
    check-cast p0, Ly45;

    .line 73
    .line 74
    check-cast p1, Landroid/database/sqlite/SQLiteDatabase;

    .line 75
    .line 76
    check-cast p2, Landroid/database/sqlite/SQLiteCursorDriver;

    .line 77
    .line 78
    check-cast p3, Ljava/lang/String;

    .line 79
    .line 80
    check-cast p4, Landroid/database/sqlite/SQLiteQuery;

    .line 81
    .line 82
    new-instance p1, Lym2;

    .line 83
    .line 84
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    invoke-direct {p1, p4, v1}, Lym2;-><init>(Ljava/io/Closeable;B)V

    .line 88
    .line 89
    .line 90
    iget-object p0, p0, Ly45;->X:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast p0, Lex7;

    .line 93
    .line 94
    iget-object v0, p0, Lex7;->f0:[I

    .line 95
    .line 96
    array-length v0, v0

    .line 97
    move v1, v4

    .line 98
    :goto_1
    if-ge v1, v0, :cond_9

    .line 99
    .line 100
    iget-object v5, p0, Lex7;->f0:[I

    .line 101
    .line 102
    aget v5, v5, v1

    .line 103
    .line 104
    if-eq v5, v4, :cond_8

    .line 105
    .line 106
    if-eq v5, v2, :cond_7

    .line 107
    .line 108
    const/4 v6, 0x3

    .line 109
    if-eq v5, v6, :cond_6

    .line 110
    .line 111
    if-eq v5, v3, :cond_5

    .line 112
    .line 113
    const/4 v6, 0x5

    .line 114
    if-eq v5, v6, :cond_4

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_4
    invoke-interface {p1, v1}, Ldx7;->l(I)V

    .line 118
    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_5
    iget-object v5, p0, Lex7;->j0:[[B

    .line 122
    .line 123
    aget-object v5, v5, v1

    .line 124
    .line 125
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    invoke-interface {p1, v1, v5}, Ldx7;->j(I[B)V

    .line 129
    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_6
    iget-object v5, p0, Lex7;->i0:[Ljava/lang/String;

    .line 133
    .line 134
    aget-object v5, v5, v1

    .line 135
    .line 136
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    invoke-interface {p1, v1, v5}, Ldx7;->t(ILjava/lang/String;)V

    .line 140
    .line 141
    .line 142
    goto :goto_2

    .line 143
    :cond_7
    iget-object v5, p0, Lex7;->h0:[D

    .line 144
    .line 145
    aget-wide v6, v5, v1

    .line 146
    .line 147
    invoke-interface {p1, v1, v6, v7}, Ldx7;->h(ID)V

    .line 148
    .line 149
    .line 150
    goto :goto_2

    .line 151
    :cond_8
    iget-object v5, p0, Lex7;->g0:[J

    .line 152
    .line 153
    aget-wide v6, v5, v1

    .line 154
    .line 155
    invoke-interface {p1, v1, v6, v7}, Ldx7;->i(IJ)V

    .line 156
    .line 157
    .line 158
    :goto_2
    add-int/lit8 v1, v1, 0x1

    .line 159
    .line 160
    goto :goto_1

    .line 161
    :cond_9
    new-instance p0, Landroid/database/sqlite/SQLiteCursor;

    .line 162
    .line 163
    invoke-direct {p0, p2, p3, p4}, Landroid/database/sqlite/SQLiteCursor;-><init>(Landroid/database/sqlite/SQLiteCursorDriver;Ljava/lang/String;Landroid/database/sqlite/SQLiteQuery;)V

    .line 164
    .line 165
    .line 166
    return-object p0

    .line 167
    :pswitch_1
    check-cast p0, Lkf;

    .line 168
    .line 169
    check-cast p1, Lgi2;

    .line 170
    .line 171
    check-cast p2, Ldj2;

    .line 172
    .line 173
    check-cast p3, Lbj2;

    .line 174
    .line 175
    check-cast p4, Lcj2;

    .line 176
    .line 177
    iget-object v0, p0, Lkf;->g0:Lfi2;

    .line 178
    .line 179
    iget p3, p3, Lbj2;->a:I

    .line 180
    .line 181
    iget p4, p4, Lcj2;->a:I

    .line 182
    .line 183
    check-cast v0, Lhi2;

    .line 184
    .line 185
    invoke-virtual {v0, p1, p2, p3, p4}, Lhi2;->b(Lgi2;Ldj2;II)Lrj8;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    instance-of p2, p1, Lrj8;

    .line 190
    .line 191
    if-nez p2, :cond_a

    .line 192
    .line 193
    new-instance p2, Lzv7;

    .line 194
    .line 195
    iget-object p3, p0, Lkf;->l0:Lzv7;

    .line 196
    .line 197
    invoke-direct {p2, p1, p3}, Lzv7;-><init>(Lrj8;Lzv7;)V

    .line 198
    .line 199
    .line 200
    iput-object p2, p0, Lkf;->l0:Lzv7;

    .line 201
    .line 202
    iget-object p0, p2, Lzv7;->Z:Ljava/lang/Object;

    .line 203
    .line 204
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    check-cast p0, Landroid/graphics/Typeface;

    .line 208
    .line 209
    goto :goto_3

    .line 210
    :cond_a
    iget-object p0, p1, Lrj8;->X:Ljava/lang/Object;

    .line 211
    .line 212
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    check-cast p0, Landroid/graphics/Typeface;

    .line 216
    .line 217
    :goto_3
    return-object p0

    .line 218
    nop

    .line 219
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
