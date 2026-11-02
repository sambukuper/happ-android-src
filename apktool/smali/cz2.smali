.class public final synthetic Lcz2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:Ljava/lang/String;

.field public final synthetic Y:Z

.field public final synthetic Z:Lgn2;

.field public final synthetic f0:Lkx4;

.field public final synthetic g0:Z

.field public final synthetic h0:Ljava/lang/String;

.field public final synthetic i0:Lgn2;

.field public final synthetic j0:S

.field public final synthetic k0:S


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;ZLgn2;Lkx4;ZLjava/lang/String;Lgn2;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcz2;->X:Ljava/lang/String;

    .line 5
    .line 6
    iput-boolean p2, p0, Lcz2;->Y:Z

    .line 7
    .line 8
    iput-object p3, p0, Lcz2;->Z:Lgn2;

    .line 9
    .line 10
    iput-object p4, p0, Lcz2;->f0:Lkx4;

    .line 11
    .line 12
    iput-boolean p5, p0, Lcz2;->g0:Z

    .line 13
    .line 14
    iput-object p6, p0, Lcz2;->h0:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p7, p0, Lcz2;->i0:Lgn2;

    .line 17
    .line 18
    iput-short p8, p0, Lcz2;->j0:S

    .line 19
    .line 20
    iput-short p9, p0, Lcz2;->k0:S

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    move-object v7, p1

    .line 2
    check-cast v7, Llp2;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-short p1, p0, Lcz2;->j0:S

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, Lw79;->P(I)I

    .line 14
    .line 15
    .line 16
    move-result v8

    .line 17
    iget-object v0, p0, Lcz2;->X:Ljava/lang/String;

    .line 18
    .line 19
    iget-boolean v1, p0, Lcz2;->Y:Z

    .line 20
    .line 21
    iget-object v2, p0, Lcz2;->Z:Lgn2;

    .line 22
    .line 23
    iget-object v3, p0, Lcz2;->f0:Lkx4;

    .line 24
    .line 25
    iget-boolean v4, p0, Lcz2;->g0:Z

    .line 26
    .line 27
    iget-object v5, p0, Lcz2;->h0:Ljava/lang/String;

    .line 28
    .line 29
    iget-object v6, p0, Lcz2;->i0:Lgn2;

    .line 30
    .line 31
    iget-short v9, p0, Lcz2;->k0:S

    .line 32
    .line 33
    invoke-static/range {v0 .. v9}, Lg33;->a(Ljava/lang/String;ZLgn2;Lkx4;ZLjava/lang/String;Lgn2;Llp2;II)V

    .line 34
    .line 35
    .line 36
    sget-object p0, Ldn8;->a:Ldn8;

    .line 37
    .line 38
    return-object p0
.end method
