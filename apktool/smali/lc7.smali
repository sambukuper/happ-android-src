.class public final Llc7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final synthetic X:B

.field public Y:I

.field public Z:Z

.field public f0:Ljava/lang/Object;

.field public final synthetic g0:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ldf8;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput-byte v0, p0, Llc7;->X:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Llc7;->g0:Ljava/lang/Object;

    .line 8
    .line 9
    new-instance p1, Lbf8;

    .line 10
    .line 11
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Llc7;->f0:Ljava/lang/Object;

    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    iput-boolean p1, p0, Llc7;->Z:Z

    .line 18
    .line 19
    const/4 p1, 0x0

    .line 20
    iput p1, p0, Llc7;->Y:I

    .line 21
    .line 22
    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/AbstractMap;B)V
    .locals 0

    .line 23
    iput-byte p2, p0, Llc7;->X:B

    iput-object p1, p0, Llc7;->g0:Ljava/lang/Object;

    const/4 p1, -0x1

    iput p1, p0, Llc7;->Y:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/Iterator;
    .locals 2

    .line 1
    iget-byte v0, p0, Llc7;->X:B

    .line 2
    .line 3
    iget-object v1, p0, Llc7;->g0:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Llc7;->f0:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Ljava/util/Iterator;

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    check-cast v1, Lhc7;

    .line 15
    .line 16
    iget-object v0, v1, Lhc7;->Y:Ljava/util/Map;

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iput-object v0, p0, Llc7;->f0:Ljava/lang/Object;

    .line 27
    .line 28
    :cond_0
    return-object v0

    .line 29
    :pswitch_0
    iget-object v0, p0, Llc7;->f0:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, Ljava/util/Iterator;

    .line 32
    .line 33
    if-nez v0, :cond_1

    .line 34
    .line 35
    check-cast v1, Lgc7;

    .line 36
    .line 37
    iget-object v0, v1, Lgc7;->Z:Ljava/util/Map;

    .line 38
    .line 39
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    iput-object v0, p0, Llc7;->f0:Ljava/lang/Object;

    .line 48
    .line 49
    :cond_1
    return-object v0

    .line 50
    nop

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public b(C)I
    .locals 3

    .line 1
    iget-object p0, p0, Llc7;->g0:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ldf8;

    .line 4
    .line 5
    const v0, 0xdbff

    .line 6
    .line 7
    .line 8
    if-lt p1, v0, :cond_0

    .line 9
    .line 10
    return v0

    .line 11
    :cond_0
    invoke-virtual {p0, p1}, Ldf8;->b(C)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    :cond_1
    add-int/lit8 p1, p1, 0x1

    .line 16
    .line 17
    if-gt p1, v0, :cond_2

    .line 18
    .line 19
    int-to-char v2, p1

    .line 20
    invoke-virtual {p0, v2}, Ldf8;->b(C)I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eq v2, v1, :cond_1

    .line 25
    .line 26
    :cond_2
    add-int/lit8 p1, p1, -0x1

    .line 27
    .line 28
    return p1
.end method

