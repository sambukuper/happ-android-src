.class public final Lu12;
.super Lg24;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic Y:Lce8;

.field public final synthetic Z:Ldn2;

.field public final synthetic f0:I


# direct methods
.method public constructor <init>(Lce8;Ldn2;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lu12;->Y:Lce8;

    .line 2
    .line 3
    iput-object p2, p0, Lu12;->Z:Ldn2;

    .line 4
    .line 5
    iput p3, p0, Lu12;->f0:I

    .line 6
    .line 7
    const/4 p1, 0x2

    .line 8
    invoke-direct {p0, p1}, Lg24;-><init>(I)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Llp2;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Number;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 6
    .line 7
    .line 8
    iget p2, p0, Lu12;->f0:I

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
    iget-object v0, p0, Lu12;->Y:Lce8;

    .line 17
    .line 18
    iget-object p0, p0, Lu12;->Z:Ldn2;

    .line 19
    .line 20
    invoke-static {v0, p0, p1, p2}, Lb22;->a(Lce8;Ldn2;Llp2;I)V

    .line 21
    .line 22
    .line 23
    sget-object p0, Ldn8;->a:Ldn8;

    .line 24
    .line 25
    return-object p0
.end method
