.class public final synthetic Lq79;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lr79;


# direct methods
.method public synthetic constructor <init>(Lr79;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lq79;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lq79;->Y:Lr79;

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
    .locals 2

    .line 1
    iget-byte v0, p0, Lq79;->X:B

    .line 2
    .line 3
    iget-object p0, p0, Lq79;->Y:Lr79;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, Lyz4;

    .line 9
    .line 10
    iget-object p0, p0, Lr79;->d:Lvz7;

    .line 11
    .line 12
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, Ls79;

    .line 17
    .line 18
    invoke-direct {v0, p0}, Lqc4;-><init>(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :pswitch_0
    new-instance v0, Ls79;

    .line 23
    .line 24
    iget v1, p0, Lr79;->b:F

    .line 25
    .line 26
    iget p0, p0, Lr79;->c:F

    .line 27
    .line 28
    invoke-direct {v0, v1, p0}, Ls79;-><init>(FF)V

    .line 29
    .line 30
    .line 31
    return-object v0

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
