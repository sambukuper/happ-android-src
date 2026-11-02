.class public final synthetic Lv64;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lw64;


# direct methods
.method public synthetic constructor <init>(Lw64;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lv64;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lv64;->Y:Lw64;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, Lv64;->X:B

    .line 2
    .line 3
    iget-object p0, p0, Lv64;->Y:Lw64;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lw64;->r0:Ls64;

    .line 9
    .line 10
    iget-object v0, v0, Ls64;->b:Lj74;

    .line 11
    .line 12
    invoke-virtual {v0}, Lj74;->d()Le74;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iget-object v1, v1, Le74;->p:Lsd5;

    .line 17
    .line 18
    sget-object v2, Lsd5;->X:Lsd5;

    .line 19
    .line 20
    if-ne v1, v2, :cond_0

    .line 21
    .line 22
    invoke-virtual {v0}, Lj74;->d()Le74;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0}, Le74;->i()J

    .line 27
    .line 28
    .line 29
    move-result-wide v0

    .line 30
    const-wide v2, 0xffffffffL

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    and-long/2addr v0, v2

    .line 36
    :goto_0
    long-to-int v0, v0

    .line 37
    goto :goto_1

    .line 38
    :cond_0
    invoke-virtual {v0}, Lj74;->d()Le74;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0}, Le74;->i()J

    .line 43
    .line 44
    .line 45
    move-result-wide v0

    .line 46
    const/16 v2, 0x20

    .line 47
    .line 48
    shr-long/2addr v0, v2

    .line 49
    goto :goto_0

    .line 50
    :goto_1
    iget-object p0, p0, Lw64;->r0:Ls64;

    .line 51
    .line 52
    iget-object p0, p0, Ls64;->b:Lj74;

    .line 53
    .line 54
    invoke-virtual {p0}, Lj74;->d()Le74;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    iget v1, v1, Le74;->m:I

    .line 59
    .line 60
    neg-int v1, v1

    .line 61
    invoke-virtual {p0}, Lj74;->d()Le74;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    iget p0, p0, Le74;->q:I

    .line 66
    .line 67
    add-int/2addr v1, p0

    .line 68
    sub-int/2addr v0, v1

    .line 69
    int-to-float p0, v0

    .line 70
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    return-object p0

    .line 75
    :pswitch_0
    iget-object p0, p0, Lw64;->r0:Ls64;

    .line 76
    .line 77
    iget-object p0, p0, Ls64;->b:Lj74;

    .line 78
    .line 79
    invoke-virtual {p0}, Lj74;->c()I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    iget-object v1, p0, Lj74;->g0:Lwg;

    .line 84
    .line 85
    iget-object v1, v1, Lwg;->c:Ljava/lang/Object;

    .line 86
    .line 87
    check-cast v1, Loh5;

    .line 88
    .line 89
    invoke-virtual {v1}, Loh5;->l()I

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    invoke-virtual {p0}, Lj74;->m()Z

    .line 94
    .line 95
    .line 96
    move-result p0

    .line 97
    if-eqz p0, :cond_1

    .line 98
    .line 99
    mul-int/lit16 v0, v0, 0x1f4

    .line 100
    .line 101
    add-int/2addr v0, v1

    .line 102
    int-to-float p0, v0

    .line 103
    const/high16 v0, 0x42c80000    # 100.0f

    .line 104
    .line 105
    add-float/2addr p0, v0

    .line 106
    goto :goto_2

    .line 107
    :cond_1
    mul-int/lit16 v0, v0, 0x1f4

    .line 108
    .line 109
    add-int/2addr v0, v1

    .line 110
    int-to-float p0, v0

    .line 111
    :goto_2
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    return-object p0

    .line 116
    :pswitch_1
    iget-object p0, p0, Lw64;->r0:Ls64;

    .line 117
    .line 118
    iget-object p0, p0, Ls64;->b:Lj74;

    .line 119
    .line 120
    invoke-virtual {p0}, Lj74;->c()I

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    iget-object p0, p0, Lj74;->g0:Lwg;

    .line 125
    .line 126
    iget-object p0, p0, Lwg;->c:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast p0, Loh5;

    .line 129
    .line 130
    invoke-virtual {p0}, Loh5;->l()I

    .line 131
    .line 132
    .line 133
    move-result p0

    .line 134
    mul-int/lit16 v0, v0, 0x1f4

    .line 135
    .line 136
    add-int/2addr v0, p0

    .line 137
    int-to-float p0, v0

    .line 138
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    return-object p0

    .line 143
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
