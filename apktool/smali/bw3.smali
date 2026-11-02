.class public final Lbw3;
.super Ljava/lang/Object;

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:B

.field public final Y:Lew3;


# direct methods
.method public synthetic constructor <init>(Lew3;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lbw3;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lbw3;->Y:Lew3;

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
    .locals 1

    .line 1
    iget-byte v0, p0, Lbw3;->X:B

    .line 2
    .line 3
    iget-object p0, p0, Lbw3;->Y:Lew3;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lew3;->Y:Ljava/lang/Class;

    .line 9
    .line 10
    invoke-static {p0}, Lz91;->o(Ljava/lang/Class;)Lqb6;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :pswitch_0
    new-instance v0, Ldw3;

    .line 16
    .line 17
    invoke-direct {v0, p0}, Ldw3;-><init>(Lew3;)V

    .line 18
    .line 19
    .line 20
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
