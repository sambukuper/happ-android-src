.class public final Lme0;
.super Lee0;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final synthetic f:B


# direct methods
.method public synthetic constructor <init>(Ljava/lang/reflect/Method;ZIB)V
    .locals 0

    .line 1
    iput-byte p4, p0, Lme0;->f:B

    .line 2
    .line 3
    invoke-direct {p0, p1, p2, p3}, Lee0;-><init>(Ljava/lang/reflect/Method;ZI)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final d([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, Lme0;->f:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    array-length v0, p1

    .line 10
    invoke-virtual {p0, v0}, Lne0;->e(I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v3, p1}, Lee0;->h(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :pswitch_0
    array-length v0, p1

    .line 19
    invoke-virtual {p0, v0}, Lne0;->e(I)V

    .line 20
    .line 21
    .line 22
    array-length v0, p1

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    move-object v0, v3

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    aget-object v0, p1, v2

    .line 28
    .line 29
    :goto_0
    invoke-virtual {p0, v0}, Lne0;->g(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    array-length v0, p1

    .line 33
    if-gt v0, v1, :cond_1

    .line 34
    .line 35
    new-array p1, v2, [Ljava/lang/Object;

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_1
    array-length v0, p1

    .line 39
    invoke-static {p1, v1, v0}, Leu;->k0([Ljava/lang/Object;II)[Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    :goto_1
    invoke-virtual {p0, v3, p1}, Lee0;->h(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    :pswitch_1
    array-length v0, p1

    .line 49
    invoke-virtual {p0, v0}, Lne0;->e(I)V

    .line 50
    .line 51
    .line 52
    aget-object v0, p1, v2

    .line 53
    .line 54
    array-length v3, p1

    .line 55
    if-gt v3, v1, :cond_2

    .line 56
    .line 57
    new-array p1, v2, [Ljava/lang/Object;

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_2
    array-length v2, p1

    .line 61
    invoke-static {p1, v1, v2}, Leu;->k0([Ljava/lang/Object;II)[Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    :goto_2
    invoke-virtual {p0, v0, p1}, Lee0;->h(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    return-object p0

    .line 70
    nop

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
