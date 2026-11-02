.class public final synthetic Lfy0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements La94;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Ljava/lang/Object;

.field public final synthetic Z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, Lfy0;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lfy0;->Y:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lfy0;->Z:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final k(Ld94;Ln84;)V
    .locals 2

    .line 1
    iget-byte v0, p0, Lfy0;->X:B

    .line 2
    .line 3
    iget-object v1, p0, Lfy0;->Z:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, Lfy0;->Y:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, Ln84;

    .line 11
    .line 12
    check-cast v1, Ly05;

    .line 13
    .line 14
    if-ne p2, p0, :cond_0

    .line 15
    .line 16
    invoke-interface {v1}, Llh7;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    check-cast p0, Ldn2;

    .line 21
    .line 22
    invoke-interface {p0}, Ldn2;->invoke()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    :cond_0
    return-void

    .line 26
    :pswitch_0
    check-cast p0, Lz95;

    .line 27
    .line 28
    check-cast v1, Landroidx/activity/ComponentActivity;

    .line 29
    .line 30
    invoke-static {p0, v1, p1, p2}, Landroidx/activity/ComponentActivity;->i(Lz95;Landroidx/activity/ComponentActivity;Ld94;Ln84;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
