.class public final synthetic Ld1;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Leo5;


# direct methods
.method public synthetic constructor <init>(Leo5;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Ld1;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Ld1;->Y:Leo5;

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
    .locals 7

    .line 1
    iget-byte v0, p0, Ld1;->X:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, Ldn8;->a:Ldn8;

    .line 5
    .line 6
    iget-object p0, p0, Ld1;->Y:Leo5;

    .line 7
    .line 8
    check-cast p1, Ldo5;

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    invoke-static {p1, p0, v1, v1}, Ldo5;->h(Ldo5;Leo5;II)V

    .line 14
    .line 15
    .line 16
    return-object v2

    .line 17
    :pswitch_0
    invoke-static {p1, p0, v1, v1}, Ldo5;->f(Ldo5;Leo5;II)V

    .line 18
    .line 19
    .line 20
    return-object v2

    .line 21
    :pswitch_1
    invoke-static {p1, p0, v1, v1}, Ldo5;->f(Ldo5;Leo5;II)V

    .line 22
    .line 23
    .line 24
    return-object v2

    .line 25
    :pswitch_2
    invoke-static {p1, p0, v1, v1}, Ldo5;->f(Ldo5;Leo5;II)V

    .line 26
    .line 27
    .line 28
    return-object v2

    .line 29
    :pswitch_3
    invoke-static {p1, p0, v1, v1}, Ldo5;->h(Ldo5;Leo5;II)V

    .line 30
    .line 31
    .line 32
    return-object v2

    .line 33
    :pswitch_4
    invoke-static {p1, p0, v1, v1}, Ldo5;->f(Ldo5;Leo5;II)V

    .line 34
    .line 35
    .line 36
    return-object v2

    .line 37
    :pswitch_5
    invoke-static {p1, p0, v1, v1}, Ldo5;->f(Ldo5;Leo5;II)V

    .line 38
    .line 39
    .line 40
    return-object v2

    .line 41
    :pswitch_6
    invoke-static {p1, p0, v1, v1}, Ldo5;->f(Ldo5;Leo5;II)V

    .line 42
    .line 43
    .line 44
    return-object v2

    .line 45
    :pswitch_7
    invoke-static {p1, p0, v1, v1}, Ldo5;->h(Ldo5;Leo5;II)V

    .line 46
    .line 47
    .line 48
    return-object v2

    .line 49
    :pswitch_8
    invoke-static {p1, p0, v1, v1}, Ldo5;->j(Ldo5;Leo5;II)V

    .line 50
    .line 51
    .line 52
    return-object v2

    .line 53
    :pswitch_9
    invoke-static {p1, p0, v1, v1}, Ldo5;->h(Ldo5;Leo5;II)V

    .line 54
    .line 55
    .line 56
    return-object v2

    .line 57
    :pswitch_a
    invoke-static {p1, p0, v1, v1}, Ldo5;->f(Ldo5;Leo5;II)V

    .line 58
    .line 59
    .line 60
    return-object v2

    .line 61
    :pswitch_b
    invoke-virtual {p1}, Ldo5;->b()Lz24;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    sget-object v1, Lz24;->X:Lz24;

    .line 66
    .line 67
    const/4 v3, 0x0

    .line 68
    const/4 v4, 0x0

    .line 69
    if-eq v0, v1, :cond_1

    .line 70
    .line 71
    invoke-virtual {p1}, Ldo5;->c()I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-nez v0, :cond_0

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_0
    invoke-virtual {p1}, Ldo5;->c()I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    iget v1, p0, Leo5;->X:I

    .line 83
    .line 84
    sub-int/2addr v0, v1

    .line 85
    int-to-long v0, v0

    .line 86
    const/16 v5, 0x20

    .line 87
    .line 88
    shl-long/2addr v0, v5

    .line 89
    invoke-virtual {p1, p0}, Ldo5;->d(Leo5;)V

    .line 90
    .line 91
    .line 92
    iget-wide v5, p0, Leo5;->g0:J

    .line 93
    .line 94
    invoke-static {v0, v1, v5, v6}, Lhf3;->c(JJ)J

    .line 95
    .line 96
    .line 97
    move-result-wide v0

    .line 98
    invoke-virtual {p0, v0, v1, v3, v4}, Leo5;->S(JFLgn2;)V

    .line 99
    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_1
    :goto_0
    invoke-virtual {p1, p0}, Ldo5;->d(Leo5;)V

    .line 103
    .line 104
    .line 105
    iget-wide v0, p0, Leo5;->g0:J

    .line 106
    .line 107
    const-wide/16 v5, 0x0

    .line 108
    .line 109
    invoke-static {v5, v6, v0, v1}, Lhf3;->c(JJ)J

    .line 110
    .line 111
    .line 112
    move-result-wide v0

    .line 113
    invoke-virtual {p0, v0, v1, v3, v4}, Leo5;->S(JFLgn2;)V

    .line 114
    .line 115
    .line 116
    :goto_1
    return-object v2

    .line 117
    :pswitch_c
    invoke-static {p1, p0, v1, v1}, Ldo5;->h(Ldo5;Leo5;II)V

    .line 118
    .line 119
    .line 120
    return-object v2

    .line 121
    :pswitch_d
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    iget v0, p0, Leo5;->X:I

    .line 125
    .line 126
    neg-int v0, v0

    .line 127
    div-int/lit8 v0, v0, 0x2

    .line 128
    .line 129
    iget v1, p0, Leo5;->Y:I

    .line 130
    .line 131
    neg-int v1, v1

    .line 132
    const/high16 v3, 0x41c00000    # 24.0f

    .line 133
    .line 134
    invoke-interface {p1, v3}, Lfi1;->x0(F)I

    .line 135
    .line 136
    .line 137
    move-result v3

    .line 138
    sub-int/2addr v1, v3

    .line 139
    invoke-static {p1, p0, v0, v1}, Ldo5;->h(Ldo5;Leo5;II)V

    .line 140
    .line 141
    .line 142
    return-object v2

    .line 143
    :pswitch_e
    invoke-static {p1, p0, v1, v1}, Ldo5;->h(Ldo5;Leo5;II)V

    .line 144
    .line 145
    .line 146
    return-object v2

    .line 147
    :pswitch_f
    invoke-static {p1, p0, v1, v1}, Ldo5;->f(Ldo5;Leo5;II)V

    .line 148
    .line 149
    .line 150
    return-object v2

    .line 151
    :pswitch_10
    invoke-static {p1, p0, v1, v1}, Ldo5;->h(Ldo5;Leo5;II)V

    .line 152
    .line 153
    .line 154
    return-object v2

    .line 155
    :pswitch_11
    invoke-static {p1, p0, v1, v1}, Ldo5;->f(Ldo5;Leo5;II)V

    .line 156
    .line 157
    .line 158
    return-object v2

    .line 159
    :pswitch_12
    invoke-static {p1, p0, v1, v1}, Ldo5;->h(Ldo5;Leo5;II)V

    .line 160
    .line 161
    .line 162
    return-object v2

    .line 163
    :pswitch_data_0
    .packed-switch 0x0
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
