.class public final Lpe1;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lhe2;


# instance fields
.field public a:Lbd1;

.field public final b:Lgp1;


# direct methods
.method public constructor <init>(Lbd1;)V
    .locals 1

    .line 1
    sget-object v0, Liy6;->b:Lgp1;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lpe1;->a:Lbd1;

    .line 7
    .line 8
    iput-object v0, p0, Lpe1;->b:Lgp1;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(Lxx6;FLuy7;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Loe1;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p2, p0, p1, v1}, Loe1;-><init>(FLpe1;Lxx6;Lq51;)V

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Lpe1;->b:Lgp1;

    .line 8
    .line 9
    invoke-static {p0, v0, p3}, Lw51;->W(Ls61;Lrn2;Lq51;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method
