.class public final synthetic Li80;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:Leo5;

.field public final synthetic Y:Ltr4;

.field public final synthetic Z:Lzr4;

.field public final synthetic f0:I

.field public final synthetic g0:I

.field public final synthetic h0:Lk80;


# direct methods
.method public synthetic constructor <init>(Leo5;Ltr4;Lzr4;IILk80;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Li80;->X:Leo5;

    .line 5
    .line 6
    iput-object p2, p0, Li80;->Y:Ltr4;

    .line 7
    .line 8
    iput-object p3, p0, Li80;->Z:Lzr4;

    .line 9
    .line 10
    iput p4, p0, Li80;->f0:I

    .line 11
    .line 12
    iput p5, p0, Li80;->g0:I

    .line 13
    .line 14
    iput-object p6, p0, Li80;->h0:Lk80;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, Ldo5;

    .line 3
    .line 4
    iget-object p1, p0, Li80;->Z:Lzr4;

    .line 5
    .line 6
    invoke-interface {p1}, Lug3;->getLayoutDirection()Lz24;

    .line 7
    .line 8
    .line 9
    move-result-object v3

    .line 10
    iget-object p1, p0, Li80;->h0:Lk80;

    .line 11
    .line 12
    iget-object v6, p1, Lk80;->a:Lp50;

    .line 13
    .line 14
    iget-object v1, p0, Li80;->X:Leo5;

    .line 15
    .line 16
    iget-object v2, p0, Li80;->Y:Ltr4;

    .line 17
    .line 18
    iget v4, p0, Li80;->f0:I

    .line 19
    .line 20
    iget v5, p0, Li80;->g0:I

    .line 21
    .line 22
    invoke-static/range {v0 .. v6}, Lg80;->d(Ldo5;Leo5;Ltr4;Lz24;IILp50;)V

    .line 23
    .line 24
    .line 25
    sget-object p0, Ldn8;->a:Ldn8;

    .line 26
    .line 27
    return-object p0
.end method
