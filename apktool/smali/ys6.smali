.class public final Lys6;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field public A0:Ljava/lang/String;

.field public B0:Lht6;

.field public C0:Ljava/lang/Float;

.field public D0:Lht6;

.field public E0:Ljava/lang/Float;

.field public F0:I

.field public G0:I

.field public H0:I

.field public I0:I

.field public J0:I

.field public K0:I

.field public L0:I

.field public M0:I

.field public N0:I

.field public O0:I

.field public X:J

.field public Y:Lht6;

.field public Z:Ljava/lang/Float;

.field public f0:Lht6;

.field public g0:Ljava/lang/Float;

.field public h0:Lks6;

.field public i0:Ljava/lang/Float;

.field public j0:[Lks6;

.field public k0:Lks6;

.field public l0:Ljava/lang/Float;

.field public m0:Lbs6;

.field public n0:Ljava/util/ArrayList;

.field public o0:Lks6;

.field public p0:Ljava/lang/Integer;

.field public q0:Ljava/lang/Boolean;

.field public r0:Lyr6;

.field public s0:Ljava/lang/String;

.field public t0:Ljava/lang/String;

.field public u0:Ljava/lang/String;

.field public v0:Ljava/lang/Boolean;

.field public w0:Ljava/lang/Boolean;

.field public x0:Lht6;

.field public y0:Ljava/lang/Float;

.field public z0:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    iput-wide v0, p0, Lys6;->X:J

    .line 7
    .line 8
    return-void
.end method

.method public static a()Lys6;
    .locals 8

    .line 1
    new-instance v0, Lys6;

    .line 2
    .line 3
    invoke-direct {v0}, Lys6;-><init>()V

    .line 4
    .line 5
    .line 6
    const-wide/16 v1, -0x1

    .line 7
    .line 8
    iput-wide v1, v0, Lys6;->X:J

    .line 9
    .line 10
    sget-object v1, Lbs6;->Y:Lbs6;

    .line 11
    .line 12
    iput-object v1, v0, Lys6;->Y:Lht6;

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    iput v2, v0, Lys6;->F0:I

    .line 16
    .line 17
    const/high16 v3, 0x3f800000    # 1.0f

    .line 18
    .line 19
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    iput-object v4, v0, Lys6;->Z:Ljava/lang/Float;

    .line 24
    .line 25
    const/4 v5, 0x0

    .line 26
    iput-object v5, v0, Lys6;->f0:Lht6;

    .line 27
    .line 28
    iput-object v4, v0, Lys6;->g0:Ljava/lang/Float;

    .line 29
    .line 30
    new-instance v6, Lks6;

    .line 31
    .line 32
    invoke-direct {v6, v3}, Lks6;-><init>(F)V

    .line 33
    .line 34
    .line 35
    iput-object v6, v0, Lys6;->h0:Lks6;

    .line 36
    .line 37
    iput v2, v0, Lys6;->G0:I

    .line 38
    .line 39
    iput v2, v0, Lys6;->H0:I

    .line 40
    .line 41
    const/high16 v3, 0x40800000    # 4.0f

    .line 42
    .line 43
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    iput-object v3, v0, Lys6;->i0:Ljava/lang/Float;

    .line 48
    .line 49
    iput-object v5, v0, Lys6;->j0:[Lks6;

    .line 50
    .line 51
    new-instance v3, Lks6;

    .line 52
    .line 53
    const/4 v6, 0x0

    .line 54
    invoke-direct {v3, v6}, Lks6;-><init>(F)V

    .line 55
    .line 56
    .line 57
    iput-object v3, v0, Lys6;->k0:Lks6;

    .line 58
    .line 59
    iput-object v4, v0, Lys6;->l0:Ljava/lang/Float;

    .line 60
    .line 61
    iput-object v1, v0, Lys6;->m0:Lbs6;

    .line 62
    .line 63
    iput-object v5, v0, Lys6;->n0:Ljava/util/ArrayList;

    .line 64
    .line 65
    new-instance v3, Lks6;

    .line 66
    .line 67
    const/high16 v6, 0x41400000    # 12.0f

    .line 68
    .line 69
    const/4 v7, 0x7

    .line 70
    invoke-direct {v3, v7, v6}, Lks6;-><init>(IF)V

    .line 71
    .line 72
    .line 73
    iput-object v3, v0, Lys6;->o0:Lks6;

    .line 74
    .line 75
    const/16 v3, 0x190

    .line 76
    .line 77
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    iput-object v3, v0, Lys6;->p0:Ljava/lang/Integer;

    .line 82
    .line 83
    iput v2, v0, Lys6;->I0:I

    .line 84
    .line 85
    iput v2, v0, Lys6;->J0:I

    .line 86
    .line 87
    iput v2, v0, Lys6;->K0:I

    .line 88
    .line 89
    iput v2, v0, Lys6;->L0:I

    .line 90
    .line 91
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 92
    .line 93
    iput-object v3, v0, Lys6;->q0:Ljava/lang/Boolean;

    .line 94
    .line 95
    iput-object v5, v0, Lys6;->r0:Lyr6;

    .line 96
    .line 97
    iput-object v5, v0, Lys6;->s0:Ljava/lang/String;

    .line 98
    .line 99
    iput-object v5, v0, Lys6;->t0:Ljava/lang/String;

    .line 100
    .line 101
    iput-object v5, v0, Lys6;->u0:Ljava/lang/String;

    .line 102
    .line 103
    iput-object v3, v0, Lys6;->v0:Ljava/lang/Boolean;

    .line 104
    .line 105
    iput-object v3, v0, Lys6;->w0:Ljava/lang/Boolean;

    .line 106
    .line 107
    iput-object v1, v0, Lys6;->x0:Lht6;

    .line 108
    .line 109
    iput-object v4, v0, Lys6;->y0:Ljava/lang/Float;

    .line 110
    .line 111
    iput-object v5, v0, Lys6;->z0:Ljava/lang/String;

    .line 112
    .line 113
    iput v2, v0, Lys6;->M0:I

    .line 114
    .line 115
    iput-object v5, v0, Lys6;->A0:Ljava/lang/String;

    .line 116
    .line 117
    iput-object v5, v0, Lys6;->B0:Lht6;

    .line 118
    .line 119
    iput-object v4, v0, Lys6;->C0:Ljava/lang/Float;

    .line 120
    .line 121
    iput-object v5, v0, Lys6;->D0:Lht6;

    .line 122
    .line 123
    iput-object v4, v0, Lys6;->E0:Ljava/lang/Float;

    .line 124
    .line 125
    iput v2, v0, Lys6;->N0:I

    .line 126
    .line 127
    iput v2, v0, Lys6;->O0:I

    .line 128
    .line 129
    return-object v0
.end method


# virtual methods
.method public final clone()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lys6;

    .line 6
    .line 7
    iget-object p0, p0, Lys6;->j0:[Lks6;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, [Lks6;->clone()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, [Lks6;

    .line 16
    .line 17
    iput-object p0, v0, Lys6;->j0:[Lks6;

    .line 18
    .line 19
    :cond_0
    return-object v0
.end method
