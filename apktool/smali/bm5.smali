.class public final Lbm5;
.super Lz0;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lx73;


# instance fields
.field public final synthetic X:B

.field public final Y:Lb2;


# direct methods
.method public synthetic constructor <init>(Lb2;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lbm5;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lbm5;->Y:Lb2;

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
    iget-byte v0, p0, Lbm5;->X:B

    .line 2
    .line 3
    iget-object p0, p0, Lbm5;->Y:Lb2;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Ldm5;

    .line 9
    .line 10
    iget-object p0, p0, Ldm5;->Z:Lll5;

    .line 11
    .line 12
    invoke-virtual {p0}, Lll5;->c()I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0

    .line 17
    :pswitch_0
    check-cast p0, Lll5;

    .line 18
    .line 19
    iget p0, p0, Lll5;->Y:I

    .line 20
    .line 21
    return p0

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget-byte v0, p0, Lbm5;->X:B

    .line 2
    .line 3
    iget-object p0, p0, Lbm5;->Y:Lb2;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Ldm5;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lb2;->containsValue(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0

    .line 15
    :pswitch_0
    check-cast p0, Lll5;

    .line 16
    .line 17
    invoke-virtual {p0, p1}, Lb2;->containsValue(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 6

    .line 1
    iget-byte v0, p0, Lbm5;->X:B

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    iget-object p0, p0, Lbm5;->Y:Lb2;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    new-instance v0, Lim5;

    .line 10
    .line 11
    check-cast p0, Ldm5;

    .line 12
    .line 13
    invoke-direct {v0, p0, v1}, Lim5;-><init>(Ldm5;B)V

    .line 14
    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, Lzl5;

    .line 18
    .line 19
    check-cast p0, Lll5;

    .line 20
    .line 21
    iget-object p0, p0, Lll5;->X:Lif8;

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    const/16 v2, 0x8

    .line 27
    .line 28
    new-array v3, v2, [Lkf8;

    .line 29
    .line 30
    const/4 v4, 0x0

    .line 31
    :goto_0
    if-ge v4, v2, :cond_0

    .line 32
    .line 33
    new-instance v5, Llf8;

    .line 34
    .line 35
    invoke-direct {v5, v1}, Llf8;-><init>(B)V

    .line 36
    .line 37
    .line 38
    aput-object v5, v3, v4

    .line 39
    .line 40
    add-int/lit8 v4, v4, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    invoke-direct {v0, p0, v3}, Lnl5;-><init>(Lif8;[Lkf8;)V

    .line 44
    .line 45
    .line 46
    return-object v0

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
