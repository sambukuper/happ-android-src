.class public final Lcu5;
.super Ljava/lang/Object;

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:B

.field public final Y:Ldu5;


# direct methods
.method public synthetic constructor <init>(Ldu5;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lcu5;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lcu5;->Y:Ldu5;

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
    iget-byte v0, p0, Lcu5;->X:B

    .line 2
    .line 3
    iget-object p0, p0, Lcu5;->Y:Ldu5;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, Lug7;->k:Lfk2;

    .line 9
    .line 10
    iget-object p0, p0, Ldu5;->Y:Lv15;

    .line 11
    .line 12
    invoke-virtual {v0, p0}, Lfk2;->a(Lv15;)Lfk2;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :pswitch_0
    sget-object v0, Lug7;->k:Lfk2;

    .line 18
    .line 19
    iget-object p0, p0, Ldu5;->X:Lv15;

    .line 20
    .line 21
    invoke-virtual {v0, p0}, Lfk2;->a(Lv15;)Lfk2;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
