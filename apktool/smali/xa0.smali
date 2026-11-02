.class public final Lxa0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lw82;


# instance fields
.field public final synthetic a:B

.field public final b:Lpd5;

.field public final c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Lpd5;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Lxa0;->a:B

    .line 2
    .line 3
    iput-object p1, p0, Lxa0;->c:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lxa0;->b:Lpd5;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(Ll12;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte p1, p0, Lxa0;->a:B

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x0

    .line 5
    sget-object v2, Lma1;->Y:Lma1;

    .line 6
    .line 7
    iget-object v3, p0, Lxa0;->c:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object p0, p0, Lxa0;->b:Lpd5;

    .line 10
    .line 11
    packed-switch p1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    move-object v4, v3

    .line 15
    check-cast v4, Landroid/graphics/drawable/Drawable;

    .line 16
    .line 17
    sget-object p1, Lat8;->a:[Landroid/graphics/Bitmap$Config;

    .line 18
    .line 19
    instance-of p1, v4, Landroid/graphics/drawable/VectorDrawable;

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    if-nez p1, :cond_1

    .line 23
    .line 24
    instance-of p1, v4, Leu8;

    .line 25
    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move p1, v1

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    :goto_0
    move p1, v0

    .line 32
    :goto_1
    new-instance v3, Lb63;

    .line 33
    .line 34
    if-eqz p1, :cond_3

    .line 35
    .line 36
    invoke-static {p0}, Lb73;->a(Lpd5;)Landroid/graphics/Bitmap$Config;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    iget-object v6, p0, Lpd5;->b:Lta7;

    .line 41
    .line 42
    iget-object v7, p0, Lpd5;->c:Lpw6;

    .line 43
    .line 44
    sget-object v8, Ly63;->b:Lf4;

    .line 45
    .line 46
    invoke-static {p0, v8}, Lz68;->G(Lpd5;Lf4;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v8

    .line 50
    check-cast v8, Lta7;

    .line 51
    .line 52
    iget-object v9, p0, Lpd5;->d:Ltr5;

    .line 53
    .line 54
    sget-object v10, Ltr5;->Y:Ltr5;

    .line 55
    .line 56
    if-ne v9, v10, :cond_2

    .line 57
    .line 58
    move v9, v0

    .line 59
    goto :goto_2

    .line 60
    :cond_2
    move v9, v1

    .line 61
    :goto_2
    invoke-static/range {v4 .. v9}, Lci8;->o(Landroid/graphics/drawable/Drawable;Landroid/graphics/Bitmap$Config;Lta7;Lpw6;Lta7;Z)Landroid/graphics/Bitmap;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    iget-object p0, p0, Lpd5;->a:Landroid/content/Context;

    .line 66
    .line 67
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    new-instance v4, Landroid/graphics/drawable/BitmapDrawable;

    .line 72
    .line 73
    invoke-direct {v4, p0, v0}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 74
    .line 75
    .line 76
    :cond_3
    invoke-static {v4}, Lz39;->h(Landroid/graphics/drawable/Drawable;)Ld53;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-direct {v3, p0, p1, v2}, Lb63;-><init>(Ld53;ZLma1;)V

    .line 81
    .line 82
    .line 83
    return-object v3

    .line 84
    :pswitch_0
    new-instance p1, Lle7;

    .line 85
    .line 86
    check-cast v3, Ljava/nio/ByteBuffer;

    .line 87
    .line 88
    new-instance v1, Lza0;

    .line 89
    .line 90
    invoke-direct {v1, v3}, Lza0;-><init>(Ljava/nio/ByteBuffer;)V

    .line 91
    .line 92
    .line 93
    new-instance v4, Lj76;

    .line 94
    .line 95
    invoke-direct {v4, v1}, Lj76;-><init>(Lje7;)V

    .line 96
    .line 97
    .line 98
    iget-object p0, p0, Lpd5;->f:Ls92;

    .line 99
    .line 100
    new-instance v1, Lab0;

    .line 101
    .line 102
    invoke-direct {v1, v3}, Lab0;-><init>(Ljava/nio/ByteBuffer;)V

    .line 103
    .line 104
    .line 105
    new-instance v3, Lme7;

    .line 106
    .line 107
    invoke-direct {v3, v4, p0, v1}, Lme7;-><init>(Lba0;Ls92;Lci8;)V

    .line 108
    .line 109
    .line 110
    invoke-direct {p1, v3, v0, v2}, Lle7;-><init>(Ld73;Ljava/lang/String;Lma1;)V

    .line 111
    .line 112
    .line 113
    return-object p1

    .line 114
    :pswitch_1
    new-instance p1, Li90;

    .line 115
    .line 116
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 117
    .line 118
    .line 119
    check-cast v3, [B

    .line 120
    .line 121
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    array-length v4, v3

    .line 125
    invoke-virtual {p1, v3, v1, v4}, Li90;->write([BII)V

    .line 126
    .line 127
    .line 128
    iget-object p0, p0, Lpd5;->f:Ls92;

    .line 129
    .line 130
    invoke-static {p1, p0}, Lvj8;->j(Lba0;Ls92;)Lme7;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    new-instance p1, Lle7;

    .line 135
    .line 136
    invoke-direct {p1, p0, v0, v2}, Lle7;-><init>(Ld73;Ljava/lang/String;Lma1;)V

    .line 137
    .line 138
    .line 139
    return-object p1

    .line 140
    nop

    .line 141
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
