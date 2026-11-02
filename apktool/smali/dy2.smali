.class public final synthetic Ldy2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lby2;

.field public final synthetic Z:Lky2;

.field public final synthetic f0:Lkx4;

.field public final synthetic g0:I


# direct methods
.method public synthetic constructor <init>(Lby2;Lky2;Lkx4;IB)V
    .locals 0

    .line 1
    iput-byte p5, p0, Ldy2;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Ldy2;->Y:Lby2;

    .line 4
    .line 5
    iput-object p2, p0, Ldy2;->Z:Lky2;

    .line 6
    .line 7
    iput-object p3, p0, Ldy2;->f0:Lkx4;

    .line 8
    .line 9
    iput p4, p0, Ldy2;->g0:I

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, Ldy2;->X:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    iget v2, p0, Ldy2;->g0:I

    .line 6
    .line 7
    iget-object v3, p0, Ldy2;->f0:Lkx4;

    .line 8
    .line 9
    iget-object v4, p0, Ldy2;->Z:Lky2;

    .line 10
    .line 11
    iget-object p0, p0, Ldy2;->Y:Lby2;

    .line 12
    .line 13
    check-cast p1, Llp2;

    .line 14
    .line 15
    check-cast p2, Ljava/lang/Integer;

    .line 16
    .line 17
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    packed-switch v0, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    or-int/lit8 p2, v2, 0x1

    .line 24
    .line 25
    invoke-static {p2}, Lw79;->P(I)I

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    invoke-static {p0, v4, v3, p1, p2}, Lyn0;->e(Lby2;Lky2;Lkx4;Llp2;I)V

    .line 30
    .line 31
    .line 32
    return-object v1

    .line 33
    :pswitch_0
    or-int/lit8 p2, v2, 0x1

    .line 34
    .line 35
    invoke-static {p2}, Lw79;->P(I)I

    .line 36
    .line 37
    .line 38
    move-result p2

    .line 39
    invoke-static {p0, v4, v3, p1, p2}, Lyn0;->f(Lby2;Lky2;Lkx4;Llp2;I)V

    .line 40
    .line 41
    .line 42
    return-object v1

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
