.class public final Lkj7;
.super Llj7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final synthetic Z:B

.field public final f0:Ljava/io/Serializable;


# direct methods
.method public constructor <init>(Ldh8;Ljava/lang/String;)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    iput-byte p1, p0, Lkj7;->Z:B

    .line 3
    .line 4
    const-class p1, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {p0, p1}, Llj7;-><init>(Ljava/lang/Class;)V

    .line 7
    .line 8
    .line 9
    iput-object p2, p0, Lkj7;->f0:Ljava/io/Serializable;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;Lzl;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, Lkj7;->Z:B

    .line 12
    invoke-direct {p0, v0, p1}, Llj7;-><init>(ILjava/lang/Class;)V

    .line 13
    iput-object p2, p0, Lkj7;->f0:Ljava/io/Serializable;

    return-void
.end method


# virtual methods
.method public final e(Ljava/lang/Object;Lro3;Lt37;)V
    .locals 2

    .line 1
    iget-byte v0, p0, Lkj7;->Z:B

    .line 2
    .line 3
    iget-object p0, p0, Lkj7;->f0:Ljava/io/Serializable;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {p3, p0}, Lt37;->A(Ljava/lang/String;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    throw p0

    .line 15
    :pswitch_0
    sget-object v0, Ln37;->q0:Ln37;

    .line 16
    .line 17
    iget-object v1, p3, Lt37;->X:Ll37;

    .line 18
    .line 19
    invoke-virtual {v1, v0}, Ll37;->j(Ln37;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-virtual {p2, p0}, Lro3;->U(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    check-cast p1, Ljava/lang/Enum;

    .line 34
    .line 35
    sget-object v0, Ln37;->s0:Ln37;

    .line 36
    .line 37
    iget-object p3, p3, Lt37;->X:Ll37;

    .line 38
    .line 39
    invoke-virtual {p3, v0}, Ll37;->j(Ln37;)Z

    .line 40
    .line 41
    .line 42
    move-result p3

    .line 43
    if-eqz p3, :cond_1

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    invoke-static {p0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-virtual {p2, p0}, Lro3;->U(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    check-cast p0, Lzl;

    .line 58
    .line 59
    iget-object p0, p0, Lzl;->Z:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast p0, [Lr37;

    .line 62
    .line 63
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    aget-object p0, p0, p1

    .line 68
    .line 69
    invoke-virtual {p2, p0}, Lro3;->R(Lr37;)V

    .line 70
    .line 71
    .line 72
    :goto_0
    return-void

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
