.class public final synthetic Lpg;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:Lkx4;

.field public final synthetic Y:Ldn2;

.field public final synthetic Z:Z

.field public final synthetic f0:B


# direct methods
.method public synthetic constructor <init>(ILdn2;Lkx4;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lpg;->X:Lkx4;

    .line 5
    .line 6
    iput-object p2, p0, Lpg;->Y:Ldn2;

    .line 7
    .line 8
    iput-boolean p4, p0, Lpg;->Z:Z

    .line 9
    .line 10
    iput-byte p1, p0, Lpg;->f0:B

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Llp2;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Integer;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-byte p2, p0, Lpg;->f0:B

    .line 9
    .line 10
    or-int/lit8 p2, p2, 0x1

    .line 11
    .line 12
    invoke-static {p2}, Lw79;->P(I)I

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    iget-object v0, p0, Lpg;->Y:Ldn2;

    .line 17
    .line 18
    iget-object v1, p0, Lpg;->X:Lkx4;

    .line 19
    .line 20
    iget-boolean p0, p0, Lpg;->Z:Z

    .line 21
    .line 22
    invoke-static {p2, v0, p1, v1, p0}, Lw45;->h(ILdn2;Llp2;Lkx4;Z)V

    .line 23
    .line 24
    .line 25
    sget-object p0, Ldn8;->a:Ldn8;

    .line 26
    .line 27
    return-object p0
.end method
