.class public final Lqb5;
.super Lld2;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final d:Lqb5;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lqb5;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x3

    .line 5
    invoke-direct {v0, v1, v1, v2}, Lld2;-><init>(III)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lqb5;->d:Lqb5;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final d(Lxr0;Lrs;Lbc7;Lp91;Lvc5;)V
    .locals 0

    .line 1
    iget p0, p3, Lbc7;->t:I

    .line 2
    .line 3
    new-instance p1, Li9;

    .line 4
    .line 5
    const/16 p2, 0x9

    .line 6
    .line 7
    invoke-direct {p1, p4, p3, p2}, Li9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p3, p0, p1}, Lbc7;->m(ILrn2;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method
