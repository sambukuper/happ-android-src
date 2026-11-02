.class public final Ls44;
.super Ljava/lang/Object;

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:B

.field public final Y:Lt44;


# direct methods
.method public synthetic constructor <init>(Lt44;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Ls44;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Ls44;->Y:Lt44;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, Ls44;->X:B

    .line 2
    .line 3
    iget-object p0, p0, Ls44;->Y:Lt44;

    .line 4
    .line 5
    check-cast p1, Lv15;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lt44;->O(Lv15;)Ljava/util/ArrayList;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, p1}, Lt44;->N(Lv15;)Ljava/util/ArrayList;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
