.class public final synthetic Lc07;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:I

.field public final synthetic Z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;IB)V
    .locals 0

    .line 1
    iput-byte p3, p0, Lc07;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lc07;->Z:Ljava/lang/Object;

    .line 4
    .line 5
    iput p2, p0, Lc07;->Y:I

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, Lc07;->X:B

    .line 2
    .line 3
    iget v1, p0, Lc07;->Y:I

    .line 4
    .line 5
    iget-object p0, p0, Lc07;->Z:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, Ly48;

    .line 11
    .line 12
    invoke-virtual {p0, v1}, Ly48;->b1(I)Z

    .line 13
    .line 14
    .line 15
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_0
    check-cast p0, Lxr0;

    .line 19
    .line 20
    iget-object p0, p0, Lxr0;->e:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p0, Lx78;

    .line 23
    .line 24
    iget-object p0, p0, Lx78;->b:Lbz4;

    .line 25
    .line 26
    invoke-virtual {p0, v1}, Lbz4;->c(I)I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
