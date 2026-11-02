.class public final synthetic Lwo;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:Lkx4;

.field public final synthetic Y:Lzy0;

.field public final synthetic Z:Lo88;

.field public final synthetic f0:Lo88;

.field public final synthetic g0:Lzy0;

.field public final synthetic h0:Lsn2;

.field public final synthetic i0:F

.field public final synthetic j0:Lv09;

.field public final synthetic k0:Lkc8;

.field public final synthetic l0:I

.field public final synthetic m0:I


# direct methods
.method public synthetic constructor <init>(Lkx4;Lzy0;Lo88;Lo88;Lzy0;Lsn2;FLv09;Lkc8;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwo;->X:Lkx4;

    .line 5
    .line 6
    iput-object p2, p0, Lwo;->Y:Lzy0;

    .line 7
    .line 8
    iput-object p3, p0, Lwo;->Z:Lo88;

    .line 9
    .line 10
    iput-object p4, p0, Lwo;->f0:Lo88;

    .line 11
    .line 12
    iput-object p5, p0, Lwo;->g0:Lzy0;

    .line 13
    .line 14
    iput-object p6, p0, Lwo;->h0:Lsn2;

    .line 15
    .line 16
    iput p7, p0, Lwo;->i0:F

    .line 17
    .line 18
    iput-object p8, p0, Lwo;->j0:Lv09;

    .line 19
    .line 20
    iput-object p9, p0, Lwo;->k0:Lkc8;

    .line 21
    .line 22
    iput p10, p0, Lwo;->l0:I

    .line 23
    .line 24
    iput p11, p0, Lwo;->m0:I

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    move-object v9, p1

    .line 2
    check-cast v9, Llp2;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget p1, p0, Lwo;->l0:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, Lw79;->P(I)I

    .line 14
    .line 15
    .line 16
    move-result v10

    .line 17
    iget p1, p0, Lwo;->m0:I

    .line 18
    .line 19
    invoke-static {p1}, Lw79;->P(I)I

    .line 20
    .line 21
    .line 22
    move-result v11

    .line 23
    iget-object v0, p0, Lwo;->X:Lkx4;

    .line 24
    .line 25
    iget-object v1, p0, Lwo;->Y:Lzy0;

    .line 26
    .line 27
    iget-object v2, p0, Lwo;->Z:Lo88;

    .line 28
    .line 29
    iget-object v3, p0, Lwo;->f0:Lo88;

    .line 30
    .line 31
    iget-object v4, p0, Lwo;->g0:Lzy0;

    .line 32
    .line 33
    iget-object v5, p0, Lwo;->h0:Lsn2;

    .line 34
    .line 35
    iget v6, p0, Lwo;->i0:F

    .line 36
    .line 37
    iget-object v7, p0, Lwo;->j0:Lv09;

    .line 38
    .line 39
    iget-object v8, p0, Lwo;->k0:Lkc8;

    .line 40
    .line 41
    invoke-static/range {v0 .. v11}, Lzo;->a(Lkx4;Lzy0;Lo88;Lo88;Lzy0;Lsn2;FLv09;Lkc8;Llp2;II)V

    .line 42
    .line 43
    .line 44
    sget-object p0, Ldn8;->a:Ldn8;

    .line 45
    .line 46
    return-object p0
.end method