.method public final hasNext()Z
    .locals 5

    .line 1
    iget-byte v0, p0, Llc7;->X:B

    .line 2
    .line 3
    iget-object v1, p0, Llc7;->g0:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-boolean v0, p0, Llc7;->Z:Z

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    iget p0, p0, Llc7;->Y:I

    .line 16
    .line 17
    const v0, 0xdc00

    .line 18
    .line 19
    .line 20
    if-ge p0, v0, :cond_1

    .line 21
    .line 22
    :goto_0
    move v2, v3

    .line 23
    :cond_1
    return v2

    .line 24
    :pswitch_0
    iget v0, p0, Llc7;->Y:I

    .line 25
    .line 26
    add-int/2addr v0, v3

    .line 27
    check-cast v1, Lhc7;

    .line 28
    .line 29
    iget-object v4, v1, Lhc7;->X:Ljava/util/List;

    .line 30
    .line 31
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-lt v0, v4, :cond_2

    .line 36
    .line 37
    iget-object v0, v1, Lhc7;->Y:Ljava/util/Map;

    .line 38
    .line 39
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-nez v0, :cond_3

    .line 44
    .line 45
    invoke-virtual {p0}, Llc7;->a()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    if-eqz p0, :cond_3

    .line 54
    .line 55
    :cond_2
    move v2, v3

    .line 56
    :cond_3
    return v2

    .line 57
    :pswitch_1
    iget v0, p0, Llc7;->Y:I

    .line 58
    .line 59
    add-int/2addr v0, v3

    .line 60
    check-cast v1, Lgc7;

    .line 61
    .line 62
    iget-object v1, v1, Lgc7;->Y:Ljava/util/List;

    .line 63
    .line 64
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-lt v0, v1, :cond_4

    .line 69
    .line 70
    invoke-virtual {p0}, Llc7;->a()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    if-eqz p0, :cond_5

    .line 79
    .line 80
    :cond_4
    move v2, v3

    .line 81
    :cond_5
    return v2

    .line 82
    nop

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final next()Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, Llc7;->X:B

    .line 2
    .line 3
    iget-object v1, p0, Llc7;->g0:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast v1, Ldf8;

    .line 10
    .line 11
    invoke-virtual {p0}, Llc7;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_6

    .line 16
    .line 17
    iget v0, p0, Llc7;->Y:I

    .line 18
    .line 19
    const/high16 v3, 0x110000

    .line 20
    .line 21
    if-lt v0, v3, :cond_0

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    iput-boolean v0, p0, Llc7;->Z:Z

    .line 25
    .line 26
    const v0, 0xd800

    .line 27
    .line 28
    .line 29
    iput v0, p0, Llc7;->Y:I

    .line 30
    .line 31
    :cond_0
    iget-boolean v3, p0, Llc7;->Z:Z

    .line 32
    .line 33
    if-eqz v3, :cond_3

    .line 34
    .line 35
    invoke-virtual {v1, v0}, Ldf8;->a(I)I

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    iget v0, p0, Llc7;->Y:I

    .line 40
    .line 41
    invoke-virtual {v1, v0, v3}, Ldf8;->e(II)I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    :goto_0
    const v4, 0x10ffff

    .line 46
    .line 47
    .line 48
    if-lt v0, v4, :cond_1

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_1
    add-int/lit8 v4, v0, 0x1

    .line 52
    .line 53
    invoke-virtual {v1, v4}, Ldf8;->a(I)I

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    if-eq v5, v3, :cond_2

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_2
    invoke-virtual {v1, v4, v5}, Ldf8;->e(II)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    goto :goto_0

    .line 65
    :cond_3
    int-to-char v0, v0

    .line 66
    invoke-virtual {v1, v0}, Ldf8;->b(C)I

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    iget v0, p0, Llc7;->Y:I

    .line 71
    .line 72
    int-to-char v0, v0

    .line 73
    invoke-virtual {p0, v0}, Llc7;->b(C)I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    :goto_1
    const v4, 0xdbff

    .line 78
    .line 79
    .line 80
    if-lt v0, v4, :cond_4

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_4
    add-int/lit8 v4, v0, 0x1

    .line 84
    .line 85
    int-to-char v4, v4

    .line 86
    invoke-virtual {v1, v4}, Ldf8;->b(C)I

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    if-eq v5, v3, :cond_5

    .line 91
    .line 92
    :goto_2
    iget-object v1, p0, Llc7;->f0:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v1, Lbf8;

    .line 95
    .line 96
    iget v4, p0, Llc7;->Y:I

    .line 97
    .line 98
    iput v4, v1, Lbf8;->a:I

    .line 99
    .line 100
    iput v0, v1, Lbf8;->b:I

    .line 101
    .line 102
    iput v3, v1, Lbf8;->c:I

    .line 103
    .line 104
    iget-boolean v3, p0, Llc7;->Z:Z

    .line 105
    .line 106
    xor-int/2addr v3, v2

    .line 107
    iput-boolean v3, v1, Lbf8;->d:Z

    .line 108
    .line 109
    add-int/2addr v0, v2

    .line 110
    iput v0, p0, Llc7;->Y:I

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_5
    invoke-virtual {p0, v4}, Llc7;->b(C)I

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    goto :goto_1

    .line 118
    :cond_6
    invoke-static {}, Lbt;->n()V

    .line 119
    .line 120
    .line 121
    const/4 v1, 0x0

    .line 122
    :goto_3
    return-object v1

    .line 123
    :pswitch_0
    iput-boolean v2, p0, Llc7;->Z:Z

    .line 124
    .line 125
    iget v0, p0, Llc7;->Y:I

    .line 126
    .line 127
    add-int/2addr v0, v2

    .line 128
    iput v0, p0, Llc7;->Y:I

    .line 129
    .line 130
    check-cast v1, Lhc7;

    .line 131
    .line 132
    iget-object v2, v1, Lhc7;->X:Ljava/util/List;

    .line 133
    .line 134
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 135
    .line 136
    .line 137
    move-result v2

    .line 138
    if-ge v0, v2, :cond_7

    .line 139
    .line 140
    iget-object v0, v1, Lhc7;->X:Ljava/util/List;

    .line 141
    .line 142
    iget p0, p0, Llc7;->Y:I

    .line 143
    .line 144
    invoke-interface {v0, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    check-cast p0, Ljava/util/Map$Entry;

    .line 149
    .line 150
    goto :goto_4

    .line 151
    :cond_7
    invoke-virtual {p0}, Llc7;->a()Ljava/util/Iterator;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    check-cast p0, Ljava/util/Map$Entry;

    .line 160
    .line 161
    :goto_4
    return-object p0

    .line 162
    :pswitch_1
    iput-boolean v2, p0, Llc7;->Z:Z

    .line 163
    .line 164
    iget v0, p0, Llc7;->Y:I

    .line 165
    .line 166
    add-int/2addr v0, v2

    .line 167
    iput v0, p0, Llc7;->Y:I

    .line 168
    .line 169
    check-cast v1, Lgc7;

    .line 170
    .line 171
    iget-object v2, v1, Lgc7;->Y:Ljava/util/List;

    .line 172
    .line 173
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 174
    .line 175
    .line 176
    move-result v2

    .line 177
    if-ge v0, v2, :cond_8

    .line 178
    .line 179
    iget-object v0, v1, Lgc7;->Y:Ljava/util/List;

    .line 180
    .line 181
    iget p0, p0, Llc7;->Y:I

    .line 182
    .line 183
    invoke-interface {v0, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    check-cast p0, Ljava/util/Map$Entry;

    .line 188
    .line 189
    goto :goto_5

    .line 190
    :cond_8
    invoke-virtual {p0}, Llc7;->a()Ljava/util/Iterator;

    .line 191
    .line 192
    .line 193
    move-result-object p0

    .line 194
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    check-cast p0, Ljava/util/Map$Entry;

    .line 199
    .line 200
    :goto_5
    return-object p0

    .line 201
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final remove()V
    .locals 4

    .line 1
    iget-byte v0, p0, Llc7;->X:B

    .line 2
    .line 3
    const-string v1, "remove() was called before next()"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, p0, Llc7;->g0:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 14
    .line 15
    .line 16
    throw p0

    .line 17
    :pswitch_0
    check-cast v3, Lhc7;

    .line 18
    .line 19
    iget-boolean v0, p0, Llc7;->Z:Z

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    iput-boolean v2, p0, Llc7;->Z:Z

    .line 24
    .line 25
    sget v0, Lhc7;->h0:I

    .line 26
    .line 27
    invoke-virtual {v3}, Lhc7;->b()V

    .line 28
    .line 29
    .line 30
    iget v0, p0, Llc7;->Y:I

    .line 31
    .line 32
    iget-object v1, v3, Lhc7;->X:Ljava/util/List;

    .line 33
    .line 34
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-ge v0, v1, :cond_0

    .line 39
    .line 40
    iget v0, p0, Llc7;->Y:I

    .line 41
    .line 42
    add-int/lit8 v1, v0, -0x1

    .line 43
    .line 44
    iput v1, p0, Llc7;->Y:I

    .line 45
    .line 46
    invoke-virtual {v3, v0}, Lhc7;->i(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    invoke-virtual {p0}, Llc7;->a()Ljava/util/Iterator;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-interface {p0}, Ljava/util/Iterator;->remove()V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    invoke-static {v1}, Lbt;->i(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    :goto_0
    return-void

    .line 62
    :pswitch_1
    check-cast v3, Lgc7;

    .line 63
    .line 64
    iget-boolean v0, p0, Llc7;->Z:Z

    .line 65
    .line 66
    if-eqz v0, :cond_3

    .line 67
    .line 68
    iput-boolean v2, p0, Llc7;->Z:Z

    .line 69
    .line 70
    sget v0, Lgc7;->h0:I

    .line 71
    .line 72
    invoke-virtual {v3}, Lgc7;->b()V

    .line 73
    .line 74
    .line 75
    iget v0, p0, Llc7;->Y:I

    .line 76
    .line 77
    iget-object v1, v3, Lgc7;->Y:Ljava/util/List;

    .line 78
    .line 79
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-ge v0, v1, :cond_2

    .line 84
    .line 85
    iget v0, p0, Llc7;->Y:I

    .line 86
    .line 87
    add-int/lit8 v1, v0, -0x1

    .line 88
    .line 89
    iput v1, p0, Llc7;->Y:I

    .line 90
    .line 91
    invoke-virtual {v3, v0}, Lgc7;->g(I)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_2
    invoke-virtual {p0}, Llc7;->a()Ljava/util/Iterator;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    invoke-interface {p0}, Ljava/util/Iterator;->remove()V

    .line 100
    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_3
    invoke-static {v1}, Lbt;->i(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    :goto_1
    return-void

    .line 107
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
