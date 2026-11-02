.class public final synthetic Lqg0;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lxg0;

.field public final synthetic Z:Lte6;


# direct methods
.method public synthetic constructor <init>(Lxg0;Lwg0;Lte6;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, Lqg0;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lqg0;->Y:Lxg0;

    .line 4
    .line 5
    iput-object p3, p0, Lqg0;->Z:Lte6;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-byte v0, p0, Lqg0;->X:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lqg0;->Z:Lte6;

    .line 7
    .line 8
    invoke-static {v0}, Lwg0;->c(Lte6;)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iget-object p0, p0, Lqg0;->Y:Lxg0;

    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lxg0;->a(I)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    iget-object v0, p0, Lqg0;->Z:Lte6;

    .line 19
    .line 20
    invoke-static {v0}, Lwg0;->c(Lte6;)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object p0, p0, Lqg0;->Y:Lxg0;

    .line 25
    .line 26
    invoke-virtual {p0, v0}, Lxg0;->e(I)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
