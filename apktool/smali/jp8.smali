.class public final Ljp8;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lze2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lze2;

.field public final synthetic Z:Lrp8;


# direct methods
.method public synthetic constructor <init>(Lze2;Lrp8;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Ljp8;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Ljp8;->Y:Lze2;

    .line 4
    .line 5
    iput-object p2, p0, Ljp8;->Z:Lrp8;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final l(Ljava/lang/Object;Lq51;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, Ljp8;->X:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    iget-object v2, p0, Ljp8;->Z:Lrp8;

    .line 6
    .line 7
    iget-object v3, p0, Ljp8;->Y:Lze2;

    .line 8
    .line 9
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 10
    .line 11
    sget-object v5, Lc71;->X:Lc71;

    .line 12
    .line 13
    const/high16 v6, -0x80000000

    .line 14
    .line 15
    const/4 v7, 0x1

    .line 16
    const/4 v8, 0x0

    .line 17
    packed-switch v0, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    instance-of v0, p2, Lop8;

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    move-object v0, p2

    .line 25
    check-cast v0, Lop8;

    .line 26
    .line 27
    iget v9, v0, Lop8;->g0:I

    .line 28
    .line 29
    and-int v10, v9, v6

    .line 30
    .line 31
    if-eqz v10, :cond_0

    .line 32
    .line 33
    sub-int/2addr v9, v6

    .line 34
    iput v9, v0, Lop8;->g0:I

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    new-instance v0, Lop8;

    .line 38
    .line 39
    invoke-direct {v0, p0, p2}, Lop8;-><init>(Ljp8;Lq51;)V

    .line 40
    .line 41
    .line 42
    :goto_0
    iget-object p0, v0, Lop8;->f0:Ljava/lang/Object;

    .line 43
    .line 44
    iget p2, v0, Lop8;->g0:I

    .line 45
    .line 46
    if-eqz p2, :cond_2

    .line 47
    .line 48
    if-ne p2, v7, :cond_1

    .line 49
    .line 50
    invoke-static {p0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    invoke-static {v4}, Lbt;->i(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    move-object v1, v8

    .line 58
    goto :goto_1

    .line 59
    :cond_2
    invoke-static {p0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    check-cast p1, Lo05;

    .line 63
    .line 64
    iget-object p0, v2, Lrp8;->b:Ljs5;

    .line 65
    .line 66
    invoke-virtual {p1, p0}, Lo05;->c(Ljs5;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    check-cast p0, Ljava/lang/String;

    .line 71
    .line 72
    if-eqz p0, :cond_3

    .line 73
    .line 74
    sget-object p1, Lmr;->a:Lcp3;

    .line 75
    .line 76
    iget-object p2, p1, Lvm3;->b:Lg55;

    .line 77
    .line 78
    sget-object p2, Lzo8;->Companion:Lyo8;

    .line 79
    .line 80
    invoke-virtual {p2}, Lyo8;->serializer()Low3;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    check-cast p2, Low3;

    .line 85
    .line 86
    invoke-virtual {p1, p2, p0}, Lvm3;->a(Low3;Ljava/lang/String;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    move-object v8, p0

    .line 91
    check-cast v8, Lzo8;

    .line 92
    .line 93
    :cond_3
    iput v7, v0, Lop8;->g0:I

    .line 94
    .line 95
    invoke-interface {v3, v8, v0}, Lze2;->l(Ljava/lang/Object;Lq51;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    if-ne p0, v5, :cond_4

    .line 100
    .line 101
    move-object v1, v5

    .line 102
    :cond_4
    :goto_1
    return-object v1

    .line 103
    :pswitch_0
    instance-of v0, p2, Lip8;

    .line 104
    .line 105
    if-eqz v0, :cond_5

    .line 106
    .line 107
    move-object v0, p2

    .line 108
    check-cast v0, Lip8;

    .line 109
    .line 110
    iget v9, v0, Lip8;->g0:I

    .line 111
    .line 112
    and-int v10, v9, v6

    .line 113
    .line 114
    if-eqz v10, :cond_5

    .line 115
    .line 116
    sub-int/2addr v9, v6

    .line 117
    iput v9, v0, Lip8;->g0:I

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_5
    new-instance v0, Lip8;

    .line 121
    .line 122
    invoke-direct {v0, p0, p2}, Lip8;-><init>(Ljp8;Lq51;)V

    .line 123
    .line 124
    .line 125
    :goto_2
    iget-object p0, v0, Lip8;->f0:Ljava/lang/Object;

    .line 126
    .line 127
    iget p2, v0, Lip8;->g0:I

    .line 128
    .line 129
    if-eqz p2, :cond_7

    .line 130
    .line 131
    if-ne p2, v7, :cond_6

    .line 132
    .line 133
    invoke-static {p0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_6
    invoke-static {v4}, Lbt;->i(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    move-object v1, v8

    .line 141
    goto :goto_3

    .line 142
    :cond_7
    invoke-static {p0}, Lw39;->n0(Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    check-cast p1, Lo05;

    .line 146
    .line 147
    iget-object p0, v2, Lrp8;->c:Ljs5;

    .line 148
    .line 149
    invoke-virtual {p1, p0}, Lo05;->c(Ljs5;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    check-cast p0, Ljava/lang/String;

    .line 154
    .line 155
    if-eqz p0, :cond_8

    .line 156
    .line 157
    sget-object p1, Lmr;->a:Lcp3;

    .line 158
    .line 159
    iget-object p2, p1, Lvm3;->b:Lg55;

    .line 160
    .line 161
    sget-object p2, Lsu/happ/proxyutility/domain/routing/entity/DownloadFilesInfo;->Companion:Lsu/happ/proxyutility/domain/routing/entity/DownloadFilesInfo$Companion;

    .line 162
    .line 163
    invoke-virtual {p2}, Lsu/happ/proxyutility/domain/routing/entity/DownloadFilesInfo$Companion;->serializer()Low3;

    .line 164
    .line 165
    .line 166
    move-result-object p2

    .line 167
    check-cast p2, Low3;

    .line 168
    .line 169
    invoke-virtual {p1, p2, p0}, Lvm3;->a(Low3;Ljava/lang/String;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    move-object v8, p0

    .line 174
    check-cast v8, Lsu/happ/proxyutility/domain/routing/entity/DownloadFilesInfo;

    .line 175
    .line 176
    :cond_8
    iput v7, v0, Lip8;->g0:I

    .line 177
    .line 178
    invoke-interface {v3, v8, v0}, Lze2;->l(Ljava/lang/Object;Lq51;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object p0

    .line 182
    if-ne p0, v5, :cond_9

    .line 183
    .line 184
    move-object v1, v5

    .line 185
    :cond_9
    :goto_3
    return-object v1

    .line 186
    nop

    .line 187
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
