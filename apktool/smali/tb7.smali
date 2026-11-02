.class public final synthetic Ltb7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lgn2;


# instance fields
.field public final synthetic X:Leo5;

.field public final synthetic Y:I

.field public final synthetic Z:I

.field public final synthetic f0:Leo5;

.field public final synthetic g0:I

.field public final synthetic h0:Lca6;


# direct methods
.method public synthetic constructor <init>(Leo5;IILeo5;ILca6;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ltb7;->X:Leo5;

    .line 5
    .line 6
    iput p2, p0, Ltb7;->Y:I

    .line 7
    .line 8
    iput p3, p0, Ltb7;->Z:I

    .line 9
    .line 10
    iput-object p4, p0, Ltb7;->f0:Leo5;

    .line 11
    .line 12
    iput p5, p0, Ltb7;->g0:I

    .line 13
    .line 14
    iput-object p6, p0, Ltb7;->h0:Lca6;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final B(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, Ldo5;

    .line 2
    .line 3
    iget-object v0, p0, Ltb7;->X:Leo5;

    .line 4
    .line 5
    iget v1, p0, Ltb7;->Y:I

    .line 6
    .line 7
    iget v2, p0, Ltb7;->Z:I

    .line 8
    .line 9
    invoke-static {p1, v0, v1, v2}, Ldo5;->h(Ldo5;Leo5;II)V

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Ltb7;->h0:Lca6;

    .line 13
    .line 14
    iget v0, v0, Lca6;->X:I

    .line 15
    .line 16
    iget-object v1, p0, Ltb7;->f0:Leo5;

    .line 17
    .line 18
    iget p0, p0, Ltb7;->g0:I

    .line 19
    .line 20
    invoke-static {p1, v1, p0, v0}, Ldo5;->h(Ldo5;Leo5;II)V

    .line 21
    .line 22
    .line 23
    sget-object p0, Ldn8;->a:Ldn8;

    .line 24
    .line 25
    return-object p0
.end method
