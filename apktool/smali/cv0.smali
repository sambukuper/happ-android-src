.class public final Lcv0;
.super Lpu;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final synthetic B:B

.field public final C:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lcv0;->B:B

    .line 2
    .line 3
    iput-object p1, p0, Lcv0;->C:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final u()I
    .locals 1

    .line 1
    iget-byte v0, p0, Lcv0;->B:B

    .line 2
    .line 3
    iget-object p0, p0, Lcv0;->C:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, [B

    .line 9
    .line 10
    array-length p0, p0

    .line 11
    return p0

    .line 12
    :pswitch_0
    check-cast p0, [I

    .line 13
    .line 14
    array-length p0, p0

    .line 15
    return p0

    .line 16
    :pswitch_1
    check-cast p0, [C

    .line 17
    .line 18
    array-length p0, p0

    .line 19
    return p0

    .line 20
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final v(I)I
    .locals 1

    .line 1
    iget-byte v0, p0, Lcv0;->B:B

    .line 2
    .line 3
    iget-object p0, p0, Lcv0;->C:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, [B

    .line 9
    .line 10
    aget-byte p0, p0, p1

    .line 11
    .line 12
    and-int/lit16 p0, p0, 0xff

    .line 13
    .line 14
    return p0

    .line 15
    :pswitch_0
    check-cast p0, [I

    .line 16
    .line 17
    aget p0, p0, p1

    .line 18
    .line 19
    return p0

    .line 20
    :pswitch_1
    check-cast p0, [C

    .line 21
    .line 22
    aget-char p0, p0, p1

    .line 23
    .line 24
    return p0

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
