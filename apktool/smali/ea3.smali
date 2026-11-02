.class public final synthetic Lea3;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lkx4;

.field public final synthetic Z:I

.field public final synthetic f0:Z

.field public final synthetic g0:Lon2;


# direct methods
.method public synthetic constructor <init>(Lkx4;Lrn2;II)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, Lea3;->X:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lea3;->Y:Lkx4;

    .line 8
    .line 9
    iput-object p2, p0, Lea3;->g0:Lon2;

    .line 10
    .line 11
    iput p3, p0, Lea3;->Z:I

    .line 12
    .line 13
    iput-boolean p4, p0, Lea3;->f0:Z

    .line 14
    .line 15
    return-void
.end method

.method public synthetic constructor <init>(ZLgn2;Lkx4;I)V
    .locals 1

    .line 16
    const/4 v0, 0x0

    iput-byte v0, p0, Lea3;->X:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lea3;->f0:Z

    iput-object p2, p0, Lea3;->g0:Lon2;

    iput-object p3, p0, Lea3;->Y:Lkx4;

    iput p4, p0, Lea3;->Z:I

    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, Lea3;->X:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    iget-boolean v2, p0, Lea3;->f0:Z

    .line 6
    .line 7
    iget v3, p0, Lea3;->Z:I

    .line 8
    .line 9
    iget-object v4, p0, Lea3;->g0:Lon2;

    .line 10
    .line 11
    iget-object p0, p0, Lea3;->Y:Lkx4;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast v4, Lrn2;

    .line 17
    .line 18
    check-cast p1, Llp2;

    .line 19
    .line 20
    check-cast p2, Ljava/lang/Integer;

    .line 21
    .line 22
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    or-int/lit8 p2, v3, 0x1

    .line 26
    .line 27
    invoke-static {p2}, Lw79;->P(I)I

    .line 28
    .line 29
    .line 30
    move-result p2

    .line 31
    invoke-static {p0, v4, p1, p2, v2}, Lsp7;->a(Lkx4;Lrn2;Llp2;II)V

    .line 32
    .line 33
    .line 34
    return-object v1

    .line 35
    :pswitch_0
    check-cast v4, Lgn2;

    .line 36
    .line 37
    check-cast p1, Llp2;

    .line 38
    .line 39
    check-cast p2, Ljava/lang/Integer;

    .line 40
    .line 41
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    or-int/lit8 p2, v3, 0x1

    .line 45
    .line 46
    invoke-static {p2}, Lw79;->P(I)I

    .line 47
    .line 48
    .line 49
    move-result p2

    .line 50
    invoke-static {v2, v4, p0, p1, p2}, Lys0;->j(ZLgn2;Lkx4;Llp2;I)V

    .line 51
    .line 52
    .line 53
    return-object v1

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
